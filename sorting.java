buble sort:

int[] array = {8, 7, 5, 11, 15, 3};

for (int i = 0; i < array.length; i++) {
    for (int j = i + 1; i < array.length; j++) {
    	if (array[i] > array[j]) {
    		int temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    	}
    }
}

System.out.println(Arrays.toString(array));