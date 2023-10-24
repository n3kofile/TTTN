package com.example.tttn.Fragment.Home_Fragment;

public class manager {
    private String name;
    private int image;

    public manager() {
    }

    public manager(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
