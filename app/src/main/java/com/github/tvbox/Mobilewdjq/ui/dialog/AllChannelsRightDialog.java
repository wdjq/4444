package com.github.tvbox.Mobilewdjq.ui.dialog;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blankj.utilcode.util.ColorUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.github.tvbox.Mobilewdjq.R;
import com.github.tvbox.Mobilewdjq.bean.VodInfo;
import com.github.tvbox.Mobilewdjq.databinding.DialogAllChannelBinding;
import com.github.tvbox.Mobilewdjq.ui.activity.LiveActivity;
import com.github.tvbox.Mobilewdjq.ui.adapter.LiveChannelGroupNewAdapter;
import com.github.tvbox.Mobilewdjq.ui.adapter.LiveChannelItemNewAdapter;
import com.github.tvbox.Mobilewdjq.ui.widget.GridSpacingItemDecoration;
import com.github.tvbox.Mobilewdjq.util.FastClickCheckUtil;
import com.github.tvbox.Mobilewdjq.util.Utils;
import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.core.DrawerPopupView;
import com.lxj.xpopup.enums.PopupPosition;
import com.lxj.xpopup.interfaces.OnSelectListener;
import com.owen.tvrecyclerview.widget.V7LinearLayoutManager;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AllChannelsRightDialog extends DrawerPopupView {

    private final LiveActivity mActivity;
    private com.github.tvbox.Mobilewdjq.databinding.DialogAllChannelBinding mBinding;

    public AllChannelsRightDialog(@NonNull @NotNull Context context) {
        super(context);
        mActivity = (LiveActivity) context;
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.dialog_all_channel;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        mBinding = DialogAllChannelBinding.bind(getPopupImplView());
        initChannelGroupView();
        initLiveChannelView();
    }

    private void initChannelGroupView() {
        mBinding.mGroupGridView.setHasFixedSize(true);
        mBinding.mGroupGridView.setLayoutManager(new V7LinearLayoutManager(getContext(), 1, false));

        if (mActivity.liveChannelGroupAdapter!=null){
            mBinding.mGroupGridView.setAdapter(mActivity.liveChannelGroupAdapter);
        }

    }
    private void initLiveChannelView() {
        mBinding.mChannelGridView.setHasFixedSize(true);
        mBinding.mChannelGridView.setLayoutManager(new V7LinearLayoutManager(getContext(), 1, false));

        if (mActivity.liveChannelItemAdapter!=null){
            mBinding.mChannelGridView.setAdapter(mActivity.liveChannelItemAdapter);
        }
    }

}
