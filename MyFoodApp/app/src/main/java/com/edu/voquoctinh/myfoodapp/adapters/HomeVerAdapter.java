package com.edu.voquoctinh.myfoodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edu.voquoctinh.myfoodapp.R;
import com.edu.voquoctinh.myfoodapp.models.HomeHorModel;
import com.edu.voquoctinh.myfoodapp.models.HomeVerModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViewHolder> {

    private BottomSheetDialog bottomSheetDialog;
    Context context;
    ArrayList<HomeVerModel> list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final String mName = list.get(position).getName();
        final String mTiming = list.get(position).getName();
        final String mRating = list.get(position).getName();
        final String mPrice = list.get(position).getName();
        final int mImage = list.get(position).getImage();


        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bottomSheetDialog = new BottomSheetDialog(context, R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout,null);

                sheetView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Add to cart",Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });

                ImageView bottomImage = sheetView.findViewById(R.id.bottom_image);
                TextView bottomName = sheetView.findViewById(R.id.bottom_name);
                TextView bottomPrice = sheetView.findViewById(R.id.bottom_price);
                TextView bottomRating = sheetView.findViewById(R.id.bottom_rating);
                TextView bottomTiming = sheetView.findViewById(R.id.bottom_timing);

                bottomName.setText(mName);
                bottomImage.setImageResource(mImage);

                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();


            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, timing, rating, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ver_img);
            name = itemView.findViewById(R.id.name);
            timing = itemView.findViewById(R.id.timing);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.price);
        }
    }
}
