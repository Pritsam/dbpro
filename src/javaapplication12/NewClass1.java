package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import static javaapplication12.NewClass.DB_URL;


public class NewClass1 {
    int flag0=0,flag3=0;
    void funcy()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("USERNAME : \t");  
       String ousername=sc1.nextLine();
       if (ousername.equals(""))
    {
        System.out.println("username or password can't be left blank");
        flag3++;
    }
        else{}
       System.out.print("PASSWORD : \t");
       String opassword=sc1.nextLine();
 if (opassword.equals(""))
    {
        System.out.println("username or password can't be left blank");
        flag3++;
    }
        else{}
       
       int flag=0  ;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 
if(flag3==0)
{
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("\nPROCESSING......PROCESSING.....PROCESSING \n");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");

 stmt = conn.createStatement();
 
 obj1.sql = "SELECT username , password  FROM details";
 ResultSet rs = stmt.executeQuery(obj1.sql);

 while(rs.next()){
 String username = rs.getString("username");
 String password = rs.getString("password");
if(username.equals(ousername) && password.equals(opassword))
{
    System.out.println();
    flag=1;
    obj1.func();
    break;
}
}
 if(flag==0)
 {
 System.out.println("USERNAME OR PASSWORD DOSEN'T MATCH PLEASE TRY AGAIN............ \n");
 flag0=1;
 }        
 rs.close();
 stmt.close();
 conn.close();
 }
        
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
      
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }
 }//end finally try
      }//end try 
}
    void funccase1(String b)
    {
        Scanner sc1= new Scanner(System.in);
        System.out.print("USERNAME : \t");  
       String username=sc1.nextLine();
        System.out.print("HOSTEL NUMBER : \t");
       String hostel_no = sc1.nextLine();
       System.out.print("ROOM NUMBER : \t");
       String room_no = sc1.nextLine();
 int flag=0;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
 System.out.println("\n SAVING.....SAVING....SAVING \n");
 stmt = conn.createStatement();
PreparedStatement ps = conn.prepareStatement("insert into complain values('"+username+"','"+hostel_no+"','"+room_no+"','TECHNITIAN','"+b+"');");
 int status = ps.executeUpdate();
 if(status != 0 )
 {
 System.out.println("\nWE HAVE RECORDED YOUR COMPLAIN....ACTIONS WILL BE TAKEN IN A DAY OR TWO \n");
 }

 stmt.close();
 conn.close();
 }
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");
//end main
    }



    void funccase2(String b)
    {
        Scanner sc1= new Scanner(System.in);
               System.out.print("USERNAME : \t");  
       String username=sc1.nextLine();
        System.out.print("HOSTEL NUMBER : \t");
       String hostel_no = sc1.nextLine();
       System.out.print("ROOM NUMBER : \t");
       String room_no = sc1.nextLine();

        int flag=0;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 
try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
 System.out.println("\n SAVING.....SAVING....SAVING \n");
 stmt = conn.createStatement();
PreparedStatement ps = conn.prepareStatement("insert into complain values('"+username+"','"+hostel_no+"','"+room_no+"','CARPENTER','"+b+"');");
 int status = ps.executeUpdate();
 if(status != 0 )
 {
 System.out.println("\nWE HAVE RECORDED YOUR COMPLAIN....ACTIONS WILL BE TAKEN IN A DAY OR TWO \n");
 }
 
 stmt.close();
 conn.close();
 }
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");
//end main
}
    
        void funccase3(String b)
    {
                Scanner sc1= new Scanner(System.in);
               System.out.print("USERNAME : \t");  
       String username=sc1.nextLine();
                System.out.print("HOSTEL NUMBER : \t");
       String hostel_no = sc1.nextLine();
       System.out.print("ROOM NUMBER : \t");
       String room_no = sc1.nextLine();

        int flag=0;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 

 try {
 Class.forName("com.mysql.cj.jdbc.Driver");    
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
  System.out.println("\n SAVING.....SAVING....SAVING \n");
 stmt = conn.createStatement();
PreparedStatement ps = conn.prepareStatement("insert into complain values('"+username+"','"+hostel_no+"','"+room_no+"','PLUMBER','"+b+"');");
 int status = ps.executeUpdate();
 if(status != 0 )
 {
  System.out.println("\nWE HAVE RECORDED YOUR COMPLAIN....ACTIONS WILL BE TAKEN IN A DAY OR TWO \n");
 }

 stmt.close();
 conn.close();
 }
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");
//end main
    }
           
        void funccase4(String b)
    {
                Scanner sc1= new Scanner(System.in);
               System.out.print("USERNAME : \t");  
       String username=sc1.nextLine();
                System.out.print("HOSTEL NUMBER : \t");
       String hostel_no = sc1.nextLine();
       System.out.print("ROOM NUMBER : \t");
       String room_no = sc1.nextLine();

 int flag=0;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 

 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
  System.out.println("\n SAVING.....SAVING....SAVING \n");
 stmt = conn.createStatement();
PreparedStatement ps = conn.prepareStatement("insert into complain values('"+username+"','"+hostel_no+"','"+room_no+"','CLEANER','"+b+"');");
 int status = ps.executeUpdate();
 if(status != 0 )
 {
     System.out.println("\nWE HAVE RECORDED YOUR COMPLAIN....ACTIONS WILL BE TAKEN IN A DAY OR TWO \n");
 }
 
 stmt.close();
 conn.close();
 }
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");
//end main
    }
        
void func10()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("*************WELCOME TO THE SIGNUP PAGE**************");
        String ousername, opassword;
        System.out.println("new username : \t"); 
        ousername = sc3.nextLine();
        System.out.println("new password : \t");
        opassword = sc3.nextLine();
 int flag=0;
     Connection conn = null;
 Statement stmt = null;
 NewClass obj1=new NewClass();
 

 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Connecting to database...");
 conn = DriverManager.getConnection(DB_URL,"root","Bhavuk@123");
  System.out.println("\n SAVING.....SAVING....SAVING \n");
 stmt = conn.createStatement();
PreparedStatement ps = conn.prepareStatement("insert into details values('"+ousername+"','"+opassword+"');");
 int status = ps.executeUpdate();
 if(status != 0 )
 {
     System.out.println("Congratulations....Sucessfully added your details..");
 }
 
 stmt.close();
 conn.close();
 }
 
 catch(SQLException se){
 //Handle errors for JDBC
 se.printStackTrace();
 }
 catch(Exception e){
 //Handle errors for Class.forName
 e.printStackTrace();
 }
 finally{
 //finally block used to close resources
 try{
 if(stmt!=null)
 stmt.close();
 }
         catch(SQLException se2){
 }// nothing we can do
 try{
 if(conn!=null)
 conn.close();
 }catch(SQLException se){
 se.printStackTrace();
 }//end finally try
 }//end try
 System.out.println("Goodbye!");
//end main
    }

}