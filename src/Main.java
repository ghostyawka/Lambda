import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.");

        LambdaInt example1=(x,y) -> x+y;
        LambdaInt example2 = (x,y) -> x - y;
        LambdaInt example3 = (x,y) -> x * y;
        LambdaInt example4 = (x,y) -> x / y;

        int slojenie = example1.calculate(5,4);
        System.out.println(slojenie);
        int vychitanie = example2.calculate(5,4);
        System.out.println(vychitanie);
        int umnojenie = example3.calculate(5,4);
        System.out.println(umnojenie);
        int delenie = example4.calculate(20,5);
        System.out.println(delenie);

        System.out.println("_________________________");
        System.out.println("Задание 2.");

        Function <String, String> convert = x -> {
            if (x.length() < 5) {
                return x.toUpperCase();
            } return  x.toLowerCase();
        };
        String word1 = "lol";
        String word2 = "Liverpool";

        String solutionOfWord1 = convert.apply(word1);
        String solutionOfWord2 = convert.apply(word2);
        System.out.println(solutionOfWord1);
        System.out.println(solutionOfWord2);

        System.out.println("_________________________________");
        System.out.println("Задание 3.");

        String [] array1 = {"один", "два", "три", "четыре", "пять", "шесть"};
        Function <String, Integer> converter = y -> {
            y = y;
            switch (y) {
                case "один":
                    return 1;
                case "два":
                    return 2;
                case "три":
                    return 3;
                case "четыре":
                    return 4;
                case "пять":
                    return 5;
                case "шесть":
                    return 6;
                default:
                    return 0;
            }
        };

       Integer [] array2 = new Integer[array1.length];
       for (int i=0; i < array1.length;i++) {
           array2 [i] = converter.apply(array1[i]);
       }
       for (Integer numbers:array2) {
           System.out.println(numbers);
       }
    }
}