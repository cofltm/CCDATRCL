/* Cherish Sarmiento
   INF227
   
   Edit the program; add statement to find numbers divisible by 4 & 6 as well

 */

public class Act1_2 { //Divisible
    public static void main (String [] args){

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by 3 & 5 ");
            }
            else if (i % 4 == 0 && i % 6 == 0){
                System.out.println(i + " is divisible by 4 & 6");
            }
        }

    }
}

/*

Output:

12 is divisible by 4 & 6
15 is divisible by 3 & 5 
24 is divisible by 4 & 6 
30 is divisible by 3 & 5 
36 is divisible by 4 & 6 
45 is divisible by 3 & 5 
48 is divisible by 4 & 6
60 is divisible by 3 & 5
72 is divisible by 4 & 6
75 is divisible by 3 & 5
84 is divisible by 4 & 6
90 is divisible by 3 & 5
96 is divisible by 4 & 6

*/ 
