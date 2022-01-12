public class SingleLoopPrintableImpl implements MaxtrixPrintable{
    public void print(int[][] data) {
        NullOrEmpty nullOrEmpty = new NullOrEmpty();
        System.out.println("Это реализация SingleLoopPrintableImpl:");
        nullOrEmpty.isNull(data);
        int j=0;
        for (int i = 0; i < data.length; i++){
            nullOrEmpty.isNull(data[i]);
            nullOrEmpty.isEmpty(data[i]);

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