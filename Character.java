// WAP to read a string from user , Read a character from user and count how many times that character occurred in that string ?
import java.util.*;
class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check how many white Spaces in that word : ");
        String str= sc.nextLine();
        
        System.out.println("Enter the character to check how many times it occured : ");
        char c = sc.next().charAt(0);
        int count=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==c) {
                count++;
            }
        }
        System.out.println("Here "+count+" times this '"+c+"' character are repeated!");
    }
}
