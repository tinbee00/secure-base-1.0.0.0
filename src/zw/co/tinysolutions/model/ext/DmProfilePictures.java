/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.tinysolutions.model.ext;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Brighton
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DmProfilePictures implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(DmProfilePictures.class.getName());

    private int id;
    private SysSystemUsers sysSystemUsers;
    private byte[] profilePicture;
    private String fileName;
    private String fileType;
    private Date dateUploaded;
    private boolean status;

    public DmProfilePictures() {
    }

    public DmProfilePictures(int id, SysSystemUsers sysSystemUsers, Date dateUploaded, boolean status) {
        this.id = id;
        this.sysSystemUsers = sysSystemUsers;
        this.dateUploaded = dateUploaded;
        this.status = status;
    }

    public DmProfilePictures(int id, SysSystemUsers sysSystemUsers, byte[] profilePicture, String fileName, String fileType, Date dateUploaded, boolean status) {
        this.id = id;
        this.sysSystemUsers = sysSystemUsers;
        this.profilePicture = profilePicture;
        this.fileName = fileName;
        this.fileType = fileType;
        this.dateUploaded = dateUploaded;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SysSystemUsers getSysSystemUsers() {
        return this.sysSystemUsers;
    }

    public void setSysSystemUsers(SysSystemUsers sysSystemUsers) {
        this.sysSystemUsers = sysSystemUsers;
    }

    public byte[] getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Date getDateUploaded() {
        return this.dateUploaded;
    }

    public void setDateUploaded(Date dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
