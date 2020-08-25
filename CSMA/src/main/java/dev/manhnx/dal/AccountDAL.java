package dev.manhnx.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.manhnx.persistance.Account;

public class AccountDAL {
    public List<Account> getAll(){
        String sql = "select*from Account";
        List<Account> lst = new ArrayList<>();
        try {
            Connection con = ConnectionDB.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(getAccount(rs));
                
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return lst;

    }
    private Account getAccount(ResultSet rs) throws SQLException{
        Account account = new Account();
        account.setAccId(rs.getInt("Account Id:"));
        account.setUserName(rs.getString("UserName:"));
        account.setPassword(rs.getString("Password:"));
        account.setEmail(rs.getString("Email:"));
        account.setPosition(rs.getInt("Position:"));
        return account;
    }
    // public int insertAccount(Account account){
    //     int re
    // }
}