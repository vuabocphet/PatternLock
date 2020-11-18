package com.ecoapplock.lockview.utils;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

import com.ecoapplock.lockview.R;

public class BitmapUtil {
    public static Bitmap convertToBitmap(Drawable drawable, Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.pattern_lock_bitmap);
        Bitmap bitmap = Bitmap.createBitmap(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        drawable.draw(canvas);
        return bitmap;
    }
}
