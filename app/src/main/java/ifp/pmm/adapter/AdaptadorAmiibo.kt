package ifp.pmm.adapter

import androidx.recyclerview.widget.RecyclerView
import ifp.pmm.adapter.AdaptadorAmiibo.AmiiboViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import ifp.pmm.amiiborecyclerview.R
import android.widget.TextView
import java.util.ArrayList

class AdaptadorAmiibo(listaAmiibos: ArrayList<Amiibo>) : RecyclerView.Adapter<AmiiboViewHolder>() {
    private var listaAmiibos: ArrayList<Amiibo>

    init {
        this.listaAmiibos = listaAmiibos
    }

    fun getListaAmiibos(): ArrayList<Amiibo> {
        return listaAmiibos
    }

    fun setListaAmiibos(ListaAmiibos: ArrayList<Amiibo>) {
        listaAmiibos = ListaAmiibos
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmiiboViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_amiibo, parent, false)
        return AmiiboViewHolder(item)
    }

    override fun onBindViewHolder(holder: AmiiboViewHolder, position: Int) {
        val AmiiboActual: Amiibo = listaAmiibos[position]
        /* TODO: Asociar los elementos de nuestra clase al ViewHolder, usar
      *   Picasso para poder mostrar la imagen */
    }

    override fun getItemCount(): Int {
        return listaAmiibos.size
    }

    inner class AmiiboViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nombreCuadroTexto: TextView
        var fotoAmiibo: ImageView

        init {
            nombreCuadroTexto = itemView.findViewById(R.id.nombre)
            fotoAmiibo = itemView.findViewById(R.id.fotoAmiibo)
        }
    }
}