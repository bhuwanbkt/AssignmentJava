import java.util.Scanner;

public class Array_Test{
    public static void main(String[] args){
            String[] names = new String[8];
            String[] newNames;
            System.out.println("Enter eight names");
            for (int i = 0; i < 8; i++) {
                names[i] = new Scanner(System.in).nextLine();
            }
            newNames = performSmallCaps(names);
            for (int i = 0; i < 8; i++) {
                System.out.println(newNames[i]);
            }
        }
        static String[] performSmallCaps(String[] names){
            String[] RandomCaps = new String[8];
            for(int i=0; i<8;i++){
                int len = names[i].length();
                for(int j=0;j<len;j++) {
                    char ch = names[i].charAt(j);
                    if(j % 2 == 0) {
                        ch=Character.toUpperCase(ch);
                    }
                    else{
                        ch=Character.toLowerCase(ch);
                    }
                    if(RandomCaps[i]==null)
                        RandomCaps[i]=Character.toString(ch);
                    else
                        RandomCaps[i]=RandomCaps[i]+ ch;
                }
            }
            return RandomCaps;
        }
    }
