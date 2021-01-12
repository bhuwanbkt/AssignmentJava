package Assignment1;

import java.util.Scanner;

public class UpperCaseFirstLetterSentence {
    public static void main(String[] args){
        System.out.println("Enter a sentence");
        String sentence = new Scanner(System.in).nextLine();
        String[] separatedStr= sentence.split(" ");
        String FirstCap = null;
        for(int i=0; i<separatedStr.length;i++){
            int len = separatedStr[i].length();
            for (int j = 0; j < len; j++) {
                char ch = separatedStr[i].charAt(j);
                if(j==0)
                ch=Character.toUpperCase(ch);
                if(FirstCap==null)
                    FirstCap=Character.toString(ch);
                else FirstCap = FirstCap + ch;
                }
            FirstCap=FirstCap+" ";
            }
        System.out.println("Output: "+FirstCap);
        }
    }
