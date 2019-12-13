package com.example.project;

public class NewsItem2 {

    String Title2,Content2,Date2;
    int Userpoto2;



    public NewsItem2(String title2, String content2, String date2, int userpoto2) {
        Title2 = title2;
        Content2 = content2;
        Date2 = date2;
        Userpoto2 = userpoto2;
    }

    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public void setContent2(String content2) {
        Content2 = content2;
    }

    public void setDate2(String date2) {
        Date2 = date2;
    }

    public void setUserpoto2(int userpoto2) {
        Userpoto2 = userpoto2;
    }

    public String getTitle2() {
        return Title2;
    }

    public String getContent2() {
        return Content2;
    }

    public String getDate2() {
        return Date2;
    }

    public int getUserpoto2() {
        return Userpoto2;
    }
}
