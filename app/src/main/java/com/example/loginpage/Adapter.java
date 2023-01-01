package com.example.loginpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList)
    {
        this.userList = userList;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feedbackview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String username = String.valueOf(userList.get(position).getTextView());
        String feedback = String.valueOf(userList.get(position).getTextView2());

        holder.setdata(username,feedback);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView38);
            textView2 = itemView.findViewById(R.id.textView39);
        }

        public void setdata(String username, String feedback) {
            textView.setText(username);
            textView2.setText(feedback);
        }
    }
}
