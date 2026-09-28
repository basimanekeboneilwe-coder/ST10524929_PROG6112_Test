/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author Student
 */

// It implements the IConsoles interfacess
public abstract class Consoles implements IConsoles {
    // Variables
    private String consoleType;
    private String store;
    private int totalSales;

    //Sets UPthe values when an object is created
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    
    @Override
    public String getConsoleType() {
        return consoleType;
    }
    @Override
    public String getStore() {
        return store;
    }
    @Override
    public int getTotalSales() {
        return totalSales;
    }
    public abstract void printReport();
}
