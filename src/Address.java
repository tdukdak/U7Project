import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Address {
    private String houseNumber;
    private String street;
    private int aptNum;
    private String city;
    private String state;
    private int zipCode;

    public String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        try {
            while((line = reader.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        }
        finally {
            reader.close();
        }


    }

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
        String[] separateAddress = newAddress.split(",");
        String first = separateAddress[0];
        String second = separateAddress[1];
        String third = separateAddress[2];
        this.houseNumber = first.substring((0,first.indexOf("Apt"))-1);
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
