package pl.lborowy.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    // injectowanie
    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // injectowanie
        ((MyApplication) getApplication()).getNetComponent().inject(this); // budowanie logiki daggera + retrofit
    }
}
