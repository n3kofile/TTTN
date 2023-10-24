package com.example.tttn.Fragment.Home_Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tttn.Fragment.Home_Fragment.adapter.managerAdapter;

import com.example.tttn.MainActivity;
import com.example.tttn.R;

import java.util.ArrayList;


public class Home_Fragment extends Fragment {

    private RecyclerView rcv_list_manager;
    managerAdapter managerAdapter;
    ArrayList<manager> listmng;
    MainActivity mainActivity;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(com.example.tttn.R.layout.home_fragment, container, false);
        rcv_list_manager = view.findViewById(R.id.rcv_list_manager);
        mainActivity = (MainActivity) getActivity();
        String role = mainActivity.getRole();
//        Toast.makeText( mainActivity, role, Toast.LENGTH_SHORT).show();
        if(role == "admin"){
            initadmin();
        }else if(role == "user"){
            inituser();
        }else {
            init();
        }
        setdata();
        return view;
    }

    private void initadmin(){
        listmng = new ArrayList<>();
        listmng.add(new manager("Nhân sự",R.drawable.group));
        listmng.add(new manager("Thống kê sự cố trong ngày",R.drawable.group1));
        listmng.add(new manager("Sự cố chưa hoàn thành",R.drawable.in_progress_svgrepo_com));
        listmng.add(new manager("Thành tích cán bộ",R.drawable.award_svgrepo_com));
        listmng.add(new manager("Sự kiện bộ môn",R.drawable.event_calender_date_note_svgrepo_com));
        listmng.add(new manager("Tính sẵn sàng phòng",R.drawable.presence_available));
    }
    private void inituser(){
        listmng = new ArrayList<>();
        listmng.add(new manager("Báo cáo sự cố",R.drawable.edit_square));
        listmng.add(new manager("Yêu cầu hỗ trợ CNTT",R.drawable.globe));
        listmng.add(new manager("Quản lí mượn phòng học, hội trường",R.drawable.feed_solid));
    }
    private void init(){
        listmng = new ArrayList<>();
        listmng.add(new manager("Sự cố cần hỗ trợ",R.drawable.edit_square));
        listmng.add(new manager("Tính sẵn sàng của phòng học",R.drawable.feed_solid));
    }
    private void setdata(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rcv_list_manager.setLayoutManager(linearLayoutManager);
        managerAdapter = new managerAdapter(listmng, getContext());
        rcv_list_manager.setAdapter(managerAdapter);
    }
}
