package park.hyunwoo.aiibi.ui.profile;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import park.hyunwoo.aiibi.model.Artifact;

/**
 * Created by hyun.park on 3/3/17.
 */

public class ProfilePresenter implements ProfileContract.Presenter {

    private static final String dummyUrl = "http://thejeansblog.com/wp-content/uploads/2014/07/raw-denim-for-women.jpg";
    ProfileContract.View view;

    @Inject
    public ProfilePresenter() {

    }

    @Override
    public void start() {

    }

    @Override
    public void attachView(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void dettachView() {

    }

    @Override
    public void getUserCollection() {
        List<Artifact> artifacts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            artifacts.add(Artifact.create("Gustin", String.valueOf(i), dummyUrl));
        }
        view.showCollections(artifacts);
    }
}
