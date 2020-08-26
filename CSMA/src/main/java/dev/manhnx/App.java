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

            // showAllCafe();
        //    AccountBL.showAllAccount();
            // update();
            insertAcc();
            

                
            
        } catch (SQLException e) {
            System.out.println("connect error" +e);
        }
    }
    
    

    
    
        
    
    public static void insertCafe(){
        CafeBL cbl = new CafeBL();
        System.out.println("Insert new Cafe:");
         try {
            cbl.addCafe(inputCafe());
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    public static Cafe inputCafe() {
        Cafe cafe = new Cafe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cafe Id: ");
        cafe.setCafeId(sc.nextInt());
        System.out.print("Cafe Name: ");
        cafe.setCafeName(sc.nextLine());
        System.out.print("Cafe Price:"); 
        cafe.setCafePrice(sc.nextDouble());
        System.out.print("Available: : ");
        cafe.setCafeAvailable(sc.nextInt());
        sc.close();
        return cafe;
    }
    public static void insertAcc(){
        try {
            AccountBL abl = new AccountBL();
            abl.createAccount(inputAcc());
        } catch (Exception e) {
           System.out.println("error"+e);
        }

    }
    public static Account inputAcc(){
        Account account = new Account();
        
        System.out.print("Acc_Id: ");
        account.setAccId(InputInt());
        System.out.print("Full_Name: ");
        account.setFullName(InputString());
        System.out.print("Gender: ");
        account.setGender(InputInt());
        System.out.print("Address: ");
        account.setAddress(InputString());
        System.out.print("Phone_Number: ");
        account.setPhoneNumber(InputString());
        System.out.print("Email: ");
        account.setEmail(InputString());
        System.out.print("Birth_Date: ");
        account.setBirthDate(InputString());
        System.out.print("Acc_Status: ");
        account.setAccStatus(InputInt());
        System.out.print("Position: ");
        account.setPosition(InputInt());
        System.out.print("User_Name: ");
        account.setUserName(InputString());
        System.out.print("User_Password: ");
        account.setPassword(InputString());
        
        return account;

    }
    
    private static void update() throws SQLException {
        AccountBL abl = new AccountBL();
       try {
        abl.changePass(inputInfo());
        System.out.println("update complete");
       } catch (Exception e) {
           System.out.println("error"+e);
       }
    }
    public static Account inputInfo(){
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("New_Password: ");
        account.setPassword(sc.nextLine());
        System.out.print("Acc_Id: ");
        account.setAccId(sc.nextInt());
        
        sc.close();
        return account;
    }
    // private static void showAllAccount() throws SQLException {
    //     AccountBL abl = new AccountBL();
    //     abl.getAllAccount();
        
    // }
   
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
