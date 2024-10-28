
public class romantoInt {
    public static int romanToInt(String s) {
    int total = 0; 
    // Iterate through the string
    for (int i = 0; i < s.length(); i++) {
        int currentValue = getValue(s.charAt(i));  // Get the value of the current Roman numeral

        // Check if the next numeral exists and is larger than the current one
        if (i + 1 < s.length() && getValue(s.charAt(i + 1)) > currentValue) {
            // If so, subtract current value (this is a subtractive case)
            total =  total-currentValue;
        } else {
            // Otherwise, add the current value
            total += currentValue;
        }
    }

    return total;  // Return the total value
}

// Function to get the integer value of a Roman numeral character
public static int getValue(char romanChar) {
    switch (romanChar) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;  // In case of an invalid character
    }
}

// Main method for testing
public static void main(String[] args) {
    String romanNumeral = "MCMXCIV";  // Example Roman numeral
    int integerValue = romanToInt(romanNumeral);
    System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);  // Output: 1994
}
}