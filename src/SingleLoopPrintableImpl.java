public class SingleLoopPrintableImpl implements MaxtrixPrintable{
    public void print(int[][] data) {
        int j=0;
        for (int i = 0; i < data.length; i++){
                if (j<data[i].length){
                    System.out.print(data[i][j] + " ");
                    j++;
                    i--;
                }
                else {
                    j=0;
                    System.out.println();
                }
        }
    }
}