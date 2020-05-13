package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * GCPVIPILB
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "GCPVIPILB")
@VsoFinder(name = Constants.FINDER_VRO_GCPVIPILB, idAccessor = "getObjectID()")
@Service
public class GCPVIPILB extends AviRestResource  {
  @JsonProperty("cloud_router_ids")
  @Valid
  private List<String> cloudRouterIds = null;

  
  public GCPVIPILB addCloudRouterIdsItem(String cloudRouterIdsItem) {
    if (this.cloudRouterIds == null) {
      this.cloudRouterIds = new ArrayList<String>();
    }
    this.cloudRouterIds.add(cloudRouterIdsItem);
    return this;
  }
  
  /**
   * Google Cloud Router IDs to advertise BYOIP. Field introduced in 20.1.1.
   * @return cloudRouterIds
  **/
  @ApiModelProperty(value = "Google Cloud Router IDs to advertise BYOIP. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public List<String> getCloudRouterIds() {
    return cloudRouterIds;
  }
    
  @VsoMethod
  public void setCloudRouterIds(List<String> cloudRouterIds) {
    this.cloudRouterIds = cloudRouterIds;
  }

  
  public String getObjectID() {
		return "GCPVIPILB";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPVIPILB GCPVIPILB = (GCPVIPILB) o;
    return Objects.equals(this.cloudRouterIds, GCPVIPILB.cloudRouterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudRouterIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPVIPILB {\n");
    
    sb.append("    cloudRouterIds: ").append(toIndentedString(cloudRouterIds)).append("\n");
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

