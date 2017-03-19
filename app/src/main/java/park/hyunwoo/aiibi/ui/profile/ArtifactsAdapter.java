package park.hyunwoo.aiibi.ui.profile;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import park.hyunwoo.aiibi.BR;
import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.model.Artifact;

/**
 * Created by Hyunwoo Park on 3/14/2017.
 */
public class ArtifactsAdapter extends RecyclerView.Adapter<ArtifactViewHolder> {

    private List<Artifact> artifacts;

    public ArtifactsAdapter(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    @Override
    public ArtifactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.view_artifact, parent, false);
        return new ArtifactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ArtifactViewHolder holder, int position) {
        final Artifact artifact = artifacts.get(position);
        holder.getBinding().setVariable(BR.artifact, artifact);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return artifacts.size();
    }
}