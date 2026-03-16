package com.printdrawingsearch.controllers;

import java.util.Scanner;

public class PressEnter {

    private static final Scanner scanner = new Scanner(System.in);


  public static void waitToContinue(){
      System.out.println("/nPress {Enter} to continue....");
      scanner.nextLine();
  }

 public static void waitToContinue(String message){
     System.out.println(message);
     scanner.nextLine();

 }


}
