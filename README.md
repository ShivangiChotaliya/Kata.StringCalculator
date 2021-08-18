# Kata-StringCalculator

# Test Driven Development

Test-Driven Development is a process that relies on the repetition of very short development cycle. It is based on the test-first concept of Extreme Programming (XP) that encourages simple design with high level of confidence.

The procedure of doing TDD is following:

1. Write a test
2. Run all tests
3. Write the implementation code
4. Run all tests
5. Refactor

This procedure is often called Red-Green-Refactor.

While writing tests we are in the red state. Since test is written before the actual implementation, it is supposed to fail. If it doesn’t, test is wrong. It describes something that already exists or it was written incorrectly. Being in green while writing tests is a sign of false positive. Tests like that should be removed or refactored.

Next comes the green state. When the implementation of the last test is finished, all tests should pass. If they don’t, implementation is wrong and should be corrected.

The idea is not to make the implementation final, but to provide just enough code for tests to pass. Once everything is green we can proceed to refactor the existing code. That means that we are making the code more optimum without introducing new features. While refactoring is in place, all tests should be passing all the time. If one of them fails, refactor broke an existing functionality. Refactoring should not include new tests.

Tool
========
JUnit: A Java TDD unit test framework.


Dependency of JUnit
===================
Download : https://mvnrepository.com/artifact/junit/junit/4.0  

 <dependencies>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.0</version>
    <scope>test</scope>
</dependency>
</dependencies>



Jar of JUnit 
==================
hamcrest,
junit

IDE
=========
Eclips

Download Eclips from  : https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe


Steps create project and run 
=============================

1. Create new project (File->New->Meven Project)
2. Add package and java files in src/main.java
3. Right click on java file -> new -> create test file
4. Add dependancy in pom.xml File
5. Dependency are available in link -> https://mvnrepository.com/artifact/junit/junit/4.0  
6. Add Dependency into pom.xml file in project tag
7. write a small code in java file and a test case in test file 
8. Right click on File -> click Run As to rum file
9. Right click on the Test.java code ->  Run file 


Question
-----------------------

1.Create a simple String calculator with a method signature:
    int Add(string numbers)

    The method can take up to two numbers, separated by commas, and will return their sum. 
    for example “” or “1” or “1,2” as inputs.
    (for an empty string it will return 0) 

    Hints:
    -------------
    - Start with the simplest test case of an empty string and move to one and two numbers
    - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
    - Remember to refactor after each passing test
    -------------

2. Allow the Add method to handle an unknown amount of numbers

3. Allow the Add method to handle new lines between numbers (instead of commas).
    the following input is ok: “1\n2,3” (will equal 6)
    the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)

4. Support different delimiters
    to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
    the first line is optional. all existing scenarios should still be supported

5. Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
    if there are multiple negatives, show all of them in the exception message.

6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2

7. Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6

8. Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.

9. make sure you can also handle multiple delimiters with length longer than one char


