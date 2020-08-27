package dev.manhnx.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.manhnx.persistance.Cafe;

public class CafeDAL {
    public static List<Cafe> getId(int id) {
        // Cafe cafe = new Cafe();
        List<Cafe> lid = new ArrayList<>();
        try (Connection con = ConnectionDB.getConnection()) {
            // PreparedStatement pstm = con.prepareStatement("select*from Cafe where Cafe_Id =" + id + ";");
            PreparedStatement pstm = con.prepareStatement("select*from Cafe where Cafe_Id = ?;");
            // pstm.setInt(1, cafe.getCafeId());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                lid.add(getCafeById(rs));
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return lid;
    }

    private static Cafe getCafeById(ResultSet rs) throws SQLException {
        Cafe cafeid = new Cafe();
        cafeid.setCafeId(rs.getInt("Cafe_Id"));
        cafeid.setCafeName(rs.getString("Cafe_Name"));
        cafeid.setCafePrice(rs.getDouble("Cafe_Price"));
        cafeid.setCafeAvailable(rs.getInt("Cafe_Available"));
        cafeid.setCafeStatus(rs.getInt("Cafe_Status"));
        return cafeid;
    }
    

    private Cafe getCafe(ResultSet rs) throws SQLException {
        Cafe cafe = new Cafe();
        cafe.setCafeId(rs.getInt("Cafe_Id"));
        cafe.setCafeName(rs.getString("Cafe_Name"));
        cafe.setCafePrice(rs.getDouble("Cafe_Price"));
        cafe.setCafeAvailable(rs.getInt("Cafe_Available"));
        cafe.setCafeStatus(rs.getInt("Cafe_Status"));
        return cafe;
    }

    public List<Cafe> getALL() {
        String sql = "select*from Cafe";
        List<Cafe> lst = new ArrayList<>();
        try {
            Connection con = ConnectionDB.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(getCafe(rs));

            }
        } catch (Exception e) {

            System.out.println("erroe" + e);
        }
        return lst;
    }

    public boolean insertCafe(Cafe cafe) {
        try {
            String sql = "INSERT INTO Cafe VALUES (?, ?, ?, ?, ?)";
            Connection con = ConnectionDB.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, cafe.getCafeId());
            pstm.setString(2, cafe.getCafeName());
            pstm.setDouble(3, cafe.getCafePrice());
            pstm.setInt(4, cafe.getCafeAvailable());
            pstm.setInt(5, cafe.getCafeStatus());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("errer" + e);
        }
        return false;
    }
}