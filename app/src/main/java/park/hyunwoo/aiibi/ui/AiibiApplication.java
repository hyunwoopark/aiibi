package park.hyunwoo.aiibi.ui;

import android.app.Application;

import park.hyunwoo.aiibi.di.AppComponent;
import park.hyunwoo.aiibi.di.AppModule;
import park.hyunwoo.aiibi.di.DaggerAppComponent;

/**
 * Created by hyun.park on 2/19/17.
 */

public class AiibiApplication extends Application {

    private static AiibiApplication app;
    protected AppComponent component;

    public static AiibiApplication getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        component = DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public AppComponent getComponent() {
        return component;
    }
}