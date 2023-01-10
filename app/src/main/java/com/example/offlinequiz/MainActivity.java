package com.example.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout Matematikë = findViewById(R.id.matematikeLayout);
        final LinearLayout Informatikë = findViewById(R.id.informatikeLayout);
        final LinearLayout GjuhëShqipe = findViewById(R.id.gjuheshqipeLayout);
        final LinearLayout GjuhëAngleze = findViewById(R.id.gjuheanglezeLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        Matematikë.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "Matematikë";

                Matematikë.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Informatikë.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëShqipe.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëAngleze.setBackgroundResource(R.drawable.round_back_white10);
            }

            });
        Informatikë.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Informatikë";

                Informatikë.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Matematikë.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëShqipe.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëAngleze.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        GjuhëShqipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Gjuhë Shqipe";

                GjuhëShqipe.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Informatikë.setBackgroundResource(R.drawable.round_back_white10);
                Matematikë.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëAngleze.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        GjuhëAngleze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Gjuhë Angleze";

                GjuhëAngleze.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Informatikë.setBackgroundResource(R.drawable.round_back_white10);
                GjuhëShqipe.setBackgroundResource(R.drawable.round_back_white10);
                Matematikë.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Select The Topic !!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}