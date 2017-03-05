package park.hyunwoo.aiibi.di;

import dagger.Module;
import dagger.Provides;
import park.hyunwoo.aiibi.ui.feed.FeedContract;
import park.hyunwoo.aiibi.ui.feed.FeedPresenter;
import park.hyunwoo.aiibi.ui.login.LoginContract;
import park.hyunwoo.aiibi.ui.login.LoginPresenter;
import park.hyunwoo.aiibi.ui.profile.ProfileContract;
import park.hyunwoo.aiibi.ui.profile.ProfilePresenter;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

@Module
public class AppModule {

    //    @Provides
//    public AlbumContract.Model provideAlbumModel() {
//        return new AlbumModel();
//    }
//
    @Provides
    public LoginContract.Presenter provideLoginPresenter() {
        return new LoginPresenter();
    }

    @Provides
    public FeedContract.Presenter provideFeedPresenter() {
        return new FeedPresenter();
    }

    @Provides
    public ProfileContract.Presenter provideProfilePresenter() {
        return new ProfilePresenter();
    }}