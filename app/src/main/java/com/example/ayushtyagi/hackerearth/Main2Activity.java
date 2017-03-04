package com.example.ayushtyagi.hackerearth;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main2Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    TextView txt1;
    int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.edittext);
        e2=(EditText)findViewById(R.id.edittext1);
        b2=(Button)findViewById(R.id.button1);
        txt1=(TextView)findViewById(R.id.textview3);
        txt1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals("admin")&& e2.getText().toString().equals("admin"))
                {Toast.makeText(getApplicationContext(),"Sucess",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(i);
            }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                    txt1.setVisibility(view.VISIBLE);
                    txt1.setBackgroundColor(Color.RED);
                    counter--;
                    txt1.setText(Integer.toString(counter));
                    if (counter==0){
                        b1.setEnabled(false);
                    }

                }
        }

    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(Item);
    }
    */
}
