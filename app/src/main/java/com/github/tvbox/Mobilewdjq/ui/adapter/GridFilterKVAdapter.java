package com.github.tvbox.Mobilewdjq.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.tvbox.Mobilewdjq.R;

import java.util.ArrayList;

public class GridFilterKVAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public GridFilterKVAdapter() {
        super(R.layout.item_grid_filter_value, new ArrayList<>());
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.filterValue, item);
    }
}
