package com.myxlab.myrecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class RVActivity extends AppCompatActivity {
//step 1 - declare your view
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //step 2 - initialise your view
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewwwwww);

        //step 3 - create your data
        ItemData itemDataObject[] = {new ItemData("Alkane",R.drawable.one), new ItemData("Methane",R.drawable.two), new ItemData("Benzene",R.drawable.three), new ItemData("Alkane",R.drawable.four), new ItemData("Methane",R.drawable.two), new ItemData("Benzene",R.drawable.three), new ItemData("Alkane",R.drawable.four), new ItemData("Methane",R.drawable.two), new ItemData("Benzene",R.drawable.four), new ItemData("Alkane",R.drawable.one), new ItemData("Methane",R.drawable.two), new ItemData("Benzene",R.drawable.three)};

        recyclerView.setLayoutManager(new GridLayoutManager(RVActivity.this,2));

        //step 4 - create an adapter
        MyAdapter myAdapter = new MyAdapter(itemDataObject, RVActivity.this);

        recyclerView.setAdapter(myAdapter);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rv, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
