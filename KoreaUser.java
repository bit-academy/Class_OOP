package world.test;

import world.asia.Korea;

public class KoreaUser {
	public static void main(String[] args) {
		Korea k;
		k = new Korea();
		// k.population = 10; // k가 참조하는 객체의 인구값을 10으로 설정
		k.setPopulation(0);
		k.setPopulation(10);

		int p = k.getPopulation();
		System.out.println("인구:" + p);

		// k.capital = "서울"; // k가 참조하는 객체의 수도를 "서울"로 설정
		// System.out.println(k.specialList);
		String[] list = k.getList();
		System.out.println(list[0]);
	}
}
