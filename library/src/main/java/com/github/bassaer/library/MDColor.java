package com.github.bassaer.library;

import android.support.annotation.ColorInt;

import java.util.HashMap;

/**
 * Material Design Color<br>
 * from
 * <a href="https://material.io/guidelines/style/color.html">Google Style Color</a>
 * Created by nakayama on 2017/02/18.
 */
public class MDColor {

    @ColorInt public static final int RED_50 = 0xFFFFEBEE;
    @ColorInt public static final int RED_100 = 0xFFFFCDD2;
    @ColorInt public static final int RED_200 = 0xFFEF9A9A;
    @ColorInt public static final int RED_300 = 0xFFE57373;
    @ColorInt public static final int RED_400 = 0xFFEF5350;
    @ColorInt public static final int RED_500 = 0xFFF44336;
    @ColorInt public static final int RED_600 = 0xFFE53935;
    @ColorInt public static final int RED_700 = 0xFFD32F2F;
    @ColorInt public static final int RED_800 = 0xFFC62828;
    @ColorInt public static final int RED_900 = 0xFFB71C1C;
    @ColorInt public static final int RED_A_100 = 0xFFFF8A80;
    @ColorInt public static final int RED_A_200 = 0xFFFF5252;
    @ColorInt public static final int RED_A_400 = 0xFFFF1744;
    @ColorInt public static final int RED_A_700 = 0xFFD50000;

    @ColorInt public static final int PINK_50 = 0xFFFCE4EC;
    @ColorInt public static final int PINK_100 = 0xFFF8BBD0;
    @ColorInt public static final int PINK_200 = 0xFFF48FB1;
    @ColorInt public static final int PINK_300 = 0xFFF06292;
    @ColorInt public static final int PINK_400 = 0xFFEC407A;
    @ColorInt public static final int PINK_500 = 0xFFE91E63;
    @ColorInt public static final int PINK_600 = 0xFFD81B60;
    @ColorInt public static final int PINK_700 = 0xFFC2185B;
    @ColorInt public static final int PINK_800 = 0xFFAD1457;
    @ColorInt public static final int PINK_900 = 0xFF880E4F;
    @ColorInt public static final int PINK_A_100 = 0xFFFF80AB;
    @ColorInt public static final int PINK_A_200 = 0xFFFF4081;
    @ColorInt public static final int PINK_A_400 = 0xFFF50057;
    @ColorInt public static final int PINK_A_700 = 0xFFC51162;

    @ColorInt public static final int PURPLE_50 = 0xFFF3E5F5;
    @ColorInt public static final int PURPLE_100 = 0xFFE1BEE7;
    @ColorInt public static final int PURPLE_200 = 0xFFCE93D8;
    @ColorInt public static final int PURPLE_300 = 0xFFBA68C8;
    @ColorInt public static final int PURPLE_400 = 0xFFAB47BC;
    @ColorInt public static final int PURPLE_500 = 0xFF9C27B0;
    @ColorInt public static final int PURPLE_600 = 0xFF8E24AA;
    @ColorInt public static final int PURPLE_700 = 0xFF7B1FA2;
    @ColorInt public static final int PURPLE_800 = 0xFF6A1B9A;
    @ColorInt public static final int PURPLE_900 = 0xFF4A148C;
    @ColorInt public static final int PURPLE_A_100 = 0xFFEA80FC;
    @ColorInt public static final int PURPLE_A_200 = 0xFFE040FB;
    @ColorInt public static final int PURPLE_A_400 = 0xFFD500F9;
    @ColorInt public static final int PURPLE_A_700 = 0xFFAA00FF;

    @ColorInt public static final int DEEP_PURPLE_50 = 0xFFEDE7F6;
    @ColorInt public static final int DEEP_PURPLE_100 = 0xFFD1C4E9;
    @ColorInt public static final int DEEP_PURPLE_200 = 0xFFB39DDB;
    @ColorInt public static final int DEEP_PURPLE_300 = 0xFF9575CD;
    @ColorInt public static final int DEEP_PURPLE_400 = 0xFF7E57C2;
    @ColorInt public static final int DEEP_PURPLE_500 = 0xFF673AB7;
    @ColorInt public static final int DEEP_PURPLE_600 = 0xFF5E35B1;
    @ColorInt public static final int DEEP_PURPLE_700 = 0xFF512DA8;
    @ColorInt public static final int DEEP_PURPLE_800 = 0xFF4527A0;
    @ColorInt public static final int DEEP_PURPLE_900 = 0xFF311B92;
    @ColorInt public static final int DEEP_PURPLE_A_100 = 0xFFB388FF;
    @ColorInt public static final int DEEP_PURPLE_A_200 = 0xFF7C4DFF;
    @ColorInt public static final int DEEP_PURPLE_A_400 = 0xFF651FFF;
    @ColorInt public static final int DEEP_PURPLE_A_700 = 0xFF6200EA;

