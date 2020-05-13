package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrPrefix;
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
 * VNICNetwork
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VNICNetwork")
@VsoFinder(name = Constants.FINDER_VRO_VNICNETWORK, idAccessor = "getObjectID()")
@Service
public class VNICNetwork extends AviRestResource  {
  @JsonProperty("ctlr_alloc")
  private Boolean ctlrAlloc = null;

  @JsonProperty("ip")
  private IpAddrPrefix ip = null;

  @JsonProperty("mode")
  private String mode = "DHCP";

  
  /**
   * Placeholder for description of property ctlr_alloc of obj type vNICNetwork field type str  type boolean
   * @return ctlrAlloc
  **/
  @ApiModelProperty(value = "Placeholder for description of property ctlr_alloc of obj type vNICNetwork field type str  type boolean")


 
  @VsoMethod  
  public Boolean isCtlrAlloc() {
    return ctlrAlloc;
  }
    
  @VsoMethod
  public void setCtlrAlloc(Boolean ctlrAlloc) {
    this.ctlrAlloc = ctlrAlloc;
  }

  
  /**
   * Placeholder for description of property ip of obj type vNICNetwork field type str  type object
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "Placeholder for description of property ip of obj type vNICNetwork field type str  type object")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddrPrefix ip) {
    this.ip = ip;
  }

  
  /**
   *  Enum options - DHCP, STATIC, VIP, DOCKER_HOST.
   * @return mode
  **/
  @ApiModelProperty(required = true, value = " Enum options - DHCP, STATIC, VIP, DOCKER_HOST.")
  @NotNull


 
  @VsoMethod  
  public String getMode() {
    return mode;
  }
    
  @VsoMethod
  public void setMode(String mode) {
    this.mode = mode;
  }

  
  public String getObjectID() {
		return "VNICNetwork";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VNICNetwork vNICNetwork = (VNICNetwork) o;
    return Objects.equals(this.ctlrAlloc, vNICNetwork.ctlrAlloc) &&
        Objects.equals(this.ip, vNICNetwork.ip) &&
        Objects.equals(this.mode, vNICNetwork.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctlrAlloc, ip, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VNICNetwork {\n");
    
    sb.append("    ctlrAlloc: ").append(toIndentedString(ctlrAlloc)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

