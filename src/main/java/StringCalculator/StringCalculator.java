/*
 Questions
 ===========
1.Create a simple String calculator with a method signature:
覧覧覧覧覧覧覧�
int Add(string numbers)
覧覧覧覧覧覧覧�
The method can take up to two numbers, separated by commas, and will return their sum. 
for example 灯 or �1� or �1,2� as inputs.
(for an empty string it will return 0) 
Hints:
覧覧覧
 - Start with the simplest test case of an empty string and move to one and two numbers
 - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
 - Remember to refactor after each passing test
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�
2. Allow the Add method to handle an unknown amount of numbers
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
3. Allow the Add method to handle new lines between numbers (instead of commas).
the following input is ok: �1\n2,3� (will equal 6)
the following input is NOT ok: �1,\n� (not need to prove it - just clarifying)
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
4. Support different delimiters
to change a delimiter, the beginning of the string will contain a separate line that looks like this: �//[delimiter]\n[numbers�]� for example �//;\n1;2� should return three where the default delimiter is �;� .
the first line is optional. all existing scenarios should still be supported
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
5. Calling Add with a negative number will throw an exception 渡egatives not allowed� - and the negative that was passed. 
if there are multiple negatives, show all of them in the exception message.
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
7. Delimiters can be of any length with the following format: �//[delimiter]\n� for example: �//[***]\n1***2***3� should return 6
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
8. Allow multiple delimiters like this: �//[delim1][delim2]\n� for example �//[*][%]\n1*2%3� should return 6.
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧
9. make sure you can also handle multiple delimiters with length longer than one char
覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧 
 */
package StringCalculator;

public class StringCalculator {

	public static void main(String[] args) {
        // TODO code application logic here
    }
	
	public static int add(String numbers) { 
        int result = 0;
        String[] numArray = numbers.split(",");
        if (numArray.length > 2) {
            throw new RuntimeException("Allow only 2 numbers");
        }
        for (String number : numArray) {   
            if (!number.isEmpty()) {
                Integer.parseInt(number);
                result = result + Integer.parseInt(number);
            }    
         }
        return result; 
    }  
	
}
