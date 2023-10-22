package com.example.tttn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_HISTORY = 1;
    private static final int FRAGMENT_PHONE = 2;
    private static final int FRAGMENT_HISTORYB = 3;
    private static final int FRAGMENT_SETTING = 4;

    private int mCurrentFragment = FRAGMENT_HOME;

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mbottomNavigationView;

    private MyViewPagerAdapter mViewPagerAdapter;
    private ViewPager2 mViewpager2;
    private Integer role = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mViewPagerAdapter = new MyViewPagerAdapter(this);
        mViewpager2.setAdapter(mViewPagerAdapter);
        if (role==0){
            mbottomNavigationView.getMenu().findItem(R.id.button_history).setVisible(true);
            mbottomNavigationView.getMenu().findItem(R.id.button_phone).setVisible(true);
        }else if(role==1) {
            mbottomNavigationView.getMenu().findItem(R.id.button_history).setVisible(true);
        }else {
            mbottomNavigationView.getMenu().findItem(R.id.button_historyb).setVisible(true);
        }


        bottomclick1();
    }

    private void bottomclick1() {

        mbottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.button_Home){
                    openHomeFragment();
                    //navigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
                }else if(id == R.id.button_history){
                    openHistoryFragment();
                    //navigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                }else if(id == R.id.button_phone){
                    openPhoneFragment();
                    //navigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                }else if(id == R.id.button_historyb){
                    openHistorybFragment();
                    //navigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                }else if(id == R.id.button_setting){
                    openSettingFragment();
                    //navigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                }else if(id == R.id.button_Home){
                    openHomeFragment();
                    //navigationView.getMenu().findItem(R.id.nav_favorite).setChecked(true);
                }

                return true;
            }
        });
        mViewpager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        mCurrentFragment = FRAGMENT_HOME;
                        //navigationView.getMenu().findItem(R.id.nav_table).setChecked(true);
                        mbottomNavigationView.getMenu().findItem(R.id.button_Home).setChecked(true);
                        break;
                    case 1:
                        mCurrentFragment = FRAGMENT_HOME;
                        //navigationView.getMenu().findItem(R.id.nav_menu).setChecked(true);
                        mbottomNavigationView.getMenu().findItem(R.id.button_history).setChecked(true);
                        break;
                    case 2:
                        mCurrentFragment = FRAGMENT_HOME;
                        //navigationView.getMenu().findItem(R.id.nav_pay).setChecked(true);
                        mbottomNavigationView.getMenu().findItem(R.id.button_phone).setChecked(true);
                        break;
                    case 3:
                        mCurrentFragment = FRAGMENT_HOME;
                        //navigationView.getMenu().findItem(R.id.nav_user).setChecked(true);
                        mbottomNavigationView.getMenu().findItem(R.id.button_historyb).setChecked(true);
                        break;
                    case 4:
                        mCurrentFragment = FRAGMENT_HOME;
                        //navigationView.getMenu().findItem(R.id.nav_user).setChecked(true);
                        mbottomNavigationView.getMenu().findItem(R.id.button_setting).setChecked(true);
                        break;
                }

            }
        });
    }
    public void init(){
        mbottomNavigationView = findViewById(R.id.button_navigation);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mViewpager2 = findViewById(R.id.view_pager_2);
    }
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    private void openHomeFragment(){
        if(mCurrentFragment != FRAGMENT_HOME){
            //replaceFragment(new HomeFragment());
            mViewpager2.setCurrentItem(0);
            mCurrentFragment = FRAGMENT_HOME;
        }
    }
    private void openHistoryFragment(){
        if(mCurrentFragment != FRAGMENT_HISTORY){
            //replaceFragment(new HomeFragment());
            mViewpager2.setCurrentItem(1);
            mCurrentFragment = FRAGMENT_HISTORY;
        }
    }
    private void openPhoneFragment(){
        if(mCurrentFragment != FRAGMENT_PHONE){
            //replaceFragment(new HomeFragment());
            mViewpager2.setCurrentItem(2);
            mCurrentFragment = FRAGMENT_PHONE;
        }
    }
    private void openHistorybFragment(){
        if(mCurrentFragment != FRAGMENT_HISTORYB){
            //replaceFragment(new HomeFragment());
            mViewpager2.setCurrentItem(3);
            mCurrentFragment = FRAGMENT_HISTORYB;
        }
    }
    private void openSettingFragment(){
        if(mCurrentFragment != FRAGMENT_SETTING){
            //replaceFragment(new HomeFragment());
            mViewpager2.setCurrentItem(4);
            mCurrentFragment = FRAGMENT_SETTING;
        }
    }
}