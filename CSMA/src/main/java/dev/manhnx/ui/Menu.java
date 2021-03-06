package dev.manhnx.ui;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Menu {
    public static void MenuManageStaff() {
        System.out.println("|============================|");
        System.out.println("|       [CSMA] Group-8       |");
        System.out.println("|============================|");
        System.out.println("|        Manage Staff        |");
        System.out.println("|============================|");
        System.out.println("|1. Create Account           |");
        System.out.println("|2. Update Account           |");
        System.out.println("|3. View Profile             |");
        System.out.println("|0. Exit                     |");
        System.out.println("|============================|");
    }

    public static void MenuManageCafe() {
        System.out.println("|============================|");
        System.out.println("|        [CSMA] Group-8      |");
        System.out.println("|============================|");
        System.out.println("|        Manage Cafe         |");
        System.out.println("|============================|");
        System.out.println("|1. Insert Cafe              |");
        System.out.println("|2. Update Cafe              |");
        System.out.println("|3. View Cafe                |");
        System.out.println("|4. Search Cafe              |");
        System.out.println("|0. Exit                     |");
        System.out.println("|============================|");
    }

    public static void MenuManageOrder() {
        System.out.println("|============================|");
        System.out.println("|        [CSMA] Group-8      |");
        System.out.println("|============================|");
        System.out.println("|        Manage Order        |");
        System.out.println("|============================|");
        System.out.println("|1. View and Search Bill     |");
        System.out.println("|2. Revenue                  |");
        System.out.println("|0. Exit                     |");
        System.out.println("|============================|");
    }

    public static void MenuAdmin() {
        System.out.println("|============================|");
        System.out.println("|           Group-8          |");
        System.out.println("|============================|");
        System.out.println("|          Menu Admin        |");
        System.out.println("|============================|");
        System.out.println("|1.Manager Staff             |");
        System.out.println("|2.Manager Cafe              |");
        System.out.println("|3.Manager Order             |");
        System.out.println("|4.Logout                    |");
        System.out.println("|5.Exit                      |");
        System.out.println("|============================|");
        System.out.print("   --> Enter your choice: ");
    }
}