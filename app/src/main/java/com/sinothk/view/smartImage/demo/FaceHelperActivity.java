package com.sinothk.view.smartImage.demo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.sinothk.smartImage.FaceHelper;
import com.sinothk.smartImage.FaceImageUtil;

public class FaceHelperActivity extends AppCompatActivity {
    private ImageView img_base,img_base2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_helper);

        img_base = (ImageView) findViewById(R.id.img_base);
        img_base2= (ImageView) findViewById(R.id.img_base2);

        Bitmap baseBitmap = ((BitmapDrawable) img_base.getDrawable()).getBitmap();

        Bitmap clipBitmap = FaceImageUtil.cropToBitmap(this, baseBitmap, 100, 100);
        img_base.setImageBitmap(clipBitmap);


        //
//        Bitmap baseBitmap0 = FaceHelper.genFaceBitmap(baseBitmap);
//        img_base2.setImageBitmap(baseBitmap0);
    }
}
