package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
    s = s.toLowerCase();
    s = noSpaces(s);
    s = onlyLetters(s);
    return s.equals(reverse(s));
    }

    public String reverse(String s) {
    String n = "";
    for (int i = s.length()- 1; i >= 0; i--)
    n += s.charAt(i);
    return n;
    }
public String noSpaces(String sWord){
String s = "";
for (int i = 0; i < sWord.length(); i++)
if (sWord.charAt(i) != ' ')
s = s + sWord.charAt(i);

return s;
}

public String onlyLetters(String sString){
  String s = "";
  for (int i = 0; i < sString.length(); i++)
  if (Character.isLetter(sString.charAt(i)) == true)
  s = s + sString.charAt(i);
  
  return s;
}


}

