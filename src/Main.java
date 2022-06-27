import java.util.Scanner;

public class Main {

    private static final Row rw = new Row();
    private static final Row[] rows = Service.readFile();

    public static void main(String[] args) {
        System.out.println(" Enter 1, to open database connection "); // открыть соединение с базой данных
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if (num ==1){
//            Service.openConnection();

        }
    }


}
