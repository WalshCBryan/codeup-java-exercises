public class Address {

    String number;
    String street;
    String town;
    String zipCode;
    boolean domestic;

    public Address(String number,
                   String street,
                   String town,
                   String zipCode,
                   boolean domestic) {
        this.number = number;
        this.street = street;
        this.town = town;
        this.zipCode = zipCode;
        this.domestic = domestic;

    }
}
