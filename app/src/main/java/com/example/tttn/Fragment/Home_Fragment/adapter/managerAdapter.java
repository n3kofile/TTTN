package com.example.tttn.Fragment.Home_Fragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tttn.Fragment.Home_Fragment.manager;
import com.example.tttn.ListNS.ListNS;
import com.example.tttn.Problem_request.Request_Activity;
import com.example.tttn.R;

import java.util.ArrayList;

public class managerAdapter extends RecyclerView.Adapter<managerAdapter.ManagerViewHolder>{
    private ArrayList<manager> listmanager;
    private Context context;

    public managerAdapter(ArrayList<manager> listmanager, Context context) {
        this.listmanager = listmanager;
        this.context = context;
    }

    @NonNull
    @Override
    public ManagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_contact, parent, false);
        return new ManagerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ManagerViewHolder holder, int position) {
        final manager manager  = listmanager.get(position);
        holder.tv_manager.setText(manager.getName());
        Glide.with(context).load(manager.getImage()).into(holder.img_manager);
        String name = manager.getName();
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, name, Toast.LENGTH_LONG).show();
                if (name.equals("Báo cáo sự cố")){
                    onClickRequest();
                }else{
                    Toast.makeText(context, name, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void onClickManager(){
        Intent intent = new Intent(context, ListNS.class);
        context.startActivity(intent);
    }
    private void onClickRequest(){
        Intent intent = new Intent(context, Request_Activity.class);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return listmanager.size();
    }

    public class ManagerViewHolder extends RecyclerView.ViewHolder{

        ImageView img_manager;
        TextView tv_manager;
        LinearLayout linearLayout;
        public ManagerViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_manager = itemView.findViewById(R.id.tv_name_manager);
            img_manager = itemView.findViewById(R.id.img_icon_manager);
            linearLayout = itemView.findViewById(R.id.item_layout);
        }
    }
}
