package com.lessons.sortingAlgorithms;

public class SelectionSort {


	
    public static void main(String[] args) {
        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        SelectionSort(numbers);
        for (int i = 0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+":");
        }
    }
    public static void SelectionSort (int[] num)
    {
        int i, j, first, temp;
        for (i=num.length - 1; i > 0; i--)
        {
            first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j++)   //locate smallest element between 1 and i
            {
                if(num[j] < num[first])
                    first = j;
            }
            temp = num[first];   //swap smallest found with element in position i
            num[first] = num[i];
            num[i] = temp;
        }
    }
  
}

	
	
	
	
	
	
	
	
/**	
	
	
	public static void main(String[] args) {
		
		int[] numbers = {67,78,3,6,8,35,73,23,86,23,12,732,23};
		SelectionSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "\t");
		}
	}
		
	


	public static SelectionSort (int[] num) {	
		
		int i, j, first, temp;
		for (i = num.length -1; i < 0; i--) {
			first = 0;  // initialize to subscript of first element
			// locate the smallest element between 1 and i.
			for ( j = 1; j <= i; j++) {
				if(num[j] < num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
	}

}

*/
