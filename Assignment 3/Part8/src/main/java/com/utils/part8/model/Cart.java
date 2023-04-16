/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.part8.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hazel
 */
public class Cart {
     private List<Product> cart;
        public Cart() {
        this.cart = new ArrayList<>();
    }

    public Cart(List<Product> cart) {
        this.cart = cart;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public Product getProduct(String name){
        for(Product p: cart){
            if(name.equalsIgnoreCase(p.getName())){
                return p;
            }
        }
        return null;
    }
    public void addProduct(Product p){
        cart.add(p);
    }
    public void deleteProduct(Product p){
        cart.remove(p);
    }

    public void deleteProductByName(String name){
        Product p = getProduct(name);
        if(p!=null) deleteProduct(p);
    }

    public void updateProduct(String name, int quantity){
        for(Product p:cart){
            if(p.getName().equalsIgnoreCase(name)){
                p.setQuantity(quantity);
            }
        }
    }
}