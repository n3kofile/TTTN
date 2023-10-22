package com.example.tttn;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tttn.Fragment.History_Fragment.History_Fragment;
import com.example.tttn.Fragment.Historyb_Fragment.Historyb_Fragment;
import com.example.tttn.Fragment.Home_Fragment.Home_Fragment;
import com.example.tttn.Fragment.Phone_Fragment.Phone_Fragment;
import com.example.tttn.Fragment.Setting_Fragment.Setting_Fragment;


public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Home_Fragment();
            case 1:
                return new History_Fragment();
            case 2:
                return new Phone_Fragment();
            case 3:
                return new Historyb_Fragment();
            case 4:
                return new Setting_Fragment();
            default:
                return new Home_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
