/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import library.book.book;
import library.book.english;
import library.book.journal;
import library.book.magzine;
import library.librarian.librarian;
import library.reader.reader;
import library.transaction.transaction;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        List<librarian> arrL = new ArrayList<>();
        List<book> arrB = new ArrayList<>();
        List<reader> arrR = new ArrayList<>();
        List<transaction> arrT = new ArrayList<>();
        int choices = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: Librarian Management");
            System.out.println("2: Reader");
            reader r = new reader();
            System.out.println("3: Exit");
            System.out.println("Choose:");
            sc = new Scanner(System.in);
            choices = sc.nextInt();
            switch (choices) {
                case 1: {
                    int b = 0;
                    librarian l = new librarian();
                    if(l.login(arrL))
                    {
                        while(b == 0)
                        {
                            english eng = new english();
                            journal jou = new journal();
                            magzine mag = new magzine();
                            transaction tr = new transaction();
                            System.out.println("1: Add Book");
                            System.out.println("2: Show Book");
                            System.out.println("3: Add reader");
                            System.out.println("4: Update reader");
                            System.out.println("5: Show reader");
                            System.out.println("6: Delete reader");
                            System.out.println("7: Add transacsion");
                            System.out.println("8: Update transacion");
                            System.out.println("9: Back");
                            sc = new Scanner(System.in);
                            choices = sc.nextInt();
                            switch (choices)
                            {
                                case 1:{
                                    int c = 0;
                                    while(c == 0)
                                    {
                                        System.out.println("1: English");
                                        System.out.println("2: Journal");
                                        System.out.println("3: Magazine");
                                        System.out.println("4: Back");
                                        sc = new Scanner(System.in);
                                        choices = sc.nextInt();
                                        switch(choices)
                                        {
                                            case 1:{
                                                eng.arr(arrB);
                                                break;
                                            }
                                            case 2:{
                                                
                                                jou.arr(arrB);
                                                break;
                                            }
                                            case 3:{
                                                
                                                mag.arr(arrB);
                                                break;
                                            }
                                            case 4:{
                                                c = 1;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 2:{
                                    for (book object : arrB) {
                                        object.infor();
                                    }
                                    break;
                                }
                                case 3:{
                                    r.arr(arrR);
                                    break;
                                }
                                case 4:{
                                    r.updateReader(arrR);
                                    break;
                                }
                                case 5:{
                                    for (reader object : arrR) {
                                        object.show();
                                    }
                                    break;
                                }
                                case 6:{
                                    r.deleteReader(arrR);
                                    break;
                                }
                                case 7:{
                                    tr.add(arrB, arrR, arrT);
                                    break;
                                }
                                case 8:{
                                    tr.update(arrT);
                                    break;
                                }
                                case 9:{
                                    b = 1;
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("\nWrong!!!\n");
                    }
                    break;
                }
                case 2: {
                    int b = 0;
                    while (b == 0) {
                        System.out.println("1: Sreach Book");
                        System.out.println("2: View Book");
                        System.out.println("3: Back");
                        sc = new Scanner(System.in);
                        choices = sc.nextInt();
                        switch (choices) {
                            case 1: {
                                System.out.println("Enter Book ID");
                                sc = new Scanner(System.in);
                                String id = sc.nextLine();
                                r.searchBook(id, arrB);
                                break;
                            }
                            case 2: {
                                r.viewBook(arrB);
                                break;
                            }
                            case 3: {
                                b = 1;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3:
                {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
