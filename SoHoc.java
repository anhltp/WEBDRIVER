package caculator;

public class SoHoc {
	//phép cộng
	static int Cong (int num1, int num2) {
		return num1 + num2;
	}
	//phép trừ
	static int Tru (int num1, int num2) {
		return num1 - num2;
	}
	//phép nhân
	static int Nhan (int num1, int num2) {
		return num1 * num2;
	}
	//phép chia
	static int Chia (int num1, int num2) {
		return num1 / num2;
	}
	//phép chia dư
	static double Du (int num1, int num2) {
		return num1 % num2;
	}
	//tăng giá trị
	static int Tang (int num1) {
		return ++num1;
	}
	//Giảm giá trị
	static int Giam (int num1) {
		return --num1;
	}
	//So sánh 2 số
	static void SoSanh (int x, int y){
		if(x==y){
			System.out.println(x + " bằng " + y);
		}
		else if (x>y){
			System.out.println(x + " lớn hơn " + y);
		}
		else {
			System.out.println(x + " nhỏ hơn "+ y);
		}
	}
	//Lặp tính tổng số lẻ nhỏ hơn 20
	static int TongLeFor(int n)	{	
		int i,s=0;
		for(i=1;i<=n;i=i+2)
		{
			if(n%2!=0)
				s+=i;
			if(n%2==0)
				s+=i-1;
		}
		return s;
	}
	//Vòng lặp While
	static void WhileLoop(int n)	{
		int i = 0;
		while (i <= n) {
			System.out.print(" "+i++);
		}
	}
	//Vòng lặp Do..While
	static void DoWhile(int m){
		do{
			System.out.print(" "+m);
			m--;
		}while(m>1);
	}
	//===========HÀM CHÍNH===================================
	public static void main(String[] args) {
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
