/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameticket_package;

import java.util.Date;
import java.util.Vector;
import java.util.Scanner;

public class GameTicket 
{
    /**
     * @throws NUMBER FORMATER EXCEPTION
     * JAVA DEFINED EXCEPTION is applied here
     * it gives error when the user enters a bet money as letters not numbers
     * @param str
     * @return 
     */
public static boolean check(String str)
    {

        try
        {
            int a=Integer.valueOf(str);
        }catch(NumberFormatException e)
        {
            return false;
        }
        return true;
    }
/**
 * References used in this program
 * 1-Gibbs Martin,"Java Programming tutorial and training",Study.com,@hrefhttps://study.com/academy/lesson/java-date-data-type.html,2003.
 * 2-Paul Deitel and Harvey Deitel,“Java-How to Program”,10th edition, Pearson,2015.”
 * 3-David J.Eck,Introduction to Programming Using Java, Eighth Edition , Version 8.1.1, May 2020.
 * 4- Dr Shereen Moussa,"Control Structure and classes",Ain Shams University, genedy Hall,2020
 * 5- Dr Shereen Moussa,"Polymorphism and javadoc",Ain Shams University, genedy Hall,2020.
 * @param args
 * @throws Invalidinput 
 */
    public static void main(String[] args) throws Invalidinput
    {
     
      Boolean check=true;
      char answer,catg;
      Date[]d=new Date[4];
      Date d1=new Date(2020,7,7);
      d[0]=d1;
      Date d2=new Date(2020,10,9);
      d[1]=d2;
      Date d3=new Date(2020,6,30);
      d[2]=d3;
      Date d4=new Date(2020,9,20);
      d[3]=d4;
      Scanner scanner=new Scanner(System.in); 
      
      game []g=new game[4];
      seat[]s=new seat[3];
      
      game a=new internationalgame("Madrid VS Barcelona", "Madrid",777,5, "San Siro Stadium",d[0]);
      g[0]=a;
      game b=new internationalgame("Arsenal VS Chelsea", "Arsenal",888,5, "Anfield Stadium",d[1]);
      g[1]=b;
      game c=new nationalgame("Ahly VS Zamalek", "Ahly",232,5, "Cairo internationa Stadium", d[2]);
      g[2]=c;
      game l=new nationalgame("Ismaylia VS port Saied", "Ismaylia",332,5, "El Salam Stadium",d[3]); 
      g[3]=l;
      
      seat s1=new categoryA(22, 5);
      s[0]=s1;
      seat s2=new categoryB(11, 7);
      s[1]=s2;
      seat s3=new categoryC(72, 10);
      s[2]=s3;
   
      System.out.println("The games that are available for this season");
      for(int i=0;i<4;i++)
      {
        g[i].display();
      }
     
         nationalgame.popularmatches();
         internationalgame.popularmatches();
         
          sportfan [] fan1= new sportfan[2];
          fan1[0]=new sportfan("Alex",202);
          fan1[1]=new sportfan("Layla",707);
     
      while (check)
    {
      System.out.println("Do you want sport fan 1 or 2 (1/2)");
      int answ=scanner.nextInt();
    
     
      System.out.println("Press(1)to reserve a ticket  press(2)to cancel reservation  press(3)to display details of sportfans   press(4)to make a bet  press(5)to update seat category  press(6)to exist");

      try
      {
      answer=scanner.next().charAt(0);
      if((answer !='1')&&(answer!='2')&&(answer!='3')&&(answer!='4')&&(answer!='5')&&(answer!='6'))
      throw new Invalidinput("Incorrect input please enta 1 or 2 or 3 or 4 or 5 or 6");
      }catch(Invalidinput e)
      { 
          System.err.println("Incorrect input please enta 1 or 2 or 3 or 4 or 5 or 6");
           answer=scanner.next().charAt(0);
      }
      
      if(answer=='1')
    {
      System.out.println("The 3 categories of the tickets");
     
      for(int i=0;i<3;i++)
      {
          s[i].describe();
          System.out.println("The Seat number of this category "+s[i].number);
      }
       System.out.println("Enter category A or B or C");
       try
      {
      catg=scanner.next().charAt(0);
      if((catg !='A')&&(catg!='B')&&(catg!='C'))
      throw new Invalidinput("Incorrect input please enta A or B or C");
      }catch(Invalidinput e)
      { 
          System.err.println("Incorrect input please enta A or B or C");
          catg=scanner.next().charAt(0);
      }
        if(catg=='A')
      {
     
      for(int i=0;i<4;i++)
      {
          System.out.println("  The teams  "+g[i].VS);
      }
      System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
      char z=scanner.next().charAt(0);
      if(z=='1')
       fan1[answ-1].buyticket("A",s[0],g[0]);
      else if(z=='2')
          fan1[answ-1].buyticket("A", s[0],g[1]);
       else if(z=='3')
          fan1[answ-1].buyticket("A", s[0],g[2]);
       else if(z=='4')
          fan1[answ-1].buyticket("A", s[0],g[3]);
      }
        else  if(catg=='B')
      {
     
      for(int i=0;i<4;i++)
      {
          System.out.println("  The teams  "+g[i].VS);
      }
      System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
      char w=scanner.next().charAt(0);
      if(w=='1')
          fan1[answ-1].buyticket("B", s[1],g[0]);
      else if(w=='2')
          fan1[answ-1].buyticket("B", s[1],g[1]);
       else if(w=='3')
          fan1[answ-1].buyticket("B", s[1],g[2]);
       else if(w=='4')
          fan1[answ-1].buyticket("B", s[1],g[3]);
      }
        else  if(catg=='C')
      {
     
      for(int i=0;i<4;i++)
      {
          System.out.println("  The teams  "+g[i].VS);
      }
      System.out.println("Press 1 for the first match  press 2 for the second match  press 3 for the third match  press 4 for the fourth match");
      char r=scanner.next().charAt(0);
      if(r=='1')
          fan1[answ-1].buyticket("C", s[2],g[0]);
      else if(r=='2')
          fan1[answ-1].buyticket("C", s[2],g[1]);
       else if(r=='3')
          fan1[answ-1].buyticket("C", s[2],g[2]);
       else if(r=='4')
          fan1[answ-1].buyticket("C", s[2],g[3]);
        
      }
       
    }
      else if(answer=='2')
     {
      System.out.println("Choose the match you want to cancel your reservation from");
           for(int i=0;i<4;i++)
      {
          System.out.println("  The teams  "+g[i].VS);
      }
      System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
      char ans=scanner.next().charAt(0);
      System.out.println("The reserved seats");
            for(int i=0;i<3;i++)
      {
          System.out.println(" The numbers "+s[i].number);
      }
      System.out.println("Enter your seat number");
      int del=scanner.nextInt(); 
      System.out.println("Enter your seat category you want to cancel its reservation  (A/B/C)");
      String categremove=scanner.next();
      System.out.println("Enter the current day");
      int day=scanner.nextInt();
      System.out.println("Enter the current month");
      int month=scanner.nextInt();
      for(int i=0;i<3;i++)
    {    if(del==s[i].number)
    {
        if(ans=='1')
      {
          fan1[answ-1].cancelticket(s[i].number, day,month,g[0],categremove);
      }
          else if(ans=='2')
      {
         fan1[answ-1].cancelticket(s[i].number, day,month,g[1],categremove);
      }
          else if(ans=='3')
      {
         fan1[answ-1].cancelticket(s[i].number, day,month,g[2],categremove);
      }
          else if(ans=='4')
      {
          fan1[answ-1].cancelticket(s[i].number, day,month,g[3],categremove);
      }
    }
     }    
  
      } 
    else if(answer=='3')
    {
        System.out.println("Displaying the users details and seats reserved");
        for(int i=0;i<2;i++)
        {   
            fan1[i].display(s);
        }
    }
    else if(answer=='4')
    {
        System.out.println("Enter the price you want to bet with ");
        String p=scanner.next();
        if(check(p)==true)
        {     
             System.out.println("Choose the match you want to cancel your reservation from");
           for(int i=0;i<4;i++)
          {
             System.out.println("  The teams  "+g[i].VS);
          }
             System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
             char ans=scanner.next().charAt(0);
             System.out.println("Enter the team you expect to win");
             String x=scanner.next();
             if(ans=='1')
             fan1[answ-1].makebet(g[0], x, p);
             else if(ans=='2')
             fan1[answ-1].makebet(g[1], x, p);
             else if(ans=='3')
             fan1[answ-1].makebet(g[2], x, p);
             else if(ans=='4')
             fan1[answ-1].makebet(g[3], x, p);
        }
        else
        { 
            System.err.println("Please enter the price as a number");
            p=scanner.next();
            System.out.println("Choose the match you want to cancel your reservation from");
           for(int i=0;i<4;i++)
          {
             System.out.println("  The teams  "+g[i].VS);
          }
             System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
             char ans=scanner.next().charAt(0);
             System.out.println("Enter the team you expect to win");
             String x=scanner.next();
             if(ans=='1')
             fan1[answ-1].makebet(g[0], x, p);
             else if(ans=='2')
             fan1[answ-1].makebet(g[1], x, p);
             else if(ans=='3')
             fan1[answ-1].makebet(g[2], x, p);
             else if(ans=='4')
             fan1[answ-1].makebet(g[3], x, p);
        }
        
    }
    else if(answer=='5')
    {
      System.out.println("Choose the game you want to update your seat in");
         for(int i=0;i<4;i++)
      {
          System.out.println("  The teams  "+g[i].VS);
      }
      System.out.println("Press 1 for the first match  press 2 for the second match  press3 for the third match  press 4 for the fourth match");
      char update=scanner.next().charAt(0);
       System.out.println("The reserved seats");
            for(int k=0;k<3;k++)
      {
          System.out.println(" The numbers "+s[k].number);
      }
      System.out.println("Enter your seat number");
      int del=scanner.nextInt(); 
      System.out.println("Enter your old seat category (A/B/C)");
      String categremove=scanner.next();
      System.out.println("Enter the new seat category you want (A/B/C)");
      String categupdate=scanner.next();
         for(int j=0;j<3;j++)
    {   
        if(del==s[j].number)
     {
        if(update=='1')
      {
          fan1[answ-1].upgrade(s[j].number,g[0],categremove,s[j],categupdate);
      }
          else if(update=='2')
      {
         fan1[answ-1].upgrade(s[j].number,g[1],categremove,s[j],categupdate);
      }
          else if(update=='3')
      {
         fan1[answ-1].upgrade(s[j].number,g[2],categremove,s[j],categupdate);
      }
          else if(update=='4')
      {
          fan1[answ-1].upgrade(s[j].number,g[3],categremove,s[j],categupdate);
      }
    }
      
   }
  }
      
    else if(answer=='6')
    {
          break;
    }
  
    }
   
    }
    
}
/**
 * This is USER DEFINED EXCEPTION for invalid input such as incorrect number
 * @throws Invalidinput 
 * @param string a message to de displayed when exception happens
 * 
 */
