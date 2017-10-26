package com.srfaytkn.android.daggerexample.ui.detail.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.srfaytkn.android.daggerexample.R;
import com.srfaytkn.android.daggerexample.base.BaseFragment;
import com.srfaytkn.android.daggerexample.ui.detail.DetailActivity;
import com.srfaytkn.android.daggerexample.ui.detail.second.SecondFragment;

import javax.inject.Inject;

/**
 * Created by srfaytkn on 10/26/17.
 */

public class FirstFragment extends BaseFragment {

    @Inject
    FirstPresenter firstPresenter;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_first, container, false);

        Button button = inflate.findViewById(R.id.btn_change_fragment);
        button.setOnClickListener(v -> ((DetailActivity) getActivity()).changeFragment(SecondFragment.newInstance()));

        return inflate;
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }
}
