package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsRuleRLAction;
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
 * DnsRateProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DnsRateProfile")
@VsoFinder(name = Constants.FINDER_VRO_DNSRATEPROFILE, idAccessor = "getObjectID()")
@Service
public class DnsRateProfile extends AviRestResource  {
  @JsonProperty("action")
  private DnsRuleRLAction action = null;

  @JsonProperty("burst_size")
  private Integer burstSize = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("fine_grain")
  private Boolean fineGrain = null;

  @JsonProperty("period")
  private Integer period = 1;

  
  /**
   * Action to perform upon rate limiting. Field introduced in 18.2.5.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action to perform upon rate limiting. Field introduced in 18.2.5.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public DnsRuleRLAction getAction() {
    return action;
  }
    
  @VsoMethod
  public void setAction(DnsRuleRLAction action) {
    this.action = action;
  }

  
  /**
   * Maximum number of connections or requests or packets to be rate limited instantaneously. Field introduced in 18.2.5.
   * @return burstSize
  **/
  @ApiModelProperty(value = "Maximum number of connections or requests or packets to be rate limited instantaneously. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getBurstSize() {
    return burstSize;
  }
    
  @VsoMethod
  public void setBurstSize(Integer burstSize) {
    this.burstSize = burstSize;
  }

  
  /**
   * Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295. Special values are 0- 'unlimited'. Field introduced in 18.2.5.
   * @return count
  **/
  @ApiModelProperty(value = "Maximum number of connections or requests or packets per second. Allowed values are 1-4294967295. Special values are 0- 'unlimited'. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Enable fine granularity. Field introduced in 18.2.5.
   * @return fineGrain
  **/
  @ApiModelProperty(value = "Enable fine granularity. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Boolean isFineGrain() {
    return fineGrain;
  }
    
  @VsoMethod
  public void setFineGrain(Boolean fineGrain) {
    this.fineGrain = fineGrain;
  }

  
  /**
   * Time value in seconds to enforce rate count. Allowed values are 1-300. Field introduced in 18.2.5.
   * @return period
  **/
  @ApiModelProperty(value = "Time value in seconds to enforce rate count. Allowed values are 1-300. Field introduced in 18.2.5.")


 
  @VsoMethod  
  public Integer getPeriod() {
    return period;
  }
    
  @VsoMethod
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  public String getObjectID() {
		return "DnsRateProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRateProfile dnsRateProfile = (DnsRateProfile) o;
    return Objects.equals(this.action, dnsRateProfile.action) &&
        Objects.equals(this.burstSize, dnsRateProfile.burstSize) &&
        Objects.equals(this.count, dnsRateProfile.count) &&
        Objects.equals(this.fineGrain, dnsRateProfile.fineGrain) &&
        Objects.equals(this.period, dnsRateProfile.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, burstSize, count, fineGrain, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRateProfile {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    burstSize: ").append(toIndentedString(burstSize)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fineGrain: ").append(toIndentedString(fineGrain)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

