import java.util.*;
public class Main {
	public static void identifyCharacter(char ch)
	{
        if(Character.isDigit(ch))
        {
        	System.out.println("Entered character "+ch+" Is digit");
        }
        else if(!Character.isLetter(ch)) {
        	System.out.println("Entered character "+ch+" Is Special symbol ");
        }
        else
        {
        	switch(Character.toLowerCase(ch)) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	if(Character.isLowerCase(ch)) {
        		System.out.println("Entered character "+ch+" is Lower Case vowel");
        	}
        	else {
        		System.out.println("Entered Character "+ch+" is Upper Case vowel");
        	}
        	break;
        	default:
        		if(Character.isUpperCase(ch)) {
        			System.out.println("Entered Character "+ch+" is Upper Case consonent");
        		}
        		else {
        			System.out.println("Entered character "+ch+" is Lower Case consonent");
        		}
        	}
        }
	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a character");
      char ch=scan.next().charAt(0);
      identifyCharacter(ch);
      
	}

	}

