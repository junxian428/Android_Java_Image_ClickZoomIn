package com.example.videogame;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;
public class ImageAdapter extends BaseAdapter {
    private Context context;
    private int[] imageIds;

    public ImageAdapter(Context context, int[] imageIds) {
        this.context = context;
        this.imageIds = imageIds;
    }

    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public Object getItem(int i) {
        return imageIds[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(context);

            // Get screen height and divide by 3
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int screenHeight = displayMetrics.heightPixels;
            int itemHeight = screenHeight / 3;

            imageView.setLayoutParams(new GridView.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, itemHeight
            ));

            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(imageIds[i]);
        return imageView;
    }
}