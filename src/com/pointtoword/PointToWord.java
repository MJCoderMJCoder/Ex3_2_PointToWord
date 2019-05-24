package com.pointtoword;

import java.util.Scanner;

public class PointToWord {
	public static String pointToWord(int args) {
		/*输入分数据转换为文字*/
		String result;
		switch(args) {
		case 10:
		case 9:
			result = "优";
			break;
		case 8:
			result = "良";
			break;
		case 7:
			result = "中";
			break;
		case 6:
			result = "及格";
			break;
		default:
			result = "不及格";
			break;
		}
		return result;
		
	}

	public static void main(String[] args) {
		/*输入分数*/
		float point = 0;
		try {
			Scanner scanner = new Scanner(System.in);	//该scanner对象，从指定的标准输入流获取数据
			System.out.println("请输入分数（0-100）：");
			point = scanner.nextFloat();	//以float类型，返回指定的下一个输入数据项
			scanner.close();
		} catch (Exception e) {
			System.out.println("输入数据错误");
			System.out.println("错误信息：" + e.getMessage());
		}
		if(0 <= point && point <= 100) {
			/*转换结果输出*/
			System.out.println("成绩是：" + pointToWord((int) point / 10) );
		} else {
			System.out.println("输入的成绩不正确" + point);
		}
	}
}
