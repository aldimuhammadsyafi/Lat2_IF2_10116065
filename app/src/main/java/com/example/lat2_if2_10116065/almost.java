package com.example.lat2_if2_10116065;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class almost extends AppCompatActivity {
private Button button_almost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    button_almost= (Button)findViewById(R.id.button_almost);
    button_almost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openverify();
            }
        });


    }
    public void openverify (){
        Intent intent= new Intent(this,verify.class);
        startActivity(intent);

    }
}
