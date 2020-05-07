package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.StringMatch;
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
 * ClientInsightsSampling
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "ClientInsightsSampling")
@VsoFinder(name = Constants.FINDER_VRO_CLIENTINSIGHTSSAMPLING, idAccessor = "getObjectID()")
@Service
public class ClientInsightsSampling extends AviRestResource  {
  @JsonProperty("client_ip")
  private IpAddrMatch clientIp = null;

  @JsonProperty("sample_uris")
  private StringMatch sampleUris = null;

  @JsonProperty("skip_uris")
  private StringMatch skipUris = null;

  
  /**
   * Client IP addresses to check when inserting RUM script.
   * @return clientIp
  **/
  @ApiModelProperty(value = "Client IP addresses to check when inserting RUM script.")

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIp() {
    return clientIp;
  }
    
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  
  /**
   * URL patterns to check when inserting RUM script.
   * @return sampleUris
  **/
  @ApiModelProperty(value = "URL patterns to check when inserting RUM script.")

  @Valid

 
  @VsoMethod  
  public StringMatch getSampleUris() {
    return sampleUris;
  }
    
  @VsoMethod
  public void setSampleUris(StringMatch sampleUris) {
    this.sampleUris = sampleUris;
  }

  
  /**
   * URL patterns to avoid when inserting RUM script.
   * @return skipUris
  **/
  @ApiModelProperty(value = "URL patterns to avoid when inserting RUM script.")

  @Valid

 
  @VsoMethod  
  public StringMatch getSkipUris() {
    return skipUris;
  }
    
  @VsoMethod
  public void setSkipUris(StringMatch skipUris) {
    this.skipUris = skipUris;
  }

  
  public String getObjectID() {
		return "ClientInsightsSampling";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInsightsSampling clientInsightsSampling = (ClientInsightsSampling) o;
    return Objects.equals(this.clientIp, clientInsightsSampling.clientIp) &&
        Objects.equals(this.sampleUris, clientInsightsSampling.sampleUris) &&
        Objects.equals(this.skipUris, clientInsightsSampling.skipUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, sampleUris, skipUris);
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

