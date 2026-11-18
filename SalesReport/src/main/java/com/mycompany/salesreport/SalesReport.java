/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class SalesReport {

    public static void main(String[] args) {
     //1D Array
     String [] products = {
         "Cozy Nights Monarch mattress",
         "Restonic Barbados mattress",
         "Sealy Phuket mattres"
           
         
     };
     //2D array
     int [][] sales = {
         //Cozy Nigth Monarch mattress
         {25,18,20},
         //Restonic Barbados mattress   
         {15,10,12},
         //Sealy Phuket mattress
         {18,15,20}
     };
     Product product = new Product(products, sales);
          PrintProduct printer = new PrintProduct (product);
                 printer.printReport();
                
    }
}
