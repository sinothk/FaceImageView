# SmartImage
SmartImage

# 使用
  ## XML
    <com.sinothk.smartImage.FaceImageView
      android:layout_width="30dp"
      android:layout_height="30dp"
      android:layout_gravity="center"
      android:layout_marginTop="10dp"
      android:layout_marginBottom="10dp"
      android:src="@mipmap/img" />
      
  ## JAVA使用
    mBaseView.setImageResource(R.mipmap.imgs);
    Bitmap baseBitmap = ((BitmapDrawable) mBaseView.getDrawable()).getBitmap();
    Bitmap clipBitmap = FaceImageUtil.cropToBitmap(this, baseBitmap, 320, 320);
    mImgA_A.setImageBitmap(clipBitmap);
    
    ImageView myImageView = (ImageView) findViewById(R.id.myImageView);
    Bitmap bitmap = FaceImageUtil.cropToBitmap(this, myImageView, 400, 100);
    myImageView.setImageBitmap(bitmap);
    
  https://github.com/sinothk/SmartImage/blob/master/app/imgs/20181120112040.png
