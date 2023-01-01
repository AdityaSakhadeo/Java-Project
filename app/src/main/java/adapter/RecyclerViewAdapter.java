package adapter;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginpage.MainActivity13;
import com.example.loginpage.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<String> username;
    private List<String> feedback;

    public RecyclerViewAdapter(Context context, List<String> username) {
    this.context = context;
    this.username = username;
    }

    //What do you want to show repeatedly
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feedbackview,parent,false);
        return new ViewHolder(view);
    }

    //Tells us what will happen when we create the view-holder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        String Uname = username.get(position);
        String Fback = feedback.get(position);
        holder.username.setText(Uname);
        holder.feedback.setText(Fback);
    }

    //How many Items
    @Override
    public int getItemCount() {
        return username.size();
    }

    //Here first of all the empty card is received
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView username;
        public TextView feedback;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            username = itemView.findViewById(R.id.textView38);
            feedback = itemView.findViewById(R.id.textView39);



        }

        @Override
        public void onClick(View view) {

        }
    }
}
