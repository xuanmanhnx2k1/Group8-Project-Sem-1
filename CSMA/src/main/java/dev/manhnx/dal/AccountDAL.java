package dev.manhnx.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import dev.manhnx.persistance.Account;

public class AccountDAL {
    public List<Account> getAll() {
        String sql = "select*from Account";
        List<Account> lst = new ArrayList<Account>();
        try {
            Connection con = ConnectionDB.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lst.add(getAccount(rs));
            }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        return lst;
    }
    // public static void getAll()throws SQLException{
    // String sql = "select*from Account";

    // Connection con = ConnectionDB.getConnection();
    // PreparedStatement pstm = con.prepareStatement(sql);
    // ResultSet rs = pstm.executeQuery();
    // while (rs.next()) {
    // System.out.println("Account_Id: "+ rs.getInt("Acc_Id"));
    // System.out.println("Full_Name: "+rs.getString("Full_Name"));
    // System.out.println("Gender: "+rs.getInt("Gender"));
    // System.out.println("Address: "+rs.getString("Address"));
    // System.out.println("Phone_Number: "+rs.getString("Phone_Number"));
    // System.out.println("Email: "+rs.getString("Email"));
    // System.out.println("Birth_Date: "+rs.getDate("Birth_Date"));
    // System.out.println("Acc_Status: "+rs.getInt("Acc_Status"));
    // System.out.println("Position: "+rs.getInt("Position"));
    // System.out.println("User_Name: "+rs.getString("User_Name"));
    // System.out.println("Password: "+rs.getString("User_Password"));
    // }
    // public static Account getAll(Account account) throws SQLException{
    // String sql = "select*from Account";

    // Connection con = ConnectionDB.getConnection();
    // PreparedStatement pstm = con.prepareStatement(sql);
    // ResultSet rs = pstm.executeQuery();
    // while (rs.next()) {
    // account = getAccount(rs);
    // }
    // return account;

    // }

    private  Account getAccount(ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setAccId(rs.getInt("Acc_Id"));
        account.setUserName(rs.getString("User_Name"));
        account.setPassword(rs.getString("User_Password"));
        account.setEmail(rs.getString("Email"));
        account.setPosition(rs.getInt("Position"));
        account.setAddress(rs.getString("Address"));
        account.setBirthDate(rs.getDate("Birth_Date"));
        account.setFullName(rs.getString("Full_Name"));
        account.setPhoneNumber(rs.getString("Phone_Number"));
        account.setGender(rs.getInt("Gender"));
        account.setAccStatus(rs.getInt("Acc_Status"));

        return account;
    }
}

// public int insertAccount(Account account){
// int re
// }
