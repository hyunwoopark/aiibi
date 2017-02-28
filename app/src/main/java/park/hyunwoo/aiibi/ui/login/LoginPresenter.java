package park.hyunwoo.aiibi.ui.login;

import android.support.annotation.NonNull;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */
public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View loginView;

    @Override
    public void start() {

    }

    @Override
    public void attachView(LoginContract.View view) {

    }

    @Override
    public void dettachView() {
        this.loginView = null;
    }

    @Override
    public boolean validateUsername(@NonNull String username) {
        return false;
    }

    @Override
    public boolean validatePassword() {
        return false;
    }

    @Override
    public boolean checkUsernameAvailabilty() {
        return false;
    }
}
