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
 * APICNetworkRel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "APICNetworkRel")
@VsoFinder(name = Constants.FINDER_VRO_APICNETWORKREL, idAccessor = "getObjectID()")
@Service
public class APICNetworkRel extends AviRestResource  {
  @JsonProperty("connector")
  private String connector = null;

  @JsonProperty("rel_key")
  private String relKey = null;

  @JsonProperty("target_network")
  private String targetNetwork = null;

  
  /**
   * connector of APICNetworkRel.
   * @return connector
  **/
  @ApiModelProperty(value = "connector of APICNetworkRel.")


 
  @VsoMethod  
  public String getConnector() {
    return connector;
  }
    
  @VsoMethod
  public void setConnector(String connector) {
    this.connector = connector;
  }

  
  /**
   * rel_key of APICNetworkRel.
   * @return relKey
  **/
  @ApiModelProperty(value = "rel_key of APICNetworkRel.")


 
  @VsoMethod  
  public String getRelKey() {
    return relKey;
  }
    
  @VsoMethod
  public void setRelKey(String relKey) {
    this.relKey = relKey;
  }

  
  /**
   * target_network of APICNetworkRel.
   * @return targetNetwork
  **/
  @ApiModelProperty(value = "target_network of APICNetworkRel.")


 
  @VsoMethod  
  public String getTargetNetwork() {
    return targetNetwork;
  }
    
  @VsoMethod
  public void setTargetNetwork(String targetNetwork) {
    this.targetNetwork = targetNetwork;
  }

  
  public String getObjectID() {
		return "APICNetworkRel";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICNetworkRel apICNetworkRel = (APICNetworkRel) o;
    return Objects.equals(this.connector, apICNetworkRel.connector) &&
        Objects.equals(this.relKey, apICNetworkRel.relKey) &&
        Objects.equals(this.targetNetwork, apICNetworkRel.targetNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, relKey, targetNetwork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICNetworkRel {\n");
    
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    relKey: ").append(toIndentedString(relKey)).append("\n");
    sb.append("    targetNetwork: ").append(toIndentedString(targetNetwork)).append("\n");
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

