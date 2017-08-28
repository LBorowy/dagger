package pl.lborowy.dagger;

import android.app.Application;

/**
 * Created by RENT on 2017-08-28.
 */

public class MyApplication extends Application {
    // łączy moduły
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
