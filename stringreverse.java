import java.util.Scanner;
public class Main
{
  static void reverse_string(String str){
    if ((str==null)) || (str.length()<=1))
      System.out.println(str);
    else{
System.out.println(str.charAt(str.length()-1));
      reverse_string(str.substring(0,str.length()-1));
    }
  }
  public static void main(String args[])
  {
    Scanner sc=newScanner(System.in);
    String str=sc.nextLine();
    reverse_string(str);
  }
}
