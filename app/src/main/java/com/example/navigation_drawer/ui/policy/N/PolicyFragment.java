package com.example.navigation_drawer.ui.policy.N;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigation_drawer.R;

public class PolicyFragment extends Fragment {

    private PolicyViewModel policyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        policyViewModel =
                ViewModelProviders.of(this).get(PolicyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_policy, container, false);
        final TextView textView = root.findViewById(R.id.text_policy);
        policyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}