package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Theory;

/*
Questions:
Given a character array s[N], we need to find the number of good pairs of indices (i, j) such that i < j and s[i] == 'a' and s[j] == 'g'.
All characters are lowercase English alphabets.
 */
public class CF_GoodPair {
//Approach 1
    public static void main(String[] args) {
        char[] s = {'a', 'g', 'a', 'g', 'a', 'g', 'a', 'g', 'a', 'g'};
        int a_count = 0;
        int g_count = 0;
        for(int i = s.length - 1; i>=0; i--){
            if(s[i]=='g'){
                g_count++;
            }
            else if(s[i]=='a'){
                a_count = a_count + g_count;
            }
        }
        System.out.println(a_count);
    }
}
