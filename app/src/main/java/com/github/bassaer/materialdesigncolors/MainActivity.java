package com.github.bassaer.materialdesigncolors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.bassaer.MDColor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text_view);
        textView.setBackgroundColor(MDColor.BLUE_GREY_500);
    }
}
