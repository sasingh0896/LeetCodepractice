// Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

// Each letter in the magazine string can only be used once in your ransom note.

// Note:
// You may assume that both strings contain only lowercase letters.

// canConstruct("a", "b") -> false
// canConstruct("aa", "ab") -> false
// canConstruct("aa", "aab") -> true


// Code 
import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
         char tempArray[] = ransomNote.toCharArray();
          char tempArray1[] = magazine.toCharArray() ; 
          Arrays.sort(tempArray);
          Arrays.sort(tempArray1);
             
         String str1= new String(tempArray);
         String str2= new String(tempArray1) ;  
             
        int i = 0, j = 0;
        while(i< str1.length() && j< str2.length())
        {
            if(str1.charAt(i) == str2.charAt(j)){
                 i++;
                 j++;
                continue;
            }
            else
                j++;      
        }
        System.out.println(i);
        if(i== str1.length())
            return true;
        return false;
    }
    
}