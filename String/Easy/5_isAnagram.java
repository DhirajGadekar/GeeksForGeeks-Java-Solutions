import java.util.*;

class Solution
{
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {

        a = a.toLowerCase();
        b = b.toLowerCase();

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        a = new String(arr1);
        b = new String(arr2);

        System.out.println(a);
        System.out.println(b);
        if(a.equals(b)) {

            return true;
        }else {

            return false;
        }

    }
    public static void main(String[] args) {

            String a = "geeksforgeeks";
            String b = "forgeeksgeeks";

            boolean ret = isAnagram(a,b);
            if(ret) {

                    System.out.println("YES");
            }else {

                    System.out.println("NO");
            }
    }
}

