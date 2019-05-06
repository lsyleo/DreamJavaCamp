package dreamschool.cscourse.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		
		
		int intLottoProbability = (int)lottoProbability;
		int intPopulation = (int)population;
		
		
		
		System.out.println("로또에 당첨될 확율 : "+ lottoProbability);
		System.out.println("로또에 당첨될 확율int : "+ intLottoProbability);
		System.out.println("전 세계의 인구 수 : "+ population);
		System.out.println("전 세계의 인구 수 int : "+ intPopulation);

	}

}
