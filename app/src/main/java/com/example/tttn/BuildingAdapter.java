package com.example.tttn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.ViewHolder> {
    private List<Building> dataList;
    public BuildingAdapter(List<Building> dataList) {
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public BuildingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_building, parent, false);
        return new BuildingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuildingAdapter.ViewHolder holder, int position) {
        Building data = dataList.get(position);
        holder.buidingroom.setText(data.getSophong());
        holder.buildingfloor.setText(data.getSotang());
        // Xác định cột dựa trên vị trí (position)
        int column = position % 3; // 0 cho cột thứ nhất, 1 cho cột thứ hai, 2 cho cột thứ ba

        // Đặt màu nền cho backgroundbuiding dựa trên cột
        if (column == 0) {
            holder.backgroundbuiding.setBackgroundResource(R.drawable.purple_bg);
            holder.imgbuiding.setImageResource(R.drawable.icon_building_pp);
        } else if (column == 1) {
            holder.backgroundbuiding.setBackgroundResource(R.drawable.yellow_bg);
            holder.imgbuiding.setImageResource(R.drawable.icon_building_yl);
        } else if (column == 2) {
            holder.backgroundbuiding.setBackgroundResource(R.drawable.lightred_bg);
            holder.imgbuiding.setImageResource(R.drawable.icon_building_red);
        }
    }

    @Override
    public int getItemCount() {return dataList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView buildingfloor , buidingroom ;
        public LinearLayout backgroundbuiding;
        public ImageView imgbuiding;

        public ViewHolder(View itemView) {
            super(itemView);
            buildingfloor = itemView.findViewById(R.id.buildingfloor);
            buidingroom = itemView.findViewById(R.id.buidingroom);
            imgbuiding = itemView.findViewById(R.id.imgbuiding);
            backgroundbuiding = itemView.findViewById(R.id.backgroundbuiding);
        }
    }
}
