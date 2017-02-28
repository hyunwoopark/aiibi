package park.hyunwoo.aiibi.ui.feed;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import park.hyunwoo.aiibi.model.FeedPost;

/**
 * Created by hyun.park on 2/25/17.
 */

public class FeedPresenter implements FeedContract.Presenter {

    private static final String dummyUrl = "http://thejeansblog.com/wp-content/uploads/2014/07/raw-denim-for-women.jpg";

    FeedContract.View view;

    @Inject
    public FeedPresenter() {

    }

    @Override
    public void fetchFeed() {
        List<FeedPost> feedPosts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            feedPosts.add(FeedPost.create("Gustin", String.valueOf(i), dummyUrl));
        }
        view.showFeed(feedPosts);
    }

    @Override
    public void start() {

    }

    @Override
    public void attachView(FeedContract.View view) {
        this.view = view;
    }

    @Override
    public void dettachView() {

    }
}
