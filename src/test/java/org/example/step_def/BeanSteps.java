package org.example.step_def;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pojos.ContactBean;

import java.util.List;

public class BeanSteps {

    public static List<ContactBean> savedContacts;
    @Given("I logged into suiteCRM")
    public void i_logged_into_suite_crm() {
        // Assume you have methods for logging into suiteCRM and navigating to the contact creation page.

        private List<ContactBean> savedContacts;

    }

    @When("^I save a new contact:$")
    public void i_save_a_new_contact(DataTable dataTable) {

        // Convert the DataTable to a list of ContactBean objects
        List<ContactBean> contacts = dataTable.asList(ContactBean.class);

        // Save the contacts to the application or perform relevant actions
        // For this example, let's assume we're just storing the contacts in the 'savedContacts' list.
        savedContacts = contacts;
 //ojoajoa

    }

    @Then("^I should see contact information for \"([^\"]*)\"$")
    public void i_should_see_contact_information_for(String fullName) {

        // Find the contact information for the given full name (e.g., "Steve Gates")
        // and compare it with the previously saved contacts

        for (ContactBean contact : savedContacts) {
            String fullNameFromContact = contact.getFirstName() + " " + contact.getLastName();
            if (fullNameFromContact.equals(fullName)) {
                // Your assertions or verification code here...
                // For this example, let's just print the contact information.
                System.out.println("Found contact: " + contact);
                return; // Exit the loop once the contact is found
            }
        }

        // If the loop completes without finding the contact, we can fail the test.
        throw new AssertionError("Contact with full name \"" + fullName + "\" not found.");
    }

    }
}
