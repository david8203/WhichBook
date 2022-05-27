package com.moringaschool.whichbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnAllBooks) Button mBtnAllBooks;
    @BindView(R.id.btnCurrentlyReading) Button mBtnCurrentlyReading;
    @BindView(R.id.btnWantTo) Button mBtnWantTo;
    @BindView(R.id.btnAlreadyRead) Button mBtnAlreadyRead;
    @BindView(R.id.btnAbout) Button mBtnAbout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

