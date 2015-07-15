import java.util.Date;
import java.util.Random;
// import java.util.*;  // 위 import문 (1, 2줄) 대신 사용할 수 있다.
// import java.lang.*;  // 컴파일러에 의해 자동 삽입.

class ImplicitPack {
	public static void main(String[] args) {
		java.lang.System.out.println(new java.util.Date());
		System.out.println(new Date());
		System.out.println(new Random().nextInt());
	}
}
