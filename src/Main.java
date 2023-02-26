import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2019;
        boolean yearLeap = isYearLeap(year);
        System.out.println("Год — " + year + " ,результат = " + yearLeap);

        determineTypeOC(0, 2015);

        int deliveryDistance = 65;
        int deliveryTime = calculateTime(deliveryDistance);
        System.out.println("Потребуется " + deliveryTime + " дней для дистанции " + deliveryDistance);

    }

    public static boolean isYearLeap(int year) {

        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

    }

    public static void determineTypeOC(int type, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (type == 0) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= currentYear) {
                System.out.println("Установите нормальную версию приложения для ios по ссылке");
            }
        } else if (type == 1) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= currentYear) {
                System.out.println("Установите нормальную версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateTime(int deliveryDistance) {

        if (deliveryDistance <=0 || deliveryDistance > 100){
            return -1;
        }
           int deliveryTime = 1;

        if (deliveryDistance >= 20) {
            deliveryTime++;
        }
        if (deliveryDistance >= 60) {
            deliveryTime++;
        }
        return deliveryTime;
    }
}