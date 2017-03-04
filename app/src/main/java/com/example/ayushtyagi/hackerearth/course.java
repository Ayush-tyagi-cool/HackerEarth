package com.example.ayushtyagi.hackerearth;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.RatingBar;
        import android.widget.SeekBar;
        import android.widget.SeekBar.OnSeekBarChangeListener;
        import android.widget.Toast;

public class course extends Activity implements OnSeekBarChangeListener
{

    EditText name, dob;
    RatingBar ratings;
    SeekBar sBar;
    RadioGroup rg_gender;
    RadioButton male, female;
    Button submit;
    String pName,pDob,BarValue="",gender,courses="";
    CheckBox ch1,ch2,ch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        name = (EditText) findViewById(R.id.etName);
        dob = (EditText) findViewById(R.id.etDOB);
        ratings = (RatingBar) findViewById(R.id.ratingBar);
        sBar = (SeekBar) findViewById(R.id.seekBar);
        rg_gender=(RadioGroup)findViewById(R.id.rg_sex);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        submit = (Button) findViewById(R.id.bSubmit);
        ch1=(CheckBox)findViewById(R.id.cb_java);
        ch2=(CheckBox)findViewById(R.id.cb_android);
        ch3=(CheckBox)findViewById(R.id.cb_iphone);
        sBar.setMax(10);
        sBar.setOnSeekBarChangeListener(this);
        submit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                if(male.isChecked()) gender="Male";
                else if(female.isChecked())
                    gender="FeMale";


                if(ch1.isChecked()) courses="Java";
                if(ch2.isChecked()) courses=courses+","+"android";
                if(ch3.isChecked()) courses=courses+","+"C++";

                pName=name.getText().toString();
                pDob=dob.getText().toString();
                Toast.makeText(getApplicationContext(),"Recorded,You will be Contacted Soon",Toast.LENGTH_SHORT).show();

                if(checkValidation())
                {
                    Intent i=new Intent(course.this,show_values.class);
                    i.putExtra("name", name.getText().toString());
                    i.putExtra("dob", dob.getText().toString());

                    i.putExtra("courses", courses);
                    i.putExtra("gender", gender);
                    i.putExtra("rating", ratings.getRating()+"");
                    i.putExtra("seek", BarValue);
                    startActivity(i);
                }

                else
                {
                    Toast.makeText(course.this, "please enter all values",Toast.LENGTH_SHORT).show();
                }



            }


            // TODO Auto-generated method stub




            private boolean checkValidation() {


                if(name.getText().toString().trim().matches("")||dob.getText().toString().trim().matches("")
                        ||gender.trim().matches("")||courses.trim().matches("")	)
                {
                    return false;
                }

                else

                    return true;
            }
        });
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

    @Override
    public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
        // TODO Auto-generated method stub
        BarValue=arg1+"";

    }

    @Override
    public void onStartTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStopTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub

    }

}