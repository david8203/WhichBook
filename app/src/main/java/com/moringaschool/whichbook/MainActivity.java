package com.moringaschool.whichbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
private Button btnSeeAll,btnCurrentlyReading,btnWantToRead,btnAlreadyRead,btnAbout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//a method to initialize our buttons
        initWidgets();
        setOnClickListeners();
    }
    private void setOnClickListeners(){
        btnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,AllBooksActivity.class);
            startActivity(intent);
            }
        });
    }
    private void initWidgets() {
        btnSeeAll = (Button) findViewById(R.id.btnAllBooks);
        btnCurrentlyReading = (Button) findViewById(R.id.btnCurrentlyReading);
        btnWantToRead = (Button) findViewById(R.id.btnWantToRead);
        btnAlreadyRead = (Button) findViewById(R.id.btnAlreadyRead);
        btnAbout = (Button) findViewById(R.id.btnAbout);

    }
}

