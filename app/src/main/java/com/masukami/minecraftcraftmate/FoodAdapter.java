package com.masukami.minecraftcraftmate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by suhai on 9/11/2016.
 */
public class FoodAdapter extends BaseAdapter {

    private final Context mContext;
    private final String[] foods;
    private final int[] imageID;

    public FoodAdapter(Context context, String[] foods, int[] imageID){
        this.mContext = context;
        this.imageID = imageID;
        this.foods = foods;
    }

    @Override
    public int getCount() {
        return foods.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);;
            grid = inflater.inflate(R.layout.food_single, parent, false);
        } else {
            grid = (View) convertView;
        }
        TextView textView = (TextView) grid.findViewById(R.id.grid_text);
        ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
        textView.setText(foods[position]);
        imageView.setImageResource(imageID[position]);
        return grid;
    }

}
