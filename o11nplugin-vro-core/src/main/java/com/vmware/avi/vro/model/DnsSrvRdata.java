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
 * DnsSrvRdata
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsSrvRdata")
@VsoFinder(name = Constants.FINDER_VRO_DNSSRVRDATA, idAccessor = "getObjectID()")
@Service
public class DnsSrvRdata extends AviRestResource  {
  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("target")
  private String target = "default.host";

  @JsonProperty("weight")
  private Integer weight = null;

  
  /**
   * Service port. Allowed values are 0-65535.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Service port. Allowed values are 0-65535.")
  @NotNull


 
  @VsoMethod  
  public Integer getPort() {
    return port;
  }
    
  @VsoMethod
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Priority of the target hosting the service, low value implies higher priority for this service record. Allowed values are 0-65535.
   * @return priority
  **/
  @ApiModelProperty(value = "Priority of the target hosting the service, low value implies higher priority for this service record. Allowed values are 0-65535.")


 
  @VsoMethod  
  public Integer getPriority() {
    return priority;
  }
    
  @VsoMethod
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * Canonical hostname, of the machine hosting the service, with no trailing period. 'default.host' is valid but not 'default.host.'.
   * @return target
  **/
  @ApiModelProperty(value = "Canonical hostname, of the machine hosting the service, with no trailing period. 'default.host' is valid but not 'default.host.'.")


 
  @VsoMethod  
  public String getTarget() {
    return target;
  }
    
  @VsoMethod
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * Relative weight for service records with same priority, high value implies higher preference for this service record. Allowed values are 0-65535.
   * @return weight
  **/
  @ApiModelProperty(value = "Relative weight for service records with same priority, high value implies higher preference for this service record. Allowed values are 0-65535.")


 
  @VsoMethod  
  public Integer getWeight() {
    return weight;
  }
    
  @VsoMethod
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  public String getObjectID() {
		return "DnsSrvRdata";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsSrvRdata dnsSrvRdata = (DnsSrvRdata) o;
    return Objects.equals(this.port, dnsSrvRdata.port) &&
        Objects.equals(this.priority, dnsSrvRdata.priority) &&
        Objects.equals(this.target, dnsSrvRdata.target) &&
        Objects.equals(this.weight, dnsSrvRdata.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, priority, target, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsSrvRdata {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

