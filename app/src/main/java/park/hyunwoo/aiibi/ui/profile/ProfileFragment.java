package park.hyunwoo.aiibi.ui.profile;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import javax.inject.Inject;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.databinding.FragmentProfileBinding;
import park.hyunwoo.aiibi.model.Artifact;
import park.hyunwoo.aiibi.ui.AiibiApplication;
import park.hyunwoo.aiibi.ui.BaseFragment;

/**
 * Created by hyun.park on 3/3/17.
 */

public class ProfileFragment extends BaseFragment implements ProfileContract.View {

    private FragmentProfileBinding binding;

    @Inject
    ProfilePresenter profilePresenter;

    @NonNull
    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    public ProfileFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AiibiApplication.getApp().getComponent().inject(this);
        profilePresenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
        View view = binding.getRoot();
        binding.setProfileView(this);
        ((AppCompatActivity) getActivity()).setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitle("Nick Cage");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide.with(this)
                .load("https://www.placecage.com/200/300")
                .centerCrop()
                .into(binding.profilePicture);
        profilePresenter.getUserCollection();
    }

    @Override
    public void showCollections(List<Artifact> artifacts) {
        binding.myCollectionList.setAdapter(new ArtifactsAdapter(artifacts));
    }
}
