package LR;

import java.util.*;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Журнал мойЖурнал = Журнал.Инициализация();
		System.out.println("Электронный журнал готова к работе!");
		System.out.println("Идентификация студента:");
		System.out.print("ФИО > ");
		String фиоЧ = sc.next();
		System.out.print("Группа > ");
		String classЧ = sc.next();
		People человек = new People (фиоЧ, classЧ);
		int operation = 0;
		do
		{
			System.out.print("Уважаемый " + человек.fio +
			", Выберите действие:\n1 - Вывод табеля\n"
			+ "2 - Поставить оценки\n0 - Выход");
			operation = sc.nextInt();
			switch(operation)
			{
				case 1: мойЖурнал.Catalog();
				break;
				case 2:
					System.out.println("Группа? > ");
					String код = sc.next();
					мойЖурнал.ПоставитьОценку(код, человек);
				default:break;
			}
			
		}
		while (operation !=0);
	}
	
}
