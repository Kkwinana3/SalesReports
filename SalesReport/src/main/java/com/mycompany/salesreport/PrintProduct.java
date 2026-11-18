/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
class PrintProduct {
   
    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printTotal() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverage() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    public void printMostPopular() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("-----------------------");
        printTotal();
        printAverage();
        printMostPopular();
    }
}

