import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Main {
    public static void removeintegers(ArrayList<Integer> intarray, int remove) {
        for (int i = 0; i < intarray.size(); i++) {
            if (intarray.get(i) == remove) {
                intarray.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList OneOfEverything = new ArrayList();
        OneOfEverything.add(10);
        OneOfEverything.add(10.0);
        OneOfEverything.add("10");
        OneOfEverything.add(true);
        OneOfEverything.add(new Stores("10th Avenue Shop"));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(3);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(3);
        integers.add(8);

        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);
        doubles.add(5.0);
        doubles.add(8.0);

        ArrayList<Boolean> booleans = new ArrayList<Boolean>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);

        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Science");
        subjects.add("Mathematics");
        subjects.add("History");
        subjects.add("English");
        subjects.add("Computer Science");

        ArrayList<Stores> stores = new ArrayList<Stores>();
        stores.add(new Stores("Queens Pharmacy"));
        stores.add(new Stores("Brooklyn Mall"));
        stores.add(new Stores("Manhattan Grocery Store"));
        stores.add(new Stores("Staten Island Deli"));
        stores.add(new Stores("Bronx Retail Store"));

        System.out.println(OneOfEverything);
        System.out.println(integers);
        System.out.println(doubles);
        System.out.println(booleans);
        System.out.println(subjects);
        System.out.println(stores);
        System.out.println("\n\n\n\n\n\n\n\n");

        ArrayList<String> testmethods = new ArrayList<String>();
        testmethods.add("Add");
        testmethods.add("Size");
        testmethods.add("Set");
        testmethods.add("Get");
        testmethods.add("Remove");
        testmethods.add("Modify");
        testmethods.add("Traverse");
        System.out.println(testmethods.size());
        System.out.println(testmethods.add("Added Element"));
        testmethods.add(3, "Added Element At Index");
        System.out.println(testmethods.get(4));
        System.out.println(testmethods.set(2, "Element Set"));
        System.out.println(testmethods.remove(5));
        System.out.println(testmethods);
        System.out.println("\n\n\n\n\n\n\n\n");


        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        System.out.println();
        for (int i : integers) {
            System.out.println(i);
        }
        System.out.println();
        int i = 0;
        while (i < integers.size()) {
            System.out.println(integers.get(i));
            i++;
        }
        try {
            for (int f = 0; f < integers.size() + 1; f++) {
                if (integers.get(f) == 3) {
                    integers.remove(f);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Invalid");
        }
        try {
            for (double d : doubles) {
                doubles.add(5.0);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Invalid Function");
        }
        System.out.println();
        removeintegers(integers, 3);
        System.out.println(integers);
    }
}