//package string.hard;
//
//public class EditDistance {
//    public static void main(String[] args) {
//        String s1 = "abcd";
//        String s2 = "bcfe";
//
//        int highestLength = s1.length()>s2.length() ? s1.length():s2.length();
//
//        int iStartPoint =0;
//        int jStartPoint =0;
//        int same =0;
//        //int i =0;
//        int j =0;
//        for(int i =0;i<s1.length();i++) {
//            while (s1.charAt(i) != s2.charAt(j) && j< s2.length()) {
//                j++;
//                if(j==s2.length()-1)
//                {
//                    j=i+1;
//                    break;
//                }
//            }
//            if(s1.charAt(i) == s2.charAt(j))
//            {
//                same++;
//                j++;
//              //  j++;
//            }
//        }
//
//        System.out.println(highestLength-same);
//
//    }
//}
