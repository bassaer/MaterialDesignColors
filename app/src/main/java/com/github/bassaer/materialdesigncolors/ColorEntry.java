package com.github.bassaer.materialdesigncolors;

/**
 * Color label data
 * Created by nakayama on 2017/02/19.
 */
public class ColorEntry {
    /**
     * Name of color
     */
    private String mLabel;

    /**
     * Color value
     */
    private int color;

    /**
     * Constructor
     * @param label Name of color
     * @param color Color value
     */
    public ColorEntry(String label, int color) {
        mLabel = label;
        this.color = color;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
