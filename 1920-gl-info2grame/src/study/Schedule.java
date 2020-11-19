package study;

import java.util.ArrayList;

public class Schedule{

    private String name;
    private int promotion;
    private String comments;
    private ArrayList<NbCredit> nbCredit;

    public Schedule(){}

    public Schedule(String name, String comments) {
        this.name = name;
        this.comments = comments;
    }

    public Schedule(String name, int promotion, String comments) {
        this.name = name;
        this.promotion = promotion;
        this.comments = comments;
    }

    public Schedule(String name, int promotion) {
        this.name = name;
        this.promotion = promotion;
    }

    public void create(){}

    public void duplicate(){}

    public void importCSV(){}

    public void edit(){}

    public void save(){}

    public void exportCSV(){}

    public void printPDF(){}

    public void delete(){}

    public void validate(){}

    public void submit(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public String getComments() {
        return comments;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
}