import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8LambdaStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);

        System.out.println("--- simples print ---");
        list.stream().forEach(System.out::println);

        System.out.println("--- operacoes intermediaria skip, limit, distinct, filter, map, etc  ---");

        System.out.println("-- skip - recebe um long e retorna o restante, ex -> pula os dois primeiros indices --");
        list.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("-- limit - recece um long e percorre ate o indice do parametro --");
        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-- distinct - retira os valores repetidos da lista --");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("-- filter - recebe um predicado, exemplo retornando somente os valores pares  --");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("-- map - exemplo transforma os dados da lista, porem nao modifica os valores originais da list, util para trabalhar com lista imutaveis --");
        list.stream()
                .map(e -> e * 2)
                .forEach(System.out::println);

        System.out.println(" collect - cria uma nova lista aplicando os filtros");
        List<Integer> novaLista = list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .collect(Collectors.toList());
        System.out.println(novaLista);

        System.out.println(" collect - agrupando os valores que sao pares em true e impares em false");
        Map<Boolean, List<Integer>> collect = list.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(collect);

        System.out.println(" collect - agrupa os numeros que sao divididos por 3 ");
        // util em agrupar os clientes por idades, ou enderecos
        Map<Integer, List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(e -> e % 3));
        System.out.println(map);

        String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum " +
                "has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley " +
                "of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also " +
                "the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop " +
                "publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        // TODO quebrar em 30 posicoes sem quebrar a palavra


        Aluno aluno = new Aluno("Rodrigo", "SI", 10);
        Aluno aluno1 = new Aluno("Joao", "SI", 3);
        Aluno aluno2 = new Aluno("Paulo", "SI", 6);
        Aluno aluno3 = new Aluno("Bruno", "SI", 7);
        Aluno aluno4 = new Aluno("Dipsy", "SI", 2);
        Aluno aluno5 = new Aluno("Banana", "SI", 8);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        alunos.stream()
                .filter(e -> e.nota > 5)
                .forEach(System.out::println);

        List<Boolean> collect1 = alunos.stream()
                .map(e -> e.nota < 5)
                .collect(Collectors.toList());
        System.out.println(collect1);

        Map<Boolean, List<Aluno>> collect2 = alunos.stream()
                .collect(Collectors.groupingBy(e -> e.nota < 5));

        System.out.println(collect2);


    }
}
