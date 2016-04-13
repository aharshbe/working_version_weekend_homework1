package com.example.ahars.first_deliverable;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView gradeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);


        gradeView = (TextView) findViewById(R.id.textView);
        final EditText editText = (EditText) findViewById(R.id.editText);





        button.setOnClickListener (new View.OnClickListener() {
            public void onClick(View view) {

                String grade = editText.getText().toString();
                final int score = new Integer(grade).intValue();



                if (score >= 90 && score < 100) {
                    gradeView.setText("A");
                } else if (score >= 80 && score < 90) {
                    gradeView.setText("B");
                } else if (score >= 70 && score < 80) {
                    gradeView.setText("C");
                } else if (score >= 60 && score < 70) {
                    gradeView.setText("D");
                } else if (score >= 0 && score < 60) {
                    gradeView.setText("F");
                } else {
                    gradeView.setText("You either chose a number above 100 at which point you have an A+ or you chose a negative number at which point you're being cheeky ;)");

                }

                gradeView.setTextColor(Color.MAGENTA);
                Toast.makeText(MainActivity.this, "You clicked Grade!", Toast.LENGTH_SHORT).show();


            }

        });


        button2.setOnClickListener (new View.OnClickListener() {

            TextView textView = (TextView) findViewById(R.id.textView);
            EditText editText = (EditText) findViewById(R.id.editText);



            public void onClick(View view) {

                String passFail = editText.getText().toString();
                int theirPoints = new Integer(passFail).intValue();

                if (theirPoints >= 65){
                    textView.setText("Pass");
                }else if (theirPoints <= 65){
                    textView.setText("Fail");
                }else{
                    textView.setText("Those points are negative at which point you're being cheeky!");
                }

                textView.setTextColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "You clicked Pass or Fail!", Toast.LENGTH_SHORT).show();


            }



        });

        button3.setOnClickListener (new View.OnClickListener() {

            TextView textView = (TextView) findViewById(R.id.textView);
            EditText editText = (EditText) findViewById(R.id.editText);


            public void onClick(View view) {

                String grade = editText.getText().toString();
                StringBuilder finalGrade = new StringBuilder("");


                int iterations = 5;
                for (int i = 0; i < iterations; i++) {
                    finalGrade.append(grade + " ");
                }

                textView.setText(finalGrade.toString());
                textView.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "You clicked 5 times!", Toast.LENGTH_SHORT).show();


            }


        });


    }

}

























