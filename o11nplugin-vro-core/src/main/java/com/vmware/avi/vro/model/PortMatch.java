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
 * PortMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "PortMatch")
@VsoFinder(name = Constants.FINDER_VRO_PORTMATCH, idAccessor = "getObjectID()")
@Service
public class PortMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("ports")
  @Valid
  private List<Integer> ports = null;

  
  /**
   * Criterion to use for port matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for port matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public PortMatch addPortsItem(Integer portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<Integer>();
    }
    this.ports.add(portsItem);
    return this;
  }
  
  /**
   * Listening TCP port(s). Allowed values are 1-65535.
   * @return ports
  **/
  @ApiModelProperty(value = "Listening TCP port(s). Allowed values are 1-65535.")


 
  @VsoMethod  
  public List<Integer> getPorts() {
    return ports;
  }
    
  @VsoMethod
  public void setPorts(List<Integer> ports) {
    this.ports = ports;
  }

  
  public String getObjectID() {
		return "PortMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortMatch portMatch = (PortMatch) o;
    return Objects.equals(this.matchCriteria, portMatch.matchCriteria) &&
        Objects.equals(this.ports, portMatch.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

