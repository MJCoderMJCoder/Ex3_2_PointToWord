package com.pointtoword;

import java.util.Scanner;

public class PointToWord {
	public static String pointToWord(int args) {
		/*���������ת��Ϊ����*/
		String result;
		switch(args) {
		case 10:
		case 9:
			result = "��";
			break;
		case 8:
			result = "��";
			break;
		case 7:
			result = "��";
			break;
		case 6:
			result = "����";
			break;
		default:
			result = "������";
			break;
		}
		return result;
		
	}

	public static void main(String[] args) {
		/*�������*/
		float point = 0;
		try {
			Scanner scanner = new Scanner(System.in);	//��scanner���󣬴�ָ���ı�׼��������ȡ����
			System.out.println("�����������0-100����");
			point = scanner.nextFloat();	//��float���ͣ�����ָ������һ������������
			scanner.close();
		} catch (Exception e) {
			System.out.println("�������ݴ���");
			System.out.println("������Ϣ��" + e.getMessage());
		}
		if(0 <= point && point <= 100) {
			/*ת��������*/
			System.out.println("�ɼ��ǣ�" + pointToWord((int) point / 10) );
		} else {
			System.out.println("����ĳɼ�����ȷ" + point);
		}
	}
}
