public class Address {
    private String houseNumber;
    private String street;
    private int aptNum;
    private String city;
    private String state;
    private int zipCode;

    public Address(String houseNumber, String street, int aptNum, String city, String state, int zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address x) {
        this.houseNumber = x.getHouseNumber();
        this.street = x.getStreet();
        this.aptNum = x.getAptNum();
        this.city = x.getCity();
        this.state = x.getState();
        this.zipCode = x.getZipCode();
    }
    // 1313 Mockingbird Lane Apt 6A, Springfield, MO 65123
    public Address(String newAddress){
        String[] segments = newAddress.split(",");
        String first = segments[0];
        String second = segments[1];
        String third = segments[2];
        String[] segments2 = first.split(" ")
    }


    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getAptNum() {
        return aptNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
}
