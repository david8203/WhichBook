package com.moringaschool.whichbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private static final String TAG = "AllBooksActivity";
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Log.d(TAG, "onCreate: started");
        ListView listView = (ListView) findViewById(R.id.booksListView);
//here we define an arrayList for our strings and the adapter
        ArrayList<String> books = new ArrayList<>();
    }
}