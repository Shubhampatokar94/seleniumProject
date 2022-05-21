package Session_2;

public class IncDecOperator {

	public static void main(String[] args) {
		
		// ++ and --
		
//		int a = 1;
//		a = a + 1;
//		System.out.println(a);
		
		// Pre Increment
		int i = 1; // 1
		int j = ++i; // 2
		// i - 2
		System.out.println(i);
		System.out.println(j);
		System.out.println("-------------------------------");
		
		// Post Increment
		int p = 1;
		int q = p++;
		// p - 2
		System.out.println(p); // 2
		System.out.println(q); // 1
		System.out.println("-------------------------------");
		
		// Pre Decrement
		int m = 2;
		int n = --m;
		System.out.println(m); // 1
		System.out.println(n); // 1
		System.out.println("-------------------------------");
		
		// Post Decrement
		int c = 0;
		int d = c--;
		System.out.println(c); // -1
		System.out.println(d); //  0
		System.out.println("-------------------------------");
		
		int f = -1;
		int g = --f;
		System.out.println(f); // -2
		System.out.println(g); // -2
		System.out.println("-------------------------------");

	}

}
