package inheritance;

public class dogtest{
    public static void main(String args[]){
        Dog dog= new dog("Spike");
        System.out.println(dog.getName() + "says" + dog.speaks());
    }
}