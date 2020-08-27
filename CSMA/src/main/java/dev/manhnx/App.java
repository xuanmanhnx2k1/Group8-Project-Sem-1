package dev.manhnx;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dev.manhnx.bl.AccountBL;
import dev.manhnx.bl.CafeBL;
import dev.manhnx.dal.ConnectionDB;
import dev.manhnx.persistance.Account;
import dev.manhnx.persistance.Cafe;
import dev.manhnx.ui.AccountUI;
import dev.manhnx.ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            // while (true) {
            //     cls(); 
            //     AccountBL accountbl = new AccountBL();
            //     AccountUI  accountui = new  AccountUI();
            //     String username;
            //     String password;
            //     System.out.println("==================================|");
            //     System.out.println("|          [CSMA] Group-8         |");
            //     System.out.println("|=================================|");
            //     System.out.println("|--------Login Coffee Shop--------|");
            //     System.out.println("|=================================|");
            //     System.out.print("USERNAME : ");
            //     username = input();      
            //     System.out.print("PASSWORD : "); 
            //     password = input();
            //     int check = accountbl.login_check(username,password);
            //     if (check == -1) {
            //                         System.out.println("Account or password is not correct!");
            //                         System.out.printf("Accept %s to continue:", "Enter");
            //                         String nh = sc.nextLine();                
            //     } else if (check == 1) {
            //                         accountui.Menu_Admin(check);
            //      } else {
            //                         accountui.Menu_Staff(check);
                    
            //                     }
                
            // }
        try (Connection con = ConnectionDB.getConnection();) {
            System.out.println("connect to mysql server");
            String choice;
            
            // Scanner sc = new Scanner(System.in);
            while (true) {
                Menu.MenuAcc();
                System.out.println("Enter the selection");
                choice = sc.nextLine();
                switch (choice) {
                case "0":
                System.exit(0);
                case "1":
                AccountBL.insertAcc();
                break;
                case "2":
                AccountBL.update();
                break;
                case "3":
                AccountBL.showAllAccount();
                break;

                default:
                System.out.println("Syntax error");
                break;
                }
                }
            }
        //         Menu.MenuCafe();
        //         System.out.println("Enter the selection");
        //         choice = sc.nextLine();
        //         switch (choice) {
        //             case "0":
        //                 System.exit(0);
        //             case "1":
        //                 CafeBL.insertCafe();
        //                 break;
        //             case "2":
        //                 CafeBL.showCafeById();
        //                 break;
        //             case "3":

        //                 break;

        //             default:
        //                 System.out.println("Syntax error");
        //                 break;
        //         }
        //     }

        // } catch (SQLException e) {
        //     System.out.println("connect error" + e);
        // }
    }

    private static String input() {
        final Scanner input = new Scanner(System.in);
        String ch;
        while (true) {
            ch = input.nextLine();
            if (ch.trim().compareTo("") == 0) {
                System.out.print(" Nhap sai,moi nhap lai: ");

            } else {
                return ch.trim();
            }
        }

    }

    public static void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ignored) {
        }
    }

    // private static void showAllAccount() throws SQLException {
    // AccountBL abl = new AccountBL();
    // abl.getAllAccount();

    // }

}
