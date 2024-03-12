### quản lý thông tin phương tiện

1. tạo abstract class Vehicle có các thuộc tính:
   id - unique: tự sinh (tự tìm hiểu xem dùng gì)
   name: String
   model: String
   engine: String

run(): abstract void

với:
engine: tùy chọn
phương thức abstract run(): tùy thuộc vào loại phương tiện, overide lại phương thức run, vd: xe máy, ô tô thì sout: "đang chạy", xe đạp là đang đạp =)))

2. tạo các class tương ứng Motor, Bike, Car kế thừa từ class Vehicle
   over hàm run, có đầy đủ getter và setter

3. tại hàm main, tạo phương thức nhập vào các loại xe
- tạo class VehicleManagement để lưu trữ các loại xe
  class VehicleManagement:
  vehicles: List<Vehicle>
  có các method add, updateById, updateByName, deleteById, deleteByName
- tạo 1 list chung để lưu trữ các loại xe
- có chức năng thêm mới xe, update thông tin xe, xóa xe


