package com.example.ayushtyagi.hackerearth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b1=(Button)findViewById(R.id.leaderboard);
        b2=(Button)findViewById(R.id.solve);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.hackerearth.com/srm-aug16");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.hackerearth.com/srm-aug16/leaderboard/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });
    }
}
