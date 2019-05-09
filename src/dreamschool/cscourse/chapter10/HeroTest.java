package dreamschool.cscourse.chapter10;

public class HeroTest {

	public static void main(String[] args) {
		Hero[] heroes = { new SuperMan(), new SpiderMan(), new BatMan()};
		
		System.out.println("Hero ¸ñ·Ï : "+heroes[0]+","+heroes[1]+","+heroes[2]+",");
		
		for(Hero hero : heroes) {
			hero.action();
		}

	}

}
