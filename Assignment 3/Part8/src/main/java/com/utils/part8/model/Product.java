/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.part8.model;

/**
 *
 * @author hazel
 */
public class Product {
    private String name;
    private int quantity;

    public Product() {
        
    }
    
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
