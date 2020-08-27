package dev.manhnx.bl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dev.manhnx.dal.CafeDAL;
import dev.manhnx.persistance.Cafe;

public class CafeBL {
    private CafeDAL cafeDAL = new CafeDAL();

    public List<Cafe> getALLCafe() {
        return cafeDAL.getALL();
    }

    public boolean addCafe(Cafe cafe) {
        return cafeDAL.insertCafe(cafe);
    }

    // public List<Cafe> getbyId() {
    //     return cafeDAL.getId();
    // }

	
	public static void insertCafe() {
        CafeBL cbl = new CafeBL();
        System.out.println("Insert new Cafe:");
        try {
            cbl.addCafe(inputCafe());
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
        return cafe;
    }
    public static void showCafeById() {

        CafeBL cbl = new CafeBL();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Cafe> lst = CafeDAL.getId(id);
        try {
 
                System.out.println("================================================================================================================================================================================================");;
                System.out.println("Group-08");
                System.out.println("================================================================================================================================================================================================");
                System.out.println("Cafe list");
                System.out.println("================================================================================================================================================================================================");
                System.out.printf("| %-6s | %-10s | %-10s | %-15s | %-11s | \n", "CafeId", "Cafe Name", "Cafe Price", "Cafe Available", "Cafe Status"); 
                System.out.println("================================================================================================================================================================================================");
            for (Cafe cafe : lst) {
                System.out.printf(
                    "| %-6s | %-10s | %-10s | %-15s | %-11s | \n",
                    cafe.getCafeId(), cafe.getCafeName(), cafe.getCafePrice(), cafe.getCafeAvailable(), cafe.getCafeStatus());
                System.out.println("=================================================================================================================================================================================================");

            }
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("erroe" +e);
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