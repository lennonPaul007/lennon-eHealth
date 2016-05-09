
public void compactArray(int [] arr){

    int current = arr[0];

    boolean found = false;


    for (int i = 0; i < arr.length; i++) {

	  if (current == arr[i] && !found) {

       		found = true;

	   } else if (current != arr[i]) {

	       	System.out.print(" " + current);

	       	current = arr[i];

	       	found = false;

	   }

     }

		System.out.print(" " + current);


 }

