import java.util.Stack;

public class StackArea {

	public static void main(String[] args) {
		Stack<Integer> yigin = new Stack<Integer>();
		yigin.add(10);
		yigin.add(20);
		yigin.add(30);
		
//		yığının en üstündeki değeri yani son eklenen 30 değerini basar.
		System.out.println(yigin.peek());
//		yığının en üstündeki değeri siler.
		yigin.pop();
		System.out.println(yigin.peek());
		yigin.pop();
		System.out.println(yigin.peek());
		yigin.pop();
//		başka eleman kalmadığı için bir tane daha pop yapsak hata verir java.util.EmptyStackException hatası.
//		yigin.pop();
	}

}
