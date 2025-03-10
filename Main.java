public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int reversed_n = 0;

        for(int i = 0; i < 32; i ++){
            reversed_n = (reversed_n << 1) | (n & 1);
            n >>= 1;
        }

        return reversed_n;
    }
}