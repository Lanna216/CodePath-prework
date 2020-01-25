package com.aylanna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.maroon));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.lavender));
            }
        });

        findViewById(R.id.editText).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean b) {
                ((TextView)findViewById(R.id.editText)).setText("");
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // grab the text the user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                // put the text into our text view once the 'change text' button is clicked
                if (TextUtils.isEmpty(newText) || newText.equals("*type here* ☺")) {
                    ((TextView)findViewById(R.id.textView)).setText("Android is Awesome!");
                }
                else {
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.checkBox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox check = findViewById(R.id.checkBox);
                if (check.isChecked() == true ) {
                    findViewById(R.id.rootView).setBackgroundColor(
                            getResources().getColor(R.color.paleGreen));
                    ((TextView) findViewById(R.id.textView)).setTextColor(
                            getResources().getColor(R.color.forestGreen));
                    ((TextView) findViewById(R.id.textView)).setText("Thank you!!!");
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText("\uD83D\uDE32");
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // reset text color back to black
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                // reset the background color colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.beige));

                // reset text back to "Hello from Aylanna!"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Aylanna!");

        });

    }
}
