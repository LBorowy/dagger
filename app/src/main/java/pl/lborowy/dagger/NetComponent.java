package pl.lborowy.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by RENT on 2017-08-28.
 */

// pozwala nam na połączenia sieciowe
@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface NetComponent {
    // gdzie wstrzukujemy
    void inject(MainActivity mainActivity);
//    void inject(MainPresenter presenter);
//    void inject(MainService mainService);
}

// teraz budujemy aplikacje - Build/Make Project, aby zbudowac graf zależności
