package streamApiLambda.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamIntermediate {
    public static void secondHigestNumber(List<Integer> list){
        int secondHigest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println("secondHigest "+secondHigest);
    }
    public static void maxMinNumber(List<Integer> list){
        int max = list.stream()
//                .max(Integer::compare)
                .max((a,b) -> a.compareTo(b))
                .orElse(-1);
        System.out.println("max :"+max);

        int min =
                list.stream()
                        //.min(Integer::compare)
                        .min((a,b) -> a.compareTo(b))
                        .orElse(-1);
        System.out.println("min :"+min);
    }

    public static void firstNonrepeatingChar(String s){
        Map<Character, Long> frequency = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        Character result = frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('*');
        System.out.println(result);
    }
    public static void countFrfequencyOfEachWord(List<String> list){
        Map<String, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        frequency.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
        ;

        System.out.println(frequency);
    }
    public static void dublicateElements(List<String> list){
        Map<String , Long> frequency = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        List<String> result = frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .toList();
        System.out.println(result);
    }
    public static void dublicateElementInteger(List<Integer> list){
        Map<Integer, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.print(entry.getKey()+" "));
    }
    public static void commonElementInList(List<Integer> l1, List<Integer> l2){
        List<Integer> result = l1.stream()
//                .filter(n -> l2.contains(n))
                .filter(l2::contains)
                .distinct()
                .toList();
        System.out.println(result);
    }

    public static void flattenList(List<List<Integer>> nested){
        List<Integer> flattenResult = nested.stream()
//                .flatMap(List::stream)
                .flatMap(l -> l.stream())
                .toList();
        flattenResult.stream()
                .forEach(n -> System.out.print(n+" "));
    }
    public static void findHighestThree(List<Integer> list){
        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
//                .distinct()
                .limit(3)
                .toList();
        System.out.println(result);
    }

    public static void ListStringToString(List<String> list){
        String result = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
    public static void allAnyNone(List<Integer> list){
        boolean allEven = list.stream()
                .allMatch(n -> n % 2 == 0);
        boolean anyGrater = list.stream()
                .anyMatch(n -> n >40);
        boolean nonNegative = list.stream()
                .noneMatch(n -> n<0);
    }
    public static void main(String args[]){
     List<Integer> list = Arrays.asList(1,20, 30, 401,401, 50, 60, 20,50);
        List<Integer> list2 = Arrays.asList(1,20, 30, 50, 20,50);
     List<String> skills = Arrays.asList("java", "aws", "oops", "java", "aws", "ecr", "ec2");
        secondHigestNumber(list);
        maxMinNumber(list);
        firstNonrepeatingChar("swiss");
        firstNonrepeatingChar("swiiwss");
        countFrfequencyOfEachWord(skills);
        dublicateElements(skills);
        dublicateElementInteger(list);
        System.out.println("");
        commonElementInList(list2, list);
        System.out.println("");

        List<List<Integer>> nested = List.of(
                List.of(1, 2),
                List.of(30,40,50),
                List.of(101,102,103)
        );
        flattenList(nested);
        System.out.println("");
        findHighestThree(list);
        ListStringToString(skills);
    }
}
