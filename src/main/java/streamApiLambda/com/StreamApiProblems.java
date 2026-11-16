package streamApiLambda.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApiProblems {
    public static void findEvenNumber(List<Integer> list){
        List<Integer> result = list.stream()
                .filter(n -> n% 2 == 0)
                .map(n -> n * 10)
                .toList();
        System.out.println(result);
    }
    public static void convertToUpperCase(List<String> list){
        List<String> result = list.stream()
//                .map((s) -> s.toUpperCase())
//                .map(String::toUpperCase)
//                .map(s -> s+"CHANGE")
                .toList();
        System.out.println(result);
    }
    public static void removeDublicate(List<Integer> list){
        List<Integer> result = list.stream()
                .distinct()
                .toList();
        System.out.println(result);
    }

    public static void sortAscendingDecending(List<Integer> list){
        List<Integer> resultAse = list.stream()
                .sorted()
                .toList();
        System.out.println(resultAse);
        List<Integer> resultDesc = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(resultDesc);

    }
    public static void sumAndAverage(List<Integer> list){
        int sum = list.stream()
                .mapToInt((n) -> n.intValue())
                .sum();
        System.out.println("sum :"+sum);

        Double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("average :"+average);

    }
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,6,7);
        findEvenNumber(list);

        List<String> list2 = Arrays.asList("rahul", "ram", "shyam", "ajay");
        convertToUpperCase(list2);
        removeDublicate(list);
        sortAscendingDecending(list);
        sumAndAverage(list);
    }
}
