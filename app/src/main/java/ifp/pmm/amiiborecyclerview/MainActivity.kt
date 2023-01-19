package ifp.pmm.amiiborecyclerview

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Retrofit
import ifp.pmm.adapter.AdaptadorAmiibo
import ifp.pmm.apiinterfaces.ApiAmiibo
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.widget.Toolbar
import ifp.pmm.amiiborecyclerview.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.DividerItemDecoration
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var rw: RecyclerView

    /* TODO: Crear nuestro modelo
    *   Usar un ejemplo de respuesta y la web https://www.jsonschema2pojo.org/ */
    var listaAmiibos: ArrayList<Amiibo> = ArrayList<Amiibo>()
    lateinit var retrofit: Retrofit
    lateinit var adaptadorAmiibo: AdaptadorAmiibo
    lateinit var apiAmiibo: ApiAmiibo
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        rw = findViewById(R.id.rw)
        adaptadorAmiibo = AdaptadorAmiibo(listaAmiibos)
        rw.setLayoutManager(LinearLayoutManager(this))
        rw.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
        rw.setAdapter(adaptadorAmiibo)

        /*TODO : Crear la clase de RetroFit, instanciar nuestra API y realizar la llamada asíncrona */
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        val searchItem = menu.findItem(R.id.app_bar_search)
        val searchView = searchItem.actionView as SearchView?
        searchView!!.maxWidth = Int.MAX_VALUE
        searchView.setOnCloseListener { /* ¿Crees que tenemos que hacer algo cuendo el user cierre la barra de búsqueda? ¿TODO? */
            false
        }

        // Este método se llama cuando se pulsa el botón de buscar.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                /*TODO: Programar este metodo para que cuando se pulse el botón de buscar,
                se haga una llamada a la API pasando como parámetro de series la variable query,
                que representa lo que el usuario ha escrito en la barra de búsqueda
                 */
                return false
            }

            // Este método se llama cada vez que el texto de la barra de búsqueda cambia
            override fun onQueryTextChange(newText: String): Boolean {

                /*TODO: Programar este metodo para que cuando el user escriba,
               se filtre la lista mostrando sólo aquellos cuyo nombre contenga el string incluido
               como parámetro de entrada (newText). No hacer una nueva petición, no es necesario.
                 */
                return false
            }
        })
        return true
        /** true -> el menú ya está visible  */
    }
}