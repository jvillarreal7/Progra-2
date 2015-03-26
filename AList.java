/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcial;

import java.util.*;
public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add((int)(Math.random()*100));
        a.add((int)(Math.random()*100));
        a.add((int)(Math.random()*100));
        a.add((int)(Math.random()*100));
        
        System.out.println("Antes:");
        for(int i : a)
        {
            System.out.println(i);
        }
        Collections.sort(a);
        System.out.println("Después:");
        for(int i : a)
        {
            System.out.println(i);
        }
        
    }
        
}
