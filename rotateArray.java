
public void rotateArray(int [] array, int N){

    int [] newArray = new int [array.length];

    for(int y = 0; y <= array.length-1; y++){

  	newArray[ ( y + N ) % array.length ] = array[ y ];

    }


    System.out.print("transformed array =  [");

    for(int i : newArray){

       System.out.print(i + " ");

    }

    System.out.print("]");

 }