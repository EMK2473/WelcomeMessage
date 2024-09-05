package WelcomeMessage;

import java.util.Scanner;

public class WelcomeMessage {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
   
      userName = scnr.next();
      System.out.println("Hey " + userName + "!");
      System.out.println("Welcome to zyBooks!");
      
      scnr.close();
   }
}
