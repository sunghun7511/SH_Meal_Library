# Java 초 / 중 / 고등학교 급식 라이브러리
Java 언어에서 초 / 중 / 고등학교의 급식을 가져올 수 있습니다.

### 예시
해당 예시는 DSM(Daedeok Software Meister) 고등학교의 오늘 급식을 가져오는 예 입니다.
<pre><code>
	HashMap<Integer, Meal> meals = MealAPI.getDSMMeal(new SimpleDate(2017, 5));
	Date d = new Date();
	if(meals.contains(d.getDate())){
		Meal m = meals.get(d.getDate());
		System.out.println("[ 조식 ]");
		for(int i = 0 ; i < m.breakfast.size() ; i ++){
			System.out.println(" " + m.breakfast.get(i)));
		}
		System.out.println("[ 중식 ]");
		for(int i = 0 ; i < m.lunch.size() ; i ++){
			System.out.println(" " + m.lunch.get(i)));
		}
		System.out.println("[ 석식 ]");
		for(int i = 0 ; i < m.dinner.size() ; i ++){
			System.out.println(" " + m.dinner.get(i)));
		}
	}
</code></pre>

# 라이센스
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
