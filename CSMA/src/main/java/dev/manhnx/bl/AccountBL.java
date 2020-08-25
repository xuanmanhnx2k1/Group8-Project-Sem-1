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
    
    
}