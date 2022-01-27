package sabloane.lab1;


import java.util.*;

public class Book {
    public String name;
    public List<String> paragrafe;
    public List<String> imagini;
    public List<String> tabel;

    public Book(String name) {
        this.name=name;
        paragrafe = new ArrayList<>();
        imagini = new ArrayList<>();
        tabel = new ArrayList<>();
    }

    public void createNewParagraph(String paragraf) {
        paragrafe.add(paragraf);


    }
    public void createNewImage(String imagine) {
        imagini.add(imagine);


    }
    public void createNewTable(String tabele) {
        tabel.add(tabele);
    }
    public void print(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabel);

    }
}

