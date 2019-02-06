/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.addressbook.util;

import java.util.List;

/**
 *
 * @author raiden
 */
public class SortUtil {

    public <T extends Comparable> List<T> sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {

                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    swap(list, j - 1, j);
                }
            }
        }
        return list;

    }

    private void swap(List list, int leftIndex, int rightIndex) {
        Object oldLeft = list.get(leftIndex);
        list.set(leftIndex, list.get(rightIndex));
        list.set(rightIndex, oldLeft);
    }
}
