
package photos;
import java.util.*;
public class Google_Photos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        User object1= new User();
        int number ;
        System.out.print("Enter your desired number :");  
        number = input.nextInt();
        System.out.println(); 
        if(number==1)
        {       
            object1.add_user();
        }
        if(number==2)
        {       
            object1.add_user();
        }
    }    
}
