// Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

// Example 1:

// Input: 5
// Output: 2
// Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 

// Example 2:

// Input: 1
// Output: 0
// Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you nee

public class NumberComplement {
    static char flip(char c) 
    { 
        return (c == '0') ? '1' : '0'; 
    } 
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        int n = bin.length();
        String ones= "";
        for (int i = 0; i < n; i++) 
        { 
            ones += flip(bin.charAt(i)); 
        } 
        int decimal = Integer.parseInt(ones,2);
        
        return decimal;
    }
}