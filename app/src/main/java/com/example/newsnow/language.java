package com.example.newsnow;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class language extends AppCompatActivity {
    private Button btnEnglish;
    private Button btnGerman;

    private Button btnFrench;
    private Button btnArabic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the localized layout based on the language code
        String languageCode = getIntent().getStringExtra("LANGUAGE_CODE");
        if (languageCode != null) {
            setTheme(getResources().getIdentifier("theme_" + languageCode, "style", getPackageName()));
        }
        setContentView(R.layout.activity_language);

        btnEnglish = findViewById(R.id.btnEnglish);
        btnGerman = findViewById(R.id.btnGerman);

        btnFrench = findViewById(R.id.btnFrench);
        btnArabic = findViewById(R.id.btnArabic);


        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivityWithLanguage("en");
            }
        });
        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivityWithLanguage("de");
            }
        });



        btnFrench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivityWithLanguage("fr");
            }
        });
        btnArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivityWithLanguage("ar");
            }
        });



    }

    private void startMainActivityWithLanguage(String languageCode) {
        Intent intent = new Intent(language.this, MainActivity.class);
        intent.putExtra("LANGUAGE_CODE", languageCode);
        startActivity(intent);
        finish();
    }
}