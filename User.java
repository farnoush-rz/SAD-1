
package photos;
import java.util.*;
import java.io.*;
import static java.lang.System.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class User {
        File user = new File("user.txt");
        Scanner input = new Scanner(System.in); 
        ArrayList<BufferedImage> image;
        public void add_user(){
            String array1[]=new String[7];
            String string;
            try{ 
                BufferedWriter out = new BufferedWriter(new FileWriter(user,true));
                int width = 500;
                int height = 400;
                BufferedImage image = null;
                image = ImageIO.read( new File("c:\\image\\1.jpg"));
                ImageIO.write(image,"jpg",new File("C:\\Users\\Dear User\\Documents\\NetBeansProjects\\airport\\image\\1.jpg"));
                array1[0]="user id : ";
                array1[1]="user name : ";
                array1[2]="gender : ";
                array1[3]="phone : ";
                array1[4]="email : ";
                array1[5]="passwoed : ";
                array1[6]="date_of_birth : ";
                for(int i=0;i<=6;i++){
                    System.out.print(array1[i]);
                    string = input.next();
                    out.write(array1[i]+string+"   ");
                    out.write(lineSeparator());
                }
                out.write("***********************************************************");
                out.write(lineSeparator());
                out.close();    
        }   
        catch(IOException e){
            e.printStackTrace();
        } 
    }
    
        public void updateـuser (){      
        ArrayList<String> array_user1 =new ArrayList<String>(); 
        ArrayList<String> array_user2 =new ArrayList<String>();
        ArrayList<String> array_user3 =new ArrayList<String>();
        System.out.println("Enter the desired id : ");
        String string = input.next();
        System.out.println();
        try{ 
            BufferedReader in = new BufferedReader(new FileReader(user));
            BufferedWriter out = new BufferedWriter(new FileWriter(user,true));
            String line = "";
            int linecount1 =0;
            int linecount2 =0;
            int linecount3 =0;
            int linecount4 =0;
            while((line = in.readLine()) !=null){
                array_user1.add(line);       
                linecount1++; 
                if(linecount1%8==0){
                    linecount2=linecount1;
                }
                int posfound = line.indexOf(string);
                if(posfound > -1){
                    linecount3 = linecount2;
                    linecount4=linecount2;
                }
            }
            for(int i=linecount3;i<=linecount3+7;i++){
                System.out.println(array_user1.get(i)); 
            }
            linecount3 = linecount4;
  
            System.out.print("user id : ");
            String string2 = input.next();
            array_user2.add(string2); 
            System.out.println();
  
            System.out.print("user name : ");
            String string3 = input.next();
            array_user2.add(string3); 
            System.out.println();
  
            System.out.print("gender : ");
            String string4 = input.next();
            array_user2.add(string4); 
            System.out.println();
  
            System.out.print("phone : ");
            String string5 = input.next();
            array_user2.add(string5); 
            System.out.println();
  
            System.out.print("email : ");
            String string6 = input.next();
            array_user2.add(string6); 
            System.out.println();
  
            System.out.print("passwoed : ");
            String string7 = input.next();
            array_user2.add(string7); 
            System.out.println();
            
            System.out.print("date_of_birth : ");
            String string8 = input.next();
            array_user2.add(string7); 
            System.out.println();
            
  
            array_user3.add(0,"user id : ");
            array_user3.add(1,"user name : ");
            array_user3.add(2,"gender : ");
            array_user3.add(3,"phone : ");
            array_user3.add(4,"email : ");
            array_user3.add(5,"passwoed : ");
            array_user3.add(6,"date_of_birth : ");            
            int j=0;
            while(j<=6 ){
                array_user1.set(linecount3,array_user3.get(j)+array_user2.get(j));
                linecount3++;
                j++;
            }
            BufferedWriter out2 = new BufferedWriter(new FileWriter(user));
            out2.write("");  
            for(int k = 0;k<array_user1.size();k++){
                out.write(array_user1.get(k));   
                out.write(lineSeparator());
            }
            out.close();
            array_user2.clear();
        }
        catch(IOException e){
            e.printStackTrace();
        } 
    } 
    public void add_photos(){
        try{ 
            ArrayList<BufferedImage> images = null;
            BufferedImage image = null;
            image = ImageIO.read( new File("c:\\image"));
            images.add(image);
            ImageIO.write(image,"jpg",new File("C:\\Users\\Dear User\\Documents\\NetBeansProjects\\airport\\image"));   
            }   
            catch(IOException e){
                e.printStackTrace();
            } 
        } 
        public void remove_photos( BufferedImage image1){
        try{ 
            ArrayList<BufferedImage> images = null;
            BufferedImage image = null;
             BufferedImage image2 = null;
            image = ImageIO.read( new File("c:\\image"));
            int linecount1=0;
            while(image2 = image.read()!=null){
                linecount1++;
            images.add(image);
             int posfound = image2.indexOf(image1);
                if(posfound > -1){
            images.remove(linecount1-1);

                }
            }
            for( int i = 0;i<images.size();i++){
            ImageIO.write(images.get(i),"jpg",new File("C:\\Users\\Dear User\\Documents\\NetBeansProjects\\airport\\image"));   
            } }  
            catch(IOException e){
                e.printStackTrace();
            } 
        }
       
    }
