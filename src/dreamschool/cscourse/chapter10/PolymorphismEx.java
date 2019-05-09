package dreamschool.cscourse.chapter10;

public class PolymorphismEx {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		persons[0] = new Person("ȫ�浿","111-2222");
		persons[1] = new Student("ȫ���","111-2345","��ǻ�Ͱ��а�");
		persons[2] =  new Teacher("������","222-3333","java");
		
		
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
