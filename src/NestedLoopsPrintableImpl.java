public class NestedLoopsPrintableImpl implements MaxtrixPrintable {

    public void print(int[][] data) {
        NullOrEmpty nullOrEmpty = new NullOrEmpty();
        System.out.println("Это реализация NestedLoopsPrintableImpl:");
        nullOrEmpty.isNull(data);
        for (int i = 0; i < data.length; i++){
            nullOrEmpty.isNull(data[i]);
            nullOrEmpty.isEmpty(data[i]);
            for (int j = 0; j < data[i].length; j++){

                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
