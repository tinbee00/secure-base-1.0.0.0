package zw.co.tinysolutions.model.ext;
// Generated Sep 2, 2017 2:22:32 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.logging.Logger;

/**
 * CrmClientContactInformation generated by hbm2java
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysSystemUsersContactInformation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysSystemUsersContactInformation.class.getName());

    private Integer id;
    private SysSystemUsers sysSystemUsers;
    private SysContactInformationTypes sysContactInformationTypes;
    private String contactInformation;
    private Date dateAdded;
    private Date dateChanged;
    private Boolean status;

    public SysSystemUsersContactInformation() {
    }

    public SysSystemUsersContactInformation(Integer id, SysSystemUsers sysSystemUsers, SysContactInformationTypes sysContactInformationTypes, String contactInformation, Date dateAdded, Date dateChanged, Boolean status) {
        this.id = id;
        this.sysSystemUsers = sysSystemUsers;
        this.sysContactInformationTypes = sysContactInformationTypes;
        this.contactInformation = contactInformation;
        this.dateAdded = dateAdded;
        this.dateChanged = dateChanged;
        this.status = status;
    }

    
 public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  public SysSystemUsers getSysSystemUsers() {
        return this.sysSystemUsers;
    }

    public void setSysSystemUsers(SysSystemUsers sysSystemUsers) {
        this.sysSystemUsers = sysSystemUsers;
    }

   public SysContactInformationTypes getSysContactInformationTypes() {
        return this.sysContactInformationTypes;
    }

    public void setSysContactInformationTypes(SysContactInformationTypes sysContactInformationTypes) {
        this.sysContactInformationTypes = sysContactInformationTypes;
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

   public Date getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

   public Date getDateChanged() {
        return this.dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}