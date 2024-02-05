package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ClientInsightsSampling is a POJO class extends AviRestResource that used for creating
 * ClientInsightsSampling.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ClientInsightsSampling")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTINSIGHTSSAMPLING)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ClientInsightsSampling extends AviRestResource {
    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp;

    @JsonProperty("sample_uris")
    @JsonInclude(Include.NON_NULL)
    private StringMatch sampleUris;

    @JsonProperty("skip_uris")
    @JsonInclude(Include.NON_NULL)
    private StringMatch skipUris;



  /**
   * This is the getter method this will return the attribute value.
   * Client ip addresses to check when inserting rum script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public IpAddrMatch getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Client ip addresses to check when inserting rum script.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url patterns to check when inserting rum script.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sampleUris
   */
  @VsoMethod
  public StringMatch getSampleUris() {
    return sampleUris;
  }

  /**
   * This is the setter method to the attribute.
   * Url patterns to check when inserting rum script.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sampleUris set the sampleUris.
   */
  @VsoMethod
  public void setSampleUris(StringMatch sampleUris) {
    this.sampleUris = sampleUris;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Url patterns to avoid when inserting rum script.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return skipUris
   */
  @VsoMethod
  public StringMatch getSkipUris() {
    return skipUris;
  }

  /**
   * This is the setter method to the attribute.
   * Url patterns to avoid when inserting rum script.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param skipUris set the skipUris.
   */
  @VsoMethod
  public void setSkipUris(StringMatch skipUris) {
    this.skipUris = skipUris;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ClientInsightsSampling objClientInsightsSampling = (ClientInsightsSampling) o;
  return   Objects.equals(this.skipUris, objClientInsightsSampling.skipUris)&&
  Objects.equals(this.sampleUris, objClientInsightsSampling.sampleUris)&&
  Objects.equals(this.clientIp, objClientInsightsSampling.clientIp);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ClientInsightsSampling {\n");
      sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    sampleUris: ").append(toIndentedString(sampleUris)).append("\n");
        sb.append("    skipUris: ").append(toIndentedString(skipUris)).append("\n");
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

