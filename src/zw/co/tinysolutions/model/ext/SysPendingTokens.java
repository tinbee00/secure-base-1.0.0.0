package zw.co.tinysolutions.model.ext;
// Generated Sep 2, 2017 2:22:32 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.logging.Logger;

/**
 * SysPendingTokens generated by hbm2java
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysPendingTokens implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(SysPendingTokens.class.getName());
    private Integer id;
    private SysSystemUsers sysSystemUsers;
    private String token;
    private Date tokenDate;
    private String activationUrl;
    private boolean status;

    public SysPendingTokens() {
    }

    public SysPendingTokens(SysSystemUsers sysSystemUsers, Date tokenDate, boolean status) {
        this.sysSystemUsers = sysSystemUsers;
        this.tokenDate = tokenDate;
        this.status = status;
    }

    public SysPendingTokens(SysSystemUsers sysSystemUsers, String token, Date tokenDate, String activationUrl, boolean status) {
        this.sysSystemUsers = sysSystemUsers;
        this.token = token;
        this.tokenDate = tokenDate;
        this.activationUrl = activationUrl;
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

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenDate() {
        return this.tokenDate;
    }

    public void setTokenDate(Date tokenDate) {
        this.tokenDate = tokenDate;
    }

    public String getActivationUrl() {
        return this.activationUrl;
    }

    public void setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
    }

   public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
