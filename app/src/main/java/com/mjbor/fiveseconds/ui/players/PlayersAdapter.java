package com.mjbor.fiveseconds.ui.players;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mjbor.fiveseconds.R;
import com.mjbor.fiveseconds.models.Player;

import java.util.List;

/**
 * Created by mjbor on 1/21/2018.
 */

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.ViewHolder> {

    private List<Player> players;
    private Context context;


    public PlayersAdapter(List<Player> players, Context context) {
        this.players = players;
        this.context = context;
    }

    @Override
    public PlayersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.player_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlayersAdapter.ViewHolder holder, int position) {
        Player player = players.get(position);
        holder.playerName.setText(player.getName());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView playerName;

        public ViewHolder(View itemView) {
            super(itemView);
            playerName = (TextView) itemView.findViewById(R.id.playerNameTextView);
        }
    }
}
