package dev.manhnx.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.manhnx.persistance.Cafe;

public class CafeDAL {
    public Cafe getId(int cafeId) throws SQLException {
        Cafe cafe = null;
        try(Connection con = ConnectionDB.getConnection()){
            PreparedStatement pstm = con.prepareStatement("select*from Cafe where Cafe_Id =?;");
            pstm.setInt(1, cafeId);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                cafe = getCafe(rs);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return cafe;
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
            
            System.out.println("erroe"+e );
        }
		return lst;
	}

	public boolean insertCafe(Cafe cafe) {
		return false;
	}
}