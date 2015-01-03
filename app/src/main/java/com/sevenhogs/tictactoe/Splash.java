package com.sevenhogs.tictactoe;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class Splash extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread splashTimer = new Thread()
        {
            public  void run()
            {
                try
                {
                    int splashTimer = 0;
                    while(splashTimer < 5000)
                    {
                        sleep(100);
                        splashTimer = splashTimer + 100;


                    };
                    startActivity(new Intent("com.sevenhogs.tictactoe.CLEARSCREEN"));
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    finish();

                }
            }


        };

        splashTimer.start();


    }
}