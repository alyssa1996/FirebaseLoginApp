package com.example.jisupark.firebaseloginapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
<<<<<<< HEAD

/**
 * Created by JisuPark on 2018-07-26.
 */

public class Pop extends Activity {
=======
class Pop extends Activity {
>>>>>>> e27e36f25dea5cbb9e392c8594d0a83fa0428be3
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .6));

    }
}
