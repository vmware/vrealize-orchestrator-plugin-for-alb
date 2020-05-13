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
 * DnsRuleActionAllowDrop
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleActionAllowDrop")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONALLOWDROP, idAccessor = "getObjectID()")
@Service
public class DnsRuleActionAllowDrop extends AviRestResource  {
  @JsonProperty("allow")
  private Boolean allow = true;

  @JsonProperty("reset_conn")
  private Boolean resetConn = true;

  
  /**
   * Allow the DNS query. Field introduced in 17.1.1.
   * @return allow
  **/
  @ApiModelProperty(value = "Allow the DNS query. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isAllow() {
    return allow;
  }
    
  @VsoMethod
  public void setAllow(Boolean allow) {
    this.allow = allow;
  }

  
  /**
   * Reset the TCP connection of the DNS query, if allow is set to false to drop the query. Field introduced in 17.1.1.
   * @return resetConn
  **/
  @ApiModelProperty(value = "Reset the TCP connection of the DNS query, if allow is set to false to drop the query. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public Boolean isResetConn() {
    return resetConn;
  }
    
  @VsoMethod
  public void setResetConn(Boolean resetConn) {
    this.resetConn = resetConn;
  }

  
  public String getObjectID() {
		return "DnsRuleActionAllowDrop";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionAllowDrop dnsRuleActionAllowDrop = (DnsRuleActionAllowDrop) o;
    return Objects.equals(this.allow, dnsRuleActionAllowDrop.allow) &&
        Objects.equals(this.resetConn, dnsRuleActionAllowDrop.resetConn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, resetConn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionAllowDrop {\n");
    
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    resetConn: ").append(toIndentedString(resetConn)).append("\n");
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

