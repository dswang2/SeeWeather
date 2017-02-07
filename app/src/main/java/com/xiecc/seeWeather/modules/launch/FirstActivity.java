package com.xiecc.seeWeather.modules.launch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.xiecc.seeWeather.R;
import com.xiecc.seeWeather.modules.main.ui.MainActivity;
import java.lang.ref.WeakReference;

/**
 * Created by hugo on 2015/10/25 0025.
 * 闪屏页
 * @see <a herf="http://www.androiddesignpatterns.com/2013/01/inner-class-handler-memory-leak.html">How to Leak a Context: Handlers & Inner Classes</a>
 */
public class FirstActivity extends Activity {
    private static final String TAG = FirstActivity.class.getSimpleName();
    private SwitchHandler mHandler = new SwitchHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //activity切换的淡入淡出效果

        //overridePendingTransition 这个函数有两个参数,一个参数是第一个activity进入时的动画,另外一个参数则是第二个activity退出时的动画
        //android.R.anim.fade_in, android.R.anim.fade_out 是Android系统的淡入淡出效果
        //参考：http://blog.csdn.net/qq_30379689/article/details/52494270
        //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        //自定义的activity淡入淡出效果，动画文件在 res - anim 目录下
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);

        super.onCreate(savedInstanceState);
        mHandler.sendEmptyMessageDelayed(1, 1000);

    }

    private static class SwitchHandler extends Handler {
        private WeakReference<FirstActivity> mWeakReference;

        SwitchHandler(FirstActivity activity) {
            mWeakReference = new WeakReference<FirstActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            FirstActivity activity = mWeakReference.get();
            if (activity != null) {
                MainActivity.launch(activity);
                activity.finish();
            }
        }
    }
}