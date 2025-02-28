
import  java.lang.String;
public class SBuilder {
    public  static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
//        chatat
        System.out.println(sb.charAt(0));
//        •	Set a Character at Index –
        sb.setCharAt(0, 'Y');
        System.out.println(sb);

//        insert at specific index
        sb.insert(0, "HI");
        System.out.println(sb);

//        Append means to add something at the end.
        sb.append(" Stark");
        System.out.println(sb);


//        Deletes a portion of the string.
        sb.delete(1, 3);
        System.out.println(sb);

//        reverse
        sb.reverse();
        System.out.println(sb);





    }
}

