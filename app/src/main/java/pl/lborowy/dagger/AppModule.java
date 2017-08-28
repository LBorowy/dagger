package pl.lborowy.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RENT on 2017-08-28.
 */

@Module
public class AppModule {
    // pobieramy aplikacje
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides // to będzie coś, co będzie można wstrzyknąć(coś jak gettery)
    @Singleton
    Application provideApplication() {
        return application;
    }
}
