package week2.day2;

import java.util.Arrays;

public class Anagram {


public static void main(String[] args) {
	String s1="stops";
	String s2="potss";
	if(s1.length()!=s2.length())
	{
	
		System.out.println("Both the string are not equal, so string are not anagram");	
	}
	
	else
{
char[]string1=s1.toCharArray();
char[]string2=s2.toCharArray();
Arrays.sort(string1);
Arrays.sort(string2);
if(Arrays.equals(string1,string2)==true)
{
	System.out.println("strings are Anagram");
}
	else
	{
	System.out.println("strings are not Anagram");

}
}
}
}


