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
public class english extends book{
    private int Area;
    Scanner sc = new Scanner(System.in);
    public english(){
        
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    @Override
    public void infor() {
        super.infor();
        System.out.println("Area: "+this.Area);
    }

    

    @Override
    public void add() {
        System.out.println("Enter information Book English:");
        super.add(); //To change body of generated methods, choose Tools | Templates.
        this.Area = 1;
        setType("english");
    }
    
    public void arr(List<book> list)
    {
        System.out.println("How many book?");
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            english e = new english();
            e.add();
            list.add(e);
        }
    }
    
}