    @ColorInt public static final int INDIGO_50 = 0xFFE8EAF6;
    @ColorInt public static final int INDIGO_100 = 0xFFC5CAE9;
    @ColorInt public static final int INDIGO_200 = 0xFF9FA8DA;
    @ColorInt public static final int INDIGO_300 = 0xFF7986CB;
    @ColorInt public static final int INDIGO_400 = 0xFF5C6BC0;
    @ColorInt public static final int INDIGO_500 = 0xFF3F51B5;
    @ColorInt public static final int INDIGO_600 = 0xFF3949AB;
    @ColorInt public static final int INDIGO_700 = 0xFF303F9F;
    @ColorInt public static final int INDIGO_800 = 0xFF283593;
    @ColorInt public static final int INDIGO_900 = 0xFF1A237E;
    @ColorInt public static final int INDIGO_A_100 = 0xFF8C9EFF;
    @ColorInt public static final int INDIGO_A_200 = 0xFF536DFE;
    @ColorInt public static final int INDIGO_A_400 = 0xFF3D5AFE;
    @ColorInt public static final int INDIGO_A_700 = 0xFF304FFE;

    @ColorInt public static final int BLUE_50 = 0xFFE3F2FD;
    @ColorInt public static final int BLUE_100 = 0xFFBBDEFB;
    @ColorInt public static final int BLUE_200 = 0xFF90CAF9;
    @ColorInt public static final int BLUE_300 = 0xFF64B5F6;
    @ColorInt public static final int BLUE_400 = 0xFF42A5F5;
    @ColorInt public static final int BLUE_500 = 0xFF2196F3;
    @ColorInt public static final int BLUE_600 = 0xFF1E88E5;
    @ColorInt public static final int BLUE_700 = 0xFF1976D2;
    @ColorInt public static final int BLUE_800 = 0xFF1565C0;
    @ColorInt public static final int BLUE_900 = 0xFF0D47A1;
    @ColorInt public static final int BLUE_A_100 = 0xFF82B1FF;
    @ColorInt public static final int BLUE_A_200 = 0xFF448AFF;
    @ColorInt public static final int BLUE_A_400 = 0xFF2979FF;
    @ColorInt public static final int BLUE_A_700 = 0xFF2962FF;

    @ColorInt public static final int LIGHT_BLUE_50 = 0xFFE1F5FE;
    @ColorInt public static final int LIGHT_BLUE_100 = 0xFFB3E5FC;
    @ColorInt public static final int LIGHT_BLUE_200 = 0xFF81D4FA;
    @ColorInt public static final int LIGHT_BLUE_300 = 0xFF4FC3F7;
    @ColorInt public static final int LIGHT_BLUE_400 = 0xFF29B6F6;
    @ColorInt public static final int LIGHT_BLUE_500 = 0xFF03A9F4;
    @ColorInt public static final int LIGHT_BLUE_600 = 0xFF039BE5;
    @ColorInt public static final int LIGHT_BLUE_700 = 0xFF0288D1;
    @ColorInt public static final int LIGHT_BLUE_800 = 0xFF0277BD;
    @ColorInt public static final int LIGHT_BLUE_900 = 0xFF01579B;
    @ColorInt public static final int LIGHT_BLUE_A_100 = 0xFF80D8FF;
    @ColorInt public static final int LIGHT_BLUE_A_200 = 0xFF40C4FF;
    @ColorInt public static final int LIGHT_BLUE_A_400 = 0xFF00B0FF;
    @ColorInt public static final int LIGHT_BLUE_A_700 = 0xFF0091EA;

    @ColorInt public static final int CYAN_50 = 0xFFE0F7FA;
    @ColorInt public static final int CYAN_100 = 0xFFB2EBF2;
    @ColorInt public static final int CYAN_200 = 0xFF80DEEA;
    @ColorInt public static final int CYAN_300 = 0xFF4DD0E1;
    @ColorInt public static final int CYAN_400 = 0xFF26C6DA;
    @ColorInt public static final int CYAN_500 = 0xFF00BCD4;
    @ColorInt public static final int CYAN_600 = 0xFF00ACC1;
    @ColorInt public static final int CYAN_700 = 0xFF0097A7;
    @ColorInt public static final int CYAN_800 = 0xFF00838F;
    @ColorInt public static final int CYAN_900 = 0xFF006064;
    @ColorInt public static final int CYAN_A_100 = 0xFF84FFFF;
    @ColorInt public static final int CYAN_A_200 = 0xFF18FFFF;
    @ColorInt public static final int CYAN_A_400 = 0xFF00E5FF;
    @ColorInt public static final int CYAN_A_700 = 0xFF00B8D4;

