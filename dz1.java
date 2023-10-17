package homework1;

import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //Д/з: создать приложение запрашивающее у пользователя//
 System.out.print("Input product name: ");  //наименование товара
 String  productName = scanner.nextLine();

        System.out.printf("Input amount of product: "); //количество
        int num = scanner.nextInt();
        System.out.printf("Your amount of product: %d \n", num); //  прибудет к вам в ближайшее время
        scanner.nextLine();

        System.out.printf("Input phone contact: "); // телефон пользователя
        long l1=scanner.nextLong();
        System.out.printf("Your phone contact:  %d \n", l1); // 5_555_555_5555L;
        scanner.nextLine();

        System.out.print("Input address: "); //адрес
String address = scanner.nextLine();
        System.out.println("Ваш заказ принят");  // Ваш заказ принят
        System.out.printf("Product name: %s amount of product: %d  \n", productName, num);
        System.out.println(" Tовар доставим по адресу: "); // Товар доставим по адресу:
        System.out.printf("Adress: %s phone: %d  \n", address, l1 );
       scanner.close();

       //В консоль выводит информацию о заказе, в виде:
   // Товар <Наименование товара>
   // в количестве <количество>
    // Товар доставим по адресу: <адрес>.
   //  Ваш контактный номер: <телефон>

    }
}
