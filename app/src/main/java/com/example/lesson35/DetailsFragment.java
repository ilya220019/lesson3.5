package com.example.lesson35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {
    TextView textView;
    TextView textView1;
    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.titlef_id);
        textView1 = view.findViewById(R.id.messagef_tv);
        imageView = view.findViewById(R.id.chapf_tv);

        Bundle bundle = getArguments();
        textView.setText(bundle.getString("title"));
        textView1.setText(bundle.getString("message"));
        imageView.setImageResource(bundle.getInt("image"));

    }
}