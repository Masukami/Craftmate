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
public class MechanismAdapter extends BaseAdapter{

    private final Context mContext;
    private final String[] mechanisms;
    private final int[] imageID;
    public MechanismAdapter(Context context, String[] mechanisms, int[] imageID){
        this.mContext = context;
        this.imageID = imageID;
        this.mechanisms = mechanisms;
    }

    @Override
    public int getCount() {
        return mechanisms.length;
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
            grid = inflater.inflate(R.layout.mechanism_single, parent, false);
        } else {
            grid = (View) convertView;
        }
        TextView textView = (TextView) grid.findViewById(R.id.grid_text);
        ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
        textView.setText(mechanisms[position]);
        imageView.setImageResource(imageID[position]);
        return grid;
    }
}
