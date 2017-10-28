import java.util.*;
public class Collections {
    public static void main(String[] args){
        int size = 0; //Размер коллекции
        int enterNumberAdd = 0; //Число, которое надо добавить в коллекцию
        int enterNumberRemove = 0; //Число, которое надо удалить из коллекции
        int enterNumberGet = 0; //Число, которое надо найти в коллекции
        long startTask, endTask; //Время выполнения операции
        int[] array; //Набор данных для разных структур коллекций

        size = readInt("Ввод размера коллекции: ");
        array = new int[size]; //Объявление массива
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*10);//Заполнение массива случайными числами
        }
        for (int z = 0; z < size; z++){
            System.out.println(array[z]); //Вывод массива на экран
        }
        /*Объявление коллекций*/
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        /*Заполение коллекций данными из массива array*/
        for (int i = 0; i < size; i++) {
            arrayList.add(array[i]);
            linkedList.add(array[i]);
            hashSet.add(array[i]);
            treeSet.add(array[i]);
        }

        /*Вывод заполненных коллекций на экран*/
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

        /*Добавление нового числа в коллекцию*/
        enterNumberAdd = readInt("Введите число для добавления в коллекцию: ");

        startTask = System.nanoTime();
        arrayList.add(enterNumberAdd);
        endTask = System.nanoTime();
        System.out.println("Время выполнения добавления в ArrayList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        linkedList.add(enterNumberAdd);
        endTask = System.nanoTime();
        System.out.println("Время выполнения добавления в LinkedList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        hashSet.add(enterNumberAdd);
        endTask = System.nanoTime();
        System.out.println("Время выполнения добавления в HashSet " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        treeSet.add(enterNumberAdd);
        endTask = System.nanoTime();
        System.out.println("Время выполнения добавления в TreeSet " + (endTask-startTask) + " нс");

        /*Вывод коллекций на экран после добавления нового числа*/
        System.out.println("");
        System.out.println("Коллекции после добавления числа");
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

        /*Добавление нового числа в коллекцию*/
        enterNumberRemove = readInt("Введите число для удаления из коллекции: ");

        startTask = System.nanoTime();
        arrayList.remove(new Integer(enterNumberRemove));
        endTask = System.nanoTime();
        System.out.println("Время выполнения удаления в ArrayList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        linkedList.remove(new Integer(enterNumberRemove));
        endTask = System.nanoTime();
        System.out.println("Время выполнения удаления в LinkedList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        hashSet.remove(new Integer(enterNumberRemove));
        endTask = System.nanoTime();
        System.out.println("Время выполнения удаления в HashSet " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        treeSet.remove(new Integer(enterNumberRemove));
        endTask = System.nanoTime();
        System.out.println("Время выполнения удаления в TreeSet " + (endTask-startTask) + " нс");

        /*Вывод коллекций на экран после удаления числа*/
        System.out.println("");
        System.out.println("Коллекции после удаления числа");
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

        /*поиск числа в коллекции*/
        enterNumberGet = readInt("Введите число для поиска в коллекции: ");

        startTask = System.nanoTime();
        if (arrayList.contains(new Integer (enterNumberGet))) {
            System.out.println(enterNumberGet);}
        else
        {System.out.println("Число в ArrayList не найдено");}
        endTask = System.nanoTime();
        System.out.println("Время выполнения поиска в ArrayList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        if (linkedList.contains(new Integer (enterNumberGet))) {
            System.out.println(enterNumberGet);}
        else
        {System.out.println("Число в LinkedList не найдено");}
        endTask = System.nanoTime();
        System.out.println("Время выполнения поиска в LinkedList " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        if (hashSet.contains(new Integer (enterNumberGet))) {
            System.out.println(enterNumberGet);}
        else
        {System.out.println("Число в HashSet не найдено");}
        endTask = System.nanoTime();
        System.out.println("Время выполнения поиска в HashSet " + (endTask-startTask) + " нс");

        startTask = System.nanoTime();
        if (treeSet.contains(new Integer (enterNumberGet))) {
            System.out.println(enterNumberGet);}
        else
        {System.out.println("Число в TreeSet не найдено");}
        endTask = System.nanoTime();
        System.out.println("Время выполнения поиска в TreeSet " + (endTask-startTask) + " нс");

        /*Вывод коллекций на экран после поиска числа*/
        System.out.println("");
        System.out.println("Коллекции после поиска числа");
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);
    }


    public static int readInt(String text){
        System.out.println(text);
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();
        return res;
    }
}
