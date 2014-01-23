package com.nemo.WakeAndSleep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void send_wol(View view){
        byte[] kdg =
                {
                        (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,

                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                        (byte)0x00, (byte)0x08, (byte)0x9B, (byte)0xBF, (byte)0x66, (byte)0x96,
                };

        new Thread_WOL(kdg).start();
    }

    public void send_sleep(View view){
        new Thread_Sleep().start();
    }
}
