package dev.manhnx;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dev.manhnx.bl.AccountBL;
import dev.manhnx.bl.CafeBL;
import dev.manhnx.dal.ConnectionDB;
import dev.manhnx.persistance.Account;
import dev.manhnx.persistance.Cafe;
import dev.manhnx.ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        try (Connection con = ConnectionDB.getConnection();) {
            System.out.println("connect to mysql server");
            String choice;
            Scanner sc = new Scanner(System.in);
            while (true) {
            //     Menu.MenuAcc();
            //     System.out.println("Enter the selection");
            //     choice = sc.nextLine();
            //     switch (choice) {
            //         case "0":
            //             System.exit(0);
            //         case "1":
            //             AccountBL.insertAcc();
            //             break;
            //         case "2":
            //             AccountBL.update();
            //             break;
            //         case "3":
            //             AccountBL.showAllAccount();
            //             break;

            //         default:
            //         System.out.println("Syntax error");
            //             break;
            //     }
            // }
                Menu.MenuCafe();
                System.out.println("Enter the selection");
                choice = sc.nextLine();
                switch (choice) {
                    case "0":
                        System.exit(0);
                    case "1":
                        CafeBL.insertCafe();
                        break;
                    case "2":
                        CafeBL.showCafeById();
                        break;
                    case "3":
                        
                        break;

                    default:
                    System.out.println("Syntax error");
                        break;
                }
            }

        } catch (SQLException e) {
            System.out.println("connect error" + e);
        }
    }

    

    // private static void showAllAccount() throws SQLException {
    // AccountBL abl = new AccountBL();
    // abl.getAllAccount();

    // }

    
    }
