package com.example.usegestdetect;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends Activity {
    private GestureDetector gestDetect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestDetect = new GestureDetector(this, new MySimpleOnGestureListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        gestDetect.onTouchEvent(event);
        return false;
    }

    private class MySimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDoubleTap(MotionEvent e){
            Log.v("onDoubleTap", "onDoubleTap");
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e){
            Log.v("onDoubleTapEvent", "onDoubleTapEvent");
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onDown(MotionEvent e){
            Log.v("onDown", "onDown");
            return super.onDown(e);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            Log.v("onFling", "X speed:" + (int)velocityX + " Y speed:" + (int)velocityY);
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onLongPress(MotionEvent e){
            Log.v("onLongPress", "onLongPress");
            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
            Log.v("onScroll", "X scroll:" + (int)distanceX + " Y scroll:" + (int)distanceY);
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public void onShowPress(MotionEvent e){
            Log.v("onShowPress", "onShowPress");
            super.onShowPress(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e){
            Log.v("onSingleTapConfirmed", "onSingleTapConfirmed");
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e){
            Log.v("onSingleTapUp", "onSingleTapUp");
            return super.onSingleTapUp(e);
        }
    }
}
