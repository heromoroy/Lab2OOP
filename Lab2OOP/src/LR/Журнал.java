package LR;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.*;

public class ������ {
	Hashtable<������, Vector<People>> �����������_������ = new Hashtable<������, Vector<People>>();
	
	private ������() { }
	
	public static ������ �������������()
	{
		������ res = new ������();
		������ ����� = new ������();
		�����.������� = ��������.�����������;
		�����.������ = 5;
		�����.��������� = "�������";
		�����.��� = "001";
		res.�����������_������.put(�����, new Vector<>());
		
		����� = new ������();
		�����.������� = ��������.���;
		�����.������ = 5;
		�����.��������� = "�������";
		�����.��� = "002";
		res.�����������_������.put(�����, new Vector<>());
		
		����� = new ������();
		�����.������� = ��������.����������;
		�����.������ = 0;
		�����.��������� = " �� �������";
		�����.��� = "003";
		res.�����������_������.put(�����, new Vector<>());
		
		����� = new ������();
		�����.������� = ��������.����;
		�����.������ = 4;
		�����.��������� = " �������";
		�����.��� = "004";
		res.�����������_������.put(�����, new Vector<>());
		
		return res;
	}
	
	public void ���������������(String ���������, People people)
	{
		Optional<Entry<������, Vector<People>>> find =
				�����������_������.entrySet().stream().filter(e->e.getKey().���.equals(���������)).findFirst();
		
		if (find.isPresent())
		{
			if(find.get().getKey().������ == 0)
			{
				find.get().getKey().������ = 4;
				find.get().getValue().add(people);
				System.out.println("������ �����������");
			}
			else
			{
				System.out.println("������ ��� �����������!!!");
			}
		}
		else
			System.out.println("�������� ������ ���!!!");
	}
	
	public void Catalog()
	{
		�����������_������.entrySet().stream().forEach(e->{������ tab = e.getKey();
		System.out.println(tab.������� + "\n" + tab.������ + "\n" + tab.��������� + "\n" + tab.��� + "\n");});
	}
}
