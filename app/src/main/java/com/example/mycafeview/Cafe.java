package com.example.mycafeview;

import android.os.Parcel;
import android.os.Parcelable;

public class Cafe implements Parcelable{
    private String deskripsi;
    private String alamat;
    private String photo;
    private String title;

    protected Cafe(Parcel in) {
        deskripsi = in.readString();
        alamat = in.readString();
        photo = in.readString();
        title = in.readString();
        rating = in.readString();
    }

    public static final Creator<Cafe> CREATOR = new Creator<Cafe>() {
        @Override
        public Cafe createFromParcel(Parcel in) {
            return new Cafe(in);
        }

        @Override
        public Cafe[] newArray(int size) {
            return new Cafe[size];
        }
    };

    public Cafe(String title, String deskripsi, String photo, String alamat, String rating){
        this.title = title;
        this.deskripsi = deskripsi;
        this.rating = rating;
        this.alamat = alamat;
        this.photo = photo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskripsi() {

        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {

        this.deskripsi = deskripsi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }

    public String getPhoto() {

        return photo;
    }

    public void setPhoto(String photo) {

        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(deskripsi);
        dest.writeString(alamat);
        dest.writeString(photo);
        dest.writeString(title);
        dest.writeString(rating);
    }
}
