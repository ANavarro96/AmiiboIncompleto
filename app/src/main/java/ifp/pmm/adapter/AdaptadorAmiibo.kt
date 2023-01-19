package ifp.pmm.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ifp.pmm.amiiborecyclerview.R;

public class AdaptadorAmiibo extends RecyclerView.Adapter<AdaptadorAmiibo.AmiiboViewHolder> {
    private ArrayList<Amiibo> listaAmiibos;


    public AdaptadorAmiibo(ArrayList<Amiibo> listaAmiibos) {
        this.listaAmiibos = listaAmiibos;
    }

    public ArrayList<Amiibo> getListaAmiibos() {
        return listaAmiibos;
    }
    public void setListaAmiibos(ArrayList<Amiibo> ListaAmiibos) {
        this.listaAmiibos = ListaAmiibos;
    }



    @NonNull
    @Override
    public AmiiboViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_amiibo, parent, false);
        return new AmiiboViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull AmiiboViewHolder holder, int position) {
        Amiibo AmiiboActual = listaAmiibos.get(position);
      /* TODO: Asociar los elementos de nuestra clase al ViewHolder, usar
      *   Picasso para poder mostrar la imagen */

    }


    @Override
    public int getItemCount() {
        return listaAmiibos.size();
    }

    public class AmiiboViewHolder extends RecyclerView.ViewHolder {
        TextView nombreCuadroTexto;
        ImageView fotoAmiibo;

        public TextView getNombreCuadroTexto() {
            return nombreCuadroTexto;
        }

        public void setNombreCuadroTexto(TextView nombreCuadroTexto) {
            this.nombreCuadroTexto = nombreCuadroTexto;
        }


        public ImageView getFotoAmiibo() {
            return fotoAmiibo;
        }

        public void setFotoAmiibo(ImageView portadaIW) {
            this.fotoAmiibo = portadaIW;
        }


        public AmiiboViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nombreCuadroTexto = itemView.findViewById(R.id.nombre);
            this.fotoAmiibo = itemView.findViewById(R.id.fotoAmiibo);
        }
    }
}
