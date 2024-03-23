package com.github.tvbox.Mobilewdjq.ui.activity

import android.content.Intent
import android.os.Handler
import com.github.tvbox.Mobilewdjq.base.BaseVbActivity
import com.github.tvbox.Mobilewdjq.databinding.ActivitySplashBinding

class SplashActivity : BaseVbActivity<ActivitySplashBinding>() {
    override fun init() {
        mBinding.root.postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        },400)
    }
}