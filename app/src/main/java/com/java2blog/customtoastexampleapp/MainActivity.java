package com.java2blog.customtoastexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                //Creating the LayoutInflater instance
                LayoutInflater liCustomToast = getLayoutInflater();
                //Getting the View object as defined in the custom_toast.xml file
                View layout = liCustomToast.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

            } });
    }
}
