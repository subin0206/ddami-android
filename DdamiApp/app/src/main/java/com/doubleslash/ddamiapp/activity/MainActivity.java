package com.doubleslash.ddamiapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.doubleslash.ddamiapp.R;
import com.doubleslash.ddamiapp.fragment.ActivitisFragment;
import com.doubleslash.ddamiapp.fragment.ChattingFragment;
import com.doubleslash.ddamiapp.fragment.MainFragment;
import com.doubleslash.ddamiapp.fragment.ShopFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.nio.charset.CoderMalfunctionError;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    private MainFragment mainFragment = new MainFragment();
    private ChattingFragment chattingFragment = new ChattingFragment();
    private ShopFragment shopFragment = new ShopFragment();
    private ActivitisFragment activitisFragment = new ActivitisFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, mainFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.page_main: {
                        transaction.replace(R.id.frame_layout, mainFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.page_shop: {
                        transaction.replace(R.id.frame_layout, shopFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.page_activities: {
                        transaction.replace(R.id.frame_layout, activitisFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.page_chat : {
                        transaction.replace(R.id.frame_layout,chattingFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });
    }

}
