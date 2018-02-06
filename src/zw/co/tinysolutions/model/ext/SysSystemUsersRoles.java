/*
 * Maps system users to one or more roles(User Types)
 */
package zw.co.tinysolutions.model.ext;

import java.util.logging.Logger;

/**
 *
 * @author Brighton
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysSystemUsersRoles implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysSystemUsersRoles.class.getName());
    private Integer id;
    private SysConnectedSystemsUsers sysConnectedSystemsUsers;
    private SysUserTypes sysUserTypes;
    private boolean status = true;

    public SysSystemUsersRoles() {
    }

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
     * @return the sysSystemUsers
     */
    public SysConnectedSystemsUsers getSysConnectedSystemsUsers() {
        return sysConnectedSystemsUsers;
    }

    /**
     * @param sysConnectedSystemsUsers the sysConnectedSystemsUsers to set
     */
    public void setSysConnectedSystemsUsers(SysConnectedSystemsUsers sysConnectedSystemsUsers) {
        this.sysConnectedSystemsUsers = sysConnectedSystemsUsers;
    }

    /**
     * @return the sysUserTypes
     */
    public SysUserTypes getSysUserTypes() {
        return sysUserTypes;
    }

    /**
     * @param sysUserTypes the sysUserTypes to set
     */
    public void setSysUserTypes(SysUserTypes sysUserTypes) {
        this.sysUserTypes = sysUserTypes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
