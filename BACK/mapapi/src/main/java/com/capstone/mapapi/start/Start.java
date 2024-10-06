package com.capstone.mapapi.start;

import jakarta.persistence.*;

@Entity
@Table(name = "start")
public class Start {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String startLat; // latitude
    private String startLon; // longitude

    // 기본 생성자
    public Start() {}

    // 생성자
    public Start(String startLat, String startLon) {
        this.startLat = startLat;
        this.startLon = startLon;
    }

    public String getStartLat() {
        return startLat;
    }

    public void setStartLat(String startLat) {
        this.startLat = startLat;
    }

    public String getStartLon() {
        return startLon;
    }

    public void setStartLon(String startLon) {
        this.startLon = startLon;
    }
}
