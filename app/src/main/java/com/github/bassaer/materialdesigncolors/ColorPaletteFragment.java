package com.github.bassaer.materialdesigncolors;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.github.bassaer.library.MDColor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nakayama on 2017/02/27.
 */
public class ColorPaletteFragment extends Fragment {

    public static final int NUM_OF_14_COLORS = 16;
    public static final int NUM_OF_10_COLORS = 3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_color_palette, container, false);

        TableLayout tableLayout = (TableLayout)rootView.findViewById(R.id.table_layout);

        List<View> views = new ArrayList<>();

        //Init cells
        for (int i = 0; i < NUM_OF_14_COLORS; i++) {
            getActivity().getLayoutInflater().inflate(R.layout.table_low_14_pallette, tableLayout);
            TableRow tableRow = (TableRow)tableLayout.getChildAt(i);
            views.add(tableRow.findViewById(R.id.table_row_14_50));
            views.add(tableRow.findViewById(R.id.table_row_14_100));
            views.add(tableRow.findViewById(R.id.table_row_14_200));
            views.add(tableRow.findViewById(R.id.table_row_14_300));
            views.add(tableRow.findViewById(R.id.table_row_14_400));
            views.add(tableRow.findViewById(R.id.table_row_14_500));
            views.add(tableRow.findViewById(R.id.table_row_14_600));
            views.add(tableRow.findViewById(R.id.table_row_14_700));
            views.add(tableRow.findViewById(R.id.table_row_14_800));
            views.add(tableRow.findViewById(R.id.table_row_14_900));
            views.add(tableRow.findViewById(R.id.table_row_14_a_100));
            views.add(tableRow.findViewById(R.id.table_row_14_a_200));
            views.add(tableRow.findViewById(R.id.table_row_14_a_400));
            views.add(tableRow.findViewById(R.id.table_row_14_a_700));
        }

        for (int i = 0; i < NUM_OF_10_COLORS; i++) {
            getActivity().getLayoutInflater().inflate(R.layout.table_low_10_pallette, tableLayout);
            TableRow tableRow = (TableRow)tableLayout.getChildAt(i+NUM_OF_14_COLORS);
            views.add(tableRow.findViewById(R.id.table_row_10_50));
            views.add(tableRow.findViewById(R.id.table_row_10_100));
            views.add(tableRow.findViewById(R.id.table_row_10_200));
            views.add(tableRow.findViewById(R.id.table_row_10_300));
            views.add(tableRow.findViewById(R.id.table_row_10_400));
            views.add(tableRow.findViewById(R.id.table_row_10_500));
            views.add(tableRow.findViewById(R.id.table_row_10_600));
            views.add(tableRow.findViewById(R.id.table_row_10_700));
            views.add(tableRow.findViewById(R.id.table_row_10_800));
            views.add(tableRow.findViewById(R.id.table_row_10_900));
        }

        //Set colors
        Iterator<String> iterator = MDColor.sMDColorNameMap.keySet().iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            if (counter >= views.size()) {
                break;
            }
            String key = iterator.next();
            views.get(counter).setBackgroundColor(MDColor.sMDColorNameMap.get(key));
            counter++;
        }

        return rootView;

    }


}