    @ColorInt public static final int TEAL_50 = 0xFFE0F2F1;
    @ColorInt public static final int TEAL_100 = 0xFFB2DFDB;
    @ColorInt public static final int TEAL_200 = 0xFF80CBC4;
    @ColorInt public static final int TEAL_300 = 0xFF4DB6AC;
    @ColorInt public static final int TEAL_400 = 0xFF26A69A;
    @ColorInt public static final int TEAL_500 = 0xFF009688;
    @ColorInt public static final int TEAL_600 = 0xFF00897B;
    @ColorInt public static final int TEAL_700 = 0xFF00796B;
    @ColorInt public static final int TEAL_800 = 0xFF00695C;
    @ColorInt public static final int TEAL_900 = 0xFF004D40;
    @ColorInt public static final int TEAL_A_100 = 0xFFA7FFEB;
    @ColorInt public static final int TEAL_A_200 = 0xFF64FFDA;
    @ColorInt public static final int TEAL_A_400 = 0xFF1DE9B6;
    @ColorInt public static final int TEAL_A_700 = 0xFF00BFA5;

    @ColorInt public static final int GREEN_50 = 0xFFE8F5E9;
    @ColorInt public static final int GREEN_100 = 0xFFC8E6C9;
    @ColorInt public static final int GREEN_200 = 0xFFA5D6A7;
    @ColorInt public static final int GREEN_300 = 0xFF81C784;
    @ColorInt public static final int GREEN_400 = 0xFF66BB6A;
    @ColorInt public static final int GREEN_500 = 0xFF4CAF50;
    @ColorInt public static final int GREEN_600 = 0xFF43A047;
    @ColorInt public static final int GREEN_700 = 0xFF388E3C;
    @ColorInt public static final int GREEN_800 = 0xFF2E7D32;
    @ColorInt public static final int GREEN_900 = 0xFF1B5E20;
    @ColorInt public static final int GREEN_A_100 = 0xFFB9F6CA;
    @ColorInt public static final int GREEN_A_200 = 0xFF69F0AE;
    @ColorInt public static final int GREEN_A_400 = 0xFF00E676;
    @ColorInt public static final int GREEN_A_700 = 0xFF00C853;

    @ColorInt public static final int LIGHT_GREEN_50 = 0xFFF1F8E9;
    @ColorInt public static final int LIGHT_GREEN_100 = 0xFFDCEDC8;
    @ColorInt public static final int LIGHT_GREEN_200 = 0xFFC5E1A5;
    @ColorInt public static final int LIGHT_GREEN_300 = 0xFFAED581;
    @ColorInt public static final int LIGHT_GREEN_400 = 0xFF9CCC65;
    @ColorInt public static final int LIGHT_GREEN_500 = 0xFF8BC34A;
    @ColorInt public static final int LIGHT_GREEN_600 = 0xFF7CB342;
    @ColorInt public static final int LIGHT_GREEN_700 = 0xFF689F38;
    @ColorInt public static final int LIGHT_GREEN_800 = 0xFF558B2F;
    @ColorInt public static final int LIGHT_GREEN_900 = 0xFF33691E;
    @ColorInt public static final int LIGHT_GREEN_A_100 = 0xFFCCFF90;
    @ColorInt public static final int LIGHT_GREEN_A_200 = 0xFFB2FF59;
    @ColorInt public static final int LIGHT_GREEN_A_400 = 0xFF76FF03;
    @ColorInt public static final int LIGHT_GREEN_A_700 = 0xFF64DD17;

    @ColorInt public static final int LIME_50 = 0xFFF9FBE7;
    @ColorInt public static final int LIME_100 = 0xFFF0F4C3;
    @ColorInt public static final int LIME_200 = 0xFFE6EE9C;
    @ColorInt public static final int LIME_300 = 0xFFDCE775;
    @ColorInt public static final int LIME_400 = 0xFFD4E157;
    @ColorInt public static final int LIME_500 = 0xFFCDDC39;
    @ColorInt public static final int LIME_600 = 0xFFC0CA33;
    @ColorInt public static final int LIME_700 = 0xFFAFB42B;
    @ColorInt public static final int LIME_800 = 0xFF9E9D24;
    @ColorInt public static final int LIME_900 = 0xFF827717;
    @ColorInt public static final int LIME_A_100 = 0xFFF4FF81;
    @ColorInt public static final int LIME_A_200 = 0xFFEEFF41;
    @ColorInt public static final int LIME_A_400 = 0xFFC6FF00;
    @ColorInt public static final int LIME_A_700 = 0xFFAEEA00;

    @ColorInt public static final int YELLOW_50 = 0xFFFFFDE7;
    @ColorInt public static final int YELLOW_100 = 0xFFFFF9C4;
    @ColorInt public static final int YELLOW_200 = 0xFFFFF59D;
    @ColorInt public static final int YELLOW_300 = 0xFFFFF176;
    @ColorInt public static final int YELLOW_400 = 0xFFFFEE58;
    @ColorInt public static final int YELLOW_500 = 0xFFFFEB3B;
    @ColorInt public static final int YELLOW_600 = 0xFFFDD835;
    @ColorInt public static final int YELLOW_700 = 0xFFFBC02D;
    @ColorInt public static final int YELLOW_800 = 0xFFF9A825;
    @ColorInt public static final int YELLOW_900 = 0xFFF57F17;
    @ColorInt public static final int YELLOW_A_100 = 0xFFFFFF8D;
    @ColorInt public static final int YELLOW_A_200 = 0xFFFFFF00;
    @ColorInt public static final int YELLOW_A_400 = 0xFFFFEA00;
    @ColorInt public static final int YELLOW_A_700 = 0xFFFFD600;

