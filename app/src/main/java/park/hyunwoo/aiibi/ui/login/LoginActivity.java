package park.hyunwoo.aiibi.ui.login;

import android.os.Bundle;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.ui.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
