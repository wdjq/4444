package com.github.tvbox.Mobilewdjq.callback;

import com.github.tvbox.Mobilewdjq.R;
import com.kingja.loadsir.callback.Callback;

/**
 * @author pj567
 * @date :2020/12/24
 * @description:
 */
public class EmptyCallback extends Callback {
    @Override
    protected int onCreateView() {
        return R.layout.loadsir_empty_layout;
    }
}
