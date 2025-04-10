
public class Strings{
    
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        
           //char at index 0
        System.out.println(sb.charAt(0));
        sb.setCharAt (0,'p');
        System.out.println(sb);
        
        System.out.println(sb.insert(2,'n'));
        sb.delete(2,9);
        System.out.println(sb);
        
        sb.append('p');
        System.out.println(sb);
        
        sb.append('o');
        System.out.println(sb);
    }
}   

