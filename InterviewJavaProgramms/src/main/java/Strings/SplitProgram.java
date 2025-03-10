package Strings;

public class SplitProgram {
    //I have string "infosys validation". I need to extract only infosys from this string using java program

    public static void main(String[] args){

                // Input string
                String input = "infosys validation";

                // Extract the first word using split
                String extractedWord = input.split(" ")[0];

                // Print the extracted word
                System.out.println("Extracted word: " + extractedWord);


    }
}
