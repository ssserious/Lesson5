/**
* Java 1. Lesson 5
*@author Sergey Sergeev
*@version 25.10.2021
*/


class Les5 { 
    public static void main(String[] args) {
		Sotrudnik[] sotrudniki = {
		    new Sotrudnik("Sergeev Sergey", "Engineer", "sergeevs@yandex.ru", "89110000001",65000,36),
			new Sotrudnik("Sobolev Aleksandr", "Manager", "soboleva@yandex.ru", "89110000002",75000,28),
			new Sotrudnik("Zobnin Aleksandr", "Direktor", "zobnina@yandex.ru", "89110000003",110000,55),
			new Sotrudnik("Maksimenko Aleksandr", "Operator", "maksimenkoa@yandex.ru", "89110000004",44000,26),
			new Sotrudnik("Larsen Jordan", "Dispetcher", "larsenj@yandex.ru", "89110000005",70000,33)
		};
	    for (Sotrudnik sotrudnik : sotrudniki)
            if (sotrudnik.Age() > 40)
                System.out.println(sotrudnik);
	}
}

class Sotrudnik {
	private String name;
	private String position;
	private String email;
	private String mobile;
	private int salary;
	private int age;
    
    Sotrudnik(String name, String position, String email, String mobile, int salary, int age) {
	    this.name = name;
		this.position = position;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.age = age;
	}
	
	public int Age() {
		return age;
	}
	public String toString() {
	    return name + ", " + position + ", " + email + ", " + mobile + ", " + salary + ", " + age;
	}
}	
	
		
		
		
		
		
		
		
	
	

		
		
		
		
		
		
		
		
		
		
	
	