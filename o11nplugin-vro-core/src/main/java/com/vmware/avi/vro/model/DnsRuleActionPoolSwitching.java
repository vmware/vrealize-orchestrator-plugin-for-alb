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
 * DnsRuleActionPoolSwitching
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRuleActionPoolSwitching")
@VsoFinder(name = Constants.FINDER_VRO_DNSRULEACTIONPOOLSWITCHING, idAccessor = "getObjectID()")
@Service
public class DnsRuleActionPoolSwitching extends AviRestResource  {
  @JsonProperty("pool_group_ref")
  private String poolGroupRef = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  
  /**
   * Reference of the pool group to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type PoolGroup. Field introduced in 18.1.3, 17.2.12.
   * @return poolGroupRef
  **/
  @ApiModelProperty(value = "Reference of the pool group to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type PoolGroup. Field introduced in 18.1.3, 17.2.12.")


 
  @VsoMethod  
  public String getPoolGroupRef() {
    return poolGroupRef;
  }
    
  @VsoMethod
  public void setPoolGroupRef(String poolGroupRef) {
    this.poolGroupRef = poolGroupRef;
  }

  
  /**
   * Reference of the pool to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type Pool. Field introduced in 18.1.3, 17.2.12.
   * @return poolRef
  **/
  @ApiModelProperty(value = "Reference of the pool to serve the passthrough DNS query which cannot be served locally. It is a reference to an object of type Pool. Field introduced in 18.1.3, 17.2.12.")


 
  @VsoMethod  
  public String getPoolRef() {
    return poolRef;
  }
    
  @VsoMethod
  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }

  
  public String getObjectID() {
		return "DnsRuleActionPoolSwitching";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleActionPoolSwitching dnsRuleActionPoolSwitching = (DnsRuleActionPoolSwitching) o;
    return Objects.equals(this.poolGroupRef, dnsRuleActionPoolSwitching.poolGroupRef) &&
        Objects.equals(this.poolRef, dnsRuleActionPoolSwitching.poolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolGroupRef, poolRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleActionPoolSwitching {\n");
    
    sb.append("    poolGroupRef: ").append(toIndentedString(poolGroupRef)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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

