package com.edu.voquoctinh.myfoodapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edu.voquoctinh.myfoodapp.adapters.CartAdapter;
import com.edu.voquoctinh.myfoodapp.models.CartModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.pizza1,"Pizza thập cẩm", "30","5.0"));
        list.add(new CartModel(R.drawable.pizza2,"Pizza Bò", "40","5.0"));
        list.add(new CartModel(R.drawable.pizza3,"Pizza Hải Sản", "30","5.0"));
        list.add(new CartModel(R.drawable.burger2,"Hambuger Thịt", "20","5.0"));
        list.add(new CartModel(R.drawable.burger4,"Hambuger Hải Sản", "20","5.0"));
        list.add(new CartModel(R.drawable.fries2,"Khoai Tây chiên", "30","5.0"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);


        return view;
    }
}