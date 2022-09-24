//grepper How to convert a string into a date

import java.time.LocalDate;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is the variable that we wanna convert
		String myDate = "2022-09-24";
		
		//to do so, we need used "LocalDate.parse((CharSequence){variable})"
		LocalDate myParsedDate = LocalDate.parse((CharSequence)myDate);
		
		//after change let's see now the type both of them
		System.out.println("type before parsing"+myDate.getClass().getName());
		System.out.println("type after parsing"+myParsedDate.getClass().getName());
		
		
		//OUTPUT
		//>>>type before parsingjava.lang.String
		//>>>type after parsingjava.time.LocalDate
	}

}

//end grepper