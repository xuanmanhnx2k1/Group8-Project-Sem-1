package dev.manhnx.ui;

import java.io.IOException;
import java.util.Scanner;
import dev.manhnx.ui.*;
import dev.manhnx.bl.AccountBL;
import dev.manhnx.dal.AccountDAL;

public class AccountUI {
                    static Scanner sc = new Scanner(System.in);

                    public static void Menu_Admin(int id){
                        boolean back = true;
                        while (back) {
                            cls();
                        System.out.println("=============================");
                        System.out.println("|           Group-8         |");
                        System.out.println("=============================");
                        System.out.println("|          Menu Admin       |");
                        System.out.println("=============================");
                        System.out.println("|1.Manager Staff            |");
                        System.out.println("|2.Manager Cafe             |");
                        System.out.println("|3.Manager Order            |");
                        System.out.println("|4.Logout                   |");
                        System.out.println("|5.Exit                     |");
                        System.out.println("=============================");
                        System.out.print("   --> Enter your choice: ");
                        String chose = sc.nextLine();
                        switch (chose) {
                            case "1":
                            cls();
                            // AccountBL.showAccountById(id);
                            // AccountBL.inputInfoUpdateById(id);
                            break;
                            case "2":
                                cls();
                            // manage_staff_menu();
                                break;
                            case "3":
                                cls();
                                // productsUI.admin_products_menu();
                                break;
                            case "5":
                                back = false;
                                break;
                            case "0":
                                System.exit(0);
                            default:
                                System.out.printf("Khong hop le,Nhan %s de quay lai:", "Enter");
                                String nh = sc.nextLine();
                        }
                }
      }
      public static void Menu_Staff(int id){
                    System.out.println("=============================");
                    System.out.println("|           Group-8         |");
                    System.out.println("=============================");
                    System.out.println("|          Menu Staff       |");
                    System.out.println("=============================");
                    System.out.println("|1.Manager Product          |");
                    System.out.println("|2.Manager Order            |");
                    System.out.println("|3.Logout                   |");
                    System.out.println("|4.Exit                     |");
                    System.out.println("=============================");
                }

      private static void cls() {
      }
}