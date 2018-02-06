package zw.co.tinysolutions.model.ext;
// Generated Sep 2, 2017 2:22:32 PM by Hibernate Tools 4.3.1

import java.util.logging.Logger;

/**
 * SysUserTypes generated by hbm2java
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SysUserTypes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysUserTypes.class.getName());
    private Integer id;
    private String userTypeId;
    private String typeDescription;
    private boolean status = true;
    private SysConnectedSystems sysConnectedSystems;

    public SysUserTypes() {
    }

    public SysUserTypes(String userTypeId, boolean status) {
        this.userTypeId = userTypeId;
        this.status = status;
    }

    public SysUserTypes(String userTypeId, String typeDescription, boolean status) {
        this.userTypeId = userTypeId;
        this.typeDescription = typeDescription;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getTypeDescription() {
        return this.typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the sysConnectedSystems
     */
    public SysConnectedSystems getSysConnectedSystems() {
        return sysConnectedSystems;
    }

    /**
     * @param sysConnectedSystems the sysConnectedSystems to set
     */
    public void setSysConnectedSystems(SysConnectedSystems sysConnectedSystems) {
        this.sysConnectedSystems = sysConnectedSystems;
    }

}