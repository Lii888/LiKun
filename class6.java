package 类与对象;

import java.util.Scanner;

class Cuboid {
	private double length;
	private double width;
	private double height;

	public void Cuboid() {
	}

	public void Cuboid(double alength, double awidth, double aheight) {
		length = alength;
		width = awidth;
		height = aheight;
	}

	public void setlength(double alength) {
		length = alength;
	}

	public double getlength() {
		return length;
	}

	public void setwidth(double awidth) {
		width = awidth;
	}

	public double getwidth() {
		return width;
	}

	public void setheight(double aheight) {
		height = aheight;
	}

	public double getheight() {
		return height;
	}

	public void printCuboid(double a, double b, double c) {
		System.out.println("长方体长为：" + length);
		System.out.println("长方体宽为：" + width);
		System.out.println("长方体高为：" + height);
	}

	public void getArea(double a, double b, double c) {
		double area = (a * b + a * c + b * c) * 2;
		System.out.printf("长方体表面积为：%.2f\n", area);
	}

	public void getCubage(double a, double b, double c) {
		double cubage = a * b * c;
		System.out.printf("长方体体积为：%.2f \n",cubage);
	}

	public void isCube(double a, double b, double c) {
		if ((a == b && b == c) || (a == b && a == c))
			System.out.println("是正方体");
		else
			System.out.println("不是正方体");
	}

	public void drawing() {
		System.out.println("已绘制该图形");
	}
}

public class class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid CdA = new Cuboid();
		System.out.println("请输入长宽高：");
		Scanner scan = new Scanner(System.in);
		double l = scan.nextDouble();
		double w = scan.nextDouble();
		double h = scan.nextDouble();
		CdA.setlength(l);
		CdA.setwidth(w);
		CdA.setheight(h);
		CdA.printCuboid(l, w, h);
		CdA.isCube(l, w, h);
		Cuboid CdB = new Cuboid();
		System.out.println("请输入修改后的长宽高：");
		double l1 = scan.nextDouble();
		double w1 = scan.nextDouble();
		double h1 = scan.nextDouble();
		System.out.println("请输入修改后的长：");
		double l2 =scan.nextDouble();
		CdB.setlength(l2);
		CdB.getArea(l2,w1,h1);
		CdB.getCubage(l2,w1,h1);
	}

}
