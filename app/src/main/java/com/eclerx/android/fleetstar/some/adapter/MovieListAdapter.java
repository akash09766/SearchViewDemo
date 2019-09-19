package com.eclerx.android.fleetstar.some.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.eclerx.android.fleetstar.some.R;
import com.eclerx.android.fleetstar.some.model.Results;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Results> listData;

    public MovieListAdapter(Context context, ArrayList<Results> listData) {
        this.context = context;
        this.listData = listData;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MovieListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieListViewHolder(inflater.inflate(R.layout.movie_list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListViewHolder holder, int position) {
        Results item = listData.get(position);
        holder.mMovieTitleTv.setText(item.getOriginal_title());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class MovieListViewHolder extends RecyclerView.ViewHolder {
        private TextView mMovieTitleTv;
        public MovieListViewHolder(@NonNull View itemView) {
            super(itemView);
            mMovieTitleTv = itemView.findViewById(R.id.movie_title_tv_id);
        }
    }
}
