class selectionSort{

    public void Ssort(int A[]){
        int minVal,minIndex;
        minVal = A[0];
        for(int x=0;x<A.length;x++){
            minVal = A[x];
            minIndex = x;
            for(int y=x;y<A.length;y++){
                if(A[y]<minVal){
                    minVal = A[y];
                    minIndex = y;
                }
            }
            A[minIndex] = A[x];
            A[x] = minVal;
        }
    }

    public void Display(int T[]){
        for(int i=0;i<T.length;i++){
            System.out.print(T[i]+" ");
        }
    }

    public static void main(String arguments[]){
        int num[] = {12,10,16,11,9,7};

        selectionSort object = new selectionSort();
        object.Ssort(num);
        object.Display(num);
    }
}