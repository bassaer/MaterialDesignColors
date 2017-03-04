# MaterialDesignColors

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MaterialDesignColors-red.svg?style=flat)](https://android-arsenal.com/details/1/5384)
[![Download](https://api.bintray.com/packages/tnakayama/MaterialDesignColors/materialdesigncolors/images/download.svg) ](https://bintray.com/tnakayama/MaterialDesignColors/materialdesigncolors/_latestVersion)
[![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=9)
[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](https://github.com/bassaer/MaterialDesignColors/blob/master/LICENSE)

Android library which provides [Google Material Design Colors](https://material.io/guidelines/style/color.html)

<img src="https://github.com/bassaer/MaterialDesignColors/blob/develop/images/mdc_screen.png" height="400">

## Gradle

[![Download](https://api.bintray.com/packages/tnakayama/MaterialDesignColors/materialdesigncolors/images/download.svg) ](https://bintray.com/tnakayama/MaterialDesignColors/materialdesigncolors/_latestVersion)

```
dependencies {
    compile 'com.github.bassaer:materialdesigncolors:1.0.0'
}
```

## Usage


```
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

```

Or can be used as color resource for layout file.
 
```
<ImageView
    android:id="@+id/top_icon"
    android:layout_width="@dimen/icon_size"
    android:layout_height="@dimen/icon_size"
    android:layout_gravity="center"
    android:src="@drawable/ic_action_android"
    android:tint="@color/cyan_500"/>
```

## Licence

```
MIT License

Copyright (c) 2017 Tsubasa Nakayama

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
