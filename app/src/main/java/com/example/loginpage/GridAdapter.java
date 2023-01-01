package com.example.loginpage;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.loginpage.R;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] productName;
    int[] image;
    int[] price;

    LayoutInflater inflater;
    public GridAdapter(Context context, String[] productName, int[] image,int[] price) {
        this.context = context;
        this.productName = productName;
        this.image = image;
        this.price = price;
    }


    @Override
    public int getCount() {
        return productName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null)
        {
            view = inflater.inflate(R.layout.shoppinginterface,null);
        }

        ImageView imageView = view.findViewById(R.id.nesCafe);
        TextView textView = view.findViewById(R.id.textView44);
        TextView textView2 = view.findViewById(R.id.textView45);
        imageView.setImageResource(image[i]);
        textView.setText(productName[i]);
        textView2.setText("₹"+price[i]);
        return view;
    }
}
