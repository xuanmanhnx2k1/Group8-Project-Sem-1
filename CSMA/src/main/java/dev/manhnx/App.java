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

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = ConnectionDB.getConnection();
            System.out.println("connect to mysql server");
            // insertCafe();
            // insertCafe();

            // showAllCafe();
            showAllAccount();


                
            
        } catch (SQLException e) {
            System.out.println("connect error" +e);
        }
    }
    
    public static void showAllCafe(){
        CafeBL cbl = new CafeBL();
        System.out.println("Cafe list:");
        List<Cafe> lst = cbl.getALL();
        for(Cafe cafe : lst){
            System.out.println(cafe);
        }
    }
    public static void insertCafe(){
        CafeBL cbl = new CafeBL();
        System.out.println("Insert new Cafe:");
         if (cbl.addCafe(inputCafe())) {
                System.out.println("Insert complete");
             
         }else{
             System.out.println("Insert failed");
         }
    }
    public static Cafe inputCafe() {
        Cafe cafe = new Cafe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cafe Name: ");
        cafe.setCafeName(sc.nextLine());
        System.out.print("Cafe Price:");
        cafe.setCafePrice(sc.nextDouble());
        System.out.print("Amount: ");
        cafe.setAmount(sc.nextInt());
        sc.close();
        return cafe;
    }
    private static void showAllAccount() throws SQLException {
        AccountBL abl = new AccountBL();
        abl.getAllAccount();
        
    }


}
