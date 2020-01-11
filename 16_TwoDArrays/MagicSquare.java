class MagicSquare{
    int[][] b;
    MagicSquare(){
        int[][] b={{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
        this.b = b;
    }
    MagicSquare(int[][] c){
        b = c;
    }
    int rowSum(int row){
        int sum = 0;
        for(int i = 0; i<b[row].length; i++){
            sum+=b[row][i];
        }
        return sum;
    }
    int colSum(int col){
        int sum = 0;
        for(int i = 0; i<b.length; i++){
            sum+=b[i][col];
        }
        return sum;
    }
    boolean diagSums(int sum){
        //Major
        int sumM = 0;
        for(int i = 0; i<b[0].length; i++){
            sumM+= b[i][i];
        }
        //Minor
        int sumMi=0;
        for(int i = 0; i<b.length; i++){
            sumMi+=b[i][b.length-1-i];
        }
        if(sum==sumM&&sumM==sumMi&&sumMi==sum){
            return true;
        }
        return false;

    }
    boolean isMagic(){
        boolean testB = true;
        for(int i = 0; i<b.length;i++){
            if(!(exactlyOnce()&&diagSums(rowSum(i))&&diagSums(colSum(i)))){
                testB = false;
            }
        }
        return testB;

    }
    boolean exactlyOnce(){
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[i].length; j++){
                if(check(b[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    boolean check(int c){
        int count = 0;
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[i].length; j++){
                if(c == b[i][j]){
                    count++;
                }
            }
        }
        return count>1;
    }
}