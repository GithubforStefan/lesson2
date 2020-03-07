public class Exercise2review {

    public static void main (String[] args){

       /* String str = "The quick brown fox";
        StringBuilder invstr = new StringBuilder();
                for(int i = str.length()-1;i >= 0;i--){

                    invstr.append(str.charAt(i));
                }
        System.out.println(invstr.toString());
*/

       String s1 = "Stefan ";
       String s2 = "Kraus";

       StringBuilder s3 = new StringBuilder();
       s3.append(s1+s2);
        System.out.println(s3);

        //System.out.println(s1+s2);
    }
}
