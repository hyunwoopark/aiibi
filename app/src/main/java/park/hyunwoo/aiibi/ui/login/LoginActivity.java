package park.hyunwoo.aiibi.ui.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;

import javax.inject.Inject;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.databinding.ActivityLoginBinding;
import park.hyunwoo.aiibi.ui.AiibiApplication;
import park.hyunwoo.aiibi.ui.BaseActivity;
import park.hyunwoo.aiibi.ui.main.MainActivity;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Inject
    LoginContract.Presenter loginPresenter;

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AiibiApplication.getApp().getComponent().inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setLoginView(this);
        loginPresenter.attachView(this);
    }

    @Override
    public void loginPressed(View view) {
        loginPresenter.validateUsername(binding.loginUsername.getText().toString());
        Snackbar.make(binding.getRoot(), "Login Pressed", Snackbar.LENGTH_SHORT).show();
        MainActivity.start(this);
    }

    @Override
    public void forgotPasswordPressed(View view) {
        Snackbar.make(binding.getRoot(), "Forgot Password Pressed", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void displayUsernameError(String errorMessage) {

    }

    @Override
    public void displayPasswordError(String password) {

    }

    @Override
    public void displayErrorDialog(String errorMessage) {

    }

    @Override
    public void loginSuccessful() {
        Snackbar.make(binding.getRoot(), "Successful", Snackbar.LENGTH_SHORT).show();
    }
}
