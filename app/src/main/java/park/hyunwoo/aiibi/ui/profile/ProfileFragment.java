package park.hyunwoo.aiibi.ui.profile;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import park.hyunwoo.aiibi.R;
import park.hyunwoo.aiibi.databinding.FragmentProfileBinding;
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
//        Glide.with(this)
//                .load("https://www.placecage.com/200/300")
//                .centerCrop()
//                .into(binding.profilePicture);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTitle(R.string.title_faded);
    }
}
