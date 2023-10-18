/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sort;

/**
 *
 * @author Kien Luu
 */
public class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j ++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.err.println("Interation "+ i );
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,9,8,7,10,22,48,65,32,87,34,3,2,5,4,6};
        arr = bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.err.print(arr[i] + "\n");
            } else {
                System.err.print(arr[i]+", ");
            }
        }
    }
    
}
