# Java �� / �� / ����б� �޽� ���̺귯��
Java ���� �� / �� / ����б��� �޽��� ������ �� �ֽ��ϴ�.

### ����
�ش� ���ô� DSM(Daedeok Software Meister) ����б��� ���� �޽��� �������� �� �Դϴ�.
<pre><code>
	HashMap<Integer, Meal> meals = MealAPI.getDSMMeal(new SimpleDate(2017, 5));
	Date d = new Date();
	if(meals.contains(d.getDate())){
		Meal m = meals.get(d.getDate());
		System.out.println("[ ���� ]");
		for(int i = 0 ; i < m.breakfast.size() ; i ++){
			System.out.println(" " + m.breakfast.get(i)));
		}
		System.out.println("[ �߽� ]");
		for(int i = 0 ; i < m.lunch.size() ; i ++){
			System.out.println(" " + m.lunch.get(i)));
		}
		System.out.println("[ ���� ]");
		for(int i = 0 ; i < m.dinner.size() ; i ++){
			System.out.println(" " + m.dinner.get(i)));
		}
	}
</code></pre>

# ���̼���
### Developed by SHGroup.
### WTFPL
<pre><code>
        DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
                    Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

  0. You just DO WHAT THE FUCK YOU WANT TO.
</code></pre>
