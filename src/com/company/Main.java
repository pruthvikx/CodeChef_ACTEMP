package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){

            int alice = scan.nextInt();
            int bob = scan.nextInt();
            int charlie = scan.nextInt();

            if (alice <= bob && charlie <= bob){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
