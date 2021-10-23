/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.action;

import java.util.ArrayList;
import java.util.List;
import library.book.book;

/**
 *
 * @author Admin
 */
public interface Actions {
    public void searchBook(String book_ID, List<book> bookList);
    public void viewBook(List<book> bookList);
}
