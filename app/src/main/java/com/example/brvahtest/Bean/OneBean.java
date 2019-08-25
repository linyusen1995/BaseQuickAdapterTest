package com.example.brvahtest.Bean;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.brvahtest.Adapter.TestAdapter;

public class OneBean extends AbstractExpandableItem<TwoBean> implements MultiItemEntity {

    private String content;

    public OneBean(String content) {
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
        return 0;
    }

    @Override
    public int getItemType() {
        return TestAdapter.TYPE_ONE;
    }
}
