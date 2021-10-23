/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import library.book.book;
import library.action.Actions;

/**
 *
 * @author Admin
 */
public class reader implements Actions{
    private String readerID;
    private String name;
    Scanner sc = new Scanner(System.in);
    
    public void show() {
        System.out.println("reader=" + readerID + ", name=" + name);
    }
    
    public void addReader()
    {
        System.out.println("ID:");
        sc = new Scanner(System.in);
        this.readerID = sc.nextLine();
        System.out.println("name:");
        sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
    public void arr(List<reader> list)
    {
        System.out.println("Number of student to add");
        sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            reader r = new reader();
            r.addReader();
            list.add(r);
        }
    }
    
    public void updateReader(List<reader> list)
    {
        boolean f = false;
        System.out.println("Enter ID:");
        sc = new Scanner(System.in);
        String temp = sc.nextLine();
        for (reader object : list) {
            if(object.readerID.equals(temp))
            {
                System.out.println("Old Student Name: "+object.name);
                System.out.println("New name:");
                sc = new Scanner(System.in);
                object.name = sc.nextLine();
                System.out.println("Success!");
                f = true;
            }
        }
        if(f == false)
        {
            System.out.println("Wrong ID");
        }
    }
    
    public void deleteReader(List<reader> list)
    {
        boolean f = false;
        System.out.println("Enter ID:");
        sc = new Scanner(System.in);
        String temp = sc.nextLine();
        for (reader object : list) {
            if(object.readerID.equals(temp))
            {
                list.remove(object);
                System.out.println("Success!");
                f = true;
                break;
            }
        }
        if(f == false)
        {
            System.out.println("Wrong ID");
        }
    }
    
    
    @Override
    public void viewBook(List<book> bookList) {
        for (book object : bookList) {
            object.infor();
        }
    }

    @Override
    public void searchBook(String book_ID, List<book> bookList) {
        boolean f = false;
        for (book object : bookList) {
            if(object.getBook_id().equals(book_ID))
            {
                f = true;
                object.infor();
            }
        }
        if(f == false)
        {
            System.out.println("Wrong ID");
        }
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    
}
