package com.edu.voquoctinh.myfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.edu.voquoctinh.myfoodapp.adapters.DetailedDailyAdapter;
import com.edu.voquoctinh.myfoodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast","description","4.5","40","8AM to 23PM"));
            dailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("lunch")){

            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l1,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l2,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.l3,"Sweets","description","4.5","40","8AM to 23PM"));
            dailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("Dinner")){

            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d1,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d2,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d3,"Sweets","description","4.5","40","8AM to 23PM"));
            dailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("Sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweets","description","4.5","40","8AM to 23PM"));
            dailyAdapter.notifyDataSetChanged();
        }
        if (type != null && type.equalsIgnoreCase("Coffee")){

            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c1,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c2,"Sweets","description","4.5","40","8AM to 23PM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.c3,"Sweets","description","4.5","40","8AM to 23PM"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}