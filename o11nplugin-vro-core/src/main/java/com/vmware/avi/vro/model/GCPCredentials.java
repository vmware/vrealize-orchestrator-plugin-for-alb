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
 * GCPCredentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPCredentials")
@VsoFinder(name = Constants.FINDER_VRO_GCPCREDENTIALS, idAccessor = "getObjectID()")
@Service
public class GCPCredentials extends AviRestResource  {
  @JsonProperty("service_account_keyfile_data")
  private String serviceAccountKeyfileData = null;

  
  /**
   * Google Cloud Platform Service Account keyfile data in JSON format. Field introduced in 18.2.1.
   * @return serviceAccountKeyfileData
  **/
  @ApiModelProperty(value = "Google Cloud Platform Service Account keyfile data in JSON format. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getServiceAccountKeyfileData() {
    return serviceAccountKeyfileData;
  }
    
  @VsoMethod
  public void setServiceAccountKeyfileData(String serviceAccountKeyfileData) {
    this.serviceAccountKeyfileData = serviceAccountKeyfileData;
  }

  
  public String getObjectID() {
		return "GCPCredentials";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPCredentials gcPCredentials = (GCPCredentials) o;
    return Objects.equals(this.serviceAccountKeyfileData, gcPCredentials.serviceAccountKeyfileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountKeyfileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPCredentials {\n");
    
    sb.append("    serviceAccountKeyfileData: ").append(toIndentedString(serviceAccountKeyfileData)).append("\n");
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

