package com.example.lat2_if2_10116065;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
Change Log
Pengerjaan 14-april-2019 Minggu 13:39
10116065
Aldi Muhammad Syafi
AKB-2/IF-2


 */

public class register extends AppCompatActivity {
    private Button button_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button_register = (Button) findViewById(R.id.button_register);
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalmost();
            }
        });


    }
    public void openalmost (){
        Intent intent= new Intent(this,almost.class);
        startActivity(intent);

    }
}
