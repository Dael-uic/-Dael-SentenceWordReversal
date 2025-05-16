/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackssummerclass;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class StacksSummerclass {

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner scanlation = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        //reverse sentence
        for(int i = 0; i < 1; i++){
            String sentence = scanlation.nextLine();
            String[] words_array = sentence.split(" ");
            Stack<String> stacking = new Stack<String>();

            for (String word : words_array) {
                stacking.push(word);
            }

            while (!stacking.isEmpty()) {
                System.out.print(stacking.pop() + " ");
            }
        }
    }
}
