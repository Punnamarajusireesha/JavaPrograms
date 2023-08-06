import java.util.*;
public class Main {
	public static void categorizeAge(int age)
	{
  if(age>0 && age<=12) {
	 System.out.println("Child Age");
  }
  else if(age>=13 && age<=19) {
		 System.out.println("Teen Age");
  }
  else if(age>=20 && age<=59) {
		 System.out.println("Adult Age");
  }
    else
      {
		 System.out.println("Senior Age");
      }
	}

	public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
      categorizeAge(age);
	}
}


