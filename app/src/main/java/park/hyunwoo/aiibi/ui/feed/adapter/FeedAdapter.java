package park.hyunwoo.aiibi.ui.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import park.hyunwoo.aiibi.BR;
import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.model.FeedPost;

/**
 * Created by hyun.park on 2/25/17.
 */

public class FeedAdapter extends RecyclerView.Adapter<FeedViewHolder> {

    List<FeedPost> feedPosts;

    public FeedAdapter(List<FeedPost> feedPosts) {
        this.feedPosts = feedPosts;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.view_feed_post, parent, false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {
        final FeedPost feedPost = feedPosts.get(position);
        holder.getBinding().setVariable(BR.feedPost, feedPost);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return feedPosts.size();
    }
}
