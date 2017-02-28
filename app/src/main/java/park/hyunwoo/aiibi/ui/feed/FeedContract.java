package park.hyunwoo.aiibi.ui.feed;

import java.util.List;

import park.hyunwoo.aiibi.model.FeedPost;
import park.hyunwoo.aiibi.ui.BasePresenter;

/**
 * Created by hyun.park on 2/25/17.
 */

public interface FeedContract {

    interface View {
        void showFeed(List<FeedPost> feedPosts);
    }

    interface Presenter extends BasePresenter {
        void attachView(View view);

        void dettachView();

        void fetchFeed();
    }
}
