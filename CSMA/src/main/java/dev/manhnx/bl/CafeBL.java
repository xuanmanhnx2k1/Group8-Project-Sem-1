package dev.manhnx.bl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dev.manhnx.dal.CafeDAL;
import dev.manhnx.persistance.Cafe;

public class CafeBL {
    private static CafeDAL cafeDAL = new CafeDAL();

    public List<Cafe> getALLCafe() {
        return cafeDAL.getALL();
    }

    public boolean addCafe(Cafe cafe) {
        return cafeDAL.insertCafe(cafe);
    }

    // public List<Cafe> getbyId() {
    // return cafeDAL.getId();
    // }

    public static void insertCafe() {
        Scanner sc = new Scanner(System.in);
        CafeBL cbl = new CafeBL();
        System.out.println("Insert new Cafe:");
        try {
            cbl.addCafe(inputCafe());
            System.out.println("Insert complete");
            System.out.println("Press enter to back!");
            sc.nextLine();
            
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public static Cafe inputCafe() {
        Cafe cafe = new Cafe();
        System.out.print("Cafe Id: ");
        cafe.setCafeId(InputInt());
        System.out.print("Cafe Name: ");
        cafe.setCafeName(InputString());
        System.out.print("Cafe Price:");
        cafe.setCafePrice(InputDouble());
        System.out.print("Available: : ");
        cafe.setCafeAvailable(InputInt());
        System.out.println("Cafe Status: ");
        cafe.setCafeStatus(InputInt());
        return cafe;
    }

    public static void updateCafe() {
        // AccountBL abl = new AccountBL();
        Scanner sc = new Scanner(System.in);
        try {
            cafeDAL.updateCafe(inputCafeInfo());
            System.out.println("update complete");
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        System.out.println("Press enter to back!");
        sc.nextLine();

    }

    public static Cafe inputCafeInfo() {
        Cafe cafe = new Cafe();
        System.out.print("Cafe_Id: ");
        cafe.setCafeId(InputInt());
        System.out.print("New Cafe_Name: ");
        cafe.setCafeName(InputString());
        System.out.print("New Cafe_Price: ");
        cafe.setCafeAvailable(InputInt());
        System.out.print("New Cafe_Available: ");
        cafe.setCafeAvailable(InputInt());
        System.out.print("New Cafe_Status: ");
        cafe.setCafeStatus(InputInt());
        
        return cafe;
    }

    public static void showCafeById() {

        CafeBL cbl = new CafeBL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Cafe> lst = CafeDAL.getId(id);
        try {

            System.out.println("|==============================================================================|");
            System.out.println("|                            [CSMA] Group-08                                   |");
            System.out.println("|==============================================================================|");
            System.out.println("|                                Cafe list                                     |");
            System.out.println("|==============================================================================|");
            System.out.printf("| %-7s | %-20s | %-10s | %-15s | %-12s | \n", "Cafe Id", "Cafe Name", "Cafe Price",
                    "Cafe Available", "Cafe Status");
            System.out.println("|==============================================================================|");
            for (Cafe cafe : lst) {
                System.out.printf("| %-7s | %-20s | %-10s | %-15s | %-12s | \n", cafe.getCafeId(), cafe.getCafeName(),
                        cafe.getCafePrice(), cafe.getCafeAvailable(), cafe.getCafeStatus());
                System.out.println("|==============================================================================|");


            }
            System.out.println("Press enter to back");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("erroe" + e);
        }

    }

    public static void showAllCafe() {
        CafeBL cbl = new CafeBL();
        Scanner sc = new Scanner(System.in);
        List<Cafe> lst = new CafeDAL().getALL();
        try {

            System.out.println("|==============================================================================|");
            System.out.println("|                            [CSMA] Group-08                                   |");
            System.out.println("|==============================================================================|");
            System.out.println("|                                Cafe list                                     |");
            System.out.println("|==============================================================================|");
            System.out.printf("| %-7s | %-20s | %-10s | %-15s | %-12s | \n", "Cafe Id", "Cafe Name", "Cafe Price",
                    "Cafe Available", "Cafe Status");
            System.out.println("|==============================================================================|");
            for (Cafe cafe : lst) {
                System.out.printf("| %-7s | %-20s | %-10s | %-15s | %-12s | \n", cafe.getCafeId(), cafe.getCafeName(),
                        cafe.getCafePrice(), cafe.getCafeAvailable(), cafe.getCafeStatus());
                System.out.println("|==============================================================================|");

            }
            System.out.println("Press enter to back!");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("erroe" + e);
        }

    }

    public static String InputString() {
        Scanner scanner = new Scanner(System.in);
        String x;
        return x = scanner.nextLine();

    }

    public static int InputInt() {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        return y;

    }

    public static Double InputDouble() {
        Scanner scanner = new Scanner(System.in);
        double z = scanner.nextDouble();
        return z;

    }

}