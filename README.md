# FaceImageView
FaceImageView



# 引入
  ## Add it in your root build.gradle at the end of repositories:

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }

  ## Step 2. Add the dependency

    dependencies {
            implementation 'com.github.sinothk:FaceImageView:2.0.0416'
    }

# 使用
  ## XML
     <com.sinothk.smartImage.FaceImageView
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:scaleType="centerInside"
        android:src="@drawable/original_image4" />

    <ImageView
        android:id="@+id/img_base"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_marginTop="20dp"
        android:scaleType="fitXY"
        android:src="@drawable/original_image4" />

    <ImageView
        android:id="@+id/img_base2"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_marginTop="20dp"
        android:scaleType="fitXY" />
      
  ## JAVA使用
    private ImageView img_base, img_base2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_helper);

        img_base = (ImageView) findViewById(R.id.img_base);
        img_base2 = (ImageView) findViewById(R.id.img_base2);

        Bitmap baseBitmap = ((BitmapDrawable) img_base.getDrawable()).getBitmap();

        Bitmap clipBitmap = FaceImageUtil.cropToBitmap(this, baseBitmap, 100, 100);
        img_base.setImageBitmap(clipBitmap);

        Glide.with(this).asBitmap().load("https://github.com/aryarohit07/GlideFaceDetectionTransformation/blob/master/images/original_image4.jpg?raw=true").into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(@NonNull Bitmap resource, Transition<? super Bitmap> transition) {
                Bitmap clipBitmap = FaceImageUtil.cropToBitmap(FaceHelperActivity.this, resource, 100, 100);
                img_base2.setImageBitmap(clipBitmap);
            }
        });

        //
    //        Bitmap baseBitmap0 = FaceHelper.genFaceBitmap(baseBitmap);
    //        img_base2.setImageBitmap(baseBitmap0);
        }
    
  https://github.com/sinothk/SmartImage/blob/master/app/imgs/20181120112040.png
