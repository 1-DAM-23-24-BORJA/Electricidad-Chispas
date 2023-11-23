public class Client  implements Customer {

    private String clientCode;

    private  String fullName;
    private String name;
    private String surname;
    private String dni;
    private String postalAddress;
    private String town;
    private String provincie;
    private String email;
    private String phone;


    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getId() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String Id) {
        this.dni = Id;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getProvince() {
        return null;
    }

    @Override
    public void setProvince(String province) {

    }

    public String getProvincie() {
        return provincie;
    }

    public void setProvincie(String provincie) {
        this.provincie = provincie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientCode='" + clientCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dni='" + dni + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", town='" + town + '\'' +
                ", provincie='" + provincie + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
