package exercicios;

public class Teste {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ex01 x = new Ex01();
		
		String a[] = (Ex01.class.getName()).split(".");
		System.out.println(x.getClass());
		System.out.println(x.getClass().getName());
		System.out.println(Ex01.class.getSimpleName());
		System.out.println(Ex01.class.getName());
	}
}
