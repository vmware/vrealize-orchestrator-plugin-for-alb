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
 * The ConfigUpdateDetails is a POJO class extends AviRestResource that used for creating
 * ConfigUpdateDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigUpdateDetails")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGUPDATEDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigUpdateDetails extends AviRestResource {
  @JsonProperty("error_message")
  @JsonInclude(Include.NON_NULL)
  private String errorMessage = null;

  @JsonProperty("new_resource_data")
  @JsonInclude(Include.NON_NULL)
  private String newResourceData = null;

  @JsonProperty("old_resource_data")
  @JsonInclude(Include.NON_NULL)
  private String oldResourceData = null;

  @JsonProperty("path")
  @JsonInclude(Include.NON_NULL)
  private String path = null;

  @JsonProperty("request_data")
  @JsonInclude(Include.NON_NULL)
  private String requestData = null;

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
   * @return errorMessage
   */
  @VsoMethod
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * This is the setter method to the attribute.
   * Error message if request failed.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * New updated data of the resource.
   * @return newResourceData
   */
  @VsoMethod
  public String getNewResourceData() {
    return newResourceData;
  }

  /**
   * This is the setter method to the attribute.
   * New updated data of the resource.
   * @param newResourceData set the newResourceData.
   */
  @VsoMethod
  public void setNewResourceData(String  newResourceData) {
    this.newResourceData = newResourceData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Old & overwritten data of the resource.
   * @return oldResourceData
   */
  @VsoMethod
  public String getOldResourceData() {
    return oldResourceData;
  }

  /**
   * This is the setter method to the attribute.
   * Old & overwritten data of the resource.
   * @param oldResourceData set the oldResourceData.
   */
  @VsoMethod
  public void setOldResourceData(String  oldResourceData) {
    this.oldResourceData = oldResourceData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Api path.
   * @return path
   */
  @VsoMethod
  public String getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Api path.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request data if request failed.
   * @return requestData
   */
  @VsoMethod
  public String getRequestData() {
    return requestData;
  }

  /**
   * This is the setter method to the attribute.
   * Request data if request failed.
   * @param requestData set the requestData.
   */
  @VsoMethod
  public void setRequestData(String  requestData) {
    this.requestData = requestData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the created resource.
   * @return resourceName
   */
  @VsoMethod
  public String getResourceName() {
    return resourceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the created resource.
   * @param resourceName set the resourceName.
   */
  @VsoMethod
  public void setResourceName(String  resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Config type of the updated resource.
   * @return resourceType
   */
  @VsoMethod
  public String getResourceType() {
    return resourceType;
  }

  /**
   * This is the setter method to the attribute.
   * Config type of the updated resource.
   * @param resourceType set the resourceType.
   */
  @VsoMethod
  public void setResourceType(String  resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status.
   * @param status set the status.
   */
  @VsoMethod
  public void setStatus(String  status) {
    this.status = status;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request user.
   * @return user
   */
  @VsoMethod
  public String getUser() {
    return user;
  }

  /**
   * This is the setter method to the attribute.
   * Request user.
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
  ConfigUpdateDetails objConfigUpdateDetails = (ConfigUpdateDetails) o;
  return   Objects.equals(this.status, objConfigUpdateDetails.status)&&
  Objects.equals(this.requestData, objConfigUpdateDetails.requestData)&&
  Objects.equals(this.resourceName, objConfigUpdateDetails.resourceName)&&
  Objects.equals(this.errorMessage, objConfigUpdateDetails.errorMessage)&&
  Objects.equals(this.oldResourceData, objConfigUpdateDetails.oldResourceData)&&
  Objects.equals(this.user, objConfigUpdateDetails.user)&&
  Objects.equals(this.newResourceData, objConfigUpdateDetails.newResourceData)&&
  Objects.equals(this.path, objConfigUpdateDetails.path)&&
  Objects.equals(this.resourceType, objConfigUpdateDetails.resourceType);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigUpdateDetails {\n");
      sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    newResourceData: ").append(toIndentedString(newResourceData)).append("\n");
        sb.append("    oldResourceData: ").append(toIndentedString(oldResourceData)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
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

