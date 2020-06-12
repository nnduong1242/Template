/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortproduct_observer;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SortProduct_Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> listProduct = new ArrayList<>();
        Product p1 = new Product("Táo", 50000, 50);
        Product p2 = new Product("Ổi", 80000, 40);
        Product p3 = new Product("Nho", 70000, 100);
        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);
        
        
        System.out.println("Sắp xếp theo Tên:");
        SortCollection sx = new SortProductByName();
        sx.sort(listProduct);
        for (int i=0;i<listProduct.size();i++)
            System.out.println(listProduct.get(i).inThongTin());
        
        
        System.out.println("Sắp xếp theo Giá");
        sx = new SortProductByPrice();
        sx.sort(listProduct);
        for (int i=0;i<listProduct.size();i++)
            System.out.println(listProduct.get(i).inThongTin());
    }
}
    
