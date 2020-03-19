class StringBufferDemo{

public static void main ( String args[]){

StringBuffer sb = new StringBuffer("Hello");
System.out.println(sb);

sb.append("java");//now original string is changed 
System.out.println(sb);//Print HJavaello

sb.replace(1,3,"Tes");
System.out.println(sb);//printHJavalo

sb.delete(1,3);
System.out.println(sb);//PrintHlp

}
}