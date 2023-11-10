package com.example.tttn.Fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tttn.Adapter.BuildingAdapter;
import com.example.tttn.Model.Building;
import com.example.tttn.R;

import java.util.ArrayList;
import java.util.List;

public class fragment_Building extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewBuilding);

        BuildingAdapter adapter = new BuildingAdapter(getSampleData());
        recyclerView.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

    }

    private List<Building> getSampleData() {
        List<Building> data = new ArrayList<>();
        data.add(new Building("1" , "17 phòng" ));
        data.add(new Building("2" , "17 phòng" ));
        data.add(new Building("3" , "17 phòng" ));
        data.add(new Building("8" , "17 phòng" ));
        data.add(new Building("10" , "17 phòng" ));
        data.add(new Building("11" , "17 phòng" ));
        return data;
    }
}

