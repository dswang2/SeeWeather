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
     * 其实就是设置状态栏的颜色而已
     */
<<<<<<< HEAD
    // @Deprecated 注释：用于表明类(class)、方法(method)、字段(field)已经不再推荐使用
    // 代码重构时，会经常用到@Deprecated注释

    // Android KITKAT 以上实现沉浸式状态栏 实现
    // http://www.jianshu.com/p/f8374d6267ef

//    Activity中设置透明状态栏
//    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//    Activity中设置透明导航栏（ 导航栏指的就是Android下方的三大按键 ）
//    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

    @Deprecated
    public void setStatusBarColor(int color) {
        /**
         * Android4.4以上  但是抽屉有点冲突，目前就重写一个方法暂时解决4.4的问题
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(color);
        }
    }


    // kitkat是Google（谷歌公司）Android 4.4（安卓系统）的代号
    // 设置Android4.4 的沉浸式状态栏颜色
    public void setStatusBarColorForKitkat(int color) {
        /**
         * Android4.4
         */
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(color);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    // 白天模式/夜间模式 的设置
    // 参考：夜间模式 AppCompatDelegate 的简单实现
//    MODE_NIGHT_NO 日间模式
//    MODE_NIGHT_YES 夜间模式
//    MODE_NIGHT_AUTO 根据时间自动切换日夜间模式
//    MODE_NIGHT_FOLLOW_SYSTEM 默认模式

    public static void setDayTheme(AppCompatActivity activity) {
        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_NO);
        activity.getDelegate().setLocalNightMode(
            AppCompatDelegate.MODE_NIGHT_NO);
        // 调用 recreate() 使设置生效
        activity.recreate();
    }

    public static void setNightTheme(AppCompatActivity activity) {
        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_YES);
        activity.getDelegate().setLocalNightMode(
            AppCompatDelegate.MODE_NIGHT_YES);
        // 调用 recreate() 使设置生效
        activity.recreate();
    }


    public void setTheme(boolean isNights, AppCompatActivity activity) {
        if (isNights) {
            setNightTheme(activity);
        } else {
            setDayTheme(activity);
        }
    }
=======

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
>>>>>>> 722d5ba09fe26213a9e87fd57406c6d6c181ddd9

}
