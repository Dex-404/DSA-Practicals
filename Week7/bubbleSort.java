public class bubbleSort {
    public void Bsort(int A[]){
        int temp;
        for(int x=0;x<A.length;x++){
            for(int y=0;y<A.length-1;y++){
                if(A[y]>A[y+1]){
                    temp = A[y];
                    A[y] = A[y+1];
                    A[y+1] = temp;
                }
            }
        }
    }
    public void Display(int T[]){
        for(int i=0;i<T.length;i++){
            System.out.print(T[i]+" ");
        }
    }
    public static void main(String arguments[]){
        int num[] = {12,10,16,11,9,7};
        bubbleSort object = new bubbleSort();
        object.Bsort(num);
        object.Display(num);
    }
    
}
