package com.example.lat2_if2_10116065;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/*
Change Log
Pengerjaan 13-april-2019 Sabtu 15:50
10116065
Aldi Muhammad Syafi
AKB-2/IF-2
*/


public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });

    }
    public void openregister(){
        Intent intent= new Intent(this,register.class);
        startActivity(intent);

    }
}