    @ColorInt public static final int AMBER_50 = 0xFFFFF8E1;
    @ColorInt public static final int AMBER_100 = 0xFFFFECB3;
    @ColorInt public static final int AMBER_200 = 0xFFFFE082;
    @ColorInt public static final int AMBER_300 = 0xFFFFD54F;
    @ColorInt public static final int AMBER_400 = 0xFFFFCA28;
    @ColorInt public static final int AMBER_500 = 0xFFFFC107;
    @ColorInt public static final int AMBER_600 = 0xFFFFB300;
    @ColorInt public static final int AMBER_700 = 0xFFFFA000;
    @ColorInt public static final int AMBER_800 = 0xFFFF8F00;
    @ColorInt public static final int AMBER_900 = 0xFFFF6F00;
    @ColorInt public static final int AMBER_A_100 = 0xFFFFE57F;
    @ColorInt public static final int AMBER_A_200 = 0xFFFFD740;
    @ColorInt public static final int AMBER_A_400 = 0xFFFFC400;
    @ColorInt public static final int AMBER_A_700 = 0xFFFFAB00;

    @ColorInt public static final int ORANGE_50 = 0xFFFFF3E0;
    @ColorInt public static final int ORANGE_100 = 0xFFFFE0B2;
    @ColorInt public static final int ORANGE_200 = 0xFFFFCC80;
    @ColorInt public static final int ORANGE_300 = 0xFFFFB74D;
    @ColorInt public static final int ORANGE_400 = 0xFFFFA726;
    @ColorInt public static final int ORANGE_500 = 0xFFFF9800;
    @ColorInt public static final int ORANGE_600 = 0xFFFB8C00;
    @ColorInt public static final int ORANGE_700 = 0xFFF57C00;
    @ColorInt public static final int ORANGE_800 = 0xFFEF6C00;
    @ColorInt public static final int ORANGE_900 = 0xFFE65100;
    @ColorInt public static final int ORANGE_A_100 = 0xFFFFD180;
    @ColorInt public static final int ORANGE_A_200 = 0xFFFFAB40;
    @ColorInt public static final int ORANGE_A_400 = 0xFFFF9100;
    @ColorInt public static final int ORANGE_A_700 = 0xFFFF6D00;

    @ColorInt public static final int DEEP_ORANGE_50 = 0xFFFBE9E7;
    @ColorInt public static final int DEEP_ORANGE_100 = 0xFFFFCCBC;
    @ColorInt public static final int DEEP_ORANGE_200 = 0xFFFFAB91;
    @ColorInt public static final int DEEP_ORANGE_300 = 0xFFFF8A65;
    @ColorInt public static final int DEEP_ORANGE_400 = 0xFFFF7043;
    @ColorInt public static final int DEEP_ORANGE_500 = 0xFFFF5722;
    @ColorInt public static final int DEEP_ORANGE_600 = 0xFFF4511E;
    @ColorInt public static final int DEEP_ORANGE_700 = 0xFFE64A19;
    @ColorInt public static final int DEEP_ORANGE_800 = 0xFFD84315;
    @ColorInt public static final int DEEP_ORANGE_900 = 0xFFBF360C;
    @ColorInt public static final int DEEP_ORANGE_A_100 = 0xFFFF9E80;
    @ColorInt public static final int DEEP_ORANGE_A_200 = 0xFFFF6E40;
    @ColorInt public static final int DEEP_ORANGE_A_400 = 0xFFFF3D00;
    @ColorInt public static final int DEEP_ORANGE_A_700 = 0xFFDD2C00;

    @ColorInt public static final int BROWN_50 = 0xFFEFEBE9;
    @ColorInt public static final int BROWN_100 = 0xFFD7CCC8;
    @ColorInt public static final int BROWN_200 = 0xFFBCAAA4;
    @ColorInt public static final int BROWN_300 = 0xFFA1887F;
    @ColorInt public static final int BROWN_400 = 0xFF8D6E63;
    @ColorInt public static final int BROWN_500 = 0xFF795548;
    @ColorInt public static final int BROWN_600 = 0xFF6D4C41;
    @ColorInt public static final int BROWN_700 = 0xFF5D4037;
    @ColorInt public static final int BROWN_800 = 0xFF4E342E;
    @ColorInt public static final int BROWN_900 = 0xFF3E2723;

    @ColorInt public static final int GREY_50 = 0xFFFAFAFA;
    @ColorInt public static final int GREY_100 = 0xFFF5F5F5;
    @ColorInt public static final int GREY_200 = 0xFFEEEEEE;
    @ColorInt public static final int GREY_300 = 0xFFE0E0E0;
    @ColorInt public static final int GREY_400 = 0xFFBDBDBD;
    @ColorInt public static final int GREY_500 = 0xFF9E9E9E;
    @ColorInt public static final int GREY_600 = 0xFF757575;
    @ColorInt public static final int GREY_700 = 0xFF616161;
    @ColorInt public static final int GREY_800 = 0xFF424242;
    @ColorInt public static final int GREY_900 = 0xFF212121;

