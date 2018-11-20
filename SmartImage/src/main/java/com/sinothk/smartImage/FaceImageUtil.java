package com.sinothk.smartImage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

import com.cfox.ivcliplib.CImageUtils;

public class FaceImageUtil {
    public static Bitmap cropToBitmap(Context context, Bitmap baseBitmap, int width, int height) {
        return CImageUtils.instance(context).cropToBitmap(baseBitmap, width, height);
    }

    public static Bitmap cropToBitmap(Context context, ImageView imageView, int width, int height) {
        Bitmap mBitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        return CImageUtils.instance(context).cropToBitmap(mBitmap, width, height);
    }
}
