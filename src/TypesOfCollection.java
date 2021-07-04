import java.util.*;

public class TypesOfCollection {

    public static void main(String[] args) {

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);


        /*  List -> ArrayList
            -- Vantagens
                - tamanho pode crescer
                - busca rapida de um elemento pelo indice get(<<indice>>)
            -- Desvantagens
                - insercao e exlusao lenta
                - ordem natural
            -- Observacao
                - busca linear
                - ordenado de acordo com adicionado
         */
        List<Aluno> listTypeOfArray = new ArrayList<>();
        listTypeOfArray.add(a);
        listTypeOfArray.add(b);
        listTypeOfArray.add(c);
        System.out.println(listTypeOfArray);


        /*  List -> LinkedList
            -- Vantagens
                - tamanho pode crescer
                - busca rapida de um elemento pelo indice get(<<indice>>)
                - insercao e exlusao rapida
            -- Desvantagens
                - busca um pouco mais lenta do que a Arraylist
                - ordem natural
            -- Observacao
                - Cada nó contém o dado do próximo nó
                - ordenado de acordo com adicionado
         */
        List<Aluno> listTypeOfLinkedList = new LinkedList<>();
        listTypeOfLinkedList.add(a);
        listTypeOfLinkedList.add(b);
        listTypeOfLinkedList.add(c);
        System.out.println(listTypeOfLinkedList);


        /*  Set -> HashSet
            -- Vantagens
                - busca rapida
            -- Desvantagens
                - não ordenado
            -- Observacao
                - não ordenado de acordo com adicionado
         */
        Set<Aluno> listTypeOfHashSet = new HashSet<>();
        listTypeOfHashSet.add(a);
        listTypeOfHashSet.add(b);
        listTypeOfHashSet.add(c);
        System.out.println(listTypeOfHashSet);


        /*  Set -> TreeSet
            -- Vantagens
                - nao adiciona dados duplicados
                - ordena os valores
            -- Desvantagens
                - mais lento do que o hashset
         */
        Set<String> listTypeOfTreeSet = new TreeSet<>();
        listTypeOfTreeSet.add("Jose");
        listTypeOfTreeSet.add("Amaral");
        System.out.println(listTypeOfTreeSet);

        /*  Map -> TreeMap
            -- Vantagens
                - nao adiciona chaves duplicadas
                - ordena os valores
            -- Desvantagens
                - mais lento do que o hashset
         */
        Map<String, Aluno> mapTypeOfTreeMap = new TreeMap<>();
        mapTypeOfTreeMap.put("joao", a);
        mapTypeOfTreeMap.put("antonio",b);
        mapTypeOfTreeMap.put("antonio",b);
        mapTypeOfTreeMap.put("tonho",b);
        System.out.println(mapTypeOfTreeMap);


        /*  Set -> LinkedHashSet
            -- Vantagens
                - nao adiciona dados duplicados
            -- Desvantagens
                - nao ordenado
        */
        Set<Aluno> setLinkedHashSet = new LinkedHashSet<>();
        setLinkedHashSet.add(a);
        setLinkedHashSet.add(a);
        setLinkedHashSet.add(b);
        setLinkedHashSet.add(c);
        System.out.println(setLinkedHashSet);


        /*  Map -> LinkedHashMap
            -- Vantagens
                - nao adiciona chave duplicada
                - permite valor null
            -- Desvantagens
                - nao ordenado
        */
        Map<String, Aluno> mapLinkedHashMap = new LinkedHashMap<>();
        mapLinkedHashMap.put("joao", a);
        mapLinkedHashMap.put("joao", a);
        mapLinkedHashMap.put("antonio", b);
        mapLinkedHashMap.put("lucia", null);
        System.out.println(mapLinkedHashMap);

        /*  Map -> LinkedHashMap
            -- Vantagens
                - nao adiciona chave duplicada
                - permite valor null
            -- Desvantagens
                - nao ordenado
        */
        Map<String, Aluno> mapHashMap = new HashMap<>();
        mapHashMap.put("joao", a);
        mapHashMap.put("joao", a);
        mapHashMap.put("antonio", b);
        mapHashMap.put("lucia", c);
        mapHashMap.put("lucia", null);
        System.out.println(mapHashMap);
    }


}
