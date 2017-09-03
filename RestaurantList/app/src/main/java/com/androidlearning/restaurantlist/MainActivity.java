package com.androidlearning.restaurantlist;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Serializable {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        List<Map<String,Object>> Restaurants = new ArrayList<Map<String,Object>>();
        Map<String,Object> Res = new HashMap<String,Object>();
        Manager.Initialization();
        for (int i = 0;i <= 10;i++) {
            Res.put("Name",Manager.findRestaurantByID(i).Name);
            Res.put("Title",Manager.findRestaurantByID(i).Title);
            Res.put("Icon",Manager.findRestaurantByID(i).icon);
            Restaurants.add(Res);
        }
        SimpleAdapter Adapter = new SimpleAdapter(
                this,
                Restaurants,
                R.layout.listview_show,
                new String[] {"Name","Title","Icon"},
                new int[] {R.id.Name,R.id.ShortTitle,R.id.Icon}
        );
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Detail.class);
                intent.putExtra("ID",i);
                startActivity(intent);
            }
        });
    }
}
