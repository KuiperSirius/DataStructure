public class ShiYan11 {
	public static int binarySearch(int[] value, int key) {
		return binarySearchRecursion(value, 0, value.length - 1, key);
	}

	// �ݹ�ʵ���۰���ң�����ҵ�����ѱ��ҵ���Ԫ���������е��±귵�أ��Ҳ����򷵻�-1
	public static int binarySearchRecursion(int[] value, int begin, int end,
			int key) {
		//�˴���Ӵ���
		return 0;
	}

	public static void main(String[] args) {
		int[] value = { 8, 17, 26, 32, 40, 72, 87, 99 }; // �Ѱ���������
		System.out.print("�Ѱ���������Ĺؼ�������: ");
		Array1.print(value);
		int key = 99;
		System.out.println("�۰���� " + key + ", "
				+ ((binarySearch(value, key) == -1) ? "��" : "") + "�ɹ�");
		key = 25;
		System.out.println("�۰���� " + key + ", "
				+ ((binarySearch(value, key) == -1) ? "��" : "") + "�ɹ�");
	}
}

/*
 * �������н�����£� �Ѱ���������Ĺؼ�������: 8 17 26 32 40 72 87 99 32? 72? 87? 99? �۰���� 99, �ɹ�
 * 32? 17? 26? �۰���� 25, ���ɹ�
 */