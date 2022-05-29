package com.moringaschool.whichbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private static final String TAG = "AllBooksActivity";
    private RecyclerView booksRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Log.d(TAG, "onCreate: started");

        booksRecyclerView = (RecyclerView) findViewById(R.id.booksRecyclerView);
        BooksRecyclerViewAdapter adapter = new BooksRecyclerViewAdapter(this);
        booksRecyclerView.setAdapter(adapter);
        //determines how we want to order our items in the recycler view
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("My Life In Crime","John Kiriamiti","https://imgv2-2-f.scribdassets.com/img/word_document/497564317/original/216x287/91fc773837/1645828172?v=1","is a 1984 novel by Kenyan author John Kiriamiti. It is a fictionalized account of Kiriamiti's criminality in Kenya during the 1960s and 1970s.",400));
        books.add(new Book("Rich Dad Poor Dad","Robert T. Kiyosaki and Sharon Lechter","http://www.richdad.com/MediaLibrary/RichDad/images/book-covers/book-rich-dad-poor-dad.jpg","It advocates the importance of financial literacy, financial independence and building wealth through investing in assets, real estate investing, starting and owning businesses, as well as increasing one's financial intelligence",241));
        books.add(new Book("OutLander","Diana Gabaldon","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpKI_hRR5C6JkRcw0MR6xMDufiy5JRsQAOkinacljr&usqp=CAE&s","it focuses on nurse Claire Beauchamp, who travels through time to 18th-century Scotland, where she finds adventure and romance with the dashing Jamie Fraser",250));

    }
}