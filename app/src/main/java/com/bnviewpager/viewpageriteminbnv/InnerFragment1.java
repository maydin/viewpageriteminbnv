package com.bnviewpager.viewpageriteminbnv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InnerFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InnerFragment1 extends Fragment {
    public static final String PAGE_TITLE = "Inner Tab1";


    public InnerFragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment
     * @return A new instance of fragment Fragment1.
     */
    public static InnerFragment1 newInstance() {
        InnerFragment1 fragment = new InnerFragment1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inner_fragment1, container, false);
    }
}
