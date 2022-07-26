package com.example.mycafeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

public class DetailCafeActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cafe);

        ImageView imgItemPhoto = findViewById(R.id.img_poster);
        TextView tvName = findViewById(R.id.tv_judul);
        TextView tvRating = findViewById(R.id.tv_rating);
        TextView tvLokasi = findViewById(R.id.tv_lokasi);
        TextView tvDetail = findViewById(R.id.tv_detail);

        Cafe cafe = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(cafe != null){
            Glide.with(this)
                    .load(cafe.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(cafe.getTitle());
            tvRating.setText(cafe.getRating());
            tvLokasi.setText(cafe.getAlamat());
            tvDetail.setText(cafe.getDeskripsi());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Cafe");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        int images[]={R.drawable.gade_1, R.drawable.gade_2, R.drawable.gade_3, R.drawable.gade_4, R.drawable.gade_5};
        v_flipper = findViewById(R.id.v_flipper);

        for(int image : images){
            flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this, android.R.anim.slide_out_right);
    }

    @Override
    public boolean onSupportNavigateUp(){
       finish();
       return true;
    }
}