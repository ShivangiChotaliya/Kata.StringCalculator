/*

 Questions
 ===========
1.Create a simple String calculator with a method signature:
———————————————
int Add(string numbers)
———————————————
The method can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0) 
Hints:
——————
 - Start with the simplest test case of an empty string and move to one and two numbers
 - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
 - Remember to refactor after each passing test
———————————————————————————————
2. Allow the Add method to handle an unknown amount of numbers
————————————————————————————————
3. Allow the Add method to handle new lines between numbers (instead of commas).
the following input is ok: “1\n2,3” (will equal 6)
the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
——————————————————————————————-
4. Support different delimiters
to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
the first line is optional. all existing scenarios should still be supported
————————————————————————————————
5. Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
if there are multiple negatives, show all of them in the exception message.
————————————————————————————————
6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
————————————————————————————————
7. Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
————————————————————————————————
8. Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
————————————————————————————————
9. make sure you can also handle multiple delimiters with length longer than one char
———————————————————————————————— 
 */
package StringCalculator;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static void main(String[] args) {
        // TODO code application logic here
    }
	
	public static int add(String numbers) { 
        
		int result = 0;
	    List<Integer> negativeNumbers = new ArrayList<Integer>();
	    
	    if(numbers.startsWith("//")){
	        String numbersWithoutSlash = numbers.substring(2);
	        numbers = numbersWithoutSlash;
	        
	        if(numbers.contains("*") || numbers.contains("[") || numbers.contains("]")  || numbers.contains("%"))
            {
	        	// we can use , instead of \n 	
                numbers = numbers.replace('*','\n').replace('[','\n').replace(']','\n').replaceAll("%" , "\n");
            }
	    }

	    String[] numArray = numbers.split(",|\n|;"); 
	        for (String number : numArray) {
	            number = number.trim();
	            number = number.trim();  // trim numbers to allow space 
	            if (!number.isEmpty()) {
	                int onlyNumber = Integer.parseInt(number.trim());
	                if (onlyNumber < 0) {
	                    negativeNumbers.add(onlyNumber);

	                }             
	                if(onlyNumber <= 1000)
                        result = result + onlyNumber;
	            }
	        }
	        if (negativeNumbers.size() > 0) {
	                throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
	        }
	        
	        return result; 
		} 
	}  
	

