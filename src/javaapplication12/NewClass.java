package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class NewClass extends NewClass1 {
 String sql;   
 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
 static final String DB_URL = "jdbc:mysql://localhost:3306/authenticate";
 // Database credentials
 static final String USER = "root";
 static final String PASS = "Bhavuk@123";
 
 String  func1()
 {
     Scanner sc = new Scanner(System.in);
     String b = sc.nextLine();
     return b;
 }
 void func()
    {
        int flag1=0;
        do
        {
        System.out.println("\n*****************__WELCOME TO THE COMPLAIN BOX__*****************");
			System.out.println("\n->TECHNITIAN.....(press 1 to select)");
			System.out.println("\n->CARPENTER.....(press 2 to select)");
			System.out.println("\n->PLUMBER.....(press 3 to select)");
			System.out.println("\n->CLEANING.....(press 4 to select)");
			System.out.println("\n->EXIT.....(press 5 to select)");
                        System.out.print("\nENTER YOU CHOICE...... \t");
			Scanner sc = new Scanner (System.in);
			NewClass1 obj2 = new NewClass1();
                        int a = sc.nextInt();
                        
				switch(a)
					{
					case 1:
					{
					System.out.println("SWITCHES");
					System.out.println("FAN");
					System.out.println("LIGHT");
					System.out.println("AIR CONDITIONER");
					System.out.println("EXHAUST FAN");
					System.out.println("OTHER");
                     			System.out.print("BACK.....press esc to select \n");
					String b = func1();
					if(b.equals("esc"))
					{ 
                                            flag1++;
                                            break;
                                            
                                        }
                                        else if(!b.equals("esc")) 
                                        {
                                            
                                       obj2.funccase1(b);    
                                        }
					break;	
                                        }
						
					case 2:
					{
                                        System.out.println("CUPBOARD");
					System.out.println("GATES");
					System.out.println("BED/DRAWER");
					System.out.println("STUDY TABLE");
					System.out.println("RACK");
					System.out.println("OTHER");
                                        System.out.println("BACK.....press esc to select\n");
					String b = func1();
					if(b.equals("esc"))
					{ 
                                            flag1=1;
                                            break;
                                            
                                        }
                                        else if(!b.equals("esc")) 
                                        {
                                       obj2.funccase2(b);
                                        }
					break;}
					case 3:
					{ 
                                        System.out.println("BATHROOM TAP");
					System.out.println("JET SPRAY");
					System.out.println("PISTON/FLUSH");
					System.out.println("SHOWER");
					System.out.println("OTHER");
                                        System.out.println("BACK.....press esc to select\n");
					String b = func1();
					if(b.equals("esc"))
					{ 
                                            flag1=1;
                                            break;
                                        }
                                        else if(!b.equals("esc")) 
                                        {
                                            obj2.funccase3(b);
                                        }
					break;}
					case 4:
					{
                                        System.out.println("ROOM MOPING");
					System.out.println("BATHROOM");
					System.out.println("FLOOR");
					System.out.println("DUSTBIN");
					System.out.println("CORRIDOR");
					System.out.println("OTHER");
                                        System.out.println("BACK.....press esc to select\n");
					String b = func1();
					if(b.equals("esc"))
					{ 
                                            flag1=1;
                                            
                                        }
                                        else if(!b.equals("esc")) 
                                        {
                                          obj2.funccase4(b);
                                        }
					break;
                                        }
                                        case 5 :
                                        {
                                           flag1 = 0;
                                         System.out.println("\nexiting....\n");
                                            break;
                                        }
					
                                }
                                
    }while(flag1>0);
    }

 public static void main(String[] args) throws SQLException, ClassNotFoundException {
NewClass obj = new NewClass();
NewClass1 objx = new NewClass1();
System.out.println("LOGIN  {select 1 to login}\n  OR \n  SIGNUP {select 2 to signup}\n\nENTER YOUR CHOICE..\t"); 
Scanner sc2 = new Scanner(System.in);
int a1= sc2.nextInt();
switch(a1)
					{
					case 1:
					{
                                            do{
                                            objx.funcy();
                                            }while(objx.flag0>0);  
                                        break;
                                       }
                                        case 2:
                                        {
                                            objx.func10();
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("wrong value selected ...exitting");
                                        }
}
     }
}    
    


 
 
 
 
    
   

