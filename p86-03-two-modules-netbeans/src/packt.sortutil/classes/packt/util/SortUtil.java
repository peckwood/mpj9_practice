/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.util;

import java.util.List;
import packt.util.impl.BubbleSortUtilImpl;

/**
 *
 * @author raiden
 */
public class SortUtil {
    private BubbleSortUtilImpl bubbleSortUtilImpl = new BubbleSortUtilImpl();
    public <T extends Comparable> List<T> sortList(List<T> list) {
       return bubbleSortUtilImpl.sortList(list);
    }


}
