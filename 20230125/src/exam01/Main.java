package exam01;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setSsn("123456-1234567");
		person.setName("홍길동");
		person.setAddress("서울");
		System.out.println("주민등록번호 : " + person.getSsn());
		System.out.println("이름 : " + person.getName());
		System.out.println("주소 : " + person.getAddress());
		
		System.out.println();
		
		person = new Person("960109-1234567","박선아","대구");
		System.out.println("주민등록번호 : " + person.getSsn());
		System.out.println("이름 : " + person.getName());
		System.out.println("주소 : " + person.getAddress());
		
	}

}
