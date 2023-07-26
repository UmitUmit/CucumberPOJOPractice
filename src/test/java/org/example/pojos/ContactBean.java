package org.example.pojos;

public class ContactBean {

    private String firstName;
    private String lastName;
    private int officePhone;
    private int cellPhone;
    private String email;

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

    public int getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(int officePhone) {
        this.officePhone = officePhone;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
