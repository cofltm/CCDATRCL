/* Cherish Sarmiento
   INF227
   
   Edit the program; add statement to count the numbers of characters in the entered string.

 */

import java.util.Scanner;

public class Act1_3 { //Palindrome
    public static void main (String [] args){
        System.out.println("Enter String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char [] ch = str.toCharArray();
        int chCount = str.length();
        int num = 0;

        for (int i = 0; i < ch.length/2; i++){
            if (ch[i] != ch[ch.length-1-i]){
                num = 1; break;
            }
        }

        if (num == 0){
            System.out.println("The number of characters in "+ str + " is " + chCount);
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println("The number of characters in "+ str + " is " + chCount);
            System.out.println(str + " is not Palindrome");
        }
    }
}

/*

output:

[1] 
Enter String: 
cherish
The number of characters in cherish is 7
cherish is not Palindrome

[2]
Enter String: 
level
The number of characters in level is 5
level is Palindrome

*/
