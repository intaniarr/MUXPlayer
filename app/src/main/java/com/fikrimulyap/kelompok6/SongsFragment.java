package com.fikrimulyap.kelompok6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class SongsFragment extends Fragment {
    private static final int REQUEST_PERMISSION = 99;

    ArrayList<Song> songArrayList;
    ListView lvSongs;
    SongsAdapter songsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_songs, container, false);

        lvSongs = view.findViewById(R.id.lvSongs);


        return view;


    }

}