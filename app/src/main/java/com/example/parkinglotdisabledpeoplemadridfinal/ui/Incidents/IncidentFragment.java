package com.example.parkinglotdisabledpeoplemadridfinal.ui.Incidents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.parkinglotdisabledpeoplemadridfinal.R;

public class IncidentFragment extends Fragment {

    private IncidenciasViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.incidencias_fragment, container, false);

        return root;
    }
}
