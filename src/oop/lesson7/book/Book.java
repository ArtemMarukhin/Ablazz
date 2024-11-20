package oop.lesson7.book;

public class Book {
    String name;
    String autor;
    int pages;
    boolean isNonfiction;

    public Book(String name, String autor, int pages, boolean isNonfiction) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.isNonfiction = isNonfiction;
    }

    public void printCountRose(){
        System.out.println("Уоличество строк в книге: " + this.pages * 40);
    }

    public void printCountRoseOnPage(int countRoseOnPage){
        System.out.println("Количество строк в книге: " + this.pages * countRoseOnPage);
    }

    public void printInto(){
        System.out.printf("%s от %s -%s", this.name, this.autor,
                this.isNonfiction ? "Документальная" : "Не документальная");
        System.out.println();
        printCountRose();
    }

}