    @ColorInt public static final int BLUE_GREY_50 = 0xFFECEFF1;
    @ColorInt public static final int BLUE_GREY_100 = 0xFFCFD8DC;
    @ColorInt public static final int BLUE_GREY_200 = 0xFFB0BEC5;
    @ColorInt public static final int BLUE_GREY_300 = 0xFF90A4AE;
    @ColorInt public static final int BLUE_GREY_400 = 0xFF78909C;
    @ColorInt public static final int BLUE_GREY_500 = 0xFF607D8B;
    @ColorInt public static final int BLUE_GREY_600 = 0xFF546E7A;
    @ColorInt public static final int BLUE_GREY_700 = 0xFF455A64;
    @ColorInt public static final int BLUE_GREY_800 = 0xFF37474F;
    @ColorInt public static final int BLUE_GREY_900 = 0xFF263238;

    @ColorInt public static final int BLACK = 0xFF000000;
    @ColorInt public static final int WHITE = 0xFFFFFFFF;

    public static final HashMap<String, Integer> sMDColorNameMap;

    static {
        sMDColorNameMap = new HashMap<>();
        sMDColorNameMap.put("red_50", RED_50);
        sMDColorNameMap.put("red_100", RED_100);
        sMDColorNameMap.put("red_200", RED_200);
        sMDColorNameMap.put("red_300", RED_300);
        sMDColorNameMap.put("red_400", RED_400);
        sMDColorNameMap.put("red_500", RED_500);
        sMDColorNameMap.put("red_600", RED_600);
        sMDColorNameMap.put("red_700", RED_700);
        sMDColorNameMap.put("red_800", RED_800);
        sMDColorNameMap.put("red_900", RED_900);
        sMDColorNameMap.put("red_a_100", RED_A_100);
        sMDColorNameMap.put("red_a_200", RED_A_200);
        sMDColorNameMap.put("red_a_400", RED_A_400);
        sMDColorNameMap.put("red_a_700", RED_A_700);

        sMDColorNameMap.put("pink_50", PINK_50);
        sMDColorNameMap.put("pink_100", PINK_100);
        sMDColorNameMap.put("pink_200", PINK_200);
        sMDColorNameMap.put("pink_300", PINK_300);
        sMDColorNameMap.put("pink_400", PINK_400);
        sMDColorNameMap.put("pink_500", PINK_500);
        sMDColorNameMap.put("pink_600", PINK_600);
        sMDColorNameMap.put("pink_700", PINK_700);
        sMDColorNameMap.put("pink_800", PINK_800);
        sMDColorNameMap.put("pink_900", PINK_900);
        sMDColorNameMap.put("pink_a_100", PINK_A_100);
        sMDColorNameMap.put("pink_a_200", PINK_A_200);
        sMDColorNameMap.put("pink_a_400", PINK_A_400);
        sMDColorNameMap.put("pink_a_700", PINK_A_700);

        sMDColorNameMap.put("purple_50", PURPLE_50);
        sMDColorNameMap.put("purple_100", PURPLE_100);
        sMDColorNameMap.put("purple_200", PURPLE_200);
        sMDColorNameMap.put("purple_300", PURPLE_300);
        sMDColorNameMap.put("purple_400", PURPLE_400);
        sMDColorNameMap.put("purple_500", PURPLE_500);
        sMDColorNameMap.put("purple_600", PURPLE_600);
        sMDColorNameMap.put("purple_700", PURPLE_700);
        sMDColorNameMap.put("purple_800", PURPLE_800);
        sMDColorNameMap.put("purple_900", PURPLE_900);
        sMDColorNameMap.put("purple_a_100", PURPLE_A_100);
        sMDColorNameMap.put("purple_a_200", PURPLE_A_200);
        sMDColorNameMap.put("purple_a_400", PURPLE_A_400);
        sMDColorNameMap.put("purple_a_700", PURPLE_A_700);

        sMDColorNameMap.put("deep_purple_50", DEEP_PURPLE_50);
        sMDColorNameMap.put("deep_purple_100", DEEP_PURPLE_100);
        sMDColorNameMap.put("deep_purple_200", DEEP_PURPLE_200);
        sMDColorNameMap.put("deep_purple_300", DEEP_PURPLE_300);
        sMDColorNameMap.put("deep_purple_400", DEEP_PURPLE_400);
        sMDColorNameMap.put("deep_purple_500", DEEP_PURPLE_500);
        sMDColorNameMap.put("deep_purple_600", DEEP_PURPLE_600);
        sMDColorNameMap.put("deep_purple_700", DEEP_PURPLE_700);
        sMDColorNameMap.put("deep_purple_800", DEEP_PURPLE_800);
        sMDColorNameMap.put("deep_purple_900", DEEP_PURPLE_900);
        sMDColorNameMap.put("deep_purple_a_100", DEEP_PURPLE_A_100);
        sMDColorNameMap.put("deep_purple_a_200", DEEP_PURPLE_A_200);
        sMDColorNameMap.put("deep_purple_a_400", DEEP_PURPLE_A_400);
        sMDColorNameMap.put("deep_purple_a_700", DEEP_PURPLE_A_700);

        sMDColorNameMap.put("indigo_50", INDIGO_50);
        sMDColorNameMap.put("indigo_100", INDIGO_100);
        sMDColorNameMap.put("indigo_200", INDIGO_200);
        sMDColorNameMap.put("indigo_300", INDIGO_300);
        sMDColorNameMap.put("indigo_400", INDIGO_400);
        sMDColorNameMap.put("indigo_500", INDIGO_500);
        sMDColorNameMap.put("indigo_600", INDIGO_600);
        sMDColorNameMap.put("indigo_700", INDIGO_700);
        sMDColorNameMap.put("indigo_800", INDIGO_800);
        sMDColorNameMap.put("indigo_900", INDIGO_900);
        sMDColorNameMap.put("indigo_a_100", INDIGO_A_100);
        sMDColorNameMap.put("indigo_a_200", INDIGO_A_200);
        sMDColorNameMap.put("indigo_a_400", INDIGO_A_400);
        sMDColorNameMap.put("indigo_a_700", INDIGO_A_700);

        sMDColorNameMap.put("blue_50", BLUE_50);
        sMDColorNameMap.put("blue_100", BLUE_100);
        sMDColorNameMap.put("blue_200", BLUE_200);
        sMDColorNameMap.put("blue_300", BLUE_300);
        sMDColorNameMap.put("blue_400", BLUE_400);
        sMDColorNameMap.put("blue_500", BLUE_500);
        sMDColorNameMap.put("blue_600", BLUE_600);
        sMDColorNameMap.put("blue_700", BLUE_700);
        sMDColorNameMap.put("blue_800", BLUE_800);
        sMDColorNameMap.put("blue_900", BLUE_900);
        sMDColorNameMap.put("blue_a_100", BLUE_A_100);
        sMDColorNameMap.put("blue_a_200", BLUE_A_200);
        sMDColorNameMap.put("blue_a_400", BLUE_A_400);
        sMDColorNameMap.put("blue_a_700", BLUE_A_700);

        sMDColorNameMap.put("light_blue_50", LIGHT_BLUE_50);
        sMDColorNameMap.put("light_blue_100", LIGHT_BLUE_100);
        sMDColorNameMap.put("light_blue_200", LIGHT_BLUE_200);
        sMDColorNameMap.put("light_blue_300", LIGHT_BLUE_300);
        sMDColorNameMap.put("light_blue_400", LIGHT_BLUE_400);
        sMDColorNameMap.put("light_blue_500", LIGHT_BLUE_500);
        sMDColorNameMap.put("light_blue_600", LIGHT_BLUE_600);
        sMDColorNameMap.put("light_blue_700", LIGHT_BLUE_700);
        sMDColorNameMap.put("light_blue_800", LIGHT_BLUE_800);
        sMDColorNameMap.put("light_blue_900", LIGHT_BLUE_900);
        sMDColorNameMap.put("light_blue_a_100", LIGHT_BLUE_A_100);
        sMDColorNameMap.put("light_blue_a_200", LIGHT_BLUE_A_200);
        sMDColorNameMap.put("light_blue_a_400", LIGHT_BLUE_A_400);
        sMDColorNameMap.put("light_blue_a_700", LIGHT_BLUE_A_700);

        sMDColorNameMap.put("cyan_50", CYAN_50);
        sMDColorNameMap.put("cyan_100", CYAN_100);
        sMDColorNameMap.put("cyan_200", CYAN_200);
        sMDColorNameMap.put("cyan_300", CYAN_300);
        sMDColorNameMap.put("cyan_400", CYAN_400);
        sMDColorNameMap.put("cyan_500", CYAN_500);
        sMDColorNameMap.put("cyan_600", CYAN_600);
        sMDColorNameMap.put("cyan_700", CYAN_700);
        sMDColorNameMap.put("cyan_800", CYAN_800);
        sMDColorNameMap.put("cyan_900", CYAN_900);
        sMDColorNameMap.put("cyan_a_100", CYAN_A_100);
        sMDColorNameMap.put("cyan_a_200", CYAN_A_200);
        sMDColorNameMap.put("cyan_a_400", CYAN_A_400);
        sMDColorNameMap.put("cyan_a_700", CYAN_A_700);

        sMDColorNameMap.put("teal_50", TEAL_50);
        sMDColorNameMap.put("teal_100", TEAL_100);
        sMDColorNameMap.put("teal_200", TEAL_200);
        sMDColorNameMap.put("teal_300", TEAL_300);
        sMDColorNameMap.put("teal_400", TEAL_400);
        sMDColorNameMap.put("teal_500", TEAL_500);
        sMDColorNameMap.put("teal_600", TEAL_600);
        sMDColorNameMap.put("teal_700", TEAL_700);
        sMDColorNameMap.put("teal_800", TEAL_800);
        sMDColorNameMap.put("teal_900", TEAL_900);
        sMDColorNameMap.put("teal_a_100", TEAL_A_100);
        sMDColorNameMap.put("teal_a_200", TEAL_A_200);
        sMDColorNameMap.put("teal_a_400", TEAL_A_400);
        sMDColorNameMap.put("teal_a_700", TEAL_A_700);

        sMDColorNameMap.put("green_50", GREEN_50);
        sMDColorNameMap.put("green_100", GREEN_100);
        sMDColorNameMap.put("green_200", GREEN_200);
        sMDColorNameMap.put("green_300", GREEN_300);
        sMDColorNameMap.put("green_400", GREEN_400);
        sMDColorNameMap.put("green_500", GREEN_500);
        sMDColorNameMap.put("green_600", GREEN_600);
        sMDColorNameMap.put("green_700", GREEN_700);
        sMDColorNameMap.put("green_800", GREEN_800);
        sMDColorNameMap.put("green_900", GREEN_900);
        sMDColorNameMap.put("green_a_100", GREEN_A_100);
        sMDColorNameMap.put("green_a_200", GREEN_A_200);
        sMDColorNameMap.put("green_a_400", GREEN_A_400);
        sMDColorNameMap.put("green_a_700", GREEN_A_700);

        sMDColorNameMap.put("light_green_50", LIGHT_GREEN_50);
        sMDColorNameMap.put("light_green_100", LIGHT_GREEN_100);
        sMDColorNameMap.put("light_green_200", LIGHT_GREEN_200);
        sMDColorNameMap.put("light_green_300", LIGHT_GREEN_300);
        sMDColorNameMap.put("light_green_400", LIGHT_GREEN_400);
        sMDColorNameMap.put("light_green_500", LIGHT_GREEN_500);
        sMDColorNameMap.put("light_green_600", LIGHT_GREEN_600);
        sMDColorNameMap.put("light_green_700", LIGHT_GREEN_700);
        sMDColorNameMap.put("light_green_800", LIGHT_GREEN_800);
        sMDColorNameMap.put("light_green_900", LIGHT_GREEN_900);
        sMDColorNameMap.put("light_green_a_100", LIGHT_GREEN_A_100);
        sMDColorNameMap.put("light_green_a_200", LIGHT_GREEN_A_200);
        sMDColorNameMap.put("light_green_a_400", LIGHT_GREEN_A_400);
        sMDColorNameMap.put("light_green_a_700", LIGHT_GREEN_A_700);

        sMDColorNameMap.put("lime_50", LIME_50);
        sMDColorNameMap.put("lime_100", LIME_100);
        sMDColorNameMap.put("lime_200", LIME_200);
        sMDColorNameMap.put("lime_300", LIME_300);
        sMDColorNameMap.put("lime_400", LIME_400);
        sMDColorNameMap.put("lime_500", LIME_500);
        sMDColorNameMap.put("lime_600", LIME_600);
        sMDColorNameMap.put("lime_700", LIME_700);
        sMDColorNameMap.put("lime_800", LIME_800);
        sMDColorNameMap.put("lime_900", LIME_900);
        sMDColorNameMap.put("lime_a_100", LIME_A_100);
        sMDColorNameMap.put("lime_a_200", LIME_A_200);
        sMDColorNameMap.put("lime_a_400", LIME_A_400);
        sMDColorNameMap.put("lime_a_700", LIME_A_700);

        sMDColorNameMap.put("yellow_50", YELLOW_50);
        sMDColorNameMap.put("yellow_100", YELLOW_100);
        sMDColorNameMap.put("yellow_200", YELLOW_200);
        sMDColorNameMap.put("yellow_300", YELLOW_300);
        sMDColorNameMap.put("yellow_400", YELLOW_400);
        sMDColorNameMap.put("yellow_500", YELLOW_500);
        sMDColorNameMap.put("yellow_600", YELLOW_600);
        sMDColorNameMap.put("yellow_700", YELLOW_700);
        sMDColorNameMap.put("yellow_800", YELLOW_800);
        sMDColorNameMap.put("yellow_900", YELLOW_900);
        sMDColorNameMap.put("yellow_a_100", YELLOW_A_100);
        sMDColorNameMap.put("yellow_a_200", YELLOW_A_200);
        sMDColorNameMap.put("yellow_a_400", YELLOW_A_400);
        sMDColorNameMap.put("yellow_a_700", YELLOW_A_700);

        sMDColorNameMap.put("amber_50", AMBER_50);
        sMDColorNameMap.put("amber_100", AMBER_100);
        sMDColorNameMap.put("amber_200", AMBER_200);
        sMDColorNameMap.put("amber_300", AMBER_300);
        sMDColorNameMap.put("amber_400", AMBER_400);
        sMDColorNameMap.put("amber_500", AMBER_500);
        sMDColorNameMap.put("amber_600", AMBER_600);
        sMDColorNameMap.put("amber_700", AMBER_700);
        sMDColorNameMap.put("amber_800", AMBER_800);
        sMDColorNameMap.put("amber_900", AMBER_900);
        sMDColorNameMap.put("amber_a_100", AMBER_A_100);
        sMDColorNameMap.put("amber_a_200", AMBER_A_200);
        sMDColorNameMap.put("amber_a_400", AMBER_A_400);
        sMDColorNameMap.put("amber_a_700", AMBER_A_700);

        sMDColorNameMap.put("orange_50", ORANGE_50);
        sMDColorNameMap.put("orange_100", ORANGE_100);
        sMDColorNameMap.put("orange_200", ORANGE_200);
        sMDColorNameMap.put("orange_300", ORANGE_300);
        sMDColorNameMap.put("orange_400", ORANGE_400);
        sMDColorNameMap.put("orange_500", ORANGE_500);
        sMDColorNameMap.put("orange_600", ORANGE_600);
        sMDColorNameMap.put("orange_700", ORANGE_700);
        sMDColorNameMap.put("orange_800", ORANGE_800);
        sMDColorNameMap.put("orange_900", ORANGE_900);
        sMDColorNameMap.put("orange_a_100", ORANGE_A_100);
        sMDColorNameMap.put("orange_a_200", ORANGE_A_200);
        sMDColorNameMap.put("orange_a_400", ORANGE_A_400);
        sMDColorNameMap.put("orange_a_700", ORANGE_A_700);

        sMDColorNameMap.put("deep_orange_50", DEEP_ORANGE_50);
        sMDColorNameMap.put("deep_orange_100", DEEP_ORANGE_100);
        sMDColorNameMap.put("deep_orange_200", DEEP_ORANGE_200);
        sMDColorNameMap.put("deep_orange_300", DEEP_ORANGE_300);
        sMDColorNameMap.put("deep_orange_400", DEEP_ORANGE_400);
        sMDColorNameMap.put("deep_orange_500", DEEP_ORANGE_500);
        sMDColorNameMap.put("deep_orange_600", DEEP_ORANGE_600);
        sMDColorNameMap.put("deep_orange_700", DEEP_ORANGE_700);
        sMDColorNameMap.put("deep_orange_800", DEEP_ORANGE_800);
        sMDColorNameMap.put("deep_orange_900", DEEP_ORANGE_900);
        sMDColorNameMap.put("deep_orange_a_100", DEEP_ORANGE_A_100);
        sMDColorNameMap.put("deep_orange_a_200", DEEP_ORANGE_A_200);
        sMDColorNameMap.put("deep_orange_a_400", DEEP_ORANGE_A_400);
        sMDColorNameMap.put("deep_orange_a_700", DEEP_ORANGE_A_700);

        sMDColorNameMap.put("brown_50", BROWN_50);
        sMDColorNameMap.put("brown_100", BROWN_100);
        sMDColorNameMap.put("brown_200", BROWN_200);
        sMDColorNameMap.put("brown_300", BROWN_300);
        sMDColorNameMap.put("brown_400", BROWN_400);
        sMDColorNameMap.put("brown_500", BROWN_500);
        sMDColorNameMap.put("brown_600", BROWN_600);
        sMDColorNameMap.put("brown_700", BROWN_700);
        sMDColorNameMap.put("brown_800", BROWN_800);
        sMDColorNameMap.put("brown_900", BROWN_900);

        sMDColorNameMap.put("grey_50", GREY_50);
        sMDColorNameMap.put("grey_100", GREY_100);
        sMDColorNameMap.put("grey_200", GREY_200);
        sMDColorNameMap.put("grey_300", GREY_300);
        sMDColorNameMap.put("grey_400", GREY_400);
        sMDColorNameMap.put("grey_500", GREY_500);
        sMDColorNameMap.put("grey_600", GREY_600);
        sMDColorNameMap.put("grey_700", GREY_700);
        sMDColorNameMap.put("grey_800", GREY_800);
        sMDColorNameMap.put("grey_900", GREY_900);

        sMDColorNameMap.put("blue_grey_50", BLUE_GREY_50);
        sMDColorNameMap.put("blue_grey_100", BLUE_GREY_100);
        sMDColorNameMap.put("blue_grey_200", BLUE_GREY_200);
        sMDColorNameMap.put("blue_grey_300", BLUE_GREY_300);
        sMDColorNameMap.put("blue_grey_400", BLUE_GREY_400);
        sMDColorNameMap.put("blue_grey_500", BLUE_GREY_500);
        sMDColorNameMap.put("blue_grey_600", BLUE_GREY_600);
        sMDColorNameMap.put("blue_grey_700", BLUE_GREY_700);
        sMDColorNameMap.put("blue_grey_800", BLUE_GREY_800);
        sMDColorNameMap.put("blue_grey_900", BLUE_GREY_900);

        sMDColorNameMap.put("black", BLACK);
        sMDColorNameMap.put("white", WHITE);
    }



}
