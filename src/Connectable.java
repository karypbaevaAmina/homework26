public interface Connectable {

    void openConnection();

    void closeDataBaseGonnection();

    void checkBaseConnection();

    void readString(); // считать строку по индексу

    void keyRecord(); // запись по какому то ключу

    void readKeyRecord(); //считать одну запись по ключу

    void readSomeEntries(); // считать некоторый набор записи

    void EntriesNumber(); // узнать количество записей

    void addNote(); // добавить запись

    void entryIndexUpdate(); // обновить значение записи по индексу

    void contentKey(); //обновить содержимое по ключу

}
