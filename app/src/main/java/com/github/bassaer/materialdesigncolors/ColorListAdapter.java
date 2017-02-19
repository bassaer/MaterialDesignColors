package com.github.bassaer.materialdesigncolors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * List adapter for color list view
 * Created by nakayama on 2017/02/19.
 */
public class ColorListAdapter extends ArrayAdapter<ColorEntry> {
    private LayoutInflater mLayoutInflater;

    public ColorListAdapter(Context context, int resource, List<ColorEntry> objects) {
        super(context, resource, objects);
        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.color_row, null);
            holder = new ViewHolder();
            holder.colorLabel = (TextView)convertView.findViewById(R.id.color_row_label);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ColorEntry colorEntry = getItem(position);
        holder.colorLabel.setText(colorEntry.getLabel());
        holder.colorLabel.setBackgroundColor(colorEntry.getColor());

        return convertView;
    }

    class ViewHolder {
        TextView colorLabel;
    }


}
