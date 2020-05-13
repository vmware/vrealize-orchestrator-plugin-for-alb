package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * EmailConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "EmailConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_EMAILCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class EmailConfiguration extends AviRestResource  {
  @JsonProperty("auth_password")
  private String authPassword = null;

  @JsonProperty("auth_username")
  private String authUsername = null;

  @JsonProperty("disable_tls")
  private Boolean disableTls = null;

  @JsonProperty("from_email")
  private String fromEmail = "admin@avicontroller.net";

  @JsonProperty("mail_server_name")
  private String mailServerName = "localhost";

  @JsonProperty("mail_server_port")
  private Integer mailServerPort = 25;

  @JsonProperty("smtp_type")
  private String smtpType = "SMTP_LOCAL_HOST";

  
  /**
   * Password for mail server.
   * @return authPassword
  **/
  @ApiModelProperty(value = "Password for mail server.")


 
  @VsoMethod  
  public String getAuthPassword() {
    return authPassword;
  }
    
  @VsoMethod
  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  
  /**
   * Username for mail server.
   * @return authUsername
  **/
  @ApiModelProperty(value = "Username for mail server.")


 
  @VsoMethod  
  public String getAuthUsername() {
    return authUsername;
  }
    
  @VsoMethod
  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  
  /**
   * When set, disables TLS on the connection to the mail server. Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * @return disableTls
  **/
  @ApiModelProperty(value = "When set, disables TLS on the connection to the mail server. Field introduced in 17.2.12, 18.1.3, 18.2.1.")


 
  @VsoMethod  
  public Boolean isDisableTls() {
    return disableTls;
  }
    
  @VsoMethod
  public void setDisableTls(Boolean disableTls) {
    this.disableTls = disableTls;
  }

  
  /**
   * Email address in From field.
   * @return fromEmail
  **/
  @ApiModelProperty(value = "Email address in From field.")


 
  @VsoMethod  
  public String getFromEmail() {
    return fromEmail;
  }
    
  @VsoMethod
  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  
  /**
   * Mail server host.
   * @return mailServerName
  **/
  @ApiModelProperty(value = "Mail server host.")


 
  @VsoMethod  
  public String getMailServerName() {
    return mailServerName;
  }
    
  @VsoMethod
  public void setMailServerName(String mailServerName) {
    this.mailServerName = mailServerName;
  }

  
  /**
   * Mail server port.
   * @return mailServerPort
  **/
  @ApiModelProperty(value = "Mail server port.")


 
  @VsoMethod  
  public Integer getMailServerPort() {
    return mailServerPort;
  }
    
  @VsoMethod
  public void setMailServerPort(Integer mailServerPort) {
    this.mailServerPort = mailServerPort;
  }

  
  /**
   * Type of SMTP Mail Service. Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.
   * @return smtpType
  **/
  @ApiModelProperty(required = true, value = "Type of SMTP Mail Service. Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.")
  @NotNull


 
  @VsoMethod  
  public String getSmtpType() {
    return smtpType;
  }
    
  @VsoMethod
  public void setSmtpType(String smtpType) {
    this.smtpType = smtpType;
  }

  
  public String getObjectID() {
		return "EmailConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConfiguration emailConfiguration = (EmailConfiguration) o;
    return Objects.equals(this.authPassword, emailConfiguration.authPassword) &&
        Objects.equals(this.authUsername, emailConfiguration.authUsername) &&
        Objects.equals(this.disableTls, emailConfiguration.disableTls) &&
        Objects.equals(this.fromEmail, emailConfiguration.fromEmail) &&
        Objects.equals(this.mailServerName, emailConfiguration.mailServerName) &&
        Objects.equals(this.mailServerPort, emailConfiguration.mailServerPort) &&
        Objects.equals(this.smtpType, emailConfiguration.smtpType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassword, authUsername, disableTls, fromEmail, mailServerName, mailServerPort, smtpType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfiguration {\n");
    
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    disableTls: ").append(toIndentedString(disableTls)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    mailServerName: ").append(toIndentedString(mailServerName)).append("\n");
    sb.append("    mailServerPort: ").append(toIndentedString(mailServerPort)).append("\n");
    sb.append("    smtpType: ").append(toIndentedString(smtpType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

