package com.example.foody.PageAccount;

public class ListAc {
    int image;
    String course;

    public ListAc(){

    }
    public ListAc(int image, String course){
        super();
        this.image = image;
        this.course = course;
    }
    public int getImage(){
        return image;
    }
    public String getCourse(){
        return course;
    }
    public void setImage(int image){
        this.image = image;
    }
    public void setCourse(String course){
        this.course = course;
    }
}