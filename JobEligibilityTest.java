package Day3;

import java.util.Scanner;

// eligible of age<55 and education='graduate' 
//else not eligible
public class JobEligibilityTest {

	public static void main(String[] args) {
        String name;
         String edu;
		 int age;
		Scanner s= new Scanner(System.in) ;
		System.out.println("enter name education and age");
		name=s.next();
		edu=s.next();
		age= s.nextInt();
   //if we have to compare string then we use equals method to compare
   		
		if(age>=55 && edu.equals("graduate"))
		{
			System.out.println(" eligible ");
		}
		else
			System.out.println(" not eligible");
	}

}
