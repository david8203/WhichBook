package com.moringaschool.whichbook;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.viewHolder>{
    private static final String TAG = "BooksRecyclerViewAdapter";

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
}
