package com.project2.android.todroidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            EditText name;


        public int returnCount (String name){
            int charCount = 0;
            char temp;
            for (int i=0; i<name.length(); i++ ) {
                temp = name.charAt(i);
                if (temp != ' ' ){
                    charCount++;
                }
            }
            return charCount;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.edit);
        name.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.setFocusable(true);
                v.setFocusableInTouchMode(true);
                return false;
            }
        });
        Button start_quiz = (Button) findViewById(R.id.start_quiz);
            start_quiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userName = name.getText().toString();
                   int count = returnCount(userName);
                    if (userName.equals("") || count < 3) {
                                Toast.makeText(MainActivity.this,"Please enter a valid name",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Welcome " + userName,Toast.LENGTH_SHORT).show();
                    Intent startQuiz = new Intent(MainActivity.this, QuestionsActivity.class);
                        Bundle myName = new Bundle();
                        myName.putString("username",userName);
                        startQuiz.putExtras(myName);
                        startActivity(startQuiz);
                        name.setText("");
                    }
                }
            });
    }

}
