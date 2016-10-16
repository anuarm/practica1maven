import java.util.*;

public class Main {

    public static void main(String[] args) {

        int max = 10;
        List<Integer> listaPrimos = new ArrayList<>();
        listaPrimos.add(2);

        for (int i = 3; i <= max; i++) {
            isPrimo(i, listaPrimos);
        }

        listaPrimos.add(1, 1);
        Iterator<Integer> iter = listaPrimos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Hello World!");
    }


    public static void isPrimo(int num, List<Integer> listaPrimos) {

        for (int prime: listaPrimos) {
            if (num % prime == 0) {
                return;
            }
        }
        listaPrimos.add(num);
        }
}
