package com.java.recyclerviewlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = getResources().getStringArray(R.array.languages);
        s2 = getResources().getStringArray(R.array.description);

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, s1,s2,images);

         recyclerView.setAdapter(recyclerViewAdapter);
         recyclerView.setLayoutManager( new LinearLayoutManager(this));
    }
}
