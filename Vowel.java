// Online Java Compiler
// Write a program to read a string from user and count How many vowels are there in that String ?
import java.util.*;
class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check how many vowels in that word : ");
        String str= sc.nextLine();
        int count=0;
        int i;
        for(i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                count++;
            }
        }
        System.out.println("there are "+count+" vowels present in this word");
    }
}
