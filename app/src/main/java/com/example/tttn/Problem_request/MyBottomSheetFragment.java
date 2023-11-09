package com.example.tttn.Problem_request;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;

import com.example.tttn.Fragment.Home_Fragment.manager;
import com.example.tttn.MainActivity;
import com.example.tttn.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MyBottomSheetFragment extends BottomSheetDialogFragment {
    LinearLayout btn_pass;
    TextInputEditText input_evulate;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        view.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.bottom_sheet_bg));

        // Tùy chỉnh giao diện và hành vi của Bottom Sheet ở đây
        btn_pass = view.findViewById(R.id.LinearLayout_button_pass);
        input_evulate = view.findViewById(R.id.input_evulate);
        btn_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
