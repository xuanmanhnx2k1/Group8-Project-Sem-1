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
            // showAllAccount();
            // update();
            insertAcc();


                
            
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
    public static void insertAcc(){
        try {
            AccountBL abl = new AccountBL();
            abl.createAccount(inputAcc());
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    public static Account inputAcc(){
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("Acc_Id: ");
        account.setAccId(sc.nextInt());
        System.out.print("Full_Name: ");
        account.setFullName(sc.nextLine());
        System.out.print("Gender: ");
        account.setGender(sc.nextInt());
        System.out.print("Address: ");
        account.setAddress(sc.nextLine());
        System.out.print("Phone_Number: ");
        account.setPhoneNumber(sc.nextLine());
        System.out.print("Email: ");
        account.setEmail(sc.nextLine());
        System.out.print("Birth_Date: ");
        account.setBirthDate(sc.nextLine());
        System.out.print("Acc_Status: ");
        account.setAccStatus(sc.nextInt());
        System.out.print("Position: ");
        account.setPosition(sc.nextInt());
        System.out.print("User_Name: ");
        account.setUserName(sc.nextLine());
        System.out.print("User_Password: ");
        account.setPassword(sc.nextLine());

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
    private static void showAllAccount() {
        System.out.println("Account list:");
        List<Account> lst = new AccountBL().getAllAccount();
        try {
            for (Account account : lst) {
                // System.out.println("===================================================================================================");
                // System.out.println("Group-08");
                // System.out.println("===================================================================================================");
                // System.out.println("Account list");
                // System.out.println("===================================================================================================");
                // System.out.println("| %-5d | %-10d | %-10d | %-10d | %-10d | %-10d | %-10d | %-10d | %-10d | %-10d |", );
                System.out.println(account);
            }
        } catch (Exception e) {
            System.out.println("erroe" +e);
        }
        
    }
    
    


}
