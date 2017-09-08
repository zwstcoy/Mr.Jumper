package com.imagination.tong.mrjumper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Tong on 9/6/2017.
 */
public class Player {
    private Bitmap bitMap;
    private int x,y,height,width,speed;

    public Player(Context context){
        x=175;
        y=200;
        speed=5;
        height=50;
        width=30;
        bitMap= BitmapFactory.decodeResource(context.getResources(),R.drawable.player_stand);
    }

    public void update(int x,int y){
        this.x+=x;
        this.y+=y;
    }

    public Bitmap getBitMap(){
        return bitMap;
    }

    public int getSpeed(){
        return speed;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }




}
