package BusinessLogicLayer;

import DataAccessLayer.TaiKhoanDAL;
import model.TaiKhoan;

import java.sql.SQLException;
import java.util.Scanner;

public class TaiKhoanBLL {

    Scanner sc = new Scanner(System.in);
    TaiKhoanDAL taiKhoanDAL = new TaiKhoanDAL();

    public TaiKhoan getTaiKhoanByName(String tenKhachHang) throws SQLException {
        return taiKhoanDAL.getTaiKhoanByName(tenKhachHang);
    }

    public void kiemTraTaiKhoan(TaiKhoan taiKhoan) {
        System.out.print("Nhập tên tài khoản: ");
        String tentaikhoan = sc.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String matkhau = sc.nextLine();

        if (tentaikhoan.equals(taiKhoan.getTenTaiKhoan()) && matkhau.equals(taiKhoan.getMatKhau())) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Tài khoản hoặc mật khẩu sai!");
        }
    }

    public TaiKhoan getTable() throws SQLException {
        return taiKhoanDAL.getTable();
    }
}