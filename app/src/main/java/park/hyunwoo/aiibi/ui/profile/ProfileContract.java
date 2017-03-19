package park.hyunwoo.aiibi.ui.profile;

import java.util.List;

import park.hyunwoo.aiibi.model.Artifact;
import park.hyunwoo.aiibi.ui.BasePresenter;

/**
 * Created by hyun.park on 3/3/17.
 */

public interface ProfileContract {

    interface View {
        void showCollections(List<Artifact> artifacts);
    }

    interface Presenter extends BasePresenter {

        void attachView(View view);

        void dettachView();

        void getUserCollection();
    }
}
