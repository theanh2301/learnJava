package DataAccessLayer;

import model.TaiKhoan;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaiKhoanDAL {
    private String query;
    private ResultSet resultSet;

    public TaiKhoan getTaiKhoanByName(String tenKhachHang) throws SQLException {
        query = "Select tenKhachHang, tenTaiKhoan, matKhau  From TaiKhoan Where tenKhachHang = '" + tenKhachHang + "';";

        DAL.getConnection();
        resultSet = DAL.execQuery(query);

        TaiKhoan taiKhoan = null;
        while (resultSet.next()) {
            taiKhoan = getTaiKhoanInfo(resultSet);
        }

        DAL.closeConnection();

        return taiKhoan;
    }

    private TaiKhoan getTaiKhoanInfo(ResultSet resultSet) throws SQLException {
        TaiKhoan taiKhoan = new TaiKhoan();

        taiKhoan.setTenKhachHang(resultSet.getString("tenKhachHang"));
        taiKhoan.setTenTaiKhoan(resultSet.getString("tenTaiKhoan"));
        taiKhoan.setMatKhau((resultSet.getString("matKhau")));

        return taiKhoan;
    }

    public TaiKhoan getTable() throws SQLException {
        query = "Select * From TaiKhoan";

        DAL.getConnection();
        resultSet = DAL.execQuery(query);

        TaiKhoan taiKhoan = null;
        while (resultSet.next()) {
            taiKhoan = getTaiKhoanInfo(resultSet);
        }

        DAL.closeConnection();

        return taiKhoan;

    }
}
