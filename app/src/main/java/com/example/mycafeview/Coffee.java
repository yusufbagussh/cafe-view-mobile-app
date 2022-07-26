package com.example.mycafeview;

import android.os.Parcel;
import android.os.Parcelable;

public class Coffee implements Parcelable
{
    private String nama;
    private String alamat;
    private int photo;
    private double latitude;
    private double longitude;

    protected Coffee(Parcel in) {
        nama = in.readString();
        alamat = in.readString();
        photo = in.readInt();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Coffee> CREATOR = new Creator<Coffee>() {
        @Override
        public Coffee createFromParcel(Parcel in) {
            return new Coffee(in);
        }

        @Override
        public Coffee[] newArray(int size) {
            return new Coffee[size];
        }
    };

    public Coffee(int icon, String nama, double lat, double lng, String alamat) {
        this.photo = icon;
        this.nama = nama;
        this.latitude = lat;
        this.longitude = lng;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPhoto() {

        return photo;
    }

    public void setPhoto(int photo) {

        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(alamat);
        dest.writeInt(photo);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }

    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
}
