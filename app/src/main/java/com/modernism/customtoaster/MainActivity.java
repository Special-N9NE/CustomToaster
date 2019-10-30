package com.modernism.customtoaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.modernism.customtoaster2.CustomToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToaster.makeText(this
                , "Hi im Amir and it is my toast"
                , CustomToaster.LENGTH_LONG
                , R.drawable.ic_android
                , R.drawable.background
                , CustomToaster.BLACK
        ).show();
    }
}
