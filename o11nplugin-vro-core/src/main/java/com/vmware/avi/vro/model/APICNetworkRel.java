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
 * The APICNetworkRel is a POJO class extends AviRestResource that used for creating
 * APICNetworkRel.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "APICNetworkRel")
@VsoFinder(name = Constants.FINDER_VRO_APICNETWORKREL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class APICNetworkRel extends AviRestResource {
    @JsonProperty("connector")
    @JsonInclude(Include.NON_NULL)
    private String connector = null;

    @JsonProperty("rel_key")
    @JsonInclude(Include.NON_NULL)
    private String relKey = null;

    @JsonProperty("target_network")
    @JsonInclude(Include.NON_NULL)
    private String targetNetwork = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property connector of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return connector
   */
  @VsoMethod
  public String getConnector() {
    return connector;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property connector of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param connector set the connector.
   */
  @VsoMethod
  public void setConnector(String  connector) {
    this.connector = connector;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property rel_key of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return relKey
   */
  @VsoMethod
  public String getRelKey() {
    return relKey;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property rel_key of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param relKey set the relKey.
   */
  @VsoMethod
  public void setRelKey(String  relKey) {
    this.relKey = relKey;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property target_network of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return targetNetwork
   */
  @VsoMethod
  public String getTargetNetwork() {
    return targetNetwork;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property target_network of obj type apicnetworkrel field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param targetNetwork set the targetNetwork.
   */
  @VsoMethod
  public void setTargetNetwork(String  targetNetwork) {
    this.targetNetwork = targetNetwork;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  APICNetworkRel objAPICNetworkRel = (APICNetworkRel) o;
  return   Objects.equals(this.relKey, objAPICNetworkRel.relKey)&&
  Objects.equals(this.connector, objAPICNetworkRel.connector)&&
  Objects.equals(this.targetNetwork, objAPICNetworkRel.targetNetwork);
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

