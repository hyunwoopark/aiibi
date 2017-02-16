package park.hyunwoo.aiibi.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private CompositeSubscription subscription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        subscription = new CompositeSubscription();
    }

    @Override
    public void setTitle(int titleId) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getString(titleId));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        subscription.unsubscribe();
    }
}
