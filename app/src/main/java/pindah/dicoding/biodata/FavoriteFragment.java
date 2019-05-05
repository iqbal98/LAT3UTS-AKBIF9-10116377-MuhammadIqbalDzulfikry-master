package pindah.dicoding.biodata;

/*29-April-2019
    10116377
        Muhammad Iqbal Dzulfikry
            AKB-9*/

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class FavoriteFragment extends Fragment {

    RecyclerView recyclerView;
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();
    private ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this.getContext()));

        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VNdHd1asf9s\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YaGeNVWNrHs\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FflfOb4BWCU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kX1O93X77d4\" frameborder=\"0\" allowfullscreen></iframe>") );


        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

        return view;
    }
}