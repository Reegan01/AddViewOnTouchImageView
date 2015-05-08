package com.kenturf.myimagezoom;


import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TouchImageView myImage;
    TouchImageView touchImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImage = (TouchImageView)findViewById(R.id.myImg);

        myImage.setImageResource(R.drawable.floorimg);



//        myImage.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                float x = v.getX();
//                float y = v.getY();
//
//                Toast.makeText(getBaseContext(),"X value is : " + x + " Y value is : " + y,Toast.LENGTH_SHORT).show();
//
//                return false;
//            }
//        });

        /* Bro is this possible to create dynamic pin image using OnDraw method . myImage.onDraw();*/
        /* the floorimg and pinimgnew images in the Resources folder */


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




    public static void message(Context ctx,String msg,int duration) {
        Toast.makeText(ctx,msg,duration).show();
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