class Invalidinput extends Exception
{
    public Invalidinput(String msg)
    {
        super(msg);
    }
}
/**
 * abstract game that contains information about game and seats
 * FINAL DATA MEMEBER applied here in name data field
 * ABSTRACT CLASS applied here where the game is abstract
 * Polymorphism is applied here
 * and the national game and international game classes inherited from it
 * this class contains protected and private data members
 * The access modifiers here some are private to be seen in this class
 * only and some are protected to be seen in the same package 
 */
abstract class game
{
    protected String VS;
    private  String winner;
    protected int code;
    protected int numofseatsincateg;
    protected final String name;
    protected Date date;
    private static Vector<seat> vec=new Vector<>(25);
/**
 * This is the default constructor
 */
    public game()
    {
            this.VS="";
            this.winner="";
            this.code=0; 
            this.numofseatsincateg=0;
            this.name="";
            
    }
  /**
   * parameterised constructor of game class 
   * @param VS
   * @param winner
   * @param code
   * @param numofseatsincateg
   * @param name
   * @param date 
   */ 
    public game(String VS,String winner,int code,int numofseatsincateg,String name,Date date)
    {       
            this.VS=VS;
            this.winner=winner;
            this.code=code; 
            this.numofseatsincateg=numofseatsincateg;
            this.name=name;
            this.date=date;
           
    }
/**
 * this method gets the winner
 * @return string containing the winner of each match
 */
    public String getWinner()
    {
        return winner;
    }
/**
 * this method sets the winner of the matches
 * @param winner as a string
 */
    public void setWinner(String winner)
    {
        this.winner = winner;
    }
    /**
     * This method actually reserves the seat of a certain category in certain match
     * by checking the category of the seat you want to reserve if it still exists
     * through interface availability and also takes the match you want to reserve ticket in
     * you want to reserve ticket in and increase the static number of seats when reserved
     * @param categ takes the category of the seat you want to reserve
     * @param a takes object of the certain seat you want to reserve
     * @param g takes object of the certain game you want to reserve
     */
     public void buyticket(String categ,seat a,game g)
    {  Boolean check;
       if((categ.equals("A"))||(categ.equals("a")))
       { 
           check=a.stillexist();
           if(check==true)
           {
               if(g instanceof nationalgame)
               {   a.setPrice(500);
                   vec.add(a);
                   categoryA.reservedseats++;
                   System.out.println("Ticket is reserved successfully");
               }
               else if(g instanceof internationalgame)
               {   
                   a.setPrice(1000);
                   vec.add(a);
                   categoryA.reservedseats++;
                   System.out.println("Ticket is reserved successfully");
               }
          
           }
           else
            System.out.println("All CategoryA seats for this match is sold out");
      
       } 
       else if((categ.equals("B"))||(categ.equals("b")))
       {
          check=a.stillexist();
          if(check==true)
          {
              if(g instanceof nationalgame)
               {   a.setPrice(300);
                   vec.add(a);
                   categoryB.reservedseats++;
                   System.out.println("Ticket is reserved successfully");
               }
              else if(g instanceof internationalgame)
               {   a.setPrice(800);
                   vec.add(a);
                   categoryB.reservedseats++;
                   System.out.println("Ticket is reserved successfully");
               }
             
          } 
          else
            System.out.println("All CategoryB seats for this match is sold out");
       
       }
       else if((categ.equals("C"))||(categ.equals("c")))
       {
          check=a.stillexist();
          if(check==true)
          {
          if(g instanceof nationalgame)
              {   a.setPrice(200);
                  vec.add(a);
                  categoryC.reservedseats++;
                 System.out.println("Ticket is reserved successfully");
              }
          else if(g instanceof internationalgame)
               {   a.setPrice(500);
                   vec.add(a);
                   categoryB.reservedseats++;
                   System.out.println("Ticket is reserved successfully");
               }
           
          }
          else
           System.out.println("All CategoryC seats for this match is sold out");
        
       }
      
    }
     /**
      * This method cancels the ticket reservation by checking first if 
      * this ticket is bought first then checking if the date is before
      * the match by more than three days and cancel the reservation and 
      * decrements the static counter of reserved seats in each category
      * @param num number of seat that user wants to deleted as it is unique
      * @param datex the current day to check if it is before match by 3 days or not
      * @param m the current month 
      * @param g the game that the user wants to delete his ticket from
      * @param categ the category of the seat that user wants to delete ticket from
      * @return Boolean that is used in sport fan class to check if it is actually deleted and decrement number of reserved seats for this user
      */
   public Boolean cancelticket(int num,int datex,int m,game g,String categ)
    {   Boolean check=false;
     if(vec.size()>0)
     {  for(int i=0;i<vec.size();i++)
        {  
            if(vec.elementAt(i).number==num)
            {
               int x=date.getDate();
               System.out.println(x-3);
                int y=date.getMonth();
                 System.out.println(y);
               if(m<y)
               {
                  
                   if(categ.equalsIgnoreCase("A"))
                       categoryA.reservedseats--;
                   else if(categ.equalsIgnoreCase("B"))
                       categoryB.reservedseats--;
                   else if(categ.equalsIgnoreCase("C"))
                       categoryC.reservedseats--;
                    vec.removeElementAt(i);
                    System.out.println("Done ! Reservation is cancelled");
                   check=true;
               }
               else if((m==y)&&(datex >= x-3))
               {
                   System.out.println("You cannot cancel reservation before match by 3 or less days");
                   check=false;
               }
          }
        }
     }else 
        System.out.println("There is NO reserved seat"); 
                   return check;
   }
   /**
    * OVERLOADING is applied here
    * where this method is used when user wants to update his category
    * so it cancels the old reservation and reserve a new one in same 
    * match but different seat category
    * @param num number of the old seat category 
    * @param g the game that the user wants to change seat category in
    * @param categ the old seat category that the user wants to change
    * @return boolean function used in sport fan class
    */
   public Boolean cancelticket(int num,game g,String categ)
    {  
     if(vec.size()>0)
     {  for(int i=0;i<vec.size();i++)
        {  
            if(vec.elementAt(i).number==num)
            {
                  if(categ.equalsIgnoreCase("A"))
                       categoryA.reservedseats--;
                   else if(categ.equalsIgnoreCase("B"))
                       categoryB.reservedseats--;
                   else if(categ.equalsIgnoreCase("C"))
                       categoryC.reservedseats--;
                    vec.removeElementAt(i);
                    return true;
            }
         }
        
     }else 
     {
         System.out.println("There is NO reserved seat"); 
         return false;
     }
              return false;
   }
   /**
    * This method is used for displaying the matches 
    * that are available for this season and there details 
    * at the beginning of the program so that the user can choose easily
    */
      public void display()
      {
          System.out.println("  The teams  "+VS);
          System.out.println("  The game code " +code);
          System.out.println("  The Stadium "+name);
          System.out.println("  The Date " + date);
        
      }
}
/**
 * INHERITANCE is applied here
 * where the national game is inherited from the abstract class game
 * 
 */
class nationalgame extends game
{  /**
 * Constructor that calls the constructor of the super class game
 * @param VS {@inheritDoc}
 * @param winner {@inheritDoc}
 * @param code  {@inheritDoc}
 * @param numofseatsincateg {@inheritDoc}
 * @param name {@inheritDoc}
 * @param date {@inheritDoc}
 */
    public nationalgame(String VS,String winner,int code,int numofseatsincateg,String name,Date date)
    {
       super(VS,winner,code,numofseatsincateg,name,date);
    }
    /**
     * Final STATIC METhOD is applied here
     * This methods prints out the most popular matches in the national games
     * for this season
     */
    public static final void popularmatches()
    {
        System.out.println("The most popular national match of this season is : Ahly V.S Zamalek");
    }
}
/**
 * INHERITANCE is applied here
 * where the international game is inherited from the abstract class game
 * 
 */
class internationalgame extends game
{/**
 * Constructor that calls the constructor of the super class game
 * @param VS {@inheritDoc}
 * @param winner {@inheritDoc}
 * @param code  {@inheritDoc}
 * @param numofseatsincateg {@inheritDoc}
 * @param name {@inheritDoc}
 * @param date {@inheritDoc}
 */
    public internationalgame(String VS,String winner,int code,int numofseatsincateg,String name,Date date)
    {
       super(VS,winner,code,numofseatsincateg,name,date);
    }
    /**
     * Final STATIC METhOD is applied here
     * This methods prints out the most popular matches in the international games
     * for this season
     */
    public static final void popularmatches()
    {
        System.out.println("The most popular national match of this season is : Real Madrid V.S Barcelona");
    }
   
}
/**
 * INTERFACE is applied here
 * this interface is used to check the availability of the 
 * seats in each category by checking the number of reserved 
 * seats from the total number of seats
 * 
 */
