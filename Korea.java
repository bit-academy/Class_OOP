package world.asia;

public class Korea {
	private int population; // 인구
	String capital; // 수도
	private String[] specialList = { "진주실크", "대구사과", "천안호도과자" };

	public String[] getList() {
		return specialList;
	}

	public void setPopulation(int p) {
		if (p < 1) {
			System.out.println("인구는 1이상으로 설정하세요.");
			return;
		}
		population = p;
	}

	public int getPopulation() {
		return population;
	}
}
