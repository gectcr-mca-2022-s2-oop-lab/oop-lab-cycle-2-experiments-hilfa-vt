package cycle2;
import java.util.Arrays;
import java.util.Scanner;

class StringMethods{
    String str;
	static Scanner sc = new Scanner(System.in);


    StringMethods(String str) {
        this.str = str;
    }

    void manipulationMethods(){
        String value = this.str;
        System.out.println( "i) String Length is : " + value.length());
        
        System.out.println("ii) enter an alphabet to find its index:");
        System.out.println("Index: " + value.indexOf(sc.next()));
        
        System.out.println("iii) enter the position to find the character there:");
        System.out.println("Character at position: " + value.charAt(sc.nextInt()));
        
        System.out.println("iv) enter a string to concatenate with input:");

        System.out.println("concatenating 'hello' with input : " +value.concat(sc.next()));
        
        System.out.println("v) enter a string to compare with input:");
        System.out.println("Comparison: " + value.compareTo(sc.next()));
        
        System.out.println("vi) enter a string to check if it is equal to input:");
        System.out.println("equals?  " + value.equals(sc.next()));
        
        System.out.println("vii) enter a string to check if it is contained in the input:");
        System.out.println("Contains ? "+ value.contains(sc.next()));


        System.out.println("viii) Replace input with 'words': " + value.replace(value, "words"));
        System.out.println("ix) Convert to LowerCase: " + value.toLowerCase());
        System.out.println("x) Convert to UpperCase: " + value.toUpperCase());
    }

    public static void main(String []args) {
    	System.out.println("Enter a string:");
    	StringMethods str = new StringMethods(sc.nextLine());
    	str.manipulationMethods();
    }
}