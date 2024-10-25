public  class complement {
    public static int bitwiseComplement(int n) {
        int bitLength = Integer.toBinaryString(n).length();
        
        // Step 2: Create a bitmask of the same length with all bits set to 1
        int mask = (1 << bitLength) - 1;
        
        // Step 3: XOR the number with the mask to get the complement
        return n ^ mask;
    }

    public static void main(String args[]) {
        // Solution sol = new Solution();
        int n = 5;
        System.out.println("The complement of " + n + " is: " + bitwiseComplement(n));
    }
}
