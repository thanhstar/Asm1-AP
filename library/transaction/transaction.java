/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import library.book.book;
import library.reader.reader;

/**
 *
 * @author Admin
 */
public class transaction {
    private String readerID = null;
    private String bookID = null;
    Scanner sc = new Scanner(System.in);
    int a = 1;
    List<transaction> arr = new ArrayList<>();  
    
    public void check(List<book> bookList, List<reader> readerList){
        boolean f = false;
        boolean keep = false;
        while (f == false) {
            System.out.println("Enter Book ID:");
            sc = new Scanner(System.in);
            String temp = sc.nextLine();
            for (book object : bookList) {
                if (object.getBook_id().equals(temp)) {
                    this.bookID = temp;
                    f = true;
                    System.out.println("Success");
                    break;
                }
            }
            if (f == false) {
                System.out.println("Wrong ID");
                System.out.println("Back? Yes/No");
                sc = new Scanner(System.in);

                String yesno = sc.nextLine();
                if (yesno.equals("yes") || yesno.equals("Yes") || yesno.equals("y")) {
                    f = true;
                    keep = true;
                    a = 0;
                }
            }
        }
        while (keep == false) {
            System.out.println("Enter Reader ID");
            sc = new Scanner(System.in);
            String temp2 = sc.nextLine();
            for (reader object : readerList) {
                if (object.getReaderID().equals(temp2)) {
                    this.readerID = temp2;
                    keep = true;
                    System.out.println("Success");
                    break;
                }
            }
            if (keep == false) {
                System.out.println("Wrong ID");
                System.out.println("Back? Yes/No");
                sc = new Scanner(System.in);

                String yesno = sc.nextLine();
                if (yesno.equals("yes") || yesno.equals("Yes") || yesno.equals("y")) {
                    keep = true;
                    a = 0;
                }
            }
        }
    }
    
    public void add(List<book> bookList, List<reader> readerList, List<transaction> tranList) {
        System.out.println("How many book ?");
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            transaction tran = new transaction();
            tran.check(bookList, readerList);
            if(broken())
            {
                for (transaction object : tranList) {
                    tranList.remove(object);
                    break;
                }
                break;
            }
            else
            {
                tranList.add(tran);
            }
        }
    }
    
    public boolean broken()
    {
        return a == 0;
    }
    
    public void update(List<transaction> tranList) {
        boolean f = false;
        while(f == false)
        {
            System.out.println("Enter Reader ID");
            sc = new Scanner(System.in);
            String temp = sc.nextLine();
            System.out.println("Enter Book ID");
            sc = new Scanner(System.in);
            String temp2 = sc.nextLine();
            if (tranList != null) {
                for (transaction object : tranList) {
                    if (object.readerID.equals(temp) && object.bookID.equals(temp2)) {
                        System.out.println("Old Book ID: " + object.bookID);
                        System.out.println("Enter new ID:");
                        sc = new Scanner(System.in);
                        object.bookID = sc.nextLine();
                        System.out.println("Success");
                        f = true;
                        break;
                    }
                }
                if (f == false) {
                    System.out.println("Wrong ID");
                }
            }
            else
            {
                System.out.println("Empty");
            }
        }
    }
}
