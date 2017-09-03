package com.androidlearning.restaurantlist;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class Detail extends AppCompatActivity implements Serializable {
    private int id;
    private ImageView DetailIcon;
    private TextView Name;
    private TextView Info;
    private Restaurant Res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        id = (int) getIntent().getSerializableExtra("ID");
        DetailIcon = (ImageView) findViewById(R.id.DetailIcon);
        Name = (TextView) findViewById(R.id.Name);
        Info = (TextView) findViewById(R.id.Info);
        Res = Manager.findRestaurantByID(id);
        DetailIcon.setImageResource(Res.icon);
        Name.setText(Res.Name);
        Info.setText(Res.Info);
    }
}
