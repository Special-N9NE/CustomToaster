package com.modernism.customtoaster2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;

public class CustomToaster extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     * or {@link Activity} object.
     */

    public static final int WHITE = Color.WHITE;
    public static final int BLACK = Color.BLACK;
    public static final int BLUE = Color.BLUE;
    public static final int CRYN = Color.CYAN;
    public static final int GRAY = Color.GRAY;
    public static final int GREEN = Color.GREEN;
    public static final int RED = Color.RED;
    public static final int MAGENTA = Color.MAGENTA;
    public static final int YELLOW = Color.YELLOW;


    public CustomToaster(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, String message, int duration,
                                 @DrawableRes int iconResource, @DrawableRes int backgroundResource, int textColor) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);
        LinearLayout ll = view.findViewById(R.id.ll);
        TextView tv = view.findViewById(R.id.tv);
        ImageView iv = view.findViewById(R.id.iv);

        toast.setDuration(duration);
        ll.setBackgroundResource(backgroundResource);
        tv.setText(message);
        iv.setImageResource(iconResource);

        switch (textColor) {
            case Color.WHITE:
                tv.setTextColor(WHITE);
                break;
            case Color.BLACK:
                tv.setTextColor(BLACK);
                break;
            case Color.BLUE:
                tv.setTextColor(BLUE);
                break;
            case Color.CYAN:
                tv.setTextColor(CRYN);
                break;
            case Color.GRAY:
                tv.setTextColor(GRAY);
                break;
            case Color.GREEN:
                tv.setTextColor(GREEN);
                break;
            case Color.RED:
                tv.setTextColor(RED);
                break;
            case Color.MAGENTA:
                tv.setTextColor(MAGENTA);
                break;
            case Color.YELLOW:
                tv.setTextColor(YELLOW);
                break;
        }

        toast.setView(view);
        return toast;
    }
}
