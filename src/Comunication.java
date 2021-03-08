public class Comunication {
    Application[] applications;
    int numberOfAplications = 0;

    public Comunication() {
        applications = new Application[10];
    }

    public void addAplication(Application application) {
        applications[numberOfAplications++] = application;
    }

    public void displayAllApplications() {
        for (int i = 0; i < applications.length && applications[i] != null; i++) {
            System.out.println(applications[i].getAplicationNumber());
        }
    }

    public void changeStatus(int number, String status) {
        for (int i = 0; i < applications.length && applications[i] != null; i++) {
            applications[i].setStatus(status);
        }
    }

    public void displayApplicationStatus(int number) {
        for (int i = 0; i < applications.length && applications[i] != null; i++) {
            if (applications[i].getAplicationNumber() == number) {
                System.out.println("Status wniosku: " + applications[i].getStatus());
                break;
            }
        }
    }
}
