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
 * The ConfigCreateDetails is a POJO class extends AviRestResource that used for creating
 * ConfigCreateDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigCreateDetails")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGCREATEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigCreateDetails extends AviRestResource {
    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage = null;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path = null;

    @JsonProperty("request_data")
    @JsonInclude(Include.NON_NULL)
    private String requestData = null;

    @JsonProperty("resource_data")
    @JsonInclude(Include.NON_NULL)
    private String resourceData = null;

    @JsonProperty("resource_name")
    @JsonInclude(Include.NON_NULL)
    private String resourceName = null;

    @JsonProperty("resource_type")
    @JsonInclude(Include.NON_NULL)
    private String resourceType = null;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status = null;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user = null;



  /**
   * This is the getter method this will return the attribute value.
   * Error message if request failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if request failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Api path.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Api path.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request data if request failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestData
   */
  @VsoMethod
  public String getRequestData() {
    return requestData;
  }

  /**
   * This is the setter method to the attribute.
   * Request data if request failed.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestData set the requestData.
   */
  @VsoMethod
  public void setRequestData(String  requestData) {
    this.requestData = requestData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Data of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceData
   */
  @VsoMethod
  public String getResourceData() {
    return resourceData;
  }

  /**
   * This is the setter method to the attribute.
   * Data of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceData set the resourceData.
   */
  @VsoMethod
  public void setResourceData(String  resourceData) {
    this.resourceData = resourceData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceName
   */
  @VsoMethod
  public String getResourceName() {
    return resourceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceName set the resourceName.
   */
  @VsoMethod
  public void setResourceName(String  resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Config type of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceType
   */
  @VsoMethod
  public String getResourceType() {
    return resourceType;
  }

  /**
   * This is the setter method to the attribute.
   * Config type of the created resource.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceType set the resourceType.
   */
  @VsoMethod
  public void setResourceType(String  resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param user set the user.
   */
  @VsoMethod
  public void setUser(String  user) {
    this.user = user;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigCreateDetails objConfigCreateDetails = (ConfigCreateDetails) o;
  return   Objects.equals(this.path, objConfigCreateDetails.path)&&
  Objects.equals(this.user, objConfigCreateDetails.user)&&
  Objects.equals(this.status, objConfigCreateDetails.status)&&
  Objects.equals(this.resourceType, objConfigCreateDetails.resourceType)&&
  Objects.equals(this.resourceName, objConfigCreateDetails.resourceName)&&
  Objects.equals(this.requestData, objConfigCreateDetails.requestData)&&
  Objects.equals(this.errorMessage, objConfigCreateDetails.errorMessage)&&
  Objects.equals(this.resourceData, objConfigCreateDetails.resourceData);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigCreateDetails {\n");
      sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
        sb.append("    resourceData: ").append(toIndentedString(resourceData)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

