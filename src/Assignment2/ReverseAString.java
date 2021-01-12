package Assignment2;

public class ReverseAString {
    public static void main(String[] args){
        String str = "Bhuwan";
        String revStr = null;
        int len = str.length();
        for (int i = len; i > 0 ; i--) {
            if (revStr==null){
                revStr= String.valueOf(str.charAt((i-1)));
            }
            else{
                revStr= revStr+str.charAt(i-1);
            }
        }
        System.out.println("Reverse of "+str+" is "+revStr);
    }
}
