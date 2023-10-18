/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Kin PC
 */
public class BinarySearch {
    public static int Search(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
    
    static int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1 ]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12,22,53,44,75,66,18,97};
        int[] arrS = bubbleSort(arr);
        for (int i = 0; i <= arrS.length; i++) {
            if (i < arrS.length) {
                System.err.print(arr[i] + ", ");
            } else {
                System.err.println("");
            }
        }
        int index = Search(arrS, 44  );
        System.err.println(index);
    }
    
}
