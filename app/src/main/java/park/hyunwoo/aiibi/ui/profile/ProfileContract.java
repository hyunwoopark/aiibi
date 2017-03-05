package park.hyunwoo.aiibi.ui.profile;

import park.hyunwoo.aiibi.ui.BasePresenter;

/**
 * Created by hyun.park on 3/3/17.
 */

public interface ProfileContract {

    interface View {
    }

    interface Presenter extends BasePresenter {

        void attachView(View view);

        void dettachView();
    }
}
