package oop.record;

public record HumanRecord(int birthYear,
                          String name,
                          String surname,
                          String lastname) {

    public HumanRecord {
        System.out.println("Hello from record");
    }
public void getInfo(){
    System.out.println(name + " " + lastname);
}
}
