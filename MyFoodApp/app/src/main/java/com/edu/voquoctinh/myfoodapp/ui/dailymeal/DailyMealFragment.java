package com.edu.voquoctinh.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.voquoctinh.myfoodapp.R;
import com.edu.voquoctinh.myfoodapp.adapters.DailyMealAdapter;
import com.edu.voquoctinh.myfoodapp.databinding.FragmentDailymealBinding;
import com.edu.voquoctinh.myfoodapp.models.DailyMealModels;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModels> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dailymeal, container, false);


        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModels(R.drawable.breakfast,"Breakfast", "30% OFF","Description Description","breakfast"));
        dailyMealModels.add(new DailyMealModels(R.drawable.lunch,"Lunch", "20% OFF","Description Description","Lunch"));
        dailyMealModels.add(new DailyMealModels(R.drawable.dinner,"Dinner", "10% OFF","Description Description","Dinner"));
        dailyMealModels.add(new DailyMealModels(R.drawable.sweets,"Sweets", "50% OFF","Description Description","Sweets"));
        dailyMealModels.add(new DailyMealModels(R.drawable.coffe,"Coffee", "40% OFF","Description Description","Coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }

}