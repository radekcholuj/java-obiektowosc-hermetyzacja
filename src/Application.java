public class Application {
    private String name;
    private String sureName;
    private String licensePlate;
    private String status;
    private int aplicationNumber;

    public Application(String name, String sureName, String licensePlate, int aplicationNumber) {
        this.name = name;
        this.sureName = sureName;
        this.licensePlate = licensePlate;
        this.aplicationNumber = aplicationNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayApplication() {
        System.out.println("Wniosek złożył: " + getSureName() + " " + getName());
        System.out.println("rodzaj tablicy: " + getLicensePlate());
        System.out.println("Status wniosku: " + getStatus());
        System.out.println("Numer złożonego wniosku: " + getAplicationNumber());


    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getStatus() {
        return status;
    }

    public int getAplicationNumber() {
        return aplicationNumber;
    }
}
