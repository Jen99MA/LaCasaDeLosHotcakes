package com.example.lacasadeloshotcakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DetallePromoActivityFragment extends Fragment {
//public class DetallePromoActivity extends AppCompatActivity {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_detalle_promo, container, false);


        return inflater.inflate(R.layout.activity_detalle_promo, container, false);
    }
}



    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_detalle_promo);
    //}
//}