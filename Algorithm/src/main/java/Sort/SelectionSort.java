/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sort;

/**
 *
 * @author Kien Luu
 */
public class SelectionSort {
    
    static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            
            System.err.println("Interation "+ i );
        } 
        return arr; 
    }
    
    public static void main(String[] args) {
        int[] arr = {1,9,8,7,10,22,48,65,32,87,34,3,2,5,4,6};
        arr = selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.err.print(arr[i] + "\n");
            } else {
                System.err.print(arr[i]+", ");
            }
        }
    }
    
}
