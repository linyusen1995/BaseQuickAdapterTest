package com.example.brvahtest.Adapter;

import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.brvahtest.Bean.OneBean;
import com.example.brvahtest.Bean.ThreeBean;
import com.example.brvahtest.Bean.TwoBean;
import com.example.brvahtest.R;

import java.util.List;

public class TestAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static final int TYPE_ONE = 0;
    public static final int TYPE_TWO = 1;
    public static final int TYPE_THREE = 2;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public TestAdapter(List<MultiItemEntity> data) {
        super(data);
        addItemType(TYPE_ONE, R.layout.item_one);
        addItemType(TYPE_TWO, R.layout.item_two);
        addItemType(TYPE_THREE, R.layout.item_three);
    }

    @Override
    protected void convert(final BaseViewHolder helper, MultiItemEntity item) {
        switch (helper.getItemViewType()) {
            case TYPE_ONE:
                final OneBean oneBean = (OneBean) item;
                helper.setText(R.id.content, oneBean.getContent());
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int pos = helper.getAdapterPosition();
                        if (oneBean.isExpanded()) {
                            collapse(pos);
                        } else {
                            expand(pos);
                        }
                    }
                });
                break;
            case TYPE_TWO:
                final TwoBean twoBean = (TwoBean) item;
                helper.setText(R.id.content, twoBean.getContent());
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int pos=helper.getAdapterPosition();
                        if (twoBean.isExpanded()){
                            collapse(pos);
                        }else {
                            expand(pos);
                        }
                    }
                });
                break;
            case TYPE_THREE:
                ThreeBean threeBean = (ThreeBean) item;
                helper.setText(R.id.content, threeBean.getContent());
                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mContext,"三级",Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}
