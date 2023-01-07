package com.example.loginpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder>{
    private List<ModelClass2> userList2;

    public Adapter2(List<ModelClass2> userList)
    {
        this.userList2 = userList;
    }
    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartview,parent,false);
        return new Adapter2.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder holder, int position) {
        String productName = String.valueOf(userList2.get(position).getTextView48());
        String price = String.valueOf(userList2.get(position).getTextView49());
        int image = userList2.get(position).getImageView18();
        holder.setdata(productName,price,image);
    }

    @Override
    public int getItemCount() {
        return userList2.size();
    }

    public class Remover extends RecyclerView.ViewHolder{

        public TextView textView50;
        public Remover(@NonNull View itemView) {
            super(itemView);
            textView50 = itemView.findViewById(R.id.textView50);
            textView50.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userList2.remove(view);
                }
            });
        }

    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView48;
        private TextView textView49;
        private ImageView imageView18;
        private TextView textView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView48 = itemView.findViewById(R.id.textView48);
            textView49 = itemView.findViewById(R.id.textView49);
            imageView18= itemView.findViewById(R.id.imageView18);
            textView1 = itemView.findViewById(R.id.totalbill);
        }

        public void setdata(String productName, String price,int image) {
            textView48.setText(productName);
            textView49.setText(price);
            imageView18.setImageResource(image);
        }



    }
}
