package pindah.dicoding.biodata;

/*29-April-2019
    10116377
        Muhammad Iqbal Dzulfikry
            AKB-9*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RicycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricycle);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("EATING");
        description.add("spg chicken and omelette rice");

        id.add("2");
        title.add("DRINK");
        description.add("extrajoss susu with extra chocolate.");

        id.add("3");
        title.add("MOVIES");
        description.add("anime, game of thrones and marvel series  ");

        id.add("4");
        title.add("WORK");
        description.add("computer university students.");

        id.add("5");
        title.add("PLAY");
        description.add("Dota 2 and pro evolution soccer");

        id.add("6");
        title.add("TRAVEL");
        description.add("never know the road because every time I stay in boarding");

        recyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        mAdapter = new RecyclerAdapter(getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);
    }
}
