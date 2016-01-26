package accesslab05;

/**
 * Created by lucky on 1/26/16.
 */
public class AccessLab05MainClass {


    public static void main(String[] args) {

        ArrayRotator<Integer> pop = new ArrayRotator<Integer>();

        for (int i = 0; i < 5; i++) {
            pop.add(i);
        }

        System.out.println(pop.toString());
        pop.rotate(0);

        System.out.println(pop.toString());
        pop.rotate(1);

        System.out.println(pop.toString());
        pop.rotate(2);

        System.out.println(pop.toString());
        pop.rotate(3);

        System.out.println(pop.toString());
        pop.rotate(4);

        System.out.println(pop.toString());
        pop.rotate(5);





    }

}
