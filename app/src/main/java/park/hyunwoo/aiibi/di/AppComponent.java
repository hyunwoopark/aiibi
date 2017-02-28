package park.hyunwoo.aiibi.di;

import javax.inject.Singleton;

import dagger.Component;
import park.hyunwoo.aiibi.ui.feed.FeedFragment;
import park.hyunwoo.aiibi.ui.login.LoginActivity;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    void inject(LoginActivity loginActivity);

    void inject(FeedFragment feedFragment);
}