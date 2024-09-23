package org.acme.cc_approval.model;


public class Customer {
    private String name; 
    private String telephoneNumber;

    private String email;
    private String address;
    private String postalCode;
    private String state;
    private String country;

    public Customer(String name, String telephoneNumber, String email, String address, String postalCode, String state,
            String country) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.state = state;
        this.country = country;
    }

    public Customer create() {
        Customer cust = new Customer(name, telephoneNumber, email, address, postalCode, state, country);
        return cust;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", telephoneNumber=" + telephoneNumber + ", email=" + email + ", address="
                + address + ", postalCode=" + postalCode + ", state=" + state + ", country=" + country + "]";
    }
    
}
