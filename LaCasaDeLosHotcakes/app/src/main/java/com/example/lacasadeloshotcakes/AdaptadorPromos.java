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

public class AdaptadorPromos extends RecyclerView.Adapter<AdaptadorPromos.ViewHolder> {
    OnItemClickListener listener;
    List<Promo> promosAMostrar;


    public AdaptadorPromos(List<Promo> _promoAMostrar, AdaptadorPromos.OnItemClickListener _listener){
        promosAMostrar = _promoAMostrar;
        listener = _listener;
    }

    @Override
    public AdaptadorPromos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promocion, parent, false);
        ViewHolder vh = new ViewHolder(v);

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

        TextView tituloTextView;
        ImageView promoImageView;

        public ViewHolder(@NonNull View itemView){
            super (itemView);


            tituloTextView = itemView.findViewById(R.id.titulo_text_view);
            promoImageView= itemView.findViewById(R.id.promocion_image_view);
        }

        public void bind (final Promo p, final OnItemClickListener listener){

            tituloTextView.setText(p.promo);
            promoImageView.setImageResource(p.direccionImagenPromo);



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