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
 * The PortMatch is a POJO class extends AviRestResource that used for creating
 * PortMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "PortMatch")
@VsoFinder(name = Constants.FINDER_VRO_PORTMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class PortMatch extends AviRestResource {
  @JsonProperty("match_criteria")
  @JsonInclude(Include.NON_NULL)
  private String matchCriteria = null;

  @JsonProperty("ports")
  @JsonInclude(Include.NON_NULL)
  private List<Integer> ports = null;



  /**
   * This is the getter method this will return the attribute value.
   * Criterion to use for port matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
   */
  @VsoMethod
  public String getMatchCriteria() {
    return matchCriteria;
  }

  /**
   * This is the setter method to the attribute.
   * Criterion to use for port matching the http request.
   * Enum options - IS_IN, IS_NOT_IN.
   * @param matchCriteria set the matchCriteria.
   */
  @VsoMethod
  public void setMatchCriteria(String  matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Listening tcp port(s).
   * Allowed values are 1-65535.
   * @return ports
   */
  @VsoMethod
  public List<Integer> getPorts() {
    return ports;
  }

  /**
   * This is the setter method. this will set the ports
   * Listening tcp port(s).
   * Allowed values are 1-65535.
   * @return ports
   */
  @VsoMethod
  public void setPorts(List<Integer>  ports) {
    this.ports = ports;
  }

  /**
   * This is the setter method this will set the ports
   * Listening tcp port(s).
   * Allowed values are 1-65535.
   * @return ports
   */
  @VsoMethod
  public PortMatch addPortsItem(Integer portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<Integer>();
    }
    this.ports.add(portsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  PortMatch objPortMatch = (PortMatch) o;
  return   Objects.equals(this.ports, objPortMatch.ports)&&
  Objects.equals(this.matchCriteria, objPortMatch.matchCriteria);
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
