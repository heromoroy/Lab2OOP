package LR;

import java.util.*;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		������ ��������� = ������.�������������();
		System.out.println("����������� ������ ������ � ������!");
		System.out.println("������������� ��������:");
		System.out.print("��� > ");
		String ���� = sc.next();
		System.out.print("������ > ");
		String class� = sc.next();
		People ������� = new People (����, class�);
		int operation = 0;
		do
		{
			System.out.print("��������� " + �������.fio +
			", �������� ��������:\n1 - ����� ������\n"
			+ "2 - ��������� ������\n0 - �����");
			operation = sc.nextInt();
			switch(operation)
			{
				case 1: ���������.Catalog();
				break;
				case 2:
					System.out.println("������? > ");
					String ��� = sc.next();
					���������.���������������(���, �������);
				default:break;
			}
			
		}
		while (operation !=0);
	}
	
}
