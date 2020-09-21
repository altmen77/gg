package com.example.myapplication112;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.js.sendsms_example.R;

public class SettingActivity extends AppCompatActivity {
    Button btn_setover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        btn_setover = findViewById(R.id.btn_setover);

        btn_setover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });

    }

}

