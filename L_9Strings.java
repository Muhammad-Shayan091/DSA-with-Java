import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class Strings {
    public static boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length()-1;
        while(st<end) {
            while(st<end && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            while(st<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static void Displacement(String path) {
        int x=0;
        int y=0;
        for(int i = 0 ; i < path.length() ; i++) {
            char direction = path.charAt(i);
            if(direction == 'E') {
                x++;
            } else if(direction == 'W') {
                x--;
            } else if(direction == 'N') {
                y++;
            } else {
                y--;
            }
        }
        double Displacement = Math.sqrt(x*x + y*y);
        System.out.println("Displacement : " + Displacement);
    }

    public  static void subString(String Str , int st , int end) {
        String subStr = "";
        for(int i = st ; i < end ; i++) {
            System.out.print(i + " ");
            subStr += Str.charAt(i);
        }
        System.out.println("\n"+subStr);
    }
    public static void stringComparison(String Str1 , String Str2 , String Str3) {
        if((Str1.length() >= Str2.length()) && (Str1.length() >= Str3.length())) {
            System.out.println("String : 1 : " + Str1 + " : Is Greater...");
        } else if((Str2.length() >= Str1.length()) && (Str2.length() >= Str3.length())) {
            System.out.println("String : 2 : " + Str2 + " : Is Greater...");
        } else {
            System.out.println("String : 3 : " + Str3 + " : Is Greater...");
        }
    }

    public static void upperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i < str.length() ; i++) {
            if((str.charAt(i) == ' ') && (i < str.length())) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    // aaaabbcccd
    public static void countChar(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(Integer.toString(count));
            }
        }
        System.out.println(sb);

    }

    // Count Small Wovels In String 
     public static void countsmallWovel(String Str) {
        int count = 0;
        for(int i = 0 ; i < Str.length() ; i++) {
            char el = Str.charAt(i);
            if(el == 'a' || el == 'e' || el == 'i' || el == 'o' || el == 'u') {
                count++;
            }
        }
        System.out.println("No Of Small Wovels In : " + Str + " : are : " + count);
    }

    public static boolean CheckAnagram(String str1 , String str2) {
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean Result = Arrays.equals(array1, array2);
        return Result;
    }
    public static void main(String arg[]){
        Scanner sc = new  Scanner(System.in);

        // declare strings 
        // String name = "Muhammad Shayan";
        // System.out.println(name);

        // // Input strings (single word input)
        // System.out.print("Enter first name : ");
        // String firstName = sc.next();
        // System.out.print("Enter last name : ");
        // String lastName = sc.next();
        // // Concatenation (+)
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // // input a sentence
        // System.out.println("Enter Sentence : ");
        // String intro = sc.nextLine();
        // System.out.println(intro);
        // // length of String 
        // System.out.println("Intro length Is : "+intro.length());

        // String Celeb = "Sharukh";
        // for(int i = 0 ; i < Celeb.length() ; i++) {
        //     System.out.print(Celeb.charAt(i)+" ");
        // }

        // // Check Pallindrome 
        // String str1 = "madam";
        // if(isPalindrome(str1)){
        //     System.out.println(str1 + " Is Pallindrome..");
        // } else {
        //     System.out.println("Not a Pallndrome..");
        // }

        // // Find Displacement 
        // String path = sc.next();
        // Displacement(path);

        // // Compare Two Strings 
        // String str1 = "Apna";
        // String str2 = "Apna";
        // String str3 = new String("Apna");
        
        // // It will Give no Error , bcz both str1 and str2 point the same address..
        // if(str1 == str2) {
        //     System.out.println("Both Strings are Equal..");
        // } else {
        //     System.out.println("Strings are not equal..");
        // }

        // // It will Give an Error , bcz  str1 points one address and str2 point the new address..
        // if(str1 == str3) {
        //     System.out.println("Both Strings are Equal..");
        // } else {
        //     System.out.println("Strings are not equal..");
        // }

        // // It will Give no Error , bcz both str1 and str2 Compared by funtion even if both point the same address..
        // if(str1.equal(str3) == 0) {
        //     System.out.println("Both Strings are Equal..");
        // } else {
        //     System.out.println("Strings are not equal..");
        // }

        // // Sub-String Through built-in Funtion and User Drfined Funtion......
        // String Str = "ApnaCollege";
        // System.out.println(Str.substring(0, Str.length()));
        // subString(Str, 0, Str.length());

        // // Find Largest String 
        // String Str1 = "Shradha";
        // String Str2 = "thapra";
        // String Str3 = "Apna";

        // // 1.By length
        // stringComparison(Str1, Str2, Str3);

        // // 2. by Lexicographical Order (a,b,c,.......z)
        // String Fruits[] = {"Orange" , "Mango" , "Apple" , "Banana"};

        // String largest = Fruits[0];
        // for(int i = 1 ; i < Fruits.length ; i++) {
        //     if(Fruits[i].compareTo(largest) > 0) {
        //         largest = Fruits[i];
        //     }
        // }
        // System.out.println("Largest Element Is : " + largest);

        // // Upper-Case First Letter 
        // String sentence  = "my name is khan";
        // upperCase(sentence);

        // // Compressing String
        // String str1 = "aaabbbbcddd";
        // countChar(str1);

        // // Count Small Wovels In The String 
        // String company = "ApnaCollege";
        // countsmallWovel(company);
        
        // // Guess the Output 
        // String str ="ShradhaDidi";
        // String str1 ="ApnaCollege";
        // String str2  ="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // // Guess 2
        // String str3 ="ApnaCollege".replace("l","");
        // System.out.println(str3);


        // Check Anagrams 
        String order1 = "silent";
        String order2 = "listen";
        if(CheckAnagram(order1, order2)) {
            System.out.println("Both Strings are Anagrams...");
        } else {
            System.out.println("Not the Anagrams...");
        }





        

    }
}