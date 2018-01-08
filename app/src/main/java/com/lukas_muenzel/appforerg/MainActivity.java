package com.lukas_muenzel.appforerg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final Button CaesarNormalButton = (Button) this.findViewById(R.id.CaesarNormal);
        final Button CaesarNormalInfoButton = (Button) this.findViewById(R.id.CaesarNormalInfo);
        final Button CaesarAutomaticButton = (Button) this.findViewById(R.id.CaesarAutomatic);
        final Button CaesarAutomaticInfoButton = (Button) this.findViewById(R.id.CaesarAutomaticInfo);
        final Button projectInfoButton = (Button) this.findViewById(R.id.projectInfo);






        CaesarNormalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , CaesarNormal.class);
                startActivity(intent);
            }
        });

        CaesarNormalInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , CaesarNormalInfo.class);
                startActivity(intent);
            }
        });


        CaesarAutomaticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , CaesarAutomatic.class);
                startActivity(intent);
            }
        });

        CaesarAutomaticInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , CaesarAutomaticInfo.class);
                startActivity(intent);
            }
        });

        projectInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/WhyDoJavaProgrammersNeedGlasses/AppForErg"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });




    }
}
