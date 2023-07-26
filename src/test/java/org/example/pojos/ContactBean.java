package org.example.pojos;

public class ContactBean {

    private String firstName;
    private String lastName;
    private String officePhone;
    private String cellPhone;
    private String email;


    public ContactBean(String firstName, String lastName, String officePhone, String cellPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officePhone = officePhone;
        this.cellPhone = cellPhone;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
