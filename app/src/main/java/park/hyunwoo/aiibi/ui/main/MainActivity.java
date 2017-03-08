package park.hyunwoo.aiibi.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.databinding.ActivityMainBinding;
import park.hyunwoo.aiibi.ui.BaseActivity;
import park.hyunwoo.aiibi.ui.feed.FeedFragment;
import park.hyunwoo.aiibi.ui.profile.ProfileFragment;

public class MainActivity extends BaseActivity implements MainContract.View {

    private ActivityMainBinding binding;

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, MainActivity.class));
        activity.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMainView(this);
//        setSupportActionBar(binding.toolbar);
        setBottomNavigation();
        binding.bottomNavigationView.getMenu().getItem(0).setChecked(true);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, FeedFragment.newInstance())
                .commit();
    }

    private void setBottomNavigation() {
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(
                item -> {
                    Fragment fragment = selectNavigationItem(item);
                    getSupportFragmentManager()
                            .beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)                           .
                            replace(R.id.content, fragment, fragment.getTag())
                            .commit();
                    return true;
                });
    }

    private Fragment selectNavigationItem(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_feed:
                binding.fab.showMenuButton(true);
                return FeedFragment.newInstance();
            case R.id.action_browse:
                binding.fab.hideMenuButton(true);
                return FeedFragment.newInstance();
            case R.id.action_profile:
                binding.fab.hideMenuButton(true);
                return ProfileFragment.newInstance();
            default:
                return FeedFragment.newInstance();
        }
    }
}
