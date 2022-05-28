package com.example.androidminiappcontact;

public class Contact {
    private int id;
    private String Nom;
    private String Num;

    public Contact() {
    }

    public Contact(String nom, String num) {
        Nom = nom;
        Num = num;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getNum() {
        return Num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setNum(String num) {
        Num = num;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", Num='" + Num + '\'' +
                '}';
    }
}
