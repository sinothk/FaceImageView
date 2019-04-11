package com.sinothk.view.smartImage.demo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sinothk.smartImage.FaceHelper;
import com.sinothk.smartImage.picasso.facedetection.transformation.FaceCenterCrop;
import com.sinothk.smartImage.picasso.facedetection.transformation.core.PicassoFaceDetector;
import com.squareup.picasso.Picasso;

import static com.sinothk.smartImage.picasso.facedetection.transformation.FaceCenterCrop.DP;

public class FaceHelperActivity extends AppCompatActivity {
    private ImageView mBaseView, img_base2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_helper);

        mBaseView = (ImageView) findViewById(R.id.img_base1);
        img_base2 = (ImageView) findViewById(R.id.img_base2);

//        Bitmap baseBitmap = ((BitmapDrawable) mBaseView.getDrawable()).getBitmap();
//
//        Bitmap baseBitmap0 = FaceHelper.genFaceBitmap(baseBitmap);
//        mBaseView.setImageBitmap(baseBitmap0);

        PicassoFaceDetector.initialize(this);


        Picasso.with(this)
                .load("http://d.hiphotos.baidu.com/image/pic/item/3801213fb80e7bec17aa18cd212eb9389b506bad.jpg")
                .fit() // use fit() and centerInside() for making it memory efficient.
                .centerInside()
                .transform(new FaceCenterCrop(500, 500)) //in pixels. You can also use FaceCenterCrop(width, height, unit) to provide width, height in DP.
                .into(img_base2);

//        Bitmap baseBitmap2 = ((BitmapDrawable) img_base2.getDrawable()).getBitmap();
//        Bitmap baseBitmap1 = FaceHelper.genFaceBitmap(baseBitmap2);
//        img_base2.setImageBitmap(baseBitmap1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        PicassoFaceDetector.initialize(this);
    }
}
