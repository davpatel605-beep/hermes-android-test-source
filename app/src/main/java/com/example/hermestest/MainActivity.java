package com.example.hermestest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);

        textView.setText(
                "Hermes Update Test\n\n" +
                "APK Build Successful"
        );

        textView.setTextSize(24);

        setContentView(textView);
    }
}
