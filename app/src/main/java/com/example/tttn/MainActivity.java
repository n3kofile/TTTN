package com.example.tttn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tttn.Adapter.TaisanAdapter;
import com.example.tttn.Model.Taisan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewTaisan);


        TaisanAdapter adapter = new TaisanAdapter(getSampleData());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private List<Taisan> getSampleData() {
        List<Taisan> data = new ArrayList<>();
        data.add(new Taisan("ti vi", "1" , true , "" ));
        data.add(new Taisan("đồng hồ", "1" , true , "" ));
        data.add(new Taisan("bàn học", "21" , true , "" ));
        data.add(new Taisan("Ghế", "40" , true , "" ));
        data.add(new Taisan("remote", "1" , true , "" ));
        data.add(new Taisan("Bút viết", "3" , true , "" ));
        data.add(new Taisan("Xóa bảng", "1" , true , "" ));
        data.add(new Taisan("Dây HDMI", "1" , true , "" ));
        return data;
    }
}

