
public class MethodOverload {

	public void add(int i, int j)                                                             // Integer + Integer
	{
		System.out.println("Sum is " +(i+j));
	}

	public void add(String s1, String s2)                                                    // String + String
	{
		System.out.println("Concatination of two strings is " +s1+s2);
	}	

	public void divide(int num, int den)                                                    //  Integer/Integer
	{	
		if(num<den)
		{
			System.out.println("Numerator should be greater or equals to Denominator");    // Denominator is greater than numerator
		}
		else
		{
			try
			{
				System.out.println(num+" divided by "+den+" is equals to "+(num/den));
			}

			catch(ArithmeticException e)                                                  // Denominator is Zero
			{
				System.out.println("Denominator cannot be zero");
			}	
		}	
	}

	public void divide(String s1, String s2)                                              // String/String
	{ 
		String s3;
		int len1,len2;
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();

		char[] ch1=s1.toCharArray();  
		char[] ch2=s2.toCharArray(); 
		len1=ch1.length;
		len2=ch2.length;

		for(int i=0;i<len1;i++)
		{   
			for(int j=0;j<len2;j++)
			{   int k;

			if (ch1[i]==ch2[j])
			{
				for(k=i;k<len1-1;k++)
				{
					ch1[k]=ch1[k+1];
				}
				ch1[k]='$';
				if(i!=0)
					i=i-1;
				len1=len1-1;

				for(k=j;k<len2-1;k++)
				{
					ch2[k]=ch2[k+1];
				}
				ch2[k]=0;
				if(j!=0)
					j=j-1;
				len2=len2-1;
				break;
			}			
		}				
	}

		s1 = String.valueOf(ch1);
		s2 = String.valueOf(ch2);
		s3=s1+s2;
		System.out.println(s3.replaceAll("\\$",""));
  }

	public void divide(int num, String den)                                                // Integer/String
	{
		System.out.println("Integer cannot be divided by String");
	}
	
	public void divide(String num, int den)                                               // String/Integer
	{
		System.out.println("String cannot be divided by Integer");
	}
	
}