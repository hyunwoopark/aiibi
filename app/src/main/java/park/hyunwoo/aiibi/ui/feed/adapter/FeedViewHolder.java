package park.hyunwoo.aiibi.ui.feed.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by hyun.park on 2/25/17.
 */
public class FeedViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;

    public FeedViewHolder(View rowView) {
        super(rowView);
        binding = DataBindingUtil.bind(rowView);
    }
    public ViewDataBinding getBinding() {
        return binding;
    }
}
