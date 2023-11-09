package com.example.tttn.Problem_request;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tttn.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class Request_Activity extends AppCompatActivity {
    TextInputEditText input_room, input_describes;
    TextView tv_quantity_img;
    String problem;
    LinearLayout btn_picker, btn_select, btn_request, layout_img;
    ImageView img_1, img_2, img_back;
    private static final int SELECT_IMAGES_REQUEST = 1;
    private static final int CAPTURE_IMAGE_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_problem);
        init();
        spinner();
        clickRequestProblem();
        back();
        picker();
        select();
    }
    public void picker(){
        btn_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void select(){
        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

    public void clickRequestProblem(){
        btn_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Request_Activity.this, RISActivity.class);
                startActivity(intent);
            }
        });
    }
    public void spinner(){
        Spinner spinner = findViewById(R.id.spinner);
        float alphaValue = 0.5f;
        float alphaValue1 = 1f;
        List<String> items = new ArrayList<>();
// Add items to the list
        items.add("Sự cố gặp phải");
        items.add("Sự cố 1");
        items.add("Sự cố 2");
        items.add("Sự cố 3");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    spinner.setAlpha(alphaValue);
                } else {
                    spinner.setAlpha(alphaValue1);
                    problem= items.get(i);
                    Toast.makeText(getApplicationContext(), problem, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void init(){
        input_room = findViewById(R.id.input_room);
        input_describes = findViewById(R.id.input_describes);
        btn_picker = findViewById(R.id.LinearLayout_button_picker_image);
        btn_select = findViewById(R.id.LinearLayout_button_select_image);
        btn_request = findViewById(R.id.LinearLayout_button_request_problem);
        tv_quantity_img = findViewById(R.id.tv_quantity_image_problem);
        layout_img = findViewById(R.id.layout_img);
        img_1 = findViewById(R.id.img_problem_1);
        img_2 = findViewById(R.id.img_problem_2);
        img_back = findViewById(R.id.img_back_request);

    }
    public void back(){
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
