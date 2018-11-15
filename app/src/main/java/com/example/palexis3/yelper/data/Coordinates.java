package com.example.palexis3.yelper.data;

import com.google.gson.annotations.SerializedName;

public class Coordinates {

    @SerializedName("latitude")
    Double latitude;

    @SerializedName("longitude")
    Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
