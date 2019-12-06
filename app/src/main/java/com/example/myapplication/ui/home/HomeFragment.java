package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class HomeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private HomeViewModel homeViewModel;

    private Spinner spinnerOrdenar;
    private Spinner spinnerFiltrar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        spinnerOrdenar = root.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adp = ArrayAdapter.createFromResource(getContext(), R.array.ordenarSpinner, android.R.layout.simple_spinner_item);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOrdenar.setAdapter(adp);
        spinnerOrdenar.setOnItemSelectedListener(this);

        spinnerFiltrar = root.findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adp2 = ArrayAdapter.createFromResource(getContext(), R.array.filtrarSpinner, android.R.layout.simple_spinner_item);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFiltrar.setAdapter(adp2);
        spinnerFiltrar.setOnItemSelectedListener(this);
        return root;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}