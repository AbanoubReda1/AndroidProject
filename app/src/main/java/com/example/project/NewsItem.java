package com.example.project;

public class NewsItem {

String Title,Content,Date;
int Userpoto;



    public NewsItem(String title, String content, String date, int userpoto) {
        Title = title;
        Content = content;
        Date = date;
        Userpoto = userpoto;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setUserpoto(int userpoto) {
        Userpoto = userpoto;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {
        return Date;
    }

    public int getUserpoto() {
        return Userpoto;
    }
}
