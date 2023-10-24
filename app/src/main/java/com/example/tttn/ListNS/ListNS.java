package com.example.tttn.ListNS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tttn.ListNS.ListNS_Fragment.Evulate.Fragment_Evulate;
import com.example.tttn.ListNS.ListNS_Fragment.Personnel.Fragment_Personnel;
import com.example.tttn.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ListNS extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    ImageView imgback;

    ViewPagerFragmentAdapter adapter;

    // array for tab labels
    private String[] labels = new String[]{"Nhân sự", "Đánh giá"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ns);
        init();
        back();
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            tab.setText(labels[position]);
        }).attach();
    }
    public void back(){
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void init(){
        imgback = findViewById(R.id.img_back);
        tabLayout = findViewById(R.id.tl_personnel);
        viewPager2 = findViewById(R.id.view_pager_2_listNS);
        adapter = new ViewPagerFragmentAdapter(this);
        viewPager2.setAdapter(adapter);
    }
    private class ViewPagerFragmentAdapter extends FragmentStateAdapter {

        public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new Fragment_Personnel();
                case 1:
                    return new Fragment_Evulate();
                default:
                    return new Fragment_Personnel();
            }

        }
        @Override
        public int getItemCount() {
            return labels.length;
        }
    }
}