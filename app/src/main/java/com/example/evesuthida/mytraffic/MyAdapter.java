package com.example.evesuthida.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eveva on 31/7/2559.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit การประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //For Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView); //ผูก imageview กับตัว Widget imageview
        iconImageView.setImageResource(iconInts[i]);

        //For Text
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2); //title
        titleTextView.setText(titleStrings[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3); //detail
        detailTextView.setText(detailStrings[i]);
        return view1;
    }
} //Main Class
