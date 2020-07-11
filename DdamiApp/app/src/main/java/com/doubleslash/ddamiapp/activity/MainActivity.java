package com.doubleslash.ddamiapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.doubleslash.ddamiapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    AppBarConfiguration appBarConfiguration;
    AppBarConfiguration appBarConfigurationBottom;
    Toolbar toolbar;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        bottomNavigationView = findViewById(R.id.bottomNavigation);

        //NavController 생성
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);



        //AppBarConfig 생성
        Set<Integer> pageSet = new HashSet<>();

        pageSet.add(R.id.page_main);
        pageSet.add(R.id.page_shop);
        pageSet.add(R.id.page_activities);
        pageSet.add(R.id.page_chat);

        appBarConfiguration =
                new AppBarConfiguration.Builder(pageSet)
                        .setOpenableLayout(drawerLayout)
                        .build();

        // 액션바에다 컨트롤러랑 AppBarConfig 연결
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        //BottomNavigation setting
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        //navigationView
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
