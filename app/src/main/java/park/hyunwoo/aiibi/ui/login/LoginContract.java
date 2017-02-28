package park.hyunwoo.aiibi.ui.login;

import park.hyunwoo.aiibi.ui.BasePresenter;
import park.hyunwoo.aiibi.ui.BaseView;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

public interface LoginContract {

    interface View extends BaseView {
        void loginPressed(android.view.View view);

        void forgotPasswordPressed(android.view.View view);

        void displayUsernameError(String errorMessage);

        void displayPasswordError(String password);

        void displayErrorDialog(String errorMessage);

        void loginSuccessful();
    }

    interface Presenter extends BasePresenter {
        void attachView(View view);

        void dettachView();

        boolean validateUsername(String username);

        boolean validatePassword();

        boolean checkUsernameAvailabilty();
    }
}
