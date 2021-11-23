package com.example.lacasadeloshotcakes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPlatillosFragment extends Fragment {
    //public class AdaptadorPlatillos extends RecyclerView.Adapter<com.example.lacasadeloshotcakes.AdaptadorPlatillos.ViewHolder> {
    List<PlatilloFragment> platillosAMostrar;
    OnFragmentInteractionListener listener;
    //AdapterView.OnItemClickListener listener;



    @NonNull
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.item_platillo, container, false);


        return inflater.inflate(R.layout.item_platillo, container, false);
    }

    public class OnItemClickListener {

    }
}



//public AdaptadorPlatillosFragment(List<PlatilloFragment> _platilloAMostrar, AdapterView.OnItemClickListener _listener){
// platillosAMostrar = _platilloAMostrar;

// }

    //@Override
   // public AdaptadorPlatillosFragment.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_platillo, parent, false);
        //ViewHolder vh = new ViewHolder(v);

       // return  vh;
    //}

   // @Override
    //public void onBindViewHolder(@NonNull AdaptadorPlatillosFragment.ViewHolder holder, int position) {
       // holder.bind(platillosAMostrar.get(position), listener);
    //}


   // @Override
    //public int getItemCount() {
        //return platillosAMostrar.size();
    //}

   // public static class ViewHolder extends RecyclerView.ViewHolder{

        //TextView tituloTextView, detallesTextView, dalergiasTextView,precioTextView;
        //ImageView platilloImageView, calificacionImageView;

        //public ViewHolder(@NonNull View itemView){
          //  super (itemView);

           // tituloTextView = itemView.findViewById(R.id.titulo_text_view);
           // platilloImageView= itemView.findViewById(R.id.platillo_image_view);

       // }

        //public void bind (final PlatilloFragment p, final OnItemClickListener listener){

            //tituloTextView.setText(p.titulo);
           // platilloImageView.setImageResource(p.direccionImagenPlatillo);

            //itemView.setOnClickListener(new View.OnClickListener() {
                //@Override
               // public void onClick(View view) { listener.onItemClick(p);}
           // });
       // }
   // }

    //public interface OnItemClickListener{
       // void onItemClick (PlatilloFragment p);
    //}
//}
