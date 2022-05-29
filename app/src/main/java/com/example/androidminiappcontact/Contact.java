package com.example.androidminiappcontact;

public class Contact {

    private int id;
    private String nom;
    private String number;


    public Contact(int id, String nom, String number) {
        this.id = id;
        this.nom = nom;
        this.number = number;
    }
    public Contact(String nom, String number) {
        this.nom = nom;
        this.number = number;
    }


    public Contact() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}