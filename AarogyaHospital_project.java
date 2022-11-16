//package aarogya_hospital;

 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
 


// the main class
public class AarogyaHospital{
 // class for storing the patient information
    class AarogyaMember{
      int cnt;
       // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
    String name,city,dateofadmission,guardianname,guardianaddress,recinf,gender;
    int age,id;
      long AadharCardNumber,guardiancontactnumber,contactnumber;
       String address;
      public int n;
        // make constructor for the class and assign it a unique Id
        public AarogyaMember()
      {
           id=n;
          recinf="no";
          n=n+1;
      }
            // for taking patient information
        public void input(){
          Scanner sc =new Scanner(System.in);
          System.out.print("Enter patient name :");
          name =sc.nextLine();
            System.out.print("Enter patient gender(M/F):");
          gender=sc.nextLine();
          System.out.print("Enter patient age :");
          age=sc.nextInt();
          System.out.print("Enter patient id :");
          id=sc.nextInt();
          System.out.print("Enter patient city :");
          city=sc.nextLine();
          
          System.out.print("Enter patient address :");
          address=sc.nextLine();
           System.out.print("Enter patient date of admission :");
          dateofadmission=sc.nextLine();
          System.out.print("Enter patient guardian name :");
          guardianname=sc.nextLine();
           System.out.print("Enter patient guardi anaddress :");
          guardianaddress=sc.nextLine();
           System.out.print("Enter patient contact number :");
          contactnumber=sc.nextLong();
          System.out.print("Enter patient guardian contact number :");
          guardiancontactnumber=sc.nextLong();
          System.out.print("Enter patient Aadhar Card Number :");
          AadharCardNumber=sc.nextLong();
          System.out.println("patie added!");
          System.out.println();
          
        }
          
    }

 

    // pick the choice of task to be performed
    static long choices(){
      System.out.println();
        System.out.println("Press 1 for adding new member:");
        System.out.println("Press 2 to view list of all available members:");
        System.out.println("Press 3 to search member by ID:");
        System.out.println("Press 4 to search member from a particular city:");
        System.out.println("Press 5 to search member from a particular age group:");
        System.out.println("Press 6 to mark recovery of a member:");
        System.out.println("Press 7 to delete data of a member:");
        System.out.println("Press 0 to exit");
        
            // create scanner class to take input
      Scanner ip = new Scanner(System.in);
        long option=ip.nextLong();
        return option;
    }
// static void dispalyDetals(AarogyaHospital.AarogyaMember patient){
//   System.out.println("patient id:  "+patient.id);
//   System.out.println("patient name:  "+patient.name);
//   System.out.println("patient gender:  "+patient.gender);
//   System.out.println("patient city:  "+patient.city);
//   System.out.println("patient age:  "+patient.age);
//   System.out.println("patient contact number:  "+patient.contactNumber);
//   System.out.println();
// }
 

    public static void main(String args[]){
       AarogyaHospital h = new AarogyaHospital();
      int i=1;
  
        // initialise array list to store list of patients information
         ArrayList<AarogyaMember>a = new ArrayList<AarogyaMember>();
        //for adding aarogya member information
        while(true){

 

            //take choice
            long option=choices();
            
            //invalid choice
            if(option<0||option>7){
              System.out.println("invalid choice");
            
            }
            // take the input and add in the arrayList
            else if(option==1){
                AarogyaMember si=h.new AarogyaMember();
              si.input();
              if(!a.contains(si)){
                a.add(si);
                i++;
              }
                    }
            //iterate and print all the patients information
                    else if(option==2){
                      Iterator it1=a.iterator();
                      if(a.size()!=0){
                        while(it1.hasNext()){
                          AarogyaMember b=(AarogyaMember)it1.next(); 
                         System.out.println("name:"+b.name+"age:"+b.age+"gender:"+b.gender+"aadharcardnumber:"+b.AadharCardNumber+"contactnumber:"+b.contactnumber+"city: "+b.city+"addres"+b.address+"date of admision:"+b.dateofadmission+"gurdian name:"+b.guardianname+"gurdian contact number:"+b.guardiancontactnumber+"gurdian address:"+b.guardianaddress+"recoverd: "+b.recinf);
                         
                        }
                      }
                     else{
                       System.out.println("This liat is emty");
                     }  
                      
                    }
            
            // print details of the patient with a particular id (take id as input)
                    else if(option==3){
                       Scanner se=new Scanner(System.in); 
                System.out.println("Enter the id:");
                      int n=se.nextInt();
                      int l=0;
                      if(n>0 && n<=a.size()){
                        Iterator it2=a.iterator();
                        while(it2.hasNext()){
                          AarogyaMember b=(AarogyaMember)it2.next();
                          if(b.id==n){
                            l=1;
                            System.out.println("name:"+b.name+"age:"+b.age+"gender:"+b.gender+"aadharcardnumber:"+b.AadharCardNumber+"contactnumber:"+b.contactnumber+"city: "+b.city+"addres"+b.address+"date of admision:"+b.dateofadmission+"gurdian name:"+b.guardianname+"gurdian contact number:"+b.guardiancontactnumber+"gurdian address:"+b.guardianaddress+"recoverd: "+b.recinf);
                         System.out.println();
                            
                          }
                        }
                        if(l==0){
                          System.out.println("This id invalid");
                        }
                      }
                      
                
                    }
            
            // to print all the patients from a particular city (take city as input)
                    else if(option==4){
                     Scanner si=new Scanner(System.in); 
                System.out.println("Enter the city:");
                      String n=si.nextLine();
                      int l=0;
                      Iterator it2=a.iterator();
                       while(it2.hasNext()){
                        AarogyaMember b=(AarogyaMember)it2.next();
                         if(b.city.equals(n)){
                           l=1;
                                                    System.out.println("name:"+b.name+"age:"+b.age+"gender:"+b.gender+"aadharcardnumber:"+b.AadharCardNumber+"contactnumber:"+b.contactnumber+"city: "+b.city+"addres"+b.address+"date of admision:"+b.dateofadmission+"gurdian name:"+b.guardianname+"gurdian contact number:"+b.guardiancontactnumber+"gurdian address:"+b.guardianaddress+"recoverd: "+b.recinf);
                         System.out.println();
                         }
                       }
                     if(l==0) {
                       System.out.println("NO patitent admitted city:"+n);
                     }
                   }
            // to print details of all the patients in a particular age group (take age limits as input)
                   else if(option==5){
                   

                    Scanner s=new Scanner(System.in);
                        System.out.println("Enter the minimum age limit:");
                     int min=s.nextInt();
                     System.out.println("Enter the maximam age limit:");
                    int max=s.nextInt();
                     int l=0;
                      Iterator it2=a.iterator();
                     while(it2.hasNext()){
                      AarogyaMember b=(AarogyaMember)it2.next();
                       if(b.age>min&&b.age<max){
                         System.out.println("name:"+b.name+"age:"+b.age+"gender:"+b.gender+"aadharcardnumber:"+b.AadharCardNumber+"contactnumber:"+b.contactnumber+"city: "+b.city+"addres"+b.address+"date of admision:"+b.dateofadmission+"gurdian name:"+b.guardianname+"gurdian contact number:"+b.guardiancontactnumber+"gurdian address:"+b.guardianaddress+"recoverd: "+b.recinf);
                         System.out.println();
                         l=1;

                       }
                     }
                     if(l==0){
                      System.out.println("NO patitent in the age group"+max+"-"+min);
                     }
                   }
                  // take member id as input to maintain recovered information of patient
                   else if(option==6){
                   Scanner in=new Scanner(System.in);
                     System.out.println("Enter the id");
                     int l=0;

                     int n=in.nextInt();
                      Iterator it3=a.iterator();

                     while(it3.hasNext()){
                      AarogyaMember b=(AarogyaMember)it3.next();
                       if(b.id==n){
                         b.recinf="yes";
                         l=1;
                         break;
                       }
                     }
                     if(l==0){
                       System.out.println("The id is invalid");
                     }
                  }
                  //take member id as input to delete patient information
                  else if(option==7){
                    Scanner s =new Scanner(System.in);
                    System.out.println("input id");
                    int n=s.nextInt();
                     int l=0,k=-1;
                    n=s.nextInt();
                    Iterator it3=a.iterator();

                    while(it3.hasNext()){
                      AarogyaMember b=(AarogyaMember)it3.next();
                      k++;
                      if(b.id==n){
                       a.remove(k);
                        l=1;
                        break;
                      }
                    }
                  if(l==0){
                    System.out.println("The id is invalid");
                  }
                  }
                  else{
                 break;
                 }
        }
    }
}