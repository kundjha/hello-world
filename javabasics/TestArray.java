class TestArray
{

public static void main (String args[])
{

double[] myList={1.9,4.7,4.9,3.4,3.5};

//Print all the array elements

for ( int i=0;i<myList.length;i++)
{

System.out.println(myList[i]);

}

for ( Double d:myList)
{
System.out.println(d);
}
//Summing all elements 
double sum=0;
for ( int i=0;i<myList.length;i++)
	{
           sum=sum+myList[i];
	}
        System.out.println("total is " + sum);
//Finding out the larget element 
double max=myList[0];
for ( int i=1;i<myList.length; i++)
{

		if ( myList[i]>max)
		{
			max=myList[i];
		}
	}

System.out.println("Max is " +max);
//Another way of defining Array 
	String s[]=new String[4];
	s[0]="java";
	s[1]="selenium";
	s[2]="DevOps";
	s[3]="Python";

for ( int i=0;i<s.length;i++)
	{
	 System.out.println(s[i]); 
	}


//Enhanaced or for each loop 

	for ( String str:s)
	{
	System.out.println(str);
	}	
	
}

}