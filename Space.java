// Online Java Compiler
// WAP to read a String from user and count how many space are available in that String ?
import java.util.*;
class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check how many white Spaces in that word : ");
        String str= sc.nextLine();
        int count=0;
        int i;
        for(i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ') {
                count++;
            }
        }
        System.out.println("Here "+count+" white spaces are available!");
    }
}
