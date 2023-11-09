package com.example.tttn.Problem_request;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tttn.R;

public class RISActivity extends AppCompatActivity {
    LinearLayout layout_evulate, layout_feedback, layout_nvtn;
    String status = "Pass";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risactivity);
        init();
        EvulateClick();
        if (status == "request"){
            layout_evulate.setVisibility(View.GONE);
            layout_feedback.setVisibility(View.VISIBLE);
            layout_nvtn.setVisibility(View.GONE);


        }else if(status == "receive") {
            layout_evulate.setVisibility(View.GONE);
            layout_feedback.setVisibility(View.VISIBLE);
            layout_nvtn.setVisibility(View.VISIBLE);
        }else {
            layout_evulate.setVisibility(View.VISIBLE);
            layout_feedback.setVisibility(View.GONE);
            layout_nvtn.setVisibility(View.VISIBLE);
        }
    }
    public void EvulateClick(){
        layout_evulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyBottomSheetFragment bottomSheet = new MyBottomSheetFragment();
                bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
            }
        });
    }
    public void init(){
        layout_evulate = findViewById(R.id.LinearLayout_button_evulate);
        layout_feedback = findViewById(R.id.LinearLayout_button_feedback);
        layout_nvtn = findViewById(R.id.layout_nvtn);
    }
}