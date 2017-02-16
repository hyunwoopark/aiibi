package park.hyunwoo.aiibi.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Hyunwoo on 10/28/2016.
 */
public class BaseFragment extends Fragment {

    CompositeSubscription subscriptions;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        subscriptions = new CompositeSubscription();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        subscriptions.unsubscribe();
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public AppCompatActivity getAppCompatActivity() {
        return ((AppCompatActivity) getActivity());
    }

    public void setTitle(int titleId) {
        getActivity().setTitle(titleId);
    }

}
