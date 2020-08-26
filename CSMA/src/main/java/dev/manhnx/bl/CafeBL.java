package dev.manhnx.bl;

import java.sql.SQLException;
import java.util.List;

import dev.manhnx.dal.CafeDAL;
import dev.manhnx.persistance.Cafe;

public class CafeBL {
    private CafeDAL cafeDAL = new CafeDAL();

    public List<Cafe> getALLCafe() {
        return cafeDAL.getALL();
    }

    public boolean addCafe(Cafe cafe) {
        return cafeDAL.insertCafe(cafe);
    }

    public Cafe getbyId(int cafeId) throws SQLException {
        return cafeDAL.getId(cafeId);
    }

	public void getbyId(Cafe id) {
	}
	

	
}