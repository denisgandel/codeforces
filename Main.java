import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTVOffers = scanner.nextInt();
        int numberOfTVToBeCarried = scanner.nextInt();
        List<Integer> prices = new ArrayList<>();
        int total = 0;

        for (int index = 0; index < numberOfTVOffers; index++) {
            prices.add(scanner.nextInt());
        }

        for (int i = 0; i < prices.size(); i++) {
            for (int j = i; j < prices.size(); j++) {
                if (prices.get(i) < prices.get(j)) {
                    int temporal = prices.get(i);
                    prices.set(i, prices.get(j));
                    prices.set(j, temporal);
                }
            }
        }

        for (int i = 0; i < numberOfTVToBeCarried; i++) {
            if (prices.get(i) < 0) {
                total += (prices.get(i) * -1);
            }
        }

        System.out.println(total);

    }

}