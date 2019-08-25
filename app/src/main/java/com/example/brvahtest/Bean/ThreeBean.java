package com.example.brvahtest.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.brvahtest.Adapter.TestAdapter;

public class ThreeBean implements MultiItemEntity {
    private String content;

    public ThreeBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int getItemType() {
        return TestAdapter.TYPE_THREE;
    }
}
