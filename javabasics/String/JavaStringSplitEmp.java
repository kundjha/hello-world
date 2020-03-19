public class JavaStringSplit{
	public static void main(String args[]){

 String str = "jan-feb-march-april-may-jun-july";
 String delimiter= "-";
 String[] temp =str.split(delimiter);

 for ( int i=0;i<temp.length;i++){
 System.out.println(temp[i]);

 }


temp=str.split(delimiter,3);//n-1
for(int j=0;j<temp.length;j++){
 System.out.println(temp[j]);
}
}
}