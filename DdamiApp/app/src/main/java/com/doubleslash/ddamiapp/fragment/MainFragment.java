package com.doubleslash.ddamiapp.fragment;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleslash.ddamiapp.R;
import com.doubleslash.ddamiapp.adapter.MainAdapter;
import com.doubleslash.ddamiapp.model.MainItem;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.main_recyclerview);

        ArrayList<MainItem> items = new ArrayList<>();

        MainItem item = new MainItem("https://mblogthumb-phinf.pstatic.net/20160929_86/uidesignmage_1475139514655cRcSa_JPEG/%B5%F0%C0%DA%C0%CE%B8%DE%C0%CC%C1%F6_1.JPG?type=w800", "타이틀", "신영환");
        MainItem item2 = new MainItem("https://lh3.googleusercontent.com/proxy/BXVOUTQo6OCR28ccw3o3t9ktZRmfGUubrZTb4YVt8Rw13keFUVAwZtRw5dSx7-NNmIfOUBrl27_uZS7Ryfw1Y8xZRt_BqyQxRBFxU_C7g7IlIOvbxrEUXQ", "타이틀2", "신영환2");
        MainItem item3 = new MainItem("https://t1.daumcdn.net/cfile/tistory/2744FB4058719BE733", "타이틀3", "신영환3");
        MainItem item4 = new MainItem("https://www.enewstoday.co.kr/news/photo/201805/1188725_303007_1317.jpg", "타이틀4", "신영환4");

        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        RecyclerView.Adapter adapter = new MainAdapter(items);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
