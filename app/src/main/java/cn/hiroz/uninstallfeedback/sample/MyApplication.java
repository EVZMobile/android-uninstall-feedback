package cn.hiroz.uninstallfeedback.sample;

import android.app.Application;
import android.os.Build;
import cn.hiroz.uninstallfeedback.FeedbackUtils;

/**
 * Created by hiro on 5/11/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        android.util.Log.e("DaemonThread", "Build Brand => " + Build.BRAND);
//        FeedbackUtils.openUrlWhenUninstall(this, "http://www.baidu.com");
        FeedbackUtils.openUrlWhenUninstallViaAppProcess(this, "http://www.baidu.com");
    }
}
