package zw.co.tinysolutions.model.ext;

/**
 *
 * @author Britney
 */

public class ContactUs implements java.io.Serializable {

    private String name;
    private String lastname;
    private String Email_Address;
    private String Telephone_Number;
    private String Enquiry_Title;
    private String Your_Message;
    private String sitename;
    private boolean valid;

    public ContactUs() {
    }

    public ContactUs(String name, String lastname, String Email_Address,
            String Telephone_Number, String Enquiry_Title, String Your_Message,
            String sitename, boolean valid) {
        this.name = name;
        this.lastname = lastname;
        this.Email_Address = Email_Address;
        this.Telephone_Number = Telephone_Number;
        this.Enquiry_Title = Enquiry_Title;
        this.Your_Message = Your_Message;
        this.sitename = sitename;
        this.valid = valid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the Email_Address
     */
    public String getEmail_Address() {
        return Email_Address;
    }

    /**
     * @param Email_Address the Email_Address to set
     */
    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    /**
     * @return the Telephone_Number
     */
    public String getTelephone_Number() {
        return Telephone_Number;
    }

    /**
     * @param Telephone_Number the Telephone_Number to set
     */
    public void setTelephone_Number(String Telephone_Number) {
        this.Telephone_Number = Telephone_Number;
    }

    /**
     * @return the Enquiry_Title
     */
    public String getEnquiry_Title() {
        return Enquiry_Title;
    }

    /**
     * @param Enquiry_Title the Enquiry_Title to set
     */
    public void setEnquiry_Title(String Enquiry_Title) {
        this.Enquiry_Title = Enquiry_Title;
    }

    /**
     * @return the Your_Message
     */
    public String getYour_Message() {
        return Your_Message;
    }

    /**
     * @param Your_Message the Your_Message to set
     */
    public void setYour_Message(String Your_Message) {
        this.Your_Message = Your_Message;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * @return the sitename
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * @param sitename the sitename to set
     */
    public void setSitename(String sitename) {
        this.sitename = sitename;
    }
}
