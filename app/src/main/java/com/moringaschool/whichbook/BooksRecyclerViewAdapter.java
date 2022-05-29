package com.moringaschool.whichbook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.viewHolder>{
    private static final String TAG = "BooksRecyclerViewAdapter";
    private Context context;

    public BooksRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    //first we receive the elements we are going to use in a recycler view
    private ArrayList<Book> books = new ArrayList<>();
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //here we are creating an instance of the recyclerview layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_recycler_view,null);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onBindViewHolder(viewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.bookName.setText(books.get(position).getName());
        holder.bookName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,books.get(position).getName() + "selected", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
    //INNER CLASS
    //the view holder is responsible for creating every instance of the elements in our recycler view

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView bookImage;
        private TextView bookName;
        public viewHolder( View itemView) {
            super(itemView);
            bookImage = (ImageView) itemView.findViewById(R.id.bookImage);
            bookName =(TextView) itemView.findViewById(R.id.bookName);
        }
    }
    //passing items to this adapter
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
        // notifies the adapter that its data has changed
        notifyDataSetChanged();
    }
}
