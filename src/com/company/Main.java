package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int total=0;
	int[] array = new int[10];
    for(int i=0;i<5;i++){
        System.out.println("Insert your number");
        array[i]= input.nextInt();
        array[i+5]=random.nextInt(54)+1;
        total= total+array[i]+array[i+5];

    }
    Arrays.sort(array);
    System.out.println("The lowest number is "+ array[0]);
    System.out.println("The iggest number is "+ array[array.length-1]);
    System.out.println("The average is "+(float)total/10);
    System.out.println("here is the list of all numbers: ");
    for(int i=0;i<10;i++){
        System.out.print(array[i]+" ");
    }

    }
}
