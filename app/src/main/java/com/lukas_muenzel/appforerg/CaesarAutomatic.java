package com.lukas_muenzel.appforerg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class CaesarAutomatic extends AppCompatActivity {
    static Lenguage german = new Lenguage(new double[]{5.58,
            1.96, 3.16, 4.98, 16.93, 1.49, 3.02, 4.98, 8.02, 0.24, 1.32, 3.60, 2.55, 10.53, 2.24, 0.67,
            0.02, 6.89, 6.42, 5.79, 3.83, 0.84, 1.78, 0.05, 0.05, 1.21});
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caesar_automatic);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final Button acceptButton = (Button) findViewById(R.id.acceptAuto);

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputText = (EditText)findViewById(R.id.inputAuto);
                String input = inputText.getText().toString();

                TextView output = (TextView) findViewById(R.id.outputAuto);

                String[] diplacedTexts = new String[26];
                Lenguage[] lenguages = new Lenguage[26];
                double[] mistakes = new double[26];
                for(int i = 0; i <= diplacedTexts.length -1; i++){
                    diplacedTexts[i] = String.valueOf(MathForApp.getDecryption(input, i)) ;
                    lenguages[i] = new Lenguage(MathForApp.analyzeLetterFrequency(diplacedTexts[i]));
                    mistakes[i] = MathForApp.getMistakeOfArray(lenguages[i].letterFrequency, german.letterFrequency);
                }

                int solution = MathForApp.searchLowestDoubleInArray(mistakes);

                output.setText("Mit einem Fehler von ungefähr " + Math.round(mistakes[solution]) + " war die folgende Lösung am wahrscheinlichsten:\n\n" + diplacedTexts[solution]);
            }
        });
    }
}
