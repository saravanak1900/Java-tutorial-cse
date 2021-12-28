class ArraySorting{

    public static void main(String valuesgs[]){
 
    int[] values = {77,99,101,-33,1,17,56,239,-13,0,33};
    int limit=values.length-1;
    int temp; 
    System.out.println("Length\\limit of valuesray is : 0 to " +limit);
    
     for(int i=0;i<limit-1;i++){
    
        for(int j=0;j<limit-i;j++){

             if(values[j]>values[j+1]){
        
                temp=values[j];
                values[j]=values[j+1];
                values[j+1]=temp;

             }
        }
     }

     for(int x=0;x<limit;x++) {
      System.out.println(values[x]);
     }
       
   }


}

