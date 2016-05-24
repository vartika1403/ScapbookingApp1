package com.example.user.scapbookingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 22-05-2016.
 */
public class CustomAdapter extends BaseAdapter {

    ArrayList<Integer> images = new ArrayList<Integer>();
    ArrayList<Integer> names = new ArrayList<>();
    Context context;

    public CustomAdapter(Context context, ArrayList<Integer> images, ArrayList<Integer> names) {
        this.images = images;
        this.names = names;
        this.context = context;
    }


    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int position) {
        return images.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_image, null, true);
        }

        ImageView ivImage = (ImageView)convertView.findViewById(R.id.ivImage);
        TextView tvImageName = (TextView)convertView.findViewById(R.id.tvImageName);
        ivImage.setImageResource(images.get(position));
        tvImageName.setText(names.get(position));

        return convertView;

        }

    }

