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
public abstract class SortCollection<T> {
    
    public abstract int compare(T t1, T t2);
    
    public void sort(List<T> list){
        Product t;
        for (int i=0;i<list.size();i++)
            for (int j=i+1;j<list.size();j++)
                if (compare(list.get(i), list.get(j))==1)
                {
                    t=(Product) list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, (T) t);
                }
    }
}
