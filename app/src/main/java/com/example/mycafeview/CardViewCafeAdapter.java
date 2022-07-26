package com.example.mycafeview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewCafeAdapter extends RecyclerView.Adapter<CardViewCafeAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Cafe> listCafe;

    public ArrayList<Cafe> getListCafe(){

        return listCafe;
    }

    public void setListCafe(ArrayList<Cafe> listCafe){

        this.listCafe = listCafe;
    }

    public CardViewCafeAdapter(Context context){

        this.context = context;
    }
    @NonNull
    @Override
    public CardViewCafeAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_cafe, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        Cafe cafe = getListCafe().get(position);
        Glide.with(context)
                .load(cafe.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvtitle.setText(cafe.getTitle());
    }

    @Override
    public int getItemCount() {

        return getListCafe().size();
    }

    void setFilter(ArrayList<Cafe> filterCafe){
        listCafe = new ArrayList<>();
        listCafe.addAll(filterCafe);
        notifyDataSetChanged();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvtitle;

        CardViewViewHolder(@NonNull final View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.imagecover);
            tvtitle = itemView.findViewById(R.id.texttittle);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Cafe cafe = getListCafe().get(position);
            Intent intent = new Intent(context, DetailCafeActivity.class);
            intent.putExtra(DetailCafeActivity.ITEM_EXTRA, cafe);
            context.startActivity(intent);
        }
    }
 }
