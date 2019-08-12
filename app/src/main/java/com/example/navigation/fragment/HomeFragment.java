package com.example.navigation.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.navigation.R;

import org.w3c.dom.Text;


public class HomeFragment extends Fragment {
LinearLayout home,message;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_home, container, false);
       home = view.findViewById(R.id.home);
       home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(),"Working on",Toast.LENGTH_LONG).show();

               FragmentManager fm=getActivity().getSupportFragmentManager();
               fm.beginTransaction().replace(R.id.content,new Home2Fragment()).commit();
           }
       });
       return view;
    }


}