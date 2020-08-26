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

            showAllCafe();
            // showAllAccount();
            // update();
            // insertAcc();


                
            
        } catch (SQLException e) {
            System.out.println("connect error" +e);
        }
    }
    
    public static void showAllCafe(){
        CafeBL cbl = new CafeBL();
        List<Cafe> lst = cbl.getALLCafe();
        try {
 
            System.out.println("===========================================================================================================");;
            System.out.println("Group-08");
            System.out.println("===========================================================================================================");
            System.out.println("Cafe list");
            System.out.println("===========================================================================================================");
            System.out.printf("| %-6s | %-20s | %-10s | %-15s | %-12s | \n", "CafeId", "Cafename", "Price", "Available", "Status"); 
            System.out.println("===========================================================================================================");
            try {
                for (Cafe cafe : lst) {
                    System.out.printf(
                        "| %-6s | %-20s | %-10s | %-15s | %-12s | \n",
                        cafe.getCafeId(), cafe.getCafeName(), cafe.getCafePrice(), cafe.getCafeAvailable(), cafe.getCafeStatus());
                    
                }
            } catch (Exception e) {
                System.out.println("erroor"+ e);
            }
    } catch (Exception e) {
        System.out.println("erroe" +e);
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
        AccountBL abl = new AccountBL();
        List<Account> lst = new AccountBL().getAllAccount();
        try {
 
                System.out.println("================================================================================================================================================================================================");;
                System.out.println("Group-08");
                System.out.println("================================================================================================================================================================================================");
                System.out.println("Account list");
                System.out.println("================================================================================================================================================================================================");
                System.out.printf("| %-5s | %-20s | %-6s | %-30s | %-11s | %-30s | %-20s | %-6s | %-10s | %-10s | %-10s | \n", "AccId", "Fullname", "Gender", "Address", "Phone", "Email", "Birthdate", "Status", "Position", "Username", "Userpassword"); 
                System.out.println("================================================================================================================================================================================================");
            for (Account account : lst) {
                System.out.printf(
                    "| %-5s | %-20s | %-6s | %-30s | %-11s | %-30s | %-20s | %-6s | %-10s | %-10s | %-10s |  \n",
                    account.getAccId(), account.getFullName(), account.getGender(), account.getAddress(), account.getPhonNumber(), account.getEmail(), account.getBirthDate(), account.getAccStatus(), account.getPosition(), account.getUserName(), account.getPassword());
                
            }
        } catch (Exception e) {
            System.out.println("erroe" +e);
        }
        
    }
    
    


}
