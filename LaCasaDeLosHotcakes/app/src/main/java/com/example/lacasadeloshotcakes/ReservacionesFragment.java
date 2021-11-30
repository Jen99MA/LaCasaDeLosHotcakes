package com.example.lacasadeloshotcakes;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReservacionesFragment extends Fragment {
//Antes era public class Reservaciones extends AppCompatActivity {

 TextView nombreEditText, numeroEditText, fechaEditText, horaEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_reservaciones, container, false);


        return inflater.inflate(R.layout.activity_reservaciones, container, false);

    }
}


   // @Override
   // protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_reservaciones);
   // }
//}