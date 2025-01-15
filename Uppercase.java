//WAP to read a string from user and convert all the vowels of that string into upper case without predefined method , and display that characters ?
package com.String;
import java.util.*;
import Result.Vowel;
import Result.Consonant;
import Result.Space;
import Result.uppercase;

class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check how many consonants in that word : ");
        String str= sc.nextLine();
        
        Vowel vv= new Vowel();
        System.out.println("Vowel : "+vv.vc(str));
        Consonant cont= new Consonant();
        System.out.println("consonant : "+cont.con(str));
        Space sp= new Space();
        System.out.println("Space : "+sp.space_count(str));
        Uppercase us= new Uppercase();
        System.out.println("Vowel : "+us.toUpperCase());
    }
}
