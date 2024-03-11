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
 * The AsyncPatchState is a POJO class extends AviRestResource that used for creating
 * AsyncPatchState.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AsyncPatchState")
@VsoFinder(name = Constants.FINDER_VRO_ASYNCPATCHSTATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AsyncPatchState extends AviRestResource {
    @JsonProperty("error_message")
    @JsonInclude(Include.NON_NULL)
    private String errorMessage;

    @JsonProperty("error_status_code")
    @JsonInclude(Include.NON_NULL)
    private Integer errorStatusCode;

    @JsonProperty("merged_patch_id")
    @JsonInclude(Include.NON_NULL)
    private Integer mergedPatchId;

    @JsonProperty("patch_ids")
    @JsonInclude(Include.NON_NULL)
    private String patchIds;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private String path;

    @JsonProperty("request_data")
    @JsonInclude(Include.NON_NULL)
    private String requestData;

    @JsonProperty("resource_data")
    @JsonInclude(Include.NON_NULL)
    private String resourceData;

    @JsonProperty("resource_name")
    @JsonInclude(Include.NON_NULL)
    private String resourceName;

    @JsonProperty("resource_type")
    @JsonInclude(Include.NON_NULL)
    private String resourceType;

    @JsonProperty("status")
    @JsonInclude(Include.NON_NULL)
    private String status;

    @JsonProperty("user")
    @JsonInclude(Include.NON_NULL)
    private String user;



  /**
   * This is the getter method this will return the attribute value.
   * Error message if request failed.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorMessage set the errorMessage.
   */
  @VsoMethod
  public void setErrorMessage(String  errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Error status code if request failed.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return errorStatusCode
   */
  @VsoMethod
  public Integer getErrorStatusCode() {
    return errorStatusCode;
  }

  /**
   * This is the setter method to the attribute.
   * Error status code if request failed.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorStatusCode set the errorStatusCode.
   */
  @VsoMethod
  public void setErrorStatusCode(Integer  errorStatusCode) {
    this.errorStatusCode = errorStatusCode;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Merged patch id.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mergedPatchId
   */
  @VsoMethod
  public Integer getMergedPatchId() {
    return mergedPatchId;
  }

  /**
   * This is the setter method to the attribute.
   * Merged patch id.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mergedPatchId set the mergedPatchId.
   */
  @VsoMethod
  public void setMergedPatchId(Integer  mergedPatchId) {
    this.mergedPatchId = mergedPatchId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of patch ids.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return patchIds
   */
  @VsoMethod
  public String getPatchIds() {
    return patchIds;
  }

  /**
   * This is the setter method to the attribute.
   * List of patch ids.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param patchIds set the patchIds.
   */
  @VsoMethod
  public void setPatchIds(String  patchIds) {
    this.patchIds = patchIds;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Api path.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(String  path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Request data.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return requestData
   */
  @VsoMethod
  public String getRequestData() {
    return requestData;
  }

  /**
   * This is the setter method to the attribute.
   * Request data.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param requestData set the requestData.
   */
  @VsoMethod
  public void setRequestData(String  requestData) {
    this.requestData = requestData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Async patch queue data for which status is updated.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceData
   */
  @VsoMethod
  public String getResourceData() {
    return resourceData;
  }

  /**
   * This is the setter method to the attribute.
   * Async patch queue data for which status is updated.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceData set the resourceData.
   */
  @VsoMethod
  public void setResourceData(String  resourceData) {
    this.resourceData = resourceData;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the resource.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceName
   */
  @VsoMethod
  public String getResourceName() {
    return resourceName;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the resource.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceName set the resourceName.
   */
  @VsoMethod
  public void setResourceName(String  resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Config type of the resource.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return resourceType
   */
  @VsoMethod
  public String getResourceType() {
    return resourceType;
  }

  /**
   * This is the setter method to the attribute.
   * Config type of the resource.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param resourceType set the resourceType.
   */
  @VsoMethod
  public void setResourceType(String  resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Status of async patch.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return status
   */
  @VsoMethod
  public String getStatus() {
    return status;
  }

  /**
   * This is the setter method to the attribute.
   * Status of async patch.
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
   * Field introduced in 22.1.6,30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
  AsyncPatchState objAsyncPatchState = (AsyncPatchState) o;
  return   Objects.equals(this.path, objAsyncPatchState.path)&&
  Objects.equals(this.user, objAsyncPatchState.user)&&
  Objects.equals(this.status, objAsyncPatchState.status)&&
  Objects.equals(this.resourceType, objAsyncPatchState.resourceType)&&
  Objects.equals(this.resourceName, objAsyncPatchState.resourceName)&&
  Objects.equals(this.resourceData, objAsyncPatchState.resourceData)&&
  Objects.equals(this.requestData, objAsyncPatchState.requestData)&&
  Objects.equals(this.errorStatusCode, objAsyncPatchState.errorStatusCode)&&
  Objects.equals(this.errorMessage, objAsyncPatchState.errorMessage)&&
  Objects.equals(this.patchIds, objAsyncPatchState.patchIds)&&
  Objects.equals(this.mergedPatchId, objAsyncPatchState.mergedPatchId);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AsyncPatchState {\n");
      sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorStatusCode: ").append(toIndentedString(errorStatusCode)).append("\n");
        sb.append("    mergedPatchId: ").append(toIndentedString(mergedPatchId)).append("\n");
        sb.append("    patchIds: ").append(toIndentedString(patchIds)).append("\n");
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

