package com.imagination.tong.mrjumper;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Tong on 9/6/2017.
 */
public class GameActivity extends Activity {
    private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView=new GameView(this);
        setContentView(gameView);
    }

    public void onPause(){
        super.onPause();
        gameView.pause();
    }

    public void onResume(){
        super.onResume();
        gameView.resume();
    }

}

