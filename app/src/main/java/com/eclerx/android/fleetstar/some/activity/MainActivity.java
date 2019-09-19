package com.eclerx.android.fleetstar.some.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.eclerx.android.fleetstar.some.R;
import com.eclerx.android.fleetstar.some.adapter.MovieListAdapter;
import com.eclerx.android.fleetstar.some.model.MovieData;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.eclerx.android.fleetstar.some.model.Results;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private static final String TAG = "MainActivity";

    private RecyclerView mMovieListView;
    private MovieData movieData;
    private ArrayList<Results> searchResults = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setIdsToViews();

        movieData = new Gson().fromJson(loadDataFromJsonFile(), MovieData.class);
        mMovieListView.setAdapter(new MovieListAdapter(this, movieData.getResults()));
        Log.d(TAG, "onCreate: data size :" + movieData.getResults().size());
    }

    private void setIdsToViews() {
        mMovieListView = findViewById(R.id.movie_list_id);
        mMovieListView.setLayoutManager(new LinearLayoutManager(this));
    }

    public String loadDataFromJsonFile() {
        String json = null;
        try {
            InputStream is = getAssets().open("movie_data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            Log.e(TAG, "loadDataFromJsonFile: IOException : " + ex.getMessage());
            return null;
        }
        return json;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem search_item = menu.findItem(R.id.mi_search);

        SearchView searchView = (SearchView) search_item.getActionView();
        searchView.setFocusable(false);
        searchView.setQueryHint("Search");
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        Log.d(TAG, "onQueryTextChange() called with: s = [" + s + "]");

        if (s.isEmpty()) {
            mMovieListView.setAdapter(new MovieListAdapter(this, movieData.getResults()));
            return true;
        }
        searchResults.clear();

        for (Results item : movieData.getResults()) {
            if (item.getOriginal_title().contains(s)) {
                searchResults.add(item);
            }

            mMovieListView.setAdapter(new MovieListAdapter(this, searchResults));
        }

        return true;
    }
}
