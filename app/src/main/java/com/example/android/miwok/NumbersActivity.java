package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers= new ArrayList<>();

        //Word w=new Word("One", "Ek");
        //numbers.add(w);

        numbers.add(new Word("One","Ek", R.drawable.favicon));
        numbers.add(new Word("Two","Do", R.drawable.favicon));
        numbers.add(new Word("Three","Teen", R.drawable.favicon));
        numbers.add(new Word("Four","Char", R.drawable.favicon));
        numbers.add(new Word("Five","Paanch", R.drawable.favicon));
        numbers.add(new Word("Six","Chhe", R.drawable.favicon));
        numbers.add(new Word("Seven","Saat", R.drawable.favicon));
        numbers.add(new Word("Eight","Aath", R.drawable.favicon));
        numbers.add(new Word("Nine","Nau", R.drawable.favicon));
        numbers.add(new Word("Ten","Das", R.drawable.favicon));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link numbers}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter wordAdapter=new WordAdapter(this, numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.numlist);
        listView.setAdapter(wordAdapter);

    }
}
