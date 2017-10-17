package com.hansung.android.myapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class RestaurantDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.ganjang, "간장", "3000"));


        MyAdapter adapter = new MyAdapter(this, R.layout.item, data);


        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapt);


    }
}
