public interface Connectable {


    void openConnection();

    void closeDataBaseGonnection() throws Exception;

    void checkBaseConnection() throws Exception;

    void readString(); // считать строку по индексу

    void keyRecord() throws Exception; // запись по какому то ключу

    void readKeyRecord() throws Exception; //считать одну запись по ключу

    void readSomeEntries(); // считать некоторый набор записи

    void EntriesNumber(); // узнать количество записей

    void addNote() throws Exception; // добавить запись

    void entryIndexUpdate() throws Exception; // обновить значение записи по индексу

    void contentKey() throws Exception; //обновить содержимое по ключу

}
