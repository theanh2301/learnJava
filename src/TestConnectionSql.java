import BusinessLogicLayer.TaiKhoanBLL;
import model.TaiKhoan;

import java.sql.SQLException;
import java.util.Scanner;

class TesConnectionSql {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();

        TaiKhoanBLL taiKhoanBLL = new TaiKhoanBLL();
        TaiKhoan taiKhoan = taiKhoanBLL.getTaiKhoanByName(name);

        System.out.println("Tên Khách Hàng: " + name);
        System.out.println("Tên tài khoản: " + taiKhoan.getTenTaiKhoan());
        System.out.println("Mật Khẩu: " + taiKhoan.getMatKhau());

        taiKhoanBLL.kiemTraTaiKhoan(taiKhoan);

        /*taiKhoanBLL.getTable();
        System.out.println("Tên Khách Hàng: " + taiKhoan.getTenKhachHang());
        System.out.println("Tên tài khoản: " + taiKhoan.getTenTaiKhoan());
        System.out.println("Mật Khẩu: " + taiKhoan.getMatKhau());*/

    }
}