package com.example.brvahtest.Bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.brvahtest.Adapter.TestAdapter;

public class TwoBean extends AbstractExpandableItem<ThreeBean> implements MultiItemEntity {
    private String content;

    public TwoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int getLevel() {
        return 1;
    }

    @Override
    public int getItemType() {
        return TestAdapter.TYPE_TWO;
    }
}
