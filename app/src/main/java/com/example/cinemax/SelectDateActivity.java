package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), DetailMovieActivity.class)));

        AppCompatButton bookingBtn = (AppCompatButton) findViewById(R.id.checkout_btn);
        bookingBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), CheckoutActivity.class)));
    }
}