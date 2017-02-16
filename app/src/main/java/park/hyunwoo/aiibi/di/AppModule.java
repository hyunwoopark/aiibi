package park.hyunwoo.aiibi.di;

import dagger.Module;
import dagger.Provides;
import park.hyunwoo.aiibi.ui.login.LoginContract;
import park.hyunwoo.aiibi.ui.login.LoginPresenter;

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
}