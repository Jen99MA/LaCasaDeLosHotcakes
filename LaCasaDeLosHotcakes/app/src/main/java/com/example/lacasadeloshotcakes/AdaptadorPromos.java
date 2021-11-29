package com.example.lacasadeloshotcakes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPromos extends RecyclerView.Adapter<AdaptadorPromos.ViewHolder> {
    AdaptadorPromos.OnItemClickListener listener;
    List<Promo> promosAMostrar;


    public AdaptadorPromos(List<Promo> _promoAMostrar, AdaptadorPromos.OnItemClickListener _listener){
        promosAMostrar = _promoAMostrar;
        listener = _listener;
    }

    @Override
    public AdaptadorPromos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promocion, parent, false);
        AdaptadorPromos.ViewHolder vh = new AdaptadorPromos.ViewHolder(v);

        return  vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPromos.ViewHolder holder, int position) {
        holder.bind(promosAMostrar.get(position), listener);
    }


    @Override
    public int getItemCount() {
        return promosAMostrar.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tituloTextView, detallesTextView;
        ImageView promoImageView;

        public ViewHolder(@NonNull View itemView){
            super (itemView);

            tituloTextView = itemView.findViewById(R.id.titulo_text_view);
            promoImageView= itemView.findViewById(R.id.platillo_image_view);
            detallesTextView= itemView.findViewById(R.id.detalles_text_view);
        }

        public void bind (final Promo p, final OnItemClickListener listener){

            tituloTextView.setText(p.promo);
            promoImageView.setImageResource(p.direccionImagenPromo);
            detallesTextView.setText(p.descripcionPromo);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { listener.onItemClick(p);}
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick (Promo p);
    }
}