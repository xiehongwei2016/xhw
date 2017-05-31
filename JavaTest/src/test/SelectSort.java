package test;

public class SelectSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = { 63, 4, 24, 1, 3, 15 };
		SelectSort sort = new SelectSort();
		// Sorter.sort(array);

	}

	public void sort(int[] array) {
		int index;
		for (int i = 1; i < array.length; i++) {
			index = 0;
			for (int j = 1; j <= array.length - i; j++) {
				if (array[j] > array[index]) {
					index = j;
				}
			}
			showArray(array);

		}
	}

	public void showArray(int[] array) {
		for (int i : array) {
			System.out.print(">" + i);
		}
		System.out.println();
	}

}
