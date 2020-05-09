
// Given a positive integer num, write a function which returns True if num is a perfect square else False.

// Note: Do not use any built-in library function such as sqrt.

// Example 1:

// Input: 16
// Output: true
// Example 2:

// Input: 14
// Output: false

class ValidPerfectSquare{
    // class Solution {
//     public boolean isPerfectSquare(int num) {
//        if (num < 1) return false;
//       if (num == 1) return true;
//       long t = num / 2;
//       while (t * t > num) {
//         t = (t + num / t) / 2;
//       }
//       return t * t == num;        
//     }
    
// }
// // NEWTON ITERATION
// // The Newton Iteration is a mathematic approach that finds optimal answers gradually by approaching. The f'(x) derivative function of x^2 is 2x. Starting at x/2 for the guess of the square root of x, we can approach a better answer by r’=(r+x/r)/2 until the r’^2 is smaller or equal to x.

class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        
        while (l <= r) {
            long mid = l - (l - r) / 2;
            
            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                l = mid + 1;
            else
                r = mid - 1;
        }
        
        return false;
    }
}

}
