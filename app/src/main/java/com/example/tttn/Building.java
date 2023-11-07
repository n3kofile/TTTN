package com.example.tttn;

public class Building {
    String sotang;
    String sophong;

    public Building(String sotang, String sophong) {
        this.sotang = sotang;
        this.sophong = sophong;
    }

    public String getSotang() {
        return sotang;
    }

    public void setSotang(String sotang) {
        this.sotang = sotang;
    }

    public String getSophong() {
        return sophong;
    }

    public void setSophong(String sophong) {
        this.sophong = sophong;
    }
}
