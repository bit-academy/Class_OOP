package world.test;

import world.asia.Korea;

public class KoreaUser {
	public static void main(String[] args) {
		Korea k;
		k = new Korea();
		// k.population = 10; // k�� �����ϴ� ��ü�� �α����� 10���� ����
		k.setPopulation(0);
		k.setPopulation(10);

		int p = k.getPopulation();
		System.out.println("�α�:" + p);

		// k.capital = "����"; // k�� �����ϴ� ��ü�� ������ "����"�� ����
		// System.out.println(k.specialList);
		String[] list = k.getList();
		System.out.println(list[0]);
	}
}
