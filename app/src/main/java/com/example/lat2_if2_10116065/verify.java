package com.example.lat2_if2_10116065;
/*
Change Log
Pengerjaan 14-april-2019 Minggu 15:57
10116065
Aldi Muhammad Syafi
AKB-2/IF-2
* */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verify extends AppCompatActivity {
private Button button_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    button_verify = (Button) findViewById(R.id.button_verify);
    button_verify.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openveri();
        }
    });

    }
    public void openveri(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);


    }
}
