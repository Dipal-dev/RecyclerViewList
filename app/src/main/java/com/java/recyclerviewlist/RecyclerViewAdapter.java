package com.java.recyclerviewlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    String title[], description[];
    int images[];
    Context context;

    public RecyclerViewAdapter(Context ct, String s1[], String s2[], int images[]){

        context = ct;
        title = s1;
        description = s2;
        this.images = images;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.myTitle.setText(title[position]);
        holder.myDescription.setText(description[position]);
        holder.myLogo.setImageResource(images[position ]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myTitle, myDescription;
        ImageView myLogo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myTitle = itemView.findViewById(R.id.title);
            myDescription = itemView.findViewById(R.id.description);
            myLogo = itemView.findViewById(R.id.logo);

        }
    }
}
