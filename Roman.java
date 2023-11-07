import java.util.*;   
import java.io.*;   
import java.lang.Math;  
public class Roman  
{   
  int value(char a)   
  {   
    if (a == 'I')   
      return 1;   
    if (a == 'V')   
      return 5;   
    if (a == 'X')   
      return 10;   
    if (a == 'L')   
      return 50;   
    if (a == 'C')   
      return 100;   
    if (a == 'D')   
      return 500;   
    if (a == 'M')   
      return 1000;   
    return -1;   
  }     
  int convertRomanToInt(String s)   
  {     
    int total = 0;   
    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = value(s.charAt(i));    
      if (i+1 <s.length())   
      {   
        int s2 = value(s.charAt(i+1));     
        if (s1 >= s2)   
        {     
          total = total + s1;   
        }   
        else  
        {     
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }    
  public static void main(String args[])   
  {   
    Roman ob = new Roman();  
    String romanStr= "VI";   
    System.out.println("The corresponding Integer value is: "+ob.convertRomanToInt(romanStr));   
  }   
}  