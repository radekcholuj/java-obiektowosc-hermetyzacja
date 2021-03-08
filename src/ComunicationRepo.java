import java.util.Scanner;

public class ComunicationRepo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comunication comunication = new Comunication();


        int choose;
        int applicationNumber = 1;

        do {

            System.out.println("\n----- Communication Department - Customer Service application -----");
            System.out.println("select the operation number\n");
            System.out.println("1 - submission of the application ");
            System.out.println("2 - change submission status ");
            System.out.println("3 - checking the status of the application ");
            System.out.println("100 - end program ");


            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("To nie jest poprawna opcja");
            }
            choose = scanner.nextInt();
            scanner.nextLine();


            switch (choose) {
                case 1:

                    System.out.println("*****");
                    System.out.println("Wniosek składa: ");
                    System.out.print("Imię: ");
                    String name = scanner.nextLine();
                    System.out.print("Nazwisko: ");
                    String sureName = scanner.nextLine();
                    System.out.println("Wniosek o wydanie tablicy: ");
                    System.out.println("1 - samochodowa");
                    System.out.println("2 - motocyklowa");
                    System.out.println("3 - zabytkowa");
                    String typeOfLicensePlate = scanner.next();
                    String licensePlate = "";

                    switch (typeOfLicensePlate) {
                        case "1":
                            licensePlate = "samochodowa";
                            break;
                        case "2":
                            licensePlate = "motocyklowa";
                            break;
                        case "3":
                            licensePlate = "tymczasowa";
                    }
                    Application application = new Application(name, sureName, licensePlate, applicationNumber);
                    comunication.addAplication(application);
                    application.displayApplication();
                    applicationNumber++;
                    break;
                case 2:
                    System.out.println("*****");
                    System.out.print("Podaj numer wniosku: ");
                    int number = scanner.nextInt();

                    System.out.println("Możesz zmienić status wniosku");
                    System.out.println("1 - w realizacji");
                    System.out.println("2 - do odbioru");
                    String chooseStatusOption;
                    chooseStatusOption = scanner.next();
                    switch (chooseStatusOption) {
                        case "1":
                            comunication.changeStatus(number, "w realizacji");
                            break;
                        case "2":
                            comunication.changeStatus(number, "do odbioru");
                            break;
                    }
                    comunication.displayApplicationStatus(number);
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("wyświetla status wniosku");
                    System.out.println("*****");
                    System.out.print("Podaj numer wniosku: ");
                    number = scanner.nextInt();
                    comunication.displayApplicationStatus(number);
                    break;
                case 100:
                    System.out.println("Dziękujemy za skorzystanie z aplikacji");
                    break;
            }

        } while (choose != 100);
    }
}