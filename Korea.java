package world.asia;

public class Korea {
	private int population; // �α�
	String capital; // ����
	private String[] specialList = { "���ֽ�ũ", "�뱸���", "õ��ȣ������" };

	public String[] getList() {
		return specialList;
	}

	public void setPopulation(int p) {
		if (p < 1) {
			System.out.println("�α��� 1�̻����� �����ϼ���.");
			return;
		}
		population = p;
	}

	public int getPopulation() {
		return population;
	}
}
