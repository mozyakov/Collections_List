import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("==================");
        /*LinkedList list2 = new LinkedList<>();
        for (Object o : list) {
            list2.add(o);
            list2 = new LinkedList<>(list);
        }
        System.out.println(list2);
         */

        //List<Integer> list1 = new ArrayList<>();
        LinkedList list2 = new LinkedList<>();
        for (int i=0; i < list.size(); i++) {
            list2.add(i);
            list2 = new LinkedList<>(list);
        }

        System.out.println(list2);

        /*for (Object o : list) {
            System.out.println(o);
        }*/
        int[] arr = {-3, -5, -2, 0, 1, 2, 3};
        long count = Arrays.stream(arr)
                .filter(i -> i > 0)
                .count();
        System.out.println(count);  //выйдет число 3, птмч в массиве три числа больше 0

        List<String>list99 = Arrays.asList("Moscow", "London", "Lima", "Tokyo");
        list99.stream()
                .filter(x -> x.length() > 4)
                .filter(x -> x.contains("L"))
                .forEach(System.out::println); //выведет London


    }
}