/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.librarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import library.action.Actions;
import library.book.book;

/**
 *
 * @author Admin
 */
public class librarian implements Actions{
    private String name;
    private String pass;
    Scanner sc = new Scanner(System.in);
    
    public void deleteBook(String book_ID, List<book> bookList)
    {
        boolean f = false;
        String temp = book_ID;
        for (book object : bookList) {
            if(object.getBook_id().equals(temp))
            {
                bookList.remove(object);
                System.out.println("Success!");
            }
        }
        if(f == false)
        {
            System.out.println("Wrong ID");
        }
    }
    public void addLibraran()
    {
        System.out.println("name:");
        sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("pass:");
        sc = new Scanner(System.in);
        this.pass = sc.nextLine();
    }
    public void arr(List<librarian> list)
    {
        librarian l = new librarian();
        l.addLibraran();
        list.add(l);
    }
    public void deleteLibrarian(List<librarian> list)
    {
        System.out.println("name:");
        sc = new Scanner(System.in);
        String temp = sc.nextLine();
        for (librarian object : list) {
            if(object.name.equals(temp))
            {
                list.remove(object);
            }
        }
    }
    public boolean login(List<librarian> list)
    {
        System.out.println("name:");
        String temp = sc.nextLine();
        System.out.println("pass");
        String temp2 = sc.nextLine();
        for (librarian object : list) {
            if((object.name.equals(temp) && object.pass.equals(temp2)))
            {
                return true;
            }
        }
        if(temp.equals("admin") && temp2.equals("admin"))
        {
            return true;
        }
        return false;
    }

    @Override
    public void searchBook(String book_ID, List<book> bookList) {
        boolean f = false;
        String temp = book_ID;
        for (book object : bookList) {
            if(object.getBook_id().equals(temp))
            {
                object.toString();
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
            object.toString();
        }
    }
}
