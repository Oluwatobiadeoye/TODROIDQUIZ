package com.project2.android.todroidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    int finalScore;
    float score;
    String username,mainDisplay;
    TextView final_text,main;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Bundle bundle = getIntent().getExtras();
         score = (float) bundle.getInt("final");
         float yourscore =  (score/25)*100;
         finalScore = (int) yourscore;
         username = bundle.getString("username");
         mainDisplay = finalScore + "%";

        final_text = (TextView)findViewById(R.id.final_text);
        main = (TextView)findViewById(R.id.main);

        if (finalScore >= 50){
            final_text.setText("Woooow!!! " + username);
            main.setText(mainDisplay);
        }

        else {
            final_text.setText("Ooooops!!!  " + username);
            main.setText(mainDisplay);
        }

        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LastActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}
