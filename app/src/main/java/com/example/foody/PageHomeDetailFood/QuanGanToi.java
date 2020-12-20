package com.example.foody.PageHomeDetailFood;

public class QuanGanToi {
    int img;
    String tenQuan,diaChi,khoangCach,giaKhoang,thoiGianDi;

    public QuanGanToi(int img, String tenQuan, String diaChi, String khoangCach, String giaKhoang, String thoiGianDi) {
        this.img = img;
        this.tenQuan = tenQuan;
        this.diaChi = diaChi;
        this.khoangCach = khoangCach;
        this.giaKhoang = giaKhoang;
        this.thoiGianDi = thoiGianDi;
    }

    public QuanGanToi(int img, String tenQuan) {
        this.img = img;
        this.tenQuan = tenQuan;
    }

    public int getImg() {
        return img;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getKhoangCach() {
        return khoangCach;
    }

    public String getGiaKhoang() {
        return giaKhoang;
    }

    public String getThoiGianDi() {
        return thoiGianDi;
    }
}
