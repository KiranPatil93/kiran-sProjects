package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class EvenOddOutput {

    //Write a code to find out even and odds into following output format.
    //Input: "12232334300"
    //Output:
    //{
    //  "0": "even",
    //  "1": "odd",
    //  "2": "even",
    //  "3": "odd",
    //  "4": "even"
    //}
        public static void main(String[] args) {
            // Input string
            String input = "12232334300";

            // Create a map to store the results
            Map<Character, String> result = new LinkedHashMap<>();

            // Iterate over each character in the input string
            for (char c : input.toCharArray()) {
                // Check if the character is even or odd
                if (!result.containsKey(c)) { // Avoid duplicate entries
                    int digit = Character.getNumericValue(c);
                    if (digit % 2 == 0) {
                        result.put(c, "even");
                    } else {
                        result.put(c, "odd");
                    }
                }
            }

            // Print the result
            System.out.println(result);
        }
    }


