package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Theory;

import java.util.Scanner;

/*
Questions:
Given a character array s[N], we need to find the number of good pairs of indices (i, j) such that i < j and s[i] == 'a' and s[j] == 'g'.
All characters are lowercase English alphabets.
 */
public class CF_GoodPair {
//Approach 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();             //Allows users to input char arrays
        int a_count = 0;
        int g_count = 0;
        for(int i = s.length - 1; i>=0; i--){               //Start the loop from the end
            if(s[i]=='g'){                  //if and else if condition allows to ensure the loop is executing only when needed, saves time and space
                g_count++;                          //if the loop finds a 'g' at any index, increase the g_count
            }
            else if(s[i]=='a'){
                a_count = a_count + g_count;        //if 'a' is found at any index, calculate how many pair can be made with the already stored 'g's
            }
        }
        if(a_count!=0) System.out.println(a_count);            //print the total no. of good pairs
        else System.out.println("No good pairs found");
    }
}
