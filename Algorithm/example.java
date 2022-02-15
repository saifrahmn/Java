import java.util.*;


public class example {
    public static void main(String[] args){
        Set <Character> chars=new HashSet<>();
        int i=0;
        String st="SaifRahman";
        for(char c: st.toCharArray()){
            
            chars.add(c);
        }
        
        System.out.println("outside loop" +chars.size());
    }
}
