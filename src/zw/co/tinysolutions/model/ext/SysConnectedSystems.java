package zw.co.tinysolutions.model.ext;

import java.util.logging.Logger;

/**
 *
 * @author Brighton
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysConnectedSystems implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysConnectedSystems.class.getName());

    private Integer id;
    private String systemName;
    private String applicationUID;
    private String applicationOwner;
    private String applicationUrl;    
    private SysSystemUsers sysSystemUsers;
    private boolean status=true;

    public SysConnectedSystems() {
    }

    public SysConnectedSystems(Integer id, String systemName, String applicationUID, 
            String applicationOwner, String applicationUrl,
            boolean status, SysSystemUsers sysSystemUsers) {
        this.id = id;
        this.systemName = systemName;
        this.applicationUID = applicationUID;
        this.applicationOwner = applicationOwner;
        this.applicationUrl = applicationUrl;
        this.status = status;
        this.sysSystemUsers = sysSystemUsers;
    }

  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

  public String getApplicationUID() {
        return applicationUID;
    }

    public void setApplicationUID(String applicationUID) {
        this.applicationUID = applicationUID;
    }

  public String getApplicationOwner() {
        return applicationOwner;
    }

    public void setApplicationOwner(String applicationOwner) {
        this.applicationOwner = applicationOwner;
    }

  public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }    
    
    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   public SysSystemUsers getSysSystemUsers() {
        return this.sysSystemUsers;
    }

    public void setSysSystemUsers(SysSystemUsers sysSystemUsers) {
        this.sysSystemUsers = sysSystemUsers;
    }
    
}
