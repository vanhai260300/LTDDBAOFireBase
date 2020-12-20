package com.example.foody.PageHomeDetailFood;


import android.graphics.Bitmap;

import java.util.List;

public class GirdViewBean {
    String masp;
    Bitmap image;
    String tensp;
    String mota;
    List<Bitmap> danhSachHinhAnh;


    public GirdViewBean() {
    }

    public GirdViewBean(Bitmap image, String tensp, String mota) {
        this.image = image;
        this.tensp = tensp;
        this.mota = mota;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }


    public List<Bitmap> getDanhSachHinhAnh() {
        return danhSachHinhAnh;
    }

    public void setDanhSachHinhAnh(List<Bitmap> danhSachHinhAnh) {
        this.danhSachHinhAnh = danhSachHinhAnh;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }
}