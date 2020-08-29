package hardsoftday;

public class CicloForEach {

    public static void main (String ...args) {

//        for(variable_temporal : array) {
//            Sentencia
//        }

        int []a =  new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String []b = new String[] {"Carlos", "Duarte", "López", "Manuel", "Mr.Unknown"};

        for (int v : a) {
            System.out.println(v);
        }
        for (String nombres : b) {
            System.out.println(nombres);
        }

    }

}
