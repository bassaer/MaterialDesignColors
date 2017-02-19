package com.github.bassaer.materialdesigncolors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.bassaer.library.MDColor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void setColors(List<ColorEntry> colors) {
        if (colors == null) {
            colors = new ArrayList<>();
        }
        //Red
        colors.add(new ColorEntry(getString(R.string.red), MDColor.RED_500));
        colors.add(new ColorEntry(getString(R.string.v_50), MDColor.RED_50));
        colors.add(new ColorEntry(getString(R.string.v_100), MDColor.RED_100));
        colors.add(new ColorEntry(getString(R.string.v_200), MDColor.RED_200));
        colors.add(new ColorEntry(getString(R.string.v_300), MDColor.RED_300));
        colors.add(new ColorEntry(getString(R.string.v_400), MDColor.RED_400));
        colors.add(new ColorEntry(getString(R.string.v_500), MDColor.RED_500));
        colors.add(new ColorEntry(getString(R.string.v_600), MDColor.RED_600));
        colors.add(new ColorEntry(getString(R.string.v_700), MDColor.RED_700));
        colors.add(new ColorEntry(getString(R.string.v_800), MDColor.RED_800));
        colors.add(new ColorEntry(getString(R.string.v_900), MDColor.RED_900));
        colors.add(new ColorEntry(getString(R.string.a_100), MDColor.RED_A_100));
        colors.add(new ColorEntry(getString(R.string.a_200), MDColor.RED_A_200));
        colors.add(new ColorEntry(getString(R.string.a_400), MDColor.RED_A_400));
        colors.add(new ColorEntry(getString(R.string.a_700), MDColor.RED_A_700));
    }
}
