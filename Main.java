import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int pin[]={1234,5678,9012,3456,7890};
     int balance[]={1000,200,300,1500,10000};
     long mob[]={123456789078l,24567878901l,78875432167l,59672837465l,16729384756l};
     System.out.println("***************WELCOME TO MARRIYAMMAN BANK ATM*****************");
     int attempt=3,next=0;
    do{
        System.out.print("Enter Your Card No :");
     int custNumber=sc.nextInt();
     attempt=3;
     if(custNumber<pin.length){
    pinCheck:
    do{
     System.out.print("Enter Your PIN : ");
     int check=sc.nextInt();
      if(check!=pin[custNumber]){
       attempt--;
       System.out.println(":( Enter the Correct PIN :(");
       continue pinCheck;   
      }  
      else
      {   
          attempt=3;
          break;
      }
    }while(attempt!=0);
    if(attempt==0)
    {
        System.out.println("Your Daily Wrong attempt chance HOGAYAAA!!!1 :(");
    }
    else{
        System.out.println("1.Deposit\n2.Balance\n");
        System.out.print("Enter Your Choice : ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the AMount to deposit :");
                int depAmout=sc.nextInt();
                if(depAmout%100==0){
                    balance[custNumber]+=depAmout;
                }
                else{
                    System.out.println("Enter the multiples of 100's :");
                }
            case 2:
                System.out.println("Your Acc Balance is :"+balance[custNumber]);
                
        }
        
    }
     }
     else{
        System.out.println("Enter Exsisting ACC Number");
    }
    System.out.println("To continue press 1:");
     next=sc.nextInt();
    }while(next==1);
    
    
    }
}