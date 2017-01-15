
public class MainClass {

	public static void main(String[] args) {
				
		MethodOverload op1=new MethodOverload();            // MethodOverload Class object creation 
		op1.add(5,6);                                       // add two integers
		op1.add("Soma","Pathak");                                                // concatenate two strings
		op1.divide(45,9);                                   // divide two integers
        op1.divide("Aeroplane","Train");                                        // divide two strings
        op1.divide("Train",68);                            // divide string by integer
        op1.divide(34,"Test");                                                 // divide integer by string 
        op1.divide(34,0);                                   // divided by Zero
        op1.divide(34,45);                                                    // denominator is greater then numerator
        

		ConstructorOverload con1=new ConstructorOverload(400,40);                   // ConstructorOverload Class object creation with integers
		ConstructorOverload con2=new ConstructorOverload("Test","Function");        // ConstructorOverload Class object creation with Strings
		con1.add();                                                        // add two integers
		con2.add();                                                        // concatenate two strings
		con1.divide();                                                     // divide two integerss
		con2.divide();                                                     // divide two strings

	}

}
