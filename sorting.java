buble sort:

int[] array = {8, 7, 5, 11, 15, 3};

for (int i = 0; i < array.length; i++) {
    for (int j = i + 1; j < array.length; j++) {
    	if (array[i] > array[j]) {
    		int temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    	}
    }
}

System.out.println(Arrays.toString(array));


//#1 - Sort 10 schools around your house by distance:

//#2 - eBay sorts listings by the current Bid amount:

//#3 - Sport scores on ESPN

//#4 - Massive database (can't fit all into memory) needs to sort through past year's user data

//#5 - Almost sorted Udemy review data needs to update and add 2 new reviews

//#6 - Temperature Records for the past 50 years in Canada

//#7 - Large user name database needs to be sorted. Data is very random.

//#8 - You want to teach sorting for the first time