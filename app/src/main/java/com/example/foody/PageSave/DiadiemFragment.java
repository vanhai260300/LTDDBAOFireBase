package com.example.foody.PageSave;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.foody.PageOrder.Employee;
import com.example.foody.PageOrder.EmployeeDataUtils;
import com.example.foody.R;

public class DiadiemFragment extends Fragment {


    public DiadiemFragment() {
        // Required empty public constructor
    }

    Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_diadiem, container, false);

        Employeesave[] employees = EmployeeDataUtilssave.getEmployees();
        spinner = (Spinner) v.findViewById(R.id.spinner);
        ArrayAdapter<Employeesave> LTRadapter = new ArrayAdapter<Employeesave>(this.getActivity(), R.layout.spinner_item, employees);
        LTRadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(LTRadapter);

        return  v;
    }
}