package park.hyunwoo.aiibi.ui.profile;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Hyunwoo Park on 3/14/2017.
 */
public class ArtifactViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;

    public ArtifactViewHolder(View rowView) {
        super(rowView);
        binding = DataBindingUtil.bind(rowView);
    }
    public ViewDataBinding getBinding() {
        return binding;
    }
}
