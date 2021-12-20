package com.example.dormitoryapp.kezekshilik.ui.keshigip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dormitoryapp.databinding.FragmentKeshigipBinding;
import com.example.dormitoryapp.kezekshilik.ui.keshigip.recyclerview.LateStudent;
import com.example.dormitoryapp.kezekshilik.ui.keshigip.recyclerview.LateStudentAdapter;

import java.util.ArrayList;

public class KeshigipFragment extends Fragment {

    private KeshigipViewModel homeViewModel;
    private FragmentKeshigipBinding binding;

    private ArrayList<LateStudent> lateStudents = new ArrayList<LateStudent>();

    public void setInitialData(){
        lateStudents.add(new LateStudent("Marlen", "3-F", "15"));
        lateStudents.add(new LateStudent("Alikhan", "3-C", "25"));
        lateStudents.add(new LateStudent("Almas", "3-F", "10"));
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(KeshigipViewModel.class);

        binding = FragmentKeshigipBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        setInitialData();

        RecyclerView lateStudentsList = binding.keshigipList;

        LateStudentAdapter adapter = new LateStudentAdapter(getActivity(), lateStudents);

        lateStudentsList.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}