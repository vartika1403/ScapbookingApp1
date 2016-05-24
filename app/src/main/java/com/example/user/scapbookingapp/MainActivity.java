package com.example.user.scapbookingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter imageAdapter;
    ArrayList<Integer> images = new ArrayList<Integer>();
    ArrayList<Integer> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.lvImages);
        addImages();
        addNames();
        imageAdapter = new CustomAdapter(MainActivity.this,images,names);
        listView.setAdapter(imageAdapter);




    }

    private void addNames() {
        names.add(R.string.river);
        names.add(R.string.palace);
        names.add(R.string.pyramid);
    }

    private void addImages() {
        images.add(R.drawable.river);
        images.add(R.drawable.palace);
        images.add(R.drawable.pyramid);

    }
}
