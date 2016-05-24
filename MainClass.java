package caculator;

public class MainClass {
static SoHoc tinhtoan;

public static void main(String[] args) {
	//Khai báo đối tượng
	tinhtoan = new SoHoc();
	System.out.println("CÁC PHÉP TÍNH SỐ HỌC CƠ BẢN");
	//1. In kết quả tổng
	System.out.println("1. Tổng hai số là: " + SoHoc.Cong(2, 3));
	//2. In kết quả trừ
	System.out.println("2. Hiệu hai số là: " + SoHoc.Tru(10, 3));
	//3. In Kết quả nhân
	System.out.println("3. Tích hai số là: " + SoHoc.Nhan(100, 3));
	//4. In kết quả chia
	System.out.println("4. Thương hai số là: " + SoHoc.Chia(200, 4));
	//5. In kết quả chia dư
	System.out.println("5. Dư hai số là: " + SoHoc.Du(9, 8));
	//6. Tăng giá trị cho num1
    System.out.println("6. Giá trị tăng là: " + SoHoc.Tang(8));
    //7. Giảm giá trị num2
    System.out.println("7. Giá trị giảm là: " + SoHoc.Giam(8));
    //8. So sánh 2 số
   System.out.print("8. "); SoHoc.SoSanh(3,9);
   //9. Tổng các số lẻ - lặp for
   System.out.println("9. Tổng số lẻ dùng hàm for là: " + SoHoc.TongLeFor(100));
   //10. Vòng lặp While
   System.out.print("10. Vòng lặp While: "); SoHoc.WhileLoop(10);
   //11. Vòng lặp Do While
   System.out.print("\n");
   System.out.println("11. Vòng lặp Do While: "); SoHoc.DoWhile(10);
	
}
}
