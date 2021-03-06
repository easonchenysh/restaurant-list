package com.androidlearning.restaurantlist;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        id = (int) getIntent().getSerializableExtra("X5xmmACBioDnhGGnVfnAcPh33Jc7OacU5xDcrOqcfqYBkrDkJQds02I1JtZ0WzLR");
        DetailIcon = (ImageView) findViewById(R.id.DetailIcon);
        Name = (TextView) findViewById(R.id.Name);
        Info = (TextView) findViewById(R.id.Info);
        Res = Manager.findRestaurantByID(id);
        DetailIcon.setImageResource(Res.icon);
        Name.setText(Res.Name);
        Info.setText(Res.Info);
        Back = (Button) findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
