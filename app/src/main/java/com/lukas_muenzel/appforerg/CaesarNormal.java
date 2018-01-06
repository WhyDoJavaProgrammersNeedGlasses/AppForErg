package com.lukas_muenzel.appforerg;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.IntegerRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class CaesarNormal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caesar_normal);


        final Button acceptButton = (Button) findViewById(R.id.acceptNormal);

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText input = (EditText)findViewById(R.id.inputNormal);
                EditText displacement = (EditText) findViewById(R.id.displacementNormal);
                displacement.setTextColor(Color.BLACK);
                TextView output =  (TextView) findViewById(R.id.outputNormal);
                try {
                    Integer.parseInt(displacement.getText().toString());
                    String outputString = String.copyValueOf(MathForApp.getDecryption(input.getText().toString(), Integer.parseInt(displacement.getText().toString())));
                    output.setText(outputString);
                }
                catch (NumberFormatException e){
                    Snackbar.make(v, "Ungültige Eingabe", Snackbar.LENGTH_LONG)
                            .setAction("Ungültige Eingabe", null).show();
                    displacement.setTextColor(Color.RED);
                }

            }
        });
    }



}
