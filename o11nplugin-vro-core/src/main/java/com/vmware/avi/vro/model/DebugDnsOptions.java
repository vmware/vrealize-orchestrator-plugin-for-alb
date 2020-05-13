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
 * DebugDnsOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DebugDnsOptions")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGDNSOPTIONS, idAccessor = "getObjectID()")
@Service
public class DebugDnsOptions extends AviRestResource  {
  @JsonProperty("domain_name")
  @Valid
  private List<String> domainName = null;

  @JsonProperty("gslb_service_name")
  @Valid
  private List<String> gslbServiceName = null;

  
  public DebugDnsOptions addDomainNameItem(String domainNameItem) {
    if (this.domainName == null) {
      this.domainName = new ArrayList<String>();
    }
    this.domainName.add(domainNameItem);
    return this;
  }
  
  /**
   * This field filters the FQDN for Dns debug. Field introduced in 18.2.1.
   * @return domainName
  **/
  @ApiModelProperty(value = "This field filters the FQDN for Dns debug. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public List<String> getDomainName() {
    return domainName;
  }
    
  @VsoMethod
  public void setDomainName(List<String> domainName) {
    this.domainName = domainName;
  }

  
  public DebugDnsOptions addGslbServiceNameItem(String gslbServiceNameItem) {
    if (this.gslbServiceName == null) {
      this.gslbServiceName = new ArrayList<String>();
    }
    this.gslbServiceName.add(gslbServiceNameItem);
    return this;
  }
  
  /**
   * This field filters the Gslb service for Dns debug. Field introduced in 18.2.1.
   * @return gslbServiceName
  **/
  @ApiModelProperty(value = "This field filters the Gslb service for Dns debug. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public List<String> getGslbServiceName() {
    return gslbServiceName;
  }
    
  @VsoMethod
  public void setGslbServiceName(List<String> gslbServiceName) {
    this.gslbServiceName = gslbServiceName;
  }

  
  public String getObjectID() {
		return "DebugDnsOptions";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugDnsOptions debugDnsOptions = (DebugDnsOptions) o;
    return Objects.equals(this.domainName, debugDnsOptions.domainName) &&
        Objects.equals(this.gslbServiceName, debugDnsOptions.gslbServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, gslbServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugDnsOptions {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    gslbServiceName: ").append(toIndentedString(gslbServiceName)).append("\n");
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

