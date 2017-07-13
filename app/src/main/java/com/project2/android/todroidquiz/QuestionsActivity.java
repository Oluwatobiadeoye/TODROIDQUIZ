package com.project2.android.todroidquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    RadioButton r1c,r2b,r3a,r4c,r8a,r10d,r11a,r12a,r13c,r14a,r15c;
    CheckBox c5a,c5b,c5c,c5d,c6a,c6b,c6c,c6d,c7a,c7b,c7c,c7d,c9a,c9b,c9c,c9d,c16a,c16b,c16c,c16d;
    EditText et1,et2,et3,et4;
    String etA1,etA2,etA3,etA4;
    int score;
    int finalScore;

    public void getViews() {
        r1c = (RadioButton) findViewById(R.id.r1c);
        r2b = (RadioButton) findViewById(R.id.r2b);
        r3a = (RadioButton) findViewById(R.id.r3a);
        r4c = (RadioButton)findViewById(R.id.r4c);
        r8a = (RadioButton)findViewById(R.id.r8a);
        r10d = (RadioButton)findViewById(R.id.r10d);
        r11a = (RadioButton)findViewById(R.id.r11a);
        r12a = (RadioButton)findViewById(R.id.r12a);
        r13c = (RadioButton)findViewById(R.id.r13c);
        r14a = (RadioButton)findViewById(R.id.r14a);
        r15c = (RadioButton)findViewById(R.id.r15c);

        c5a = (CheckBox)findViewById(R.id.c5a);
        c5b = (CheckBox)findViewById(R.id.c5b);
        c5c = (CheckBox)findViewById(R.id.c5c);
        c5d = (CheckBox)findViewById(R.id.c5d);
        c6a = (CheckBox)findViewById(R.id.c6a);
        c6b = (CheckBox)findViewById(R.id.c6b);
        c6c = (CheckBox)findViewById(R.id.c6c);
        c6d = (CheckBox)findViewById(R.id.c6d);
        c7a = (CheckBox)findViewById(R.id.c7a);
        c7b = (CheckBox)findViewById(R.id.c7b);
        c7c = (CheckBox)findViewById(R.id.c7c);
        c7d = (CheckBox)findViewById(R.id.c7d);
        c9a = (CheckBox)findViewById(R.id.c9a);
        c9b = (CheckBox)findViewById(R.id.c9b);
        c9c = (CheckBox)findViewById(R.id.c9c);
        c9d = (CheckBox)findViewById(R.id.c9d);
        c16a = (CheckBox)findViewById(R.id.c16a);
        c16b = (CheckBox)findViewById(R.id.c16b);
        c16c = (CheckBox)findViewById(R.id.c16c);
        c16d = (CheckBox)findViewById(R.id.c16d);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);
    }

    public int returnScore(){
        etA1 = et1.getText().toString().trim();
        etA2 = et2.getText().toString().trim();
        etA3 = et3.getText().toString().trim();
        etA4 = et4.getText().toString().trim();

        if (r1c.isChecked()){
            score += 1;
        }

        if (r2b.isChecked()){
            score += 1;
        }

        if (r3a.isChecked()){
            score += 1;
        }

        if (r4c.isChecked()){
            score += 1;
        }

        if (r8a.isChecked()){
            score += 1;
        }

        if (r10d.isChecked()){
            score += 1;
        }

        if (r11a.isChecked()){
            score += 1;
        }

        if (r12a.isChecked()){
            score += 1;
        }

        if(r13c.isChecked()){
            score += 1;
        }

        if (r14a.isChecked()){
            score += 1;
        }
        if (r15c.isChecked()){
            score += 1;
        }

        if (etA1.equalsIgnoreCase("uniform resource identifier")){
            score += 1;
        }

        if (etA2.equalsIgnoreCase("software development kit")){
            score += 1;
        }

        if (etA3.equalsIgnoreCase("dots per inch")){
            score += 1;
        }

        if (etA4.equalsIgnoreCase("android debug bridge")){
            score += 1;
        }

        if ( (c5a.isChecked() && c5d.isChecked()) && (!c5b.isChecked() && !c5c.isChecked())  ){
            score += 2;
        }
        else if ( (c5a.isChecked() || c5d.isChecked()) && (!c5b.isChecked() && !c5c.isChecked())  ){
            score += 1;
        }

        if ( (c6b.isChecked() && c6c.isChecked()) && (!c6a.isChecked() && !c6d.isChecked()) ){
            score += 2;
        }
        else if ( (c6b.isChecked() || c6c.isChecked()) && (!c6a.isChecked() && !c6d.isChecked()) ){
            score += 1;
        }

        if ( (c7a.isChecked() && c7d.isChecked()) && (!c7b.isChecked() && !c7c.isChecked()) ){
            score += 2;
        }
        else if ( (c7a.isChecked() || c7d.isChecked()) && (!c7b.isChecked() && !c7c.isChecked()) ){
            score += 1;
        }

        if ( (c9a.isChecked() && c9d.isChecked()) && (!c9b.isChecked() && !c9c.isChecked()) ){
            score += 2;
        }else if ( (c9a.isChecked() || c9d.isChecked()) && (!c9b.isChecked() && !c9c.isChecked()) ){
            score += 1;
        }

        if ( (c16a.isChecked() && c16d.isChecked() )&& (!c16b.isChecked() && !c16c.isChecked()) ){
            score += 2;
        }
        else if ( (c16a.isChecked() || c16d.isChecked() )&& (!c16b.isChecked() && !c16c.isChecked()) ){
            score += 1;
        }
        return score;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        getViews();

        Bundle myName = getIntent().getExtras();

        final String userName = myName.getString("username");

        Button submitBtn = (Button)findViewById(R.id.submit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(QuestionsActivity.this);
                builder.setMessage("Confirm submission?")
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(QuestionsActivity.this,LastActivity.class);
                                        Bundle bundle = new Bundle();
                                        finalScore = returnScore();
                                        bundle.putInt("final",finalScore);
                                        bundle.putString("username",userName);
                                        i.putExtras(bundle);
                                        startActivity(i);
                                        QuestionsActivity.this.finish();
                                    }
                                }
                        )
                        .setCancelable(false)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
