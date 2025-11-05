
package lab6;
public class Task4 {
    public static void main(String[] args) {
        int randomUpperCase = (int)(Math.random() * (90-65+1))+ 65;
        
        System.out.println("The character is "+((char)randomUpperCase));
    }
}
