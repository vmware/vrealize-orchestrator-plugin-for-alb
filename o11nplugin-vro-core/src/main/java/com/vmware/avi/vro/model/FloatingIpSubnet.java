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
 * FloatingIpSubnet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "FloatingIpSubnet")
@VsoFinder(name = Constants.FINDER_VRO_FLOATINGIPSUBNET, idAccessor = "getObjectID()")
@Service
public class FloatingIpSubnet extends AviRestResource  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefix")
  private IpAddrPrefix prefix = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * FloatingIp subnet name if available, else uuid. Field introduced in 17.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "FloatingIp subnet name if available, else uuid. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * FloatingIp subnet prefix. Field introduced in 17.2.1.
   * @return prefix
  **/
  @ApiModelProperty(value = "FloatingIp subnet prefix. Field introduced in 17.2.1.")

  @Valid

 
  @VsoMethod  
  public IpAddrPrefix getPrefix() {
    return prefix;
  }
    
  @VsoMethod
  public void setPrefix(IpAddrPrefix prefix) {
    this.prefix = prefix;
  }

  
  /**
   * FloatingIp subnet uuid. Field introduced in 17.2.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "FloatingIp subnet uuid. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "FloatingIpSubnet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatingIpSubnet floatingIpSubnet = (FloatingIpSubnet) o;
    return Objects.equals(this.name, floatingIpSubnet.name) &&
        Objects.equals(this.prefix, floatingIpSubnet.prefix) &&
        Objects.equals(this.uuid, floatingIpSubnet.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, prefix, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatingIpSubnet {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

