package LR;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.*;

public class Журнал {
	Hashtable<Табель, Vector<People>> Электронный_журнал = new Hashtable<Табель, Vector<People>>();
	
	private Журнал() { }
	
	public static Журнал Инициализация()
	{
		Журнал res = new Журнал();
		Табель новый = new Табель();
		новый.Предмет = Предметы.Информатика;
		новый.Оценка = 5;
		новый.Посещение = "Посещал";
		новый.Код = "001";
		res.Электронный_журнал.put(новый, new Vector<>());
		
		новый = new Табель();
		новый.Предмет = Предметы.ООП;
		новый.Оценка = 5;
		новый.Посещение = "Посещал";
		новый.Код = "002";
		res.Электронный_журнал.put(новый, new Vector<>());
		
		новый = new Табель();
		новый.Предмет = Предметы.Математика;
		новый.Оценка = 0;
		новый.Посещение = " Не посещал";
		новый.Код = "003";
		res.Электронный_журнал.put(новый, new Vector<>());
		
		новый = new Табель();
		новый.Предмет = Предметы.ОАиП;
		новый.Оценка = 4;
		новый.Посещение = " Посещал";
		новый.Код = "004";
		res.Электронный_журнал.put(новый, new Vector<>());
		
		return res;
	}
	
	public void ПоставитьОценку(String кодЖурнал, People people)
	{
		Optional<Entry<Табель, Vector<People>>> find =
				Электронный_журнал.entrySet().stream().filter(e->e.getKey().Код.equals(кодЖурнал)).findFirst();
		
		if (find.isPresent())
		{
			if(find.get().getKey().Оценка == 0)
			{
				find.get().getKey().Оценка = 4;
				find.get().getValue().add(people);
				System.out.println("Оценка проставлена");
			}
			else
			{
				System.out.println("Оценки уже проставлены!!!");
			}
		}
		else
			System.out.println("Предмета такого нет!!!");
	}
	
	public void Catalog()
	{
		Электронный_журнал.entrySet().stream().forEach(e->{Табель tab = e.getKey();
		System.out.println(tab.Предмет + "\n" + tab.Оценка + "\n" + tab.Посещение + "\n" + tab.Код + "\n");});
	}
}
