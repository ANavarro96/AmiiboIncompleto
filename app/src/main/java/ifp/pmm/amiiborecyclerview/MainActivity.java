package ifp.pmm.amiiborecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Locale;

import ifp.pmm.adapter.AdaptadorAmiibo;
import ifp.pmm.apiinterfaces.ApiAmiibo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView rw;
    /* TODO: Crear nuestro modelo
    *   Usar un ejemplo de respuesta y la web https://www.jsonschema2pojo.org/ */
    ArrayList<Amiibo> listaAmiibos = new ArrayList<>();
    Retrofit retrofit;
    AdaptadorAmiibo adaptadorAmiibo;
    ApiAmiibo apiAmiibo;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rw = findViewById(R.id.rw);
        adaptadorAmiibo = new AdaptadorAmiibo(listaAmiibos);

        rw.setLayoutManager(new LinearLayoutManager(this));

        rw.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        rw.setAdapter(adaptadorAmiibo);

      /*TODO : Crear la clase de RetroFit, instanciar nuestra API y realizar la llamada asíncrona */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        final MenuItem searchItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                /* ¿Crees que tenemos que hacer algo cuendo el user cierre la barra de búsqueda? ¿TODO? */
             return false;
            }
        });

        // Este método se llama cuando se pulsa el botón de buscar.
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                /*TODO: Programar este metodo para que cuando se pulse el botón de buscar,
                se haga una llamada a la API pasando como parámetro de series la variable query,
                que representa lo que el usuario ha escrito en la barra de búsqueda
                 */

                return false;
            }

            // Este método se llama cada vez que el texto de la barra de búsqueda cambia
            @Override
            public boolean onQueryTextChange(String newText) {

               /*TODO: Programar este metodo para que cuando el user escriba,
               se filtre la lista mostrando sólo aquellos cuyo nombre contenga el string incluido
               como parámetro de entrada (newText). No hacer una nueva petición, no es necesario.
                 */
                return false;
            }
        });


        return true; /** true -> el menú ya está visible */
    }


}