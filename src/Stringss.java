public class Stringss {

    public static void main(String[] args){
//        char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        //        using stirng literals
        String str = "Hello world";
        //        using new keyword
        String str1 = new String("Hello, World!");
        System.out.println(str);
        System.out.println(str1);

//        Length of string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


//...................String method
        String s = "Hello";
//        charAt
        System.out.println(str.charAt(1));
//        substring method
        System.out.println( str.substring(2));
//        substring(int beginIndex, int endIndex)
        System.out.println(str.substring(1, 4));  // sub = "ell");
//        indexOf(String str)
        System.out.println(str.indexOf("l"));    // index = 2
//        toUpperCase()
        System.out.println(str.toUpperCase());
//        toLowerCase()
        System.out.println(str.toLowerCase());
//        trim()
        System.out.println(str.trim());
//        replace(CharSequence target, CharSequence replacement)
        System.out.println(str.replace("l", "p"));
//        equal
        String str11 = "Hello";
        String str22 = "Hello";
        boolean isEqual = str11.equals(str22);
        System.out.println(isEqual);

//        equalsIgnoreCase(String anotherString)
        String str01 = "hello";
        String str02 = "HELLO";
        boolean isEqualcase = str01.equalsIgnoreCase(str02);  // isEqual = true
        System.out.println( isEqualcase);

//        split()
        String strtext = "one,two,three";
        String[] parts = strtext.split(",");  // parts = ["one", "two", "three"]
       for(String ss: parts){
           System.out.println(ss);
       }


    }

}
