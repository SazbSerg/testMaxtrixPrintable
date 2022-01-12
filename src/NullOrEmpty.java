public class NullOrEmpty implements NullOrEmptyInterface {
    @Override
    public void isNull(Object obj){
        if (obj == null) {
            System.out.println("null");
        }
    }


    @Override
    public void isNull(int[] obj) {
        if (obj == null) {
            System.out.print("null");
        }

    }
    @Override
    public void isEmpty(int[] obj){
        if (obj.length == 0){
            System.out.print("empty");
        }
    }
}
