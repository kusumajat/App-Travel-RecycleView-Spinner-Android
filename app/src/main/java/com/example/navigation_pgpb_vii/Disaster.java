package com.example.navigation_pgpb_vii;

public class Disaster {
    //variabel
    private String disasterName;
    private String disasterType;

    //inisialisasi
    public String getDisasterName() {
        return disasterName;
    }

    public String getDisasterType() {
        return disasterType;
    }

    //mengembalikan nilai
    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    //mengatur ulang nilai
    public Disaster(String name,String type) {
        this.disasterName = name;
        this.disasterType = type;
    }
}
