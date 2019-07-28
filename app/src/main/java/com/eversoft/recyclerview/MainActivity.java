package com.eversoft.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The first photo", "Categorie Book", "Description Book", R.drawable.photo1));
        lstBook.add(new Book("The second photo", "Categorie Book", "Description Book", R.drawable.photo2));
        lstBook.add(new Book("The third photo", "Categorie Book", "Description Book", R.drawable.photo3));
        lstBook.add(new Book("The four photo", "Categorie Book", "Description Book", R.drawable.photo4));
        lstBook.add(new Book("The fifth photo", "Categorie Book", "Description Book", R.drawable.photo5));
        lstBook.add(new Book("The first photo", "Categorie Book", "Description Book", R.drawable.photo1));
        lstBook.add(new Book("The second photo", "Categorie Book", "Description Book", R.drawable.photo2));
        lstBook.add(new Book("The third photo", "Categorie Book", "Description Book", R.drawable.photo3));
        lstBook.add(new Book("The four photo", "Categorie Book", "Description Book", R.drawable.photo4));
        lstBook.add(new Book("Thefifth photo", "Categorie Book", "Description Book", R.drawable.photo5));
        lstBook.add(new Book("The first photo", "Categorie Book", "Description Book", R.drawable.photo1));
        lstBook.add(new Book("The second photo", "Categorie Book", "Description Book", R.drawable.photo2));
        lstBook.add(new Book("The third photo", "Categorie Book", "Description Book", R.drawable.photo3));
        lstBook.add(new Book("The four photo", "Categorie Book", "Description Book", R.drawable.photo4));
        lstBook.add(new Book("Thefifth photo", "Categorie Book", "Description Book", R.drawable.photo5));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recylerview_id);
        RecylcerViewAdapter myAdapter = new RecylcerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
    }
}
