package com.example.loginpage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginpage.databinding.ActivityMain14Binding;
import com.example.loginpage.databinding.ActivityMain9Binding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity9 extends AppCompatActivity {
    ActivityMain9Binding binding;
    Uri imageurl;
    StorageReference storageReference;
    ProgressDialog progressDialog;
    public ImageView imageView;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    TextView newusername;
    TextView errorFields;
    public Button button1;

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain9Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        button1 = findViewById(R.id.insertProduct);
        editText1 = findViewById(R.id.editTextTextPersonName2);
        editText2 = findViewById(R.id.editTextTextPersonName3);
        editText3 = findViewById(R.id.editTextTextPersonName4);
        errorFields = findViewById(R.id.allFields);
        newusername = findViewById(R.id.userMain3);
        imageView = findViewById(R.id.imageView20);

        String username = getIntent().getStringExtra("name");
        newusername.setText(username.toUpperCase());

        db = new DBHelper(this);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Integer Pd_id = 1;
                String NameTXT = editText1.getText().toString();
                String CostTXT = editText2.getText().toString();
                String QuantityTXT = editText3.getText().toString();


                if (NameTXT.equals(""))
                {
                    errorFields.setText("Please enter name of the product");
                }
                else if(CostTXT.equals(""))
                {
                    errorFields.setText("Please enter the cost of the product");
                }
                else if(QuantityTXT.equals(""))
                {
                    errorFields.setText("Please enter the quantity of the product");
                }
                else {
                    Toast.makeText(MainActivity9.this, username, Toast.LENGTH_SHORT).show();
                    int ad_id = db.GetId(username);
                    Boolean checkinsertdata = db.insertProduct(Pd_id, ad_id,NameTXT, CostTXT, QuantityTXT);

                    if (checkinsertdata == true) {
                        Toast.makeText(MainActivity9.this, "New Product Added", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity9.this, "New Entry not Added", Toast.LENGTH_SHORT).show();
                    }
                    uploadImage();
                }
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectImage();
            }
        });


    }

    private void selectImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction((Intent.ACTION_GET_CONTENT));
        startActivityForResult(intent, 100);

    }

    private void uploadImage() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Uploading Image...");
        progressDialog.show();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CANADA);
        Date now = new Date();
       // String fileName = formatter.format(now);
        String username = getIntent().getStringExtra("name");
        String fileName = username;
        storageReference = FirebaseStorage.getInstance().getReference("image/*" + fileName);
        storageReference.putFile(imageurl)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        binding.imageView20.setImageURI(null);
                        Toast.makeText(MainActivity9.this, "Image uploaded sucessfully", Toast.LENGTH_SHORT).show();
                        if (progressDialog.isShowing())
                            progressDialog.dismiss();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        if (progressDialog.isShowing())
                            progressDialog.dismiss();
                        Toast.makeText(MainActivity9.this, "Error is occured uploding the image", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100 && data != null && data.getData() != null) {
            imageurl = data.getData();
            binding.imageView20.setImageURI(imageurl);
        }
    }
}