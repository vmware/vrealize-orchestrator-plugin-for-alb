package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddrMatch;
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
 * SSLProfileSelector
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "SSLProfileSelector")
@VsoFinder(name = Constants.FINDER_VRO_SSLPROFILESELECTOR, idAccessor = "getObjectID()")
@Service
public class SSLProfileSelector extends AviRestResource  {
  @JsonProperty("client_ip_list")
  private IpAddrMatch clientIpList = null;

  @JsonProperty("ssl_profile_ref")
  private String sslProfileRef = null;

  
  /**
   * Configure client IP address groups. Field introduced in 18.2.3.
   * @return clientIpList
  **/
  @ApiModelProperty(required = true, value = "Configure client IP address groups. Field introduced in 18.2.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddrMatch getClientIpList() {
    return clientIpList;
  }
    
  @VsoMethod
  public void setClientIpList(IpAddrMatch clientIpList) {
    this.clientIpList = clientIpList;
  }

  
  /**
   * SSL profile for the client IP addresses listed. It is a reference to an object of type SSLProfile. Field introduced in 18.2.3.
   * @return sslProfileRef
  **/
  @ApiModelProperty(required = true, value = "SSL profile for the client IP addresses listed. It is a reference to an object of type SSLProfile. Field introduced in 18.2.3.")
  @NotNull


 
  @VsoMethod  
  public String getSslProfileRef() {
    return sslProfileRef;
  }
    
  @VsoMethod
  public void setSslProfileRef(String sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }

  
  public String getObjectID() {
		return "SSLProfileSelector";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLProfileSelector ssLProfileSelector = (SSLProfileSelector) o;
    return Objects.equals(this.clientIpList, ssLProfileSelector.clientIpList) &&
        Objects.equals(this.sslProfileRef, ssLProfileSelector.sslProfileRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIpList, sslProfileRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLProfileSelector {\n");
    
    sb.append("    clientIpList: ").append(toIndentedString(clientIpList)).append("\n");
    sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
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

