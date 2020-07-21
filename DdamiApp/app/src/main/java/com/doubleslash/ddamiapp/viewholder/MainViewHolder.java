package com.doubleslash.ddamiapp.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleslash.ddamiapp.R;
import com.doubleslash.ddamiapp.model.MainItem;
import com.squareup.picasso.Picasso;

public class MainViewHolder extends RecyclerView.ViewHolder {

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    private ImageView imageView = itemView.findViewById(R.id.main_image);
    private TextView title = itemView.findViewById(R.id.main_title);
    private TextView nickname = itemView.findViewById(R.id.main_nickname);

    public void adapt(MainItem mainItem){
        Picasso.get().load(mainItem.getImage()).fit().into(imageView);
        title.setText(mainItem.getTitle());
        nickname.setText(mainItem.getNickname());
    }
}
