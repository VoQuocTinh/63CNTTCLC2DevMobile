package com.edu.voquoctinh.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.edu.voquoctinh.myfoodapp.databinding.FragmentDailymealBinding;

public class DailyMealFragment extends Fragment {

    private FragmentDailymealBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DailyMealViewModel dailyMealViewModel =
                new ViewModelProvider(this).get(DailyMealViewModel.class);

        binding = FragmentDailymealBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDailymeal;
        dailyMealViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}