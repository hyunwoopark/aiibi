package park.hyunwoo.aiibi.ui.feed;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import javax.inject.Inject;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.databinding.FragmentFeedBinding;
import park.hyunwoo.aiibi.model.FeedPost;
import park.hyunwoo.aiibi.ui.AiibiApplication;
import park.hyunwoo.aiibi.ui.BaseFragment;
import park.hyunwoo.aiibi.ui.feed.adapter.FeedAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class FeedFragment extends BaseFragment implements FeedContract.View {

    private FragmentFeedBinding binding;

    @Inject
    FeedPresenter feedPresenter;

    @NonNull
    public static FeedFragment newInstance() {
        return new FeedFragment();
    }

    public FeedFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AiibiApplication.getApp().getComponent().inject(this);
        feedPresenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_feed, container, false);
        View view = binding.getRoot();
        binding.setFeedView(this);
        setupRecyclerView();
        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar);
        return view;
    }

    private void setupRecyclerView() {
//        binding.recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.toolbar.setTitle(R.string.title_faded);
        feedPresenter.fetchFeed();
    }


    @Override
    public void showFeed(List<FeedPost> feedPosts) {
        binding.recyclerview.setAdapter(new FeedAdapter(feedPosts));
    }
}
