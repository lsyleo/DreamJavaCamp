package icehs.sciece.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long billWealth = 7000000000000000000L;
		System.out.println("원래 값 : "+ billWealth);
		
		int intBillWealth = (int)billWealth;
		System.out.println("int형으로 형변환: "+ intBillWealth);
		
		double doubleBillWealth = billWealth;
		System.out.println("double형으로 형변환 : "+ doubleBillWealth);

	}

}
