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
 * OshiftSharedVirtualService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "OshiftSharedVirtualService")
@VsoFinder(name = Constants.FINDER_VRO_OSHIFTSHAREDVIRTUALSERVICE, idAccessor = "getObjectID()")
@Service
public class OshiftSharedVirtualService extends AviRestResource  {
  @JsonProperty("virtualservice_name")
  private String virtualserviceName = null;

  
  /**
   * Name of shared virtualservice. VirtualService will be created automatically by Cloud Connector. Field introduced in 17.1.1.
   * @return virtualserviceName
  **/
  @ApiModelProperty(required = true, value = "Name of shared virtualservice. VirtualService will be created automatically by Cloud Connector. Field introduced in 17.1.1.")
  @NotNull


 
  @VsoMethod  
  public String getVirtualserviceName() {
    return virtualserviceName;
  }
    
  @VsoMethod
  public void setVirtualserviceName(String virtualserviceName) {
    this.virtualserviceName = virtualserviceName;
  }

  
  public String getObjectID() {
		return "OshiftSharedVirtualService";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OshiftSharedVirtualService oshiftSharedVirtualService = (OshiftSharedVirtualService) o;
    return Objects.equals(this.virtualserviceName, oshiftSharedVirtualService.virtualserviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualserviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OshiftSharedVirtualService {\n");
    
    sb.append("    virtualserviceName: ").append(toIndentedString(virtualserviceName)).append("\n");
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

