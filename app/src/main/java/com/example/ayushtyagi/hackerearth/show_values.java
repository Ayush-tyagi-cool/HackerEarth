package com.example.ayushtyagi.hackerearth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class show_values extends Activity
{
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_values);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);


        tv1.setText("Your Name: "+getIntent().getStringExtra("name"));
        tv2.setText("Your dob: "+getIntent().getStringExtra("dob"));
        tv3.setText("Selected Courses: "+getIntent().getStringExtra("courses"));
        tv4.setText("Sex: "+getIntent().getStringExtra("gender"));
        tv5.setText("Rating Value: "+getIntent().getStringExtra("rating"));
        tv6.setText("Seekbar Value: " +
                getIntent().getStringExtra("seek"));








    }

}
