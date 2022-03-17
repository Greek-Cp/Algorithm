/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package sortingAlgorithm;

import java.awt.*;

public class bubblesort {
/*
*
Before Bubble Sort
1 3 2 4 5
loop 1 i = 0
 loop 2 x{( 5 - 0 )- 1 = 4)}
if(arr[0] > arr[0 + 1]) - 1
if(arr[1] > arr[1 + 1]) - 2
if(arr[2] > arr[2 + 1]) - 3
if(arr[3] > arr[3 + 1]) - 4
loop 1 i = 1
 loop 2 x{( 5 - 1 )- 1 = 3)}
if(arr[0] > arr[0 + 1]) - 1
if(arr[1] > arr[1 + 1]) - 2
if(arr[2] > arr[2 + 1]) - 3
loop 1 i = 2
 loop 2 x{( 5 - 2 )- 1 = 2)}
if(arr[0] > arr[0 + 1]) - 1
if(arr[1] > arr[1 + 1]) - 2
loop 1 i = 3
 loop 2 x{( 5 - 3 )- 1 = 1)}
if(arr[0] > arr[0 + 1]) - 1
loop 1 i = 4
1 2 3 4 5
*
* */
    static int[] sortingElement(int arr[]) {
        int n = arr.length;
        boolean isSwapped;
        for(int v= 0 ;v< arr.length; v++){
            if(v == 0){
                System.out.printf("%s%n%d ","Before Bubble Sort",arr[v]);

            } else{
                System.out.printf("%d ",arr[v]);
            }
            if(v == arr.length - 1){
                System.out.printf("%n");
            }

        }
        for (int i = 0; i < n; i++) { // 5
            isSwapped = false;
            System.out.printf("loop 1 i = %d%n", i);
            int c = 1;
            for (int x = 0; x < (n - i) - 1; x++) {
                if (x == 0) {
                    System.out.printf(" loop 2 x{( %d - %d )- %d = %d)} %n", n, i, 1, ((n - i) - 1));
                }
                System.out.printf("if(arr[%d] > arr[%d + 1]) - %d%n", x, x ,c++);
                if (arr[x] > arr[x + 1]) {
                    int tmp = arr[x + 1];
                    arr[x + 1] = arr[x];
                    arr[x] = tmp;
                    isSwapped = true;
                }
            }
        }
        return arr;
    }

   static int[] sortingElement(int arr[] , int n, int search){
        int tmp;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 2){
                for(int t = 0; t< n; t++){
                    System.out.printf("%d",arr[t]);
                    if(arr[t] == search){
                        System.out.printf("%d found",t);
                    }
                }
            }
            for(int k = 1; k < n; k++){
                if(arr[k - 1] > arr[k]){
                    tmp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = tmp;
                    count++;
                }
            }
        }
        return arr;
   }

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s ",arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] n = sortingElement(new int[]{
                1,3,2,4,5
        });
        printArray(n);
    }
}
