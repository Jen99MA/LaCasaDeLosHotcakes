package com.example.lacasadeloshotcakes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPlatillos extends RecyclerView.Adapter<AdaptadorPlatillos.ViewHolder> {
OnItemClickListener listener;
List<Platillo> platillosAMostrar;


public AdaptadorPlatillos(List<Platillo> _platilloAMostrar, OnItemClickListener _listener){
platillosAMostrar = _platilloAMostrar;
listener = _listener;
 }

    @Override
    public AdaptadorPlatillos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_platillo, parent, false);
        ViewHolder vh = new ViewHolder(v);

       return  vh;
    }

   @Override
    public void onBindViewHolder(@NonNull AdaptadorPlatillos.ViewHolder holder, int position) {
       holder.bind(platillosAMostrar.get(position), listener);
    }


    @Override
    public int getItemCount() {
        return platillosAMostrar.size();
    }

   public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tituloTextView, detallesTextView, dalergiasTextView,precioTextView;
        ImageView platilloImageView, calificacionImageView;

        public ViewHolder(@NonNull View itemView){
           super (itemView);

            tituloTextView = itemView.findViewById(R.id.titulo_text_view);
            platilloImageView= itemView.findViewById(R.id.platillo_image_view);
            detallesTextView= itemView.findViewById(R.id.detalles_text_view);
            dalergiasTextView = itemView.findViewById(R.id.dalergias_text_view);
            precioTextView= itemView.findViewById(R.id.precio_text_view);
            calificacionImageView= itemView.findViewById(R.id.calificacion_image_view);
        }

        public void bind (final Platillo p, final OnItemClickListener listener){

            tituloTextView.setText(p.titulo);
            platilloImageView.setImageResource(p.direccionImagenPlatillo);
            detallesTextView.setText(p.detalles);
            dalergiasTextView.setText(p.dalergias);
            precioTextView.setText(p.precio);
            calificacionImageView.setImageResource(p.direcconImagenCalificacion);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { listener.onItemClick(p);}
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick (Platillo p);
    }
}
