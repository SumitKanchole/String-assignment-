// WAP to read String from user ,  and count how many consonent are there in String ?
import java.util.*;
class Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check how many consonants in that word : ");
        String str= sc.nextLine();
        int count=0;
        int i;
        for(i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
            str.charAt(i)==' ') {
              continue;
                
            }
            else {
                count++;
            }
        }
        System.out.println("there are "+count+" consonants present in this word");
    }
}
