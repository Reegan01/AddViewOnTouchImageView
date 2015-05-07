package com.kenturf.myimagezoom;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TouchImageView myImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImage = (TouchImageView)findViewById(R.id.myImg);


        myImage.setImageResource(R.drawable.floorimg);

        /* Bro is this possible to create dynamic pin image using OnDraw method . myImage.onDraw();*/
//        myImage.onDraw();

//        @Override
//        protected void onDraw(Canvas canvas) {
//            super.onDraw(canvas);
//
//            Bitmap map = BitmapFactory.decodeResource(getResources(), R.drawable.floorimg);
//            canvas.drawBitmap(map, xPositionForMap, yPositionForMap, null);
//
//            Bitmap marker = BitmapFactory.decodeResource(getResources(), R.drawable.pinimgnew);
//            canvas.drawBitmap(marker, xPositionFor1stMarker, yPositionFor1stMarker, null);
//            canvas.drawBitmap(marker, xPositionFor2ndMarker, yPositionFor2ndMarker, null);
//        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
