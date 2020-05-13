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
 * DNSConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DNSConfig")
@VsoFinder(name = Constants.FINDER_VRO_DNSCONFIG, idAccessor = "getObjectID()")
@Service
public class DNSConfig extends AviRestResource  {
  @JsonProperty("domain_name")
  private String domainName = null;

  
  /**
   * GSLB subdomain used for GSLB service FQDN match and placement. .
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "GSLB subdomain used for GSLB service FQDN match and placement. .")
  @NotNull


 
  @VsoMethod  
  public String getDomainName() {
    return domainName;
  }
    
  @VsoMethod
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  
  public String getObjectID() {
		return "DNSConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSConfig dnSConfig = (DNSConfig) o;
    return Objects.equals(this.domainName, dnSConfig.domainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSConfig {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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

