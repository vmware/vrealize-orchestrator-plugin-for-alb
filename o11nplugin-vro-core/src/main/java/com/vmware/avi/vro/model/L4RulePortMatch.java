package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.PortRange;
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
 * L4RulePortMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "L4RulePortMatch")
@VsoFinder(name = Constants.FINDER_VRO_L4RULEPORTMATCH, idAccessor = "getObjectID()")
@Service
public class L4RulePortMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("port_ranges")
  @Valid
  private List<PortRange> portRanges = null;

  @JsonProperty("ports")
  @Valid
  private List<Integer> ports = null;

  
  /**
   * Criterion to use for Virtual Service port matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for Virtual Service port matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  public L4RulePortMatch addPortRangesItem(PortRange portRangesItem) {
    if (this.portRanges == null) {
      this.portRanges = new ArrayList<PortRange>();
    }
    this.portRanges.add(portRangesItem);
    return this;
  }
  
  /**
   * Range of TCP/UDP port numbers of the Virtual Service. Field introduced in 17.2.7.
   * @return portRanges
  **/
  @ApiModelProperty(value = "Range of TCP/UDP port numbers of the Virtual Service. Field introduced in 17.2.7.")

  @Valid

 
  @VsoMethod  
  public List<PortRange> getPortRanges() {
    return portRanges;
  }
    
  @VsoMethod
  public void setPortRanges(List<PortRange> portRanges) {
    this.portRanges = portRanges;
  }

  
  public L4RulePortMatch addPortsItem(Integer portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<Integer>();
    }
    this.ports.add(portsItem);
    return this;
  }
  
  /**
   * Virtual Service's listening port(s). Allowed values are 1-65535. Field introduced in 17.2.7.
   * @return ports
  **/
  @ApiModelProperty(value = "Virtual Service's listening port(s). Allowed values are 1-65535. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public List<Integer> getPorts() {
    return ports;
  }
    
  @VsoMethod
  public void setPorts(List<Integer> ports) {
    this.ports = ports;
  }

  
  public String getObjectID() {
		return "L4RulePortMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RulePortMatch l4RulePortMatch = (L4RulePortMatch) o;
    return Objects.equals(this.matchCriteria, l4RulePortMatch.matchCriteria) &&
        Objects.equals(this.portRanges, l4RulePortMatch.portRanges) &&
        Objects.equals(this.ports, l4RulePortMatch.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, portRanges, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4RulePortMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
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

