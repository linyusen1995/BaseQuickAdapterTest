package com.example.brvahtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.brvahtest.Adapter.TestAdapter;
import com.example.brvahtest.Bean.OneBean;
import com.example.brvahtest.Bean.ThreeBean;
import com.example.brvahtest.Bean.TwoBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TestAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        testAdapter = new TestAdapter(new ArrayList<MultiItemEntity>());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(testAdapter);
        initData();
    }

    private void initData() {
        List<MultiItemEntity> multiItemEntityList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            OneBean oneBean = new OneBean("一级标题" + i);
            for (int j = 0; j < 3; j++) {
                TwoBean twoBean = new TwoBean("二级标题" + j);
                for (int k = 0; k < 4; k++) {
                    twoBean.addSubItem(new ThreeBean("三级标题" + k));
                }
                oneBean.addSubItem(twoBean);
            }
            multiItemEntityList.add(oneBean);
        }
        testAdapter.setNewData(multiItemEntityList);
        testAdapter.notifyDataSetChanged();
    }
}
