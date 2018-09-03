package encapsulation;

public class TestEK {

	public static void main(String[] args) {
		Emirates1 ee = new Emirates1();
		ee.setHours(40);
		System.out.println(ee.getHours());
		
		Emirates1 ek = new Emirates1();
		ek.setDepartment("OPS");
		System.out.println(ek.getDepartment());
	}

}