interface availability
{
    /**
     * the only method in the availability interface
     * @return boolean function if the seat still available or not
     */
    public Boolean stillexist();
}
/**
 * SINGLE RESPONSIBILITY SOLID PRINCIPLE applied here
 * where this class only cares for the seat and giving description to it.
 * Abstraction is applied here
 * Polymorphism is applied here
 * This is abstract super seat class that implements
 * availability interface so all the inherited classes
 * can implement the same interface
 * The access modifiers here are package
 */
 abstract class seat implements availability
{
    int number;
    int totalseats;
    float price;
  /**
   * Default constructor of the seat class
   */ 
    
    public seat()
    {
        this.number=0;
        this.totalseats=0;
        this. price=0;
        
    }
    /**
     * Parametrised constructor of the seat
     * @param number number of the seat that user wants to reserve 
     * @param totalseats total number of seats in this category of seats
     */
    public seat(int number,int totalseats)
    {
        this.number=number;
        this.totalseats=totalseats;
       
    }
/**
 * this method gets the price of the ticket
 * @return the price as a float number
 */
    public float getPrice() {
        return price;
    }
/**
 * This method sets the price of the ticket
 * @param price as float
 */
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * This is ABSTRACT method that describes every category of the seats
     * OVERRIDING is applied to this method in each 
     * inherited seat category
     */
public abstract void describe();
}
/**
 * STATIC DATA MEMEBER is applied here in reserved seats
 * This class inherited from seat class and it is for the
 * first category of seats
 * 
 */
class categoryA extends seat 
{
   
    protected static int reservedseats;
    /**
     * Default constructor that call the default constructor of the seat
     */
    public categoryA()
    {
        super();
    }
    /**
     * Parameterised constructor of category A seats
     * @param number {@inheritDoc}
     * @param totalseats {@inheritDoc}
     */
    public categoryA(int number,int totalseats)
    {
        super(number,totalseats);
       
    }
    /**
     * OVERRIDE METHOD is implemented here
     * as this class extends from seat class so it 
     * implements the interface as it check the number of
     * reserved seats and the total number of seats to check whether
     * it is still available to reserve or not
     * @return the return as a boolean 
     */
     @Override
    public Boolean stillexist()
    {
        if(reservedseats == totalseats)
            return false;
        else if (reservedseats < totalseats)
            return true;
        else
            return false;
   
    }
    /**
     * OVERRIDE MEthod is implemented here
     * This class gives a description about the first category seats
     */
    @Override
    public void describe()
    {
        System.out.println("The Category A seats have the best and the closest view of the match");
    }
}
/**
 * STATIC DATA MEMEBER is applied here in reserved seats
 * This class inherited from seat class and it is for the
 * second category of seats
 * 
 */
class categoryB extends seat 
{
   
    protected static int reservedseats;
     /**
     * Default constructor that call the default constructor of the seat
     */
    public categoryB()
    {
        super();
    }
    /**
     * Parameterised constructor of category B seats
     * @param number {@inheritDoc}
     * @param totalseats {@inheritDoc}
     */
    public categoryB(int number,int totalseats)
    {
        super(number,totalseats);
     
    }
    /**
     * OVERRIDE METHOD is implemented here
     * as this class extends from seat class so it 
     * implements the interface as it check the number of
     * reserved seats and the total number of seats to check whether
     * it is still available to reserve or not
     * @return the return as a boolean 
     */
    @Override
    public Boolean stillexist()
    {
        if(reservedseats == totalseats)
            return false;
        else if (reservedseats < totalseats)
            return true;
        else
            return false;
  
    }
    /**
     * OVERRIDE MEthod is implemented here
     * This class gives a description about the second category seats
     */
    @Override
    public void describe()
    {
        System.out.println("The category B seats have yet good view and not overpriced");
    }
}
/**
 * STATIC DATA MEMEBER is applied here in reserved seats
 * This class inherited from seat class and it is for the
 * second category of seats
 * 
 */
class categoryC extends seat 
{
    
    protected static int reservedseats;
    /**
     * Default constructor that call the default constructor of the seat
     */
    public categoryC()
    {
        super();
    }
     /**
     * Parameterised constructor of category C seats
     * @param number {@inheritDoc}
     * @param totalseats {@inheritDoc}
     */
    public categoryC(int number,int totalseats)
    {
        super(number,totalseats);
      
    }
     /**
     * OVERRIDE METHOD is implemented here
     * as this class extends from seat class so it 
     * implements the interface as it check the number of
     * reserved seats and the total number of seats to check whether
     * it is still available to reserve or not
     * @return the return as a boolean 
     */
     @Override
    public Boolean stillexist()
    {
        if(reservedseats == totalseats)
            return false;
        else if (reservedseats < totalseats)
            return true;
        else
            return false;
   
    }
    /**
     * OVERRIDE MEthod is implemented here
     * This class gives a description about the third category seats
     */
    @Override
    public void describe()
    {
        System.out.println("The category C seats have the best reasonable prices");
    }
}
/**
 * SINGLE RESPONSIBILITY SOLID PRINCIPLE applied here
 * where this class only cares for the user and things he can do
 * as reserving,cancelling ,update seat or making a bet.
 *CALCULATED DATA MEMBERS is applied here.
 * this class contains different access modifiers
 * this class is for the sport fan so he can reserve,
 * delete, change a seat or make a bet
 * each fan has his own name and ID and bet points he won or lost.
 *
 */
  class sportfan
{
    public int numberoftickets=0;
    private final String name;
    private int ID;
    private int betxp;
    private Vector v=new Vector();
    /**
     * Default constructor of the sport fan class
     */
     public sportfan()
     {
         
         this.name="";
         this.ID=0;
         this.betxp=0;
      
     }
     /**
      * Parametrised constructor of the sport fan
      * @param name of the sport fan
      * @param ID which is unique for every sport fan
      */
     public sportfan(String name,int ID)
     {
         this.name=name;
         this.ID=ID;
     }
    /**
     * This method allows a sport fan to reserve a ticket
     * of certain match and certain category
     * @param categ category of the seat he wants
     * @param a object from the seat he wanted as the array of seats 
     * is hard coded with the seats data in the main function
     * @param g object from the game he wanted as the array of games 
     * is hard coded with the seats data in the main function
     */
      public void buyticket(String categ,seat a,game g)
    { 
        v.add(a.number);
        numberoftickets++;
        g.buyticket(categ, a, g);
    
    }
      /**
       * CALCULATED DATA MEMEBER is applied here to bet point user gain or loose
       * This method displays all the sport fans ticket they reserved
       * Also each sport fan name and ID
       * Also the bet points he won or lost 
       * @param s 
       */
      public void display(seat[]s)
      { 
          if(numberoftickets >0)
         {
              System.out.println(name+" has reserved "+numberoftickets +" tickets ,"+ " ID is "+ID);
       
          for(int i=0;i<v.size();i++)
          {
            for(int j=0;j<3;j++)
            {if(v.elementAt(i).equals(s[j].number))
              {
                  System.out.println("The seat number is :"+s[j].number+" The seat price is :"+s[j].price);
                 
              }
          }
          }
         }
             if(betxp >0)
             {
                 System.out.println(name+" has gained from bets is :"+betxp);
             }else if(betxp < 0)
                 System.out.println(name+" has lost from bets is :"+betxp);
             
        
      }
      /**
       * This method upgrades the seat that the user wants
       * @param num number of the old seat he want to upgrade
       * @param g the match he want to upgrade the seat in
       * @param categ the old category of the seat
       * @param a object of the seat he wants to update
       * @param categupdate the new category of the seat
       */
      public void upgrade(int num,game g,String categ,seat a,String categupdate)
      {
         Boolean check=g.cancelticket(num, g, categ);
         if(check==true)
         {   for(int i=0;i<v.size();i++)
         {
             if(v.elementAt(i).equals(num))
             { 
                 v.removeElementAt(i);
                
             }
                 
         }
             g.buyticket(categupdate, a, g);
             v.add(a.number);
         }
         else
             System.out.println("There are NO reserved seats, you must reserve first");
      }
      /**
       * This method allows sport fan to cancel a ticket reservation and minimise 
       * the number of reserved tickets again also checks if the
       * seat is reserved and the date is before the match by more than 3 days
       * as it passes the information to the delete method in the game class
       * @param num number of the seat that user wants to delete
       * @param date the day
       * @param m the month
       * @param g the match that the user wants cancel his ticket from
       * @param categ the category of the seat that he wants to cancel
       */
      public void cancelticket(int num,int date,int m,game g,String categ)
    {
     Boolean check=g.cancelticket(num, date,m,g, categ);
     if(check==true)
     { 
         for(int i=0;i<v.size();i++)
         {
             if(v.elementAt(i).equals(num))
             { 
                 v.removeElementAt(i);
                 numberoftickets--;
             }
                 
         }
     }
 }
      /**
       * Calculated data member is applied here
       * This class takes the amount of money that user wants to
       * make a bet with and if he won the bet his money is duplicated
       * else his money will be lost on him
       * @param g the match that user want to make a bet in
       * @param win the suggestion that the user think who will win the match
       * @param betprice the money that the user make a bet on
       */
 public void makebet(game g,String win,String betprice)
 {
    String x=g.getWinner();
    int a=Integer.valueOf(betprice);
    if(x.equalsIgnoreCase(win))
    {
         betxp+=a+a;
        System.out.println("Congratulations ! You now have "+betxp );
    }
    else
    {  
        System.out.println("You lost "+ betprice);
        betxp-=a;
    }
 }
 
   }
