package zw.co.tinysolutions.model.ext;

/**
 *
 * @author Brighton
 */
public interface StaticURL {

    public static String DEFAULT_APP_UID = "{000000aa-a0a0-00a0-aaa0-000a0aa000a0}";
    public static String SECURE_URL = "http://localhost:8080/securebase";
    public static String NEW_USER_URL = "http://localhost:8080/securebase/newuser";
    public static String SEND_HTML_MAIL_URL = "http://localhost:8080/securebase/sendHtmlMail";
    public static String FIND_USER_BY_ID_URL = "http://localhost:8080/securebase/finduserbyid";
    public static String FIND_USER_BY_EMAIL_URL = "http://localhost:8080/securebase/finduserbyemail";
    public static String SEND_PLAIN_MAIL_URL = "http://localhost:8080/securebase/sendPlainMail";
    public static String GET_PROFILE_PICTURE="http://localhost:8080/securebase/remoteProfilePicture";
    public static String REMOTE_LOGIN_URL="http://localhost:8080/securebase/rlogin";
}
