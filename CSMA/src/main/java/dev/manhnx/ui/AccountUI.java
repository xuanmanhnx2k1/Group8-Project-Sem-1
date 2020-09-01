package dev.manhnx.ui;

import java.io.IOException;
import java.util.Scanner;
import dev.manhnx.ui.*;
import dev.manhnx.bl.AccountBL;
import dev.manhnx.bl.CafeBL;
import dev.manhnx.bl.OrderBL;
import dev.manhnx.dal.AccountDAL;

public class AccountUI {
    static Scanner sc = new Scanner(System.in);

    public static void Menu_Admin(int id) {
        boolean back = true;
        while (back) {
            cls();
            Menu.MenuAdmin();
            String chose = sc.nextLine();

            switch (chose) {
                case "1":
                    cls();
                    while (true) {
                        Menu.MenuManageStaff();
                        System.out.print("Enter the selection: ");
                        chose = sc.nextLine();
                        if (chose.equals("0") == true) {
                            break;
                        } else {
                            switch (chose) {
                                case "1":
                                    AccountBL.insertAcc();
                                    break;
                                case "2":
                                    AccountBL.update();
                                    break;
                                case "3":
                                    AccountBL.showAllAccount();
                                    break;
                                case "0":
                                    System.exit(0);
                            }
                        }

                    }
                    break;
                case "2":
                    cls();
                    while (true) {
                        Menu.MenuManageCafe();
                        ;
                        System.out.print("Enter the selection: ");
                        chose = sc.nextLine();
                        if (chose.equals("0") == true) {
                            break;
                        } else {
                            switch (chose) {
                                case "1":
                                    CafeBL.insertCafe();
                                    break;
                                case "2":
                                    CafeBL.updateCafe();
                                    break;
                                case "3":
                                    CafeBL.showAllCafe();
                                    break;
                                case "4":
                                    CafeBL.showCafeById();
                                    break;
                                case "0":
                                    System.exit(0);
                            }
                        }

                    }
                    // manage_staff_menu();
                    break;
                case "3":
                    cls();
                    while (true) {
                        Menu.MenuManageOrder();
                        System.out.print("Enter the selection: ");
                        chose = sc.nextLine();
                        if (chose.equals("0") == true) {
                            break;
                        } else {
                            switch (chose) {
                                case "1":
                                    OrderBL.showCafeById();
                                    break;
                                case "2":

                                    break;
                                case "0":
                                    System.exit(0);

                            }
                        }

                    }
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

    public static void Menu_Staff(int id) {
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