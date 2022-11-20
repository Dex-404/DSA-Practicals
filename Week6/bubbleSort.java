class bubbleSort{
    public void sort(int T[]){
        int p = 1;
        int N = T.length-1;
        int c,temp;

        while(p<=T.length-1){
            c = 0;
            while(c<=N-1){
                if(T[c]>T[c+1]){
                    temp = T[c];
                    T[c] = T[c+1];
                    T[c+1] = temp;
                }
                c++;
            }
        } 
        p++;
        N--;

    }
}