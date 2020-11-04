package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The NsxConfiguration is a POJO class extends AviRestResource that used for creating
 * NsxConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "NsxConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_NSXCONFIGURATION)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class NsxConfiguration extends AviRestResource {
    @JsonProperty("avi_nsx_prefix")
    @JsonInclude(Include.NON_NULL)
    private String aviNsxPrefix = null;

    @JsonProperty("nsx_manager_name")
    @JsonInclude(Include.NON_NULL)
    private String nsxManagerName = null;

    @JsonProperty("nsx_manager_password")
    @JsonInclude(Include.NON_NULL)
    private String nsxManagerPassword = null;

    @JsonProperty("nsx_manager_username")
    @JsonInclude(Include.NON_NULL)
    private String nsxManagerUsername = null;

    @JsonProperty("nsx_poll_time")
    @JsonInclude(Include.NON_NULL)
    private Integer nsxPollTime = 300;



  /**
   * This is the getter method this will return the attribute value.
   * This prefix will be added to the names of all nsx objects created by avi controller.
   * It should be unique across all the avi controller clusters.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return aviNsxPrefix
   */
  @VsoMethod
  public String getAviNsxPrefix() {
    return aviNsxPrefix;
  }

  /**
   * This is the setter method to the attribute.
   * This prefix will be added to the names of all nsx objects created by avi controller.
   * It should be unique across all the avi controller clusters.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param aviNsxPrefix set the aviNsxPrefix.
   */
  @VsoMethod
  public void setAviNsxPrefix(String  aviNsxPrefix) {
    this.aviNsxPrefix = aviNsxPrefix;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The hostname or ip address of the nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxManagerName
   */
  @VsoMethod
  public String getNsxManagerName() {
    return nsxManagerName;
  }

  /**
   * This is the setter method to the attribute.
   * The hostname or ip address of the nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxManagerName set the nsxManagerName.
   */
  @VsoMethod
  public void setNsxManagerName(String  nsxManagerName) {
    this.nsxManagerName = nsxManagerName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The password avi vantage will use when authenticating with nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxManagerPassword
   */
  @VsoMethod
  public String getNsxManagerPassword() {
    return nsxManagerPassword;
  }

  /**
   * This is the setter method to the attribute.
   * The password avi vantage will use when authenticating with nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxManagerPassword set the nsxManagerPassword.
   */
  @VsoMethod
  public void setNsxManagerPassword(String  nsxManagerPassword) {
    this.nsxManagerPassword = nsxManagerPassword;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The username avi vantage will use when authenticating with nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nsxManagerUsername
   */
  @VsoMethod
  public String getNsxManagerUsername() {
    return nsxManagerUsername;
  }

  /**
   * This is the setter method to the attribute.
   * The username avi vantage will use when authenticating with nsx mgr.
   * Field introduced in 17.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nsxManagerUsername set the nsxManagerUsername.
   */
  @VsoMethod
  public void setNsxManagerUsername(String  nsxManagerUsername) {
    this.nsxManagerUsername = nsxManagerUsername;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The interval (in secs) with which avi controller polls the nsx manager for updates.
   * Field introduced in 17.1.1.
   * Unit is seconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @return nsxPollTime
   */
  @VsoMethod
  public Integer getNsxPollTime() {
    return nsxPollTime;
  }

  /**
   * This is the setter method to the attribute.
   * The interval (in secs) with which avi controller polls the nsx manager for updates.
   * Field introduced in 17.1.1.
   * Unit is seconds.
   * Default value when not specified in API or module is interpreted by Avi Controller as 300.
   * @param nsxPollTime set the nsxPollTime.
   */
  @VsoMethod
  public void setNsxPollTime(Integer  nsxPollTime) {
    this.nsxPollTime = nsxPollTime;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  NsxConfiguration objNsxConfiguration = (NsxConfiguration) o;
  return   Objects.equals(this.nsxManagerName, objNsxConfiguration.nsxManagerName)&&
  Objects.equals(this.nsxManagerUsername, objNsxConfiguration.nsxManagerUsername)&&
  Objects.equals(this.nsxManagerPassword, objNsxConfiguration.nsxManagerPassword)&&
  Objects.equals(this.aviNsxPrefix, objNsxConfiguration.aviNsxPrefix)&&
  Objects.equals(this.nsxPollTime, objNsxConfiguration.nsxPollTime);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class NsxConfiguration {\n");
      sb.append("    aviNsxPrefix: ").append(toIndentedString(aviNsxPrefix)).append("\n");
        sb.append("    nsxManagerName: ").append(toIndentedString(nsxManagerName)).append("\n");
        sb.append("    nsxManagerPassword: ").append(toIndentedString(nsxManagerPassword)).append("\n");
        sb.append("    nsxManagerUsername: ").append(toIndentedString(nsxManagerUsername)).append("\n");
        sb.append("    nsxPollTime: ").append(toIndentedString(nsxPollTime)).append("\n");
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

