package com.xiecc.seeWeather.base;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

public class BaseActivity extends RxAppCompatActivity {
    private static String TAG = BaseActivity.class.getSimpleName();

    /**
     * @Deprecated”
     * 意在-----这个方法或类不再建议使用。
     * 在新版本中有其他方法或类可以代替这个使用，以后的版本也不会再更新这个方法或类
     */

    /**
     * 设置状态栏颜色
     * 也就是所谓沉浸式状态栏
     */

//    @Deprecated
//    public void setStatusBarColor(int color) {
//        /**
//         * Android4.4以上  但是抽屉有点冲突，目前就重写一个方法暂时解决4.4的问题
//         */
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            SystemBarTintManager tintManager = new SystemBarTintManager(this);
//            tintManager.setStatusBarTintEnabled(true);
//            tintManager.setStatusBarTintResource(color);
//        }
//    }
//
//    public void setStatusBarColorForKitkat(int color) {
//        /**
//         * Android4.4
//         */
//        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
//            this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            SystemBarTintManager tintManager = new SystemBarTintManager(this);
//            tintManager.setStatusBarTintEnabled(true);
//            tintManager.setStatusBarTintResource(color);
//        }
//    }
//
//    public static void setDayTheme(AppCompatActivity activity) {
//        AppCompatDelegate.setDefaultNightMode(
//            AppCompatDelegate.MODE_NIGHT_NO);
//        activity.getDelegate().setLocalNightMode(
//            AppCompatDelegate.MODE_NIGHT_NO);
//        // 调用 recreate() 使设置生效
//        activity.recreate();
//    }
//
//    public static void setNightTheme(AppCompatActivity activity) {
//        AppCompatDelegate.setDefaultNightMode(
//            AppCompatDelegate.MODE_NIGHT_YES);
//        activity.getDelegate().setLocalNightMode(
//            AppCompatDelegate.MODE_NIGHT_YES);
//        // 调用 recreate() 使设置生效
//        activity.recreate();
//    }
//
//    public void setTheme(boolean isNights, AppCompatActivity activity) {
//        if (isNights) {
//            setNightTheme(activity);
//        } else {
//            setDayTheme(activity);
//        }
//    }
//
//    public void setTheme(AppCompatActivity activity) {
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
//        activity.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
//        activity.recreate();
//    }

}
