package com.example.mycafeview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailCoffeeActivity extends AppCompatActivity implements OnMapReadyCallback {
    private Coffee coffee;
    public  static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_coffee);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvAlamat = findViewById(R.id.tv_item_address);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map_detail);
        if(mapFragment !=  null){
            mapFragment.getMapAsync(this);
        }

        coffee = getIntent().getParcelableExtra(ITEM_EXTRA);


        if(coffee != null){
            Glide.with(this)
                    .load(coffee.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(coffee.getNama());
            Log.e("LAT", String.valueOf(coffee.getLatitude()));
            Log.e("LNG", String.valueOf(coffee.getLongitude()));
            tvAlamat.setText(coffee.getAlamat());
        }

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Coffee");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        LatLng latLng;
        if(coffee != null){
            latLng = new LatLng(coffee.getLatitude(), coffee.getLongitude());
        } else {
            latLng = new LatLng(0.5001589, 101.3772014);
        }

        MarkerOptions options = new MarkerOptions();
        options.position(latLng).title(coffee.getAlamat());
        googleMap.addMarker(options);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}