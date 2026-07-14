package Bit;


class SetTheRightmost {
    public int setBit(int n) {
        // code here
        //return n | (n+1);
        for(int i=0; i<31; i++){
            if((n>>i)%2 == 0){
                return n | (1<<i);
            }
        }
        return 0;
    }
}