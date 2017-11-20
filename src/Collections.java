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

        System.out.println("Время выполнения добавления в ArrayList " + addNumber(arrayList,enterNumberAdd) + " нс");
        System.out.println("Время выполнения добавления в LinkedList " + addNumber(linkedList,enterNumberAdd) + " нс");
        System.out.println("Время выполнения добавления в HashSet " + addNumber(hashSet,enterNumberAdd) + " нс");
        System.out.println("Время выполнения добавления в TreeSet " + addNumber(treeSet,enterNumberAdd) + " нс");

/*Вывод коллекций на экран после добавления нового числа*/
        System.out.println("");
        System.out.println("Коллекции после добавления числа");
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

/*Удаление числа из коллекции*/
        enterNumberRemove = readInt("Введите число для удаления из коллекции: ");

        System.out.println("Время выполнения добавления в ArrayList " + removeNumber(arrayList,enterNumberRemove) + " нс");
        System.out.println("Время выполнения добавления в LinkedList " + removeNumber(linkedList,enterNumberRemove) + " нс");
        System.out.println("Время выполнения добавления в HashSet " + removeNumber(hashSet,enterNumberRemove) + " нс");
        System.out.println("Время выполнения добавления в TreeSet " + removeNumber(treeSet,enterNumberRemove) + " нс");

/*Вывод коллекций на экран после удаления числа*/
        System.out.println("");
        System.out.println("Коллекции после удаления числа");
        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);
        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

/*поиск числа в коллекции*/
        enterNumberGet = readInt("Введите число для поиска в коллекции: ");

        System.out.println("Время выполнения добавления в ArrayList " + getNumber(arrayList,enterNumberGet) + " нс");
        System.out.println("Время выполнения добавления в LinkedList " + getNumber(linkedList,enterNumberGet) + " нс");
        System.out.println("Время выполнения добавления в HashSet " + getNumber(hashSet,enterNumberGet) + " нс");
        System.out.println("Время выполнения добавления в TreeSet " + getNumber(treeSet,enterNumberGet) + " нс");

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

    public static long addNumber(Collection addCollection, int enterNumber){
        long startTask, endTask, resultTime;
        resultTime=0;
        startTask = System.nanoTime();
        addCollection.add(enterNumber);
        endTask = System.nanoTime();
        resultTime = endTask - startTask;
        return resultTime;
    }

    public static long removeNumber(Collection removeCollection, int enterNumber){
        long startTask, endTask, resultTime;
        resultTime=0;
        startTask = System.nanoTime();
        removeCollection.remove(enterNumber);
        endTask = System.nanoTime();
        resultTime = endTask - startTask;
        return resultTime;
    }

    public static long getNumber(Collection getCollection, int enterNumber){
        long startTask, endTask, resultTime;
        resultTime=0;
        startTask = System.nanoTime();
        if (getCollection.contains(enterNumber))
            System.out.println(enterNumber);
        endTask = System.nanoTime();
        resultTime = endTask - startTask;
        return resultTime;
    }

}