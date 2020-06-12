/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortproduct_observer;

import java.util.List;

/**
 *
 * @author DELL
 */
public class SortProductByPrice extends SortCollection<Product>{

    @Override
    public int compare(Product t1, Product t2) {
        if (t1.getPrice() > t2.getPrice())
            return 1;
        else if (t1.getPrice()< t2.getPrice())
            return -1;
        else return 0;
    }

    
}
