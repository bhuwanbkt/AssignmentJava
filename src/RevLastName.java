public class RevLastName{
    public static void main(String[] args){
        String name = "Hello this a nice place";
        String revSting=null;
        String[] split1 = name.split(" ");

        int len= split1.length;
        for (int i = 0; i < len-1; i++) {
            if(revSting == null)
                    revSting = split1[i]+" ";
                else
                    revSting = revSting+split1[i]+" ";
        }

        int last_string_len =split1[len-1].length();
        for (int i = last_string_len-1; i>-1; i--) {
            char ch = split1[len - 1].charAt(i);
            if(revSting == null){
                revSting = ""+ ch;
            }
            else {
                revSting = revSting + ch;
            }
        }
        System.out.println(revSting);
    }
}
