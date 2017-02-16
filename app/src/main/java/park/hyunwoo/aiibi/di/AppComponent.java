package park.hyunwoo.aiibi.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {

//    void inject(AlbumModel albumModel);
}