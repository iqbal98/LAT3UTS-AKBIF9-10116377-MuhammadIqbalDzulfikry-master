package pindah.dicoding.biodata;

/*29-April-2019
    10116377
        Muhammad Iqbal Dzulfikry
            AKB-9*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DailyFragment extends Fragment  {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle, container, false);

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


        recyclerView = view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(getActivity().getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
