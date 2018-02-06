package zw.co.tinysolutions.model.ext;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 *
 * @author Brighton
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysSystemUsers implements java.io.Serializable{

  
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysSystemUsers.class.getName());
    private Integer id;
    private String userName;
    private String firstName="";
    private String lastName="";
    private boolean passwordStatus=false;
    private Date dateCreated=new Date();
    private Date lastChangeDate=new Date();
    private boolean accountStatus=false;
    private String email;
    private String phone="";
    private boolean status=true;
    private Set<SysUserPasswords> sysUserPasswordses = new HashSet<>(0);
    private Set<SysAuditMaster> sysAuditMasters = new HashSet<>(0);
    private Set<SysPendingTokens> sysPendingTokenses = new HashSet<>(0);
    private Set<SysSystemUsersContactInformation> sysSystemUsersContactInformations = new HashSet<>(0);


    public SysSystemUsers() {
    }

    public SysSystemUsers(Integer id, String userName, String firstName, String lastName,
            boolean passwordStatus, Date dateCreated, Date lastChangeDate, 
            boolean accountStatus, String email, String phone) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordStatus = passwordStatus;
        this.dateCreated = dateCreated;
        this.lastChangeDate = lastChangeDate;
        this.accountStatus = accountStatus;
        this.email = email;
        this.phone = phone;
    }

    
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the passwordStatus
     */
    public boolean isPasswordStatus() {
        return passwordStatus;
    }

    /**
     * @param passwordStatus the passwordStatus to set
     */
    public void setPasswordStatus(boolean passwordStatus) {
        this.passwordStatus = passwordStatus;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the lastChangeDate
     */
    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * @param lastChangeDate the lastChangeDate to set
     */
    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    /**
     * @return the accountStatus
     */
    public boolean isAccountStatus() {
        return accountStatus;
    }

    /**
     * @param accountStatus the accountStatus to set
     */
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
  public Set<SysUserPasswords> getSysUserPasswordses() {
        return this.sysUserPasswordses;
    }

    public void setSysUserPasswordses(Set<SysUserPasswords> sysUserPasswordses) {
        this.sysUserPasswordses = sysUserPasswordses;
    }

   public Set<SysAuditMaster> getSysAuditMasters() {
        return this.sysAuditMasters;
    }

    public void setSysAuditMasters(Set<SysAuditMaster> sysAuditMasters) {
        this.sysAuditMasters = sysAuditMasters;
    }

  public Set<SysPendingTokens> getSysPendingTokenses() {
        return this.sysPendingTokenses;
    }

    public void setSysPendingTokenses(Set<SysPendingTokens> sysPendingTokenses) {
        this.sysPendingTokenses = sysPendingTokenses;
    }

    
  public Set<SysSystemUsersContactInformation> getSysSystemUsersContactInformations() {
        return this.sysSystemUsersContactInformations;
    }

    public void setSysSystemUsersContactInformations(Set<SysSystemUsersContactInformation> sysSystemUsersContactInformations) {
        this.sysSystemUsersContactInformations = sysSystemUsersContactInformations;
    }

    
}
