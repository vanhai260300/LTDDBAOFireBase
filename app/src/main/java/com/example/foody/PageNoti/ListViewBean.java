package com.example.foody.PageNoti;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class ListViewBean implements Parcelable {
    String masp;
    Bitmap image;
    String tensp;
    String mota;
    List<Bitmap> danhSachHinhAnh;


    public ListViewBean() {
    }

    public ListViewBean(Bitmap image, String tensp, String mota) {
        this.image = image;
        this.tensp = tensp;
        this.mota = mota;
    }

    protected ListViewBean(Parcel in) {
        masp = in.readString();
        image = in.readParcelable(Bitmap.class.getClassLoader());
        tensp = in.readString();
        mota = in.readString();
        danhSachHinhAnh = in.createTypedArrayList(Bitmap.CREATOR);
    }

    public static final Creator<ListViewBean> CREATOR = new Creator<ListViewBean>() {
        @Override
        public ListViewBean createFromParcel(Parcel in) {
            return new ListViewBean(in);
        }

        @Override
        public ListViewBean[] newArray(int size) {
            return new ListViewBean[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(masp);
        dest.writeParcelable(image, flags);
        dest.writeString(tensp);
        dest.writeString(mota);
        dest.writeTypedList(danhSachHinhAnh);
    }
}