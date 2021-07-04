import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java8Colletions {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("--- list - simple foreach ---");
        list.forEach(System.out::println);

        System.out.println("--- list - remove os valores que é dividido por 2 ---");
        list.removeIf(n -> n % 2 == 0);
        list.forEach(System.out::println);

        System.out.println("--- list - multiplica por 2 cada valor da lista ---");
        list.replaceAll(n -> n * 2);
        list.forEach(System.out::println);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0,"Oi");
        map.put(1,"tudo");
        map.put(2,"bem");
        map.put(3,"com");
        map.put(4,"voce");

        System.out.println("--- map - simple foreach ---");
        map.forEach((k, v) -> System.out.println(k+v));

        System.out.println("--- map - altera um elemento especifico no mapa ---");
        map.compute(1, (k, v) -> v + " agora" );
        map.forEach((k, v) -> System.out.println(k+v));

        System.out.println("--- map - concatena o valor no mapa com a chave existente ---");
        map.merge(3, " !", (v1,v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.println(k+v));

        System.out.println("--- map - altera o valor de todos os mapas ---");
        map.replaceAll((k, v) -> v + " =) ");
        map.forEach((k, v) -> System.out.println(k+v));
    }
}
