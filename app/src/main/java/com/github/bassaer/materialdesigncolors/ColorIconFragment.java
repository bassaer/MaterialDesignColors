package com.github.bassaer.materialdesigncolors;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.bassaer.library.MDColor;

/**
 * Sample ImageView and TextView fragment
 * Created by nakayama on 2017/02/27.
 */
public class ColorIconFragment extends Fragment {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_color_icon, container, false);

        ImageView icon1 = (ImageView) rootView.findViewById(R.id.icon1);
        ImageView icon2 = (ImageView) rootView.findViewById(R.id.icon2);
        ImageView icon3 = (ImageView) rootView.findViewById(R.id.icon3);
        ImageView icon4 = (ImageView) rootView.findViewById(R.id.icon4);
        ImageView icon5 = (ImageView) rootView.findViewById(R.id.icon5);
        ImageView icon6 = (ImageView) rootView.findViewById(R.id.icon6);

        //Set icon colors
        icon1.getDrawable().setTint(MDColor.RED_500);
        icon2.getDrawable().setTint(MDColor.RED_400);
        icon3.getDrawable().setTint(MDColor.RED_300);

        icon4.getDrawable().setTint(MDColor.TEAL_500);
        icon5.getDrawable().setTint(MDColor.TEAL_400);
        icon6.getDrawable().setTint(MDColor.TEAL_300);

        TextView textView = (TextView) rootView.findViewById(R.id.text_view);
        //Set Text color
        textView.setTextColor(MDColor.YELLOW_500);
        //Set background color
        textView.setBackgroundColor(MDColor.INDIGO_500);

        return rootView;
    }
}
