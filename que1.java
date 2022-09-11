
import java.util.*;
// in class or sub only bca1styear,bca2ndyear,bca3rdyear are allowed

public class que1 {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your class ");
        String c = sc.nextLine();
      if (c.equals("bca1styear") || c.equals("bca2ndyear") || c.equals("bca3rdyear")){
        System.out.println("Enter your Hindi marks : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int sub2 = sc.nextInt();
        if(sub1 > 33 || sub2 > 33){
            System.out.println("Enter your Maths marks : ");
            int sub3 = sc.nextInt();
            if(sub1 < 33 && sub3 < 33){
                System.out.println("Your fail you have to study your previous year");
            }else if(sub2 < 33 && sub3 < 33){
                System.out.println("Your fail you have to study your previous year");
            }
            else {
                System.out.println("Enter your Chemistry marks : ");
                int sub4 = sc.nextInt();
                if(sub1 < 33 && sub4 < 33){ 
                    System.out.println("Your fail you have to study your previous year");
                }else if(sub2 < 33 && sub4 < 33){
                    System.out.println("Your fail you have to study your previous year");
                }else if(sub3 < 33 && sub4 < 33){
                    System.out.println("Your fail you have to study your previous year");
                }
               else{
                  System.out.println("Enter your Physics marks : ");
                  int sub5 = sc.nextInt();
                  if (sub1 < 33 && sub5 < 33){
                    System.out.println("Your fail you have to study your previous year");
                  }else if(sub2  < 33 && sub5 < 33){
                    System.out.println("Your fail you have to study your previous year");
                  }else if(sub3 < 33 && sub5 < 33){
                    System.out.println("Your fail you have to study your previous year");
                  }else if( sub4 < 33 && sub5 < 33){
                    System.out.println("Your fail you have to study your previous year");
                  }
                  else{
                    if (sub1 < 33){
                        System.out.println("You have to give supplymentry exam of Hindi");
                    } else if (sub2 < 33){
                        System.out.println("You have to give supplymentry exam of English");
                    }else if(sub3 < 33){
                        System.out.println("You have to give supplymentry exam of Maths");
                    }else if(sub4 < 33){
                        System.out.println("You have to give supplymentry exam of Chemistry");
                    }else if(sub5 < 33){
                        System.out.println("You have to give supplymentry exam of Physics");
                    }else {
                        System.out.println("Congratulation Your Passed");
                        float sum = sub1+sub2+sub3+sub4+sub5;
                        double per = sum/5;
                        System.out.println(" Percentage is : "+per);
                    }
                  }
               } 
            }
    
        }else{
            System.out.println("your fail you have to study your previous year");
        }
      }
     else{
        System.out.println("Please enter valid class");
     }
    
                                                                                          
                                                   
}
}