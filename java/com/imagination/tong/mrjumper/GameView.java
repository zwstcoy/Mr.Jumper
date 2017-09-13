package com.imagination.tong.mrjumper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Tong on 9/6/2017.
 */
public class GameView extends SurfaceView implements Runnable{
    volatile boolean playing;
    Thread gameThread=null;
    private Player player;
    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder holder;

    public GameView(Context context) {
        super(context);
        holder=getHolder();
        paint=new Paint();
        player=new Player(context);
        player.update(5,5);
        if(holder.getSurface().isValid()){
            canvas=holder.lockCanvas();

            canvas.drawColor(Color.argb(255,0,0,0));

            canvas.drawBitmap(player.getBitMap(),player.getX(),player.getY(),paint);

            holder.unlockCanvasAndPost(canvas);

        }

    }

    @Override
    public void run() {
        while(playing){
            update();
            draw();
            control();
        }
    }

    public void update(){

    }

    public void draw(){

    }

    public void control(){

    }

    public void pause(){
        playing =false;
       try{
           gameThread.join();
      }catch(InterruptedException e){

      }
    }
    public void resume(){
        playing=true;
        gameThread=new Thread(this);
        gameThread.start();
    }

}
