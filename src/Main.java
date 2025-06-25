import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("/Users/clementbowe/Downloads/inversionCounter/src/input.txt"));
        List<Integer> fileInput = new ArrayList<Integer>();
        while(scanner.hasNextInt()) {
            fileInput.add(scanner.nextInt());
        }
        scanner.close();
        InversionCounter counter = new InversionCounter();
        int[] input = fileInput.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(counter.countInversions(input));

    }
}