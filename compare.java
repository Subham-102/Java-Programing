class Test{
public static void main(String args[]){
String str1 = "strings are immutable";
String str2 = new String("strings are immutable");
String str3= new String("Integers are not immutable");
int result=str1.compareTo(str2);
System.out.println(result);
result=str2.compareTo(str3);
System.out.println(result);
}
}

