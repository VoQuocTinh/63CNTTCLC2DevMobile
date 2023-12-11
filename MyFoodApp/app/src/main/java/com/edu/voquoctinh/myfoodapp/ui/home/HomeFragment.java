package com.edu.voquoctinh.myfoodapp.ui.home;

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
import com.edu.voquoctinh.myfoodapp.adapters.HomeHorAdapter;
import com.edu.voquoctinh.myfoodapp.adapters.HomeVerAdapter;
import com.edu.voquoctinh.myfoodapp.databinding.FragmentHomeBinding;
import com.edu.voquoctinh.myfoodapp.models.HomeHorModel;
import com.edu.voquoctinh.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    //////vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.editText2;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ////Horizontal Recyclerview
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"Hamburger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.khoaitaychien,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        //////Vertical Recyclerview
        homeVerModelList = new ArrayList<>();

        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "7:00 - 23:00", "4.9", "Min - $35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza2, "Pizza", "7:00 - 23:00", "4.9", "Min - $35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza3, "Pizza", "7:00 - 23:00", "4.9", "Min - $35"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}