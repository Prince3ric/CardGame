/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author mogielne 991672549, 2022
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card tenClubs = new Card("Clbs", 10);
        tenClubs.setSuit("diamonds");
        Card aceHearts = new Card("Hrts", 1);

        System.out.println(tenClubs);
    }
}
