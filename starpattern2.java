package org.example;

import java.util.Scanner;

public class starpattern2 {
    public static void main(String[] args) {
       /* Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers of row :- ");
        int n=sc.nextInt();
      for (int i=0;i<n;i++){
          for (int j=0;j<n-i;j++){
              System.out.print("*");
          }
          System.out.println();
      }*/
    int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
