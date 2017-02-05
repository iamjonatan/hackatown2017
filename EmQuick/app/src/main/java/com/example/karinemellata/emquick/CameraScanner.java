package com.example.karinemellata.emquick;

/**
 * Created by karinemellata on 2017-02-04.
 */

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.view.View;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

import java.io.IOException;

    public class CameraScanner extends Activity {
        private SurfaceView surface_view;
        private Camera mCamera;
        SurfaceHolder.Callback sh_ob = null;
        SurfaceHolder surface_holder        = null;
        SurfaceHolder.Callback sh_callback  = null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            getWindow().setFormat(PixelFormat.TRANSLUCENT);

            setContentView(R.layout.idscanner);

            surface_view = new SurfaceView(getApplicationContext());
            addContentView(surface_view, new ActionBar.LayoutParams(ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT));

            if (surface_holder == null) {
                surface_holder = surface_view.getHolder();
            }

            sh_callback = my_callback();
            surface_holder.addCallback(sh_callback);
        }

        SurfaceHolder.Callback my_callback() {
            SurfaceHolder.Callback ob1 = new SurfaceHolder.Callback() {

                @Override
                public void surfaceDestroyed(SurfaceHolder holder) {
                    mCamera.stopPreview();
                    mCamera.release();
                    mCamera = null;
                }

                @Override
                public void surfaceCreated(SurfaceHolder holder) {
                    mCamera = Camera.open();

                    try {
                        mCamera.setPreviewDisplay(holder);
                    } catch (IOException exception) {
                        mCamera.release();
                        mCamera = null;
                    }
                }

                @Override
                public void surfaceChanged(SurfaceHolder holder, int format, int width,
                                           int height) {
                    mCamera.startPreview();
                }
            };
            return ob1;
        }
    }