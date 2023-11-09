package com.example.tttn;

public class Taisan {
    private String dovat;
    private String soluong;
    private boolean check = false;
    private String mota;

    public Taisan(String dovat, String soluong, boolean check, String mota) {
        this.dovat = dovat;
        this.soluong = soluong;
        this.check = check;
        this.mota = mota;
    }



    public String getDovat() {
        return dovat;
    }

    public void setDovat(String dovat) {
        this.dovat = dovat;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public boolean getCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public boolean isCheck() {
        return check;
    }
}
