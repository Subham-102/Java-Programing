/* Write a java program to find the duplicate elements from an array. */
class sanjeevni_ka_code_ka_solution {
	public static void main(String[] args) {
       		int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 3, 8, 9, 1};

        
        	for (int i = 0; i < array.length; i++) {
            		for (int j = i + 1; j < array.length; j++) {
                		if (array[i] == array[j]) {
                    			System.out.println(array[i]);
                		}
            		}
        	}
	
	}
}
