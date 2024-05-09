package com.example.birdflight;

import static com.example.birdflight.GameView.screenRatioX;
import static com.example.birdflight.GameView.screenRatioY;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Bullet {

    int x, y,width,height;

    Bitmap bullet;
    Bullet (Resources res){

        bullet = BitmapFactory.decodeResource(res, R.mipmap.bullet);

         width = bullet.getWidth();
         height = bullet.getHeight();

        width /= 4;
        height /= 4;

        width *= (int) screenRatioX;
        height *= (int) screenRatioY;



    }

}
