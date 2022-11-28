public class mergeSort {
    public void Msort(int A[],int low,int high){
        int mid;
        if(low<high){
            mid = (low+high)/2;
            Msort(A,low,mid);
            Msort(A,mid+1,high);
            merge(A,low,mid,high);
        }
    }
    public void merge(int A[],int low,int mid,int high){
        int i,j,k;
        int B[] = new int[high+1];
        i = low;
        j = mid+1;
        k = low;
        while(i<=mid && j<=high){
            if(A[i]<A[j]){
                B[k] = A[i];
                i++;
            }
            else{
                B[k] = A[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=high){
                B[k] = A[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                B[k] = A[i];
                i++;
                k++;
            }
        }
        for(int x=low;x<=high;x++){
            A[x] = B[x];
        }
    }
    public void Display(int T[]){
        for(int i=0;i<T.length;i++){
            System.out.print(T[i]+" ");
        }
    }
    public static void main(String arguments[]){
        int num[] = {12,10,16,11,9,7};
        mergeSort object = new mergeSort();
        object.Msort(num,0,num.length-1);
        object.Display(num);
    }
}
