package dev.manhnx.bl;

import java.sql.SQLException;
import java.util.List;

import dev.manhnx.dal.AccountDAL;
import dev.manhnx.persistance.Account;

public class AccountBL {
    private AccountDAL dal = new AccountDAL();
    public List<Account> getAllAccount(){
        return dal.getAll();
    }
    public boolean changePass(Account account) throws SQLException {
        return dal.updateAcc(account);

    }

    // public void getAllAccount() throws SQLException {
    //      AccountDAL.getAll();
    // }
    public boolean createAccount(Account accoount){
        return dal.insertAccount(accoount);
    }
    public static void showAllAccount() {
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