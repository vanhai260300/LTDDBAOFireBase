package com.example.foody.PageHomeDetailFood;

public class Food {
    int image;
    String langName;
    String gia;

    public Food() {
    }

    public Food(int image, String langName, String gia) {
        this.image = image;
        this.langName = langName;
        this.gia = gia;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }


    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }


    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }
}