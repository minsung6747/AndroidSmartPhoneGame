package com.example.birdflight;


import static com.example.birdflight.GameView.screenRatioX;
import static com.example.birdflight.GameView.screenRatioY;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


public class Flight {

    int toShoot = 0;
    boolean isGoingUp = false;
    int x, y, width, height, wingCounter = 0;
    Bitmap flight1, flight2, shoot1, shoot2, shoot3, shoot4, shoot5;

    Flight (int screenY, Resources res) {
        flight1 = BitmapFactory.decodeResource(res, R.mipmap.fly1);
        flight2 = BitmapFactory.decodeResource(res, R.mipmap.fly2);

        width = flight1.getWidth();
        height = flight1.getHeight();

        width /= 4;
        height /= 4;

        width *= (int) screenRatioX;
        height *= (int) screenRatioY;

        //flight1 = Bitmap.createScaledBitmap(flight1,width,height,false);
        //flight2 = Bitmap.createScaledBitmap(flight2,width,height,false);

        shoot1 = BitmapFactory.decodeResource(res,R.mipmap.shoot1);
        shoot2 = BitmapFactory.decodeResource(res,R.mipmap.shoot2);
        shoot3 = BitmapFactory.decodeResource(res,R.mipmap.shoot3);
        shoot4 = BitmapFactory.decodeResource(res,R.mipmap.shoot4);
        shoot5 = BitmapFactory.decodeResource(res,R.mipmap.shoot5);



        y = screenY / 2;
        x = (int) (64 * screenRatioX);

    }

    Bitmap getFlight () {
        

        if(wingCounter == 0){
            wingCounter++;
            return flight1;
        }

        wingCounter--;
        return flight2;
    }

}
