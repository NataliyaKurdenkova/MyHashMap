import java.util.*;

/***
 * Это структура данных (класс), которая содержит набор пар “ключ-значение”.
 * @autor Курденкова Наталия
 * @version 1.0
 * @param <K> - ключ
 * @param <V> - значение
 */
public class MyHashMap<K, V> {
    /** DEFAULT_INITIAL_CAPACITY - значение по умолчанию емкости MyHashMap*/
    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    /** MAX_CAPACITY - максимальное значение по умолчанию емкости MyHashMap*/
    public static final int MAX_CAPACITY = 1073741824;

    /** DEFAULT_LOAD_FACTOR - значение по умолчанию коэффициента загруженности MyHashMap*/
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /** количество пар «ключ-значение» (количество занятых ячеек)*/
    private int size;

    /** коэффициент загруженности*/
    private double loadFactor;

    /** емкость*/
    private int capacity;

    /** предельное количество элементов, при достижении которого размер таблицы увеличивается */
    private double threshold;

    /** сама таблица, реализованная на основе массива, для хранения пар «ключ-значение» в виде листов. */
    private List[] table;

/** конструктор, создает отображение по умолчанию: объемом (capacity) = 16 и с коэффициентом загруженности (load factor) = 0.75;*/
    public MyHashMap() {
        capacity = DEFAULT_INITIAL_CAPACITY;
        loadFactor = DEFAULT_LOAD_FACTOR;
        this.table = new LinkedList[capacity];
        this.threshold = capacity * loadFactor;
    }

    /** конструктор,Э создает отображение с заданной начальной емкостью.*/
    public MyHashMap(int capacity) {

        if (capacity <= 0) capacity = DEFAULT_INITIAL_CAPACITY;
        if (capacity >= MAX_CAPACITY) capacity = MAX_CAPACITY;

        this.capacity = capacity;

    }

    /** конструктор, создает отображение с начальной емкостью и коэффициентом загруженности.*/
    public MyHashMap(int capacity, double loadFactor) {
        if (capacity <= 0) capacity = DEFAULT_INITIAL_CAPACITY;
        if (capacity >= MAX_CAPACITY) capacity = MAX_CAPACITY;

        if (loadFactor <= 0 || Double.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor");
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.threshold = capacity * loadFactor;
    }

    /** метод, показывающий количество занятых ячеек.
     * @return - возвращает количество целых ячеек в виде целого числа*/
    public int size() {
        return size;
    }

    /** метод, для определения пуста ли MyHashMap
     * @return возвращает true - если MyHashMap пуста и возвращает false, если нет*/
    public boolean isEmpty() {
        return size == 0;
    }

    /** метод, для вставки значения в MyHashMap
     *
     * @param key - ключ
     * @param value - значение
     */
    public void put(K key, V value) {
        if (size >= loadFactor * capacity) {
            capacity += threshold;
            threshold = capacity * loadFactor;
            table = copyArray(capacity);
        }
        int ind = index(hash(key));
        List<Node> list;
        if (size >= 0 && size < capacity) {
            if (table[ind] == null) {
                addSimple(ind, key, value);
            } else {
                list = table[ind];
                Node<K, V> newNode = new Node<>(hash(key), key, value, null);
                for (int i = 0; i < list.size(); i++) {
                    Node<K, V> node = list.get(i);
                    if (node.getHash() == (newNode.getHash())) {
                        if (node.getKey().equals(newNode.getKey())) {
                            if (list.size() != 0) removeLink(list, node, newNode);
                            list.remove(node);
                            break;
                        }

                    }
                }
                if (list.size() != 0) addLink(list, newNode);
                list.add(newNode);
                table[ind] = list;
            }

        }

    }

    /** метод для определения хэш значения
     *
     * @param key - ключ
     * @return возвращает хэш переданного ключа, в виде целого числа
     */
    public final int hash(K key) {
        return Objects.hashCode(key);
    }

    /** метод для определения ячейки, в которую будет втавлен элемент
     *
     * @param hash - хэш
     * @return возвращает номер ячейки
     */
    private int index(int hash) {
        return hash & (capacity - 1);
    }

    /** метод для получения значения по ключу
     *
     * @param key - ключ
     * @return возвращает значение
     */
    public V get(K key) {
        Node<K, V> node;
        return (node = getNode(key)) == null ? null : node.getValue();
    }

    /** метод для получения Set ключей
     *
     * @return возвращает Set из ключей, находящихся в MyHashMap
     */
    public Set<K> keySet() {
        Set<K> keys = new LinkedHashSet<>();
        Iterator<Node> iteratorList;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                iteratorList = table[i].listIterator();
                while (iteratorList.hasNext()) {
                    Node<K, V> next = iteratorList.next();
                    keys.add(next.getKey());

                }
            }
        }
        return keys;
    }

    /** метод для получения Node
     *
     * @param key - ключ
     * @return возвращает Node по ключу
     */
    private Node<K, V> getNode(K key) {
        int ind = index(hash(key));
        List<Node> list = table[ind];
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = iterator.next();
            if (node.getKey().equals(key)) return node;
        }
        return null;
    }

    /** метод для копирования одной MyHashMap в другую, для увеличения размера
     *
     * @param capacity - заданная емкость
     * @return возвращает массив листов
     */
    private List[] copyArray(int capacity) {
        List[] newTable = new List[capacity];
        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[i];
        }
        return newTable;
    }

    /** метод, для простой вставки в MyHashMap
     *
     * @param ind - индекс ячейки массива
     * @param key - ключ
     * @param value - значение
     */
    private void addSimple(int ind, K key, V value) {
        List list = new LinkedList<>();
        Node<K, V> newNode = new Node<>(hash(key), key, value, null);
        list.add(newNode);
        table[ind] = list;
        size++;
    }

    /** метод для удаления и перезаписи ссылок при удалении элемента
     *
     * @param list - лист откуда удалять
     * @param nodeRem - элемент, который удаляем
     * @param newNode - элемент для вставки, если есть
     */
    private void removeLink(List<Node> list, Node<K, V> nodeRem, Node<K, V> newNode) {
        Iterator<Node> iterator = list.iterator();
        if (iterator.hasNext()) {
            Node<K, V> node = iterator.next();

            if (node.getNextNode() != null && node.getNextNode().equals(nodeRem)) {
                node.setNextNode(newNode);
                newNode.setNextNode(nodeRem.getNextNode());
            }

        }
    }

    /** метод, для добавления ссылок
     *
     * @param list - лист в котором проверить ссылки
     * @param nodeAdd - новый элемент, вставляемый в MyHashMap
     */
    private void addLink(List<Node> list, Node<K, V> nodeAdd) {
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = iterator.next();
            if (node.getNextNode() == null) {
                node.setNextNode(nodeAdd);
            }
        }

    }

    /** метод для удаления элемента по ключу
     *
     * @param key - ключ
     * @return - возвращает значение удаляемого элемента
     */
    public V remove(K key) {
        Node<K, V> node;
        return (node = removeNode(key)) == null ? null : node.getValue();
    }

    /** метод для удаления Node из MyHashMap по ключу
     *
     * @param key - ключ
     * @return возвращает удаляемую ноду
     */
    private Node<K, V> removeNode(K key) {
        int ind = index(hash(key));
        List<Node> list = table[ind];
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = iterator.next();
            if (node.getKey().equals(key)) {
                iterator.remove();
                table[ind] = list;
                if (table[ind] == null) size--;
                return node;
            }
        }
        return null;
    }

    /** метод для очистки MyHashMap   */
    public void clear() {
        size = 0;
        table = null;
    }

    /** метод для получения коллекции значений
     *
     * @return - возвращщает коллекцию значений Node, хранимых в MyHashMap
     */
    public Collection<V> values() {
        Collection<V> values = new LinkedList<>();
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                List<Node> list = table[i];
                Iterator<Node> iterator = list.listIterator();
                while (iterator.hasNext()) {
                    Node<K, V> node = iterator.next();
                    values.add(node.getValue());
                }
            }
        }
        return values;
    }


}
