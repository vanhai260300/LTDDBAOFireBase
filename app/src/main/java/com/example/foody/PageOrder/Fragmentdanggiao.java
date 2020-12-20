package com.example.foody.PageOrder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class Fragmentdanggiao extends Fragment implements OnMapReadyCallback{
    View V;
    Context context;
    ListView listView;
    CustomAdapter customAdapter;
    ArrayList<CountriesModel> countriesData;
    CountriesModel countriesModel;
    private GoogleMap gm;
    public Fragmentdanggiao(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        V = inflater.inflate(R.layout.danggiao, container, false);
        createMap();
        return V;

    }
    public void createMap() {
        SupportMapFragment smf = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        smf.getMapAsync((OnMapReadyCallback) this);
    }
    @Override
    public void onResume() {
        super.onResume();
        createMap();
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng hcm = new LatLng(16.0774843, 108.2109955);
        gm = googleMap;
        gm.addMarker(new MarkerOptions().position(hcm).title("Trường Đại Học Sư Phạm Kỹ Thuật Đà Nẵng"));
        CameraPosition cp = new CameraPosition.Builder().target(hcm).zoom(13).build();
        gm.animateCamera(CameraUpdateFactory.newCameraPosition(cp));
    }

}
