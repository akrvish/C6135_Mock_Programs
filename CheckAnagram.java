/*
Q2. Write a Java function to check if two strings are anagrams of each other.
 */
import java.util.Arrays;

public class CheckAnagram {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "Triangle";
        String string2 = "Integral";

        System.out.println(areAnagrams(string1, string2)
                ? string1 + " and " + string2 + " are anagrams."
                : string1 + " and " + string2 + " are not anagrams.");
    }
}


/*
    Output:

    Triangle and Integral are anagrams.
 */