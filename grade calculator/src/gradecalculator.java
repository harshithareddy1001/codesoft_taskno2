import java.util.Scanner;


public class gradecalculator {

   
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
         System.out.println("enter no.of subjects");
        int  n=obj.nextInt();
        int marks[]=new int[100];
        int total=0;
      
      for(int i=1;i<=n;i++){
          System.out.println("enter marks of subject"+i+"(out of 100)");
         marks[i]=obj.nextInt();
         total=total+marks[i];
       
      }
       System.out.println("your total marks are "+total);
     int percentage=total/(n);
      System.out.println("you got "+percentage+" %");
     if(percentage>80){
          System.out.println("you got grade A");
          
     }else if(percentage>60 && percentage<80){
          System.out.println("you got grade B");
          
     }else if(percentage>40 && percentage<60){
          System.out.println("you got grade C");
     }else{
          System.out.println("you failed the exam");
     }
            
       
    }
    
}
