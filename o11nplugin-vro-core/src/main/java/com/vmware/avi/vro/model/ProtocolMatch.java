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
 * ProtocolMatch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ProtocolMatch")
@VsoFinder(name = Constants.FINDER_VRO_PROTOCOLMATCH, idAccessor = "getObjectID()")
@Service
public class ProtocolMatch extends AviRestResource  {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("protocols")
  private String protocols = null;

  
  /**
   * Criterion to use for protocol matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.
   * @return matchCriteria
  **/
  @ApiModelProperty(required = true, value = "Criterion to use for protocol matching the HTTP request. Enum options - IS_IN, IS_NOT_IN.")
  @NotNull


 
  @VsoMethod  
  public String getMatchCriteria() {
    return matchCriteria;
  }
    
  @VsoMethod
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  
  /**
   * HTTP or HTTPS protocol. Enum options - HTTP, HTTPS.
   * @return protocols
  **/
  @ApiModelProperty(required = true, value = "HTTP or HTTPS protocol. Enum options - HTTP, HTTPS.")
  @NotNull


 
  @VsoMethod  
  public String getProtocols() {
    return protocols;
  }
    
  @VsoMethod
  public void setProtocols(String protocols) {
    this.protocols = protocols;
  }

  
  public String getObjectID() {
		return "ProtocolMatch";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtocolMatch protocolMatch = (ProtocolMatch) o;
    return Objects.equals(this.matchCriteria, protocolMatch.matchCriteria) &&
        Objects.equals(this.protocols, protocolMatch.protocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, protocols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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

