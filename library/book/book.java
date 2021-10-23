/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author infor
 */
public class book {
    private String Book_id;
    private String Book_name;
    private String Author;
    private String Publish;
    private String Type;

    public book(){
        
    }
    public book(String Book_id, String Book_name, String Author,String Publish,String Type ){
        this.Book_id= Book_id;
        this.Book_name= Book_name;
        this.Author=Author;
        this.Publish=Publish;
        this.Type=Type;
    }
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Id: ");
        this.Book_id =sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        this.Book_name= sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("enter Book Author: ");
        this.Author = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter Book Publish:");
        this.Publish = sc.nextLine();
    }

    public void infor() {
        System.out.println("Book_id=" + Book_id + ", Book_name=" + this.Book_name + ", Author=" + this.Author + ", Publish=" + this.Publish + ", Type=" + this.Type);
    }

    public String getBook_id() {
        return Book_id;
    }

    public void setBook_id(String Book_id) {
        this.Book_id = Book_id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String Book_name) {
        this.Book_name = Book_name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublish() {
        return Publish;
    }

    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
}
