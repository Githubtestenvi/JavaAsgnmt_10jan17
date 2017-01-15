
public class ConstructorOverload {
	int i,j,sum,quotient;
	String s1,s2,newString1,newString2;

	public ConstructorOverload(int i, int j) {
		this.i = i;
		this.j = j;
		sum=i+j;
		newString1=String.valueOf(sum);
		quotient=i/j;
		newString2=String.valueOf(quotient);
	}  

	public ConstructorOverload(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		newString1 = s1+s2;				
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
		s3=s3.replaceAll("\\$","");
		newString2=s3;
	} 

	public void add()	{
		System.out.println("Sum is "+newString1);
	}

	public void divide(){
		System.out.println("After Division result is "+newString2);
	}
}
