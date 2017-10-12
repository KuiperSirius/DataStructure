public class ShiYan11 {
	public static int binarySearch(int[] value, int key) {
		return binarySearchRecursion(value, 0, value.length - 1, key);
	}

	// 递归实现折半查找，如果找到，则把被找到的元素在数组中的下标返回，找不到则返回-1
	public static int binarySearchRecursion(int[] value, int begin, int end,
			int key) {
		//此处添加代码
		return 0;
	}

	public static void main(String[] args) {
		int[] value = { 8, 17, 26, 32, 40, 72, 87, 99 }; // 已按升序排序
		System.out.print("已按升序排序的关键字序列: ");
		Array1.print(value);
		int key = 99;
		System.out.println("折半查找 " + key + ", "
				+ ((binarySearch(value, key) == -1) ? "不" : "") + "成功");
		key = 25;
		System.out.println("折半查找 " + key + ", "
				+ ((binarySearch(value, key) == -1) ? "不" : "") + "成功");
	}
}

/*
 * 程序运行结果如下： 已按升序排序的关键字序列: 8 17 26 32 40 72 87 99 32? 72? 87? 99? 折半查找 99, 成功
 * 32? 17? 26? 折半查找 25, 不成功
 */