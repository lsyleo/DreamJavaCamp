package dreamschool.cscourse.chapter10;

public class PolymorphismEx {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		persons[0] = new Person("홍길동","111-2222");
		persons[1] = new Student("홍길순","111-2345","컴퓨터공학과");
		persons[2] =  new Teacher("강감찬","222-3333","java");
		
		
		for(int i =0;i < persons.length;i++) {
			persons[i].sleep();
			persons[i].eat();
			if(persons[i] instanceof Student) {
				((Student)persons[i]).study();
			}
		}
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
		}
		
		((Student)persons[1]).study();
		/*
		per1.eat();
		per1.sleep();
		stu1.sleep();
		tea1.sleep();
		
		stu1.eat();
		tea1.eat();
		*/
		
	}

}
