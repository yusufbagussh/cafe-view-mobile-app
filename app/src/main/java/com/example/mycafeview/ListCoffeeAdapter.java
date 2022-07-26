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

public class ListCoffeeAdapter extends RecyclerView.Adapter<ListCoffeeAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Coffee> listCoffee;

    public  ArrayList<Coffee> getListCoffee(){
        return listCoffee;
    }

    public void setListCoffee(ArrayList<Coffee> listCoffee){
        this.listCoffee = listCoffee;
    }

    public ListCoffeeAdapter(ArrayList<Coffee> list, Context context){

        this.listCoffee = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListCoffeeAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_coffee, viewGroup, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Coffee coffee = listCoffee.get(position);
        Glide.with(holder.itemView.getContext())
                .load(coffee.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(coffee.getNama());

    }

    @Override
    public int getItemCount() {
        return listCoffee.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvReview;

        ListViewHolder(View view){
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_coffee);
            tvName = view.findViewById(R.id.tv_item_coffee_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Coffee coffee = getListCoffee().get(position);
            Intent intent =  new Intent(context, DetailCoffeeActivity.class);
            intent.putExtra(DetailCoffeeActivity.ITEM_EXTRA, coffee);
            context.startActivity(intent);
        }
    }
}
