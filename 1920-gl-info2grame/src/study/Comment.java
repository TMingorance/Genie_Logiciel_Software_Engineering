package study;

import user.Person;

import java.util.Date;

public class Comment {

    // Attributes
    private Date date;
    private Person auteur;
    private String text;

    // Constructors
    public Comment() {
    }

    public Comment(Date date, Person auteur, String text) {
        this.date = date;
        this.auteur = auteur;
        this.text = text;
    }

    // Getters & Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getAuteur() {
        return auteur;
    }

    public void setAuteur(Person auteur) {
        this.auteur = auteur;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Methods
    public void create(){}
}