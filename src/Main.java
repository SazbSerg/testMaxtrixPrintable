public class Main {
    public static void main(String[] args) {

         int[][] data = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] data1 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {10}
        };

        int[][] data2 = {
                null,
                {},
                {10}
        };

        int[][] data3 = null;


        class Random {
            public void randomLoop(int [][] arr) {
                NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();
                SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();
                double x = Math.random();
                if (x < 0.5) {
                    nestedLoopsPrintable.print(arr);
                    System.out.println("Это реализация NestedLoopsPrintableImpl");
                    System.out.println();
                } else {
                    singleLoopPrintable.print(arr);
                    System.out.println("Это реализация SingleLoopPrintableImpl");
                    System.out.println();
                }
            }
        }

        Random random = new Random();
        random.randomLoop(data);
        random.randomLoop(data1);

    }
}
