package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.SensitiveFieldRule;
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
 * SensitiveLogProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SensitiveLogProfile")
@VsoFinder(name = Constants.FINDER_VRO_SENSITIVELOGPROFILE, idAccessor = "getObjectID()")
@Service
public class SensitiveLogProfile extends AviRestResource  {
  @JsonProperty("header_field_rules")
  @Valid
  private List<SensitiveFieldRule> headerFieldRules = null;

  @JsonProperty("waf_field_rules")
  @Valid
  private List<SensitiveFieldRule> wafFieldRules = null;

  
  public SensitiveLogProfile addHeaderFieldRulesItem(SensitiveFieldRule headerFieldRulesItem) {
    if (this.headerFieldRules == null) {
      this.headerFieldRules = new ArrayList<SensitiveFieldRule>();
    }
    this.headerFieldRules.add(headerFieldRulesItem);
    return this;
  }
  
  /**
   * Match sensitive header fields in HTTP application log. Field introduced in 17.2.10, 18.1.2.
   * @return headerFieldRules
  **/
  @ApiModelProperty(value = "Match sensitive header fields in HTTP application log. Field introduced in 17.2.10, 18.1.2.")

  @Valid

 
  @VsoMethod  
  public List<SensitiveFieldRule> getHeaderFieldRules() {
    return headerFieldRules;
  }
    
  @VsoMethod
  public void setHeaderFieldRules(List<SensitiveFieldRule> headerFieldRules) {
    this.headerFieldRules = headerFieldRules;
  }

  
  public SensitiveLogProfile addWafFieldRulesItem(SensitiveFieldRule wafFieldRulesItem) {
    if (this.wafFieldRules == null) {
      this.wafFieldRules = new ArrayList<SensitiveFieldRule>();
    }
    this.wafFieldRules.add(wafFieldRulesItem);
    return this;
  }
  
  /**
   * Match sensitive WAF log fields in HTTP application log. Field introduced in 17.2.13, 18.1.3.
   * @return wafFieldRules
  **/
  @ApiModelProperty(value = "Match sensitive WAF log fields in HTTP application log. Field introduced in 17.2.13, 18.1.3.")

  @Valid

 
  @VsoMethod  
  public List<SensitiveFieldRule> getWafFieldRules() {
    return wafFieldRules;
  }
    
  @VsoMethod
  public void setWafFieldRules(List<SensitiveFieldRule> wafFieldRules) {
    this.wafFieldRules = wafFieldRules;
  }

  
  public String getObjectID() {
		return "SensitiveLogProfile";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveLogProfile sensitiveLogProfile = (SensitiveLogProfile) o;
    return Objects.equals(this.headerFieldRules, sensitiveLogProfile.headerFieldRules) &&
        Objects.equals(this.wafFieldRules, sensitiveLogProfile.wafFieldRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerFieldRules, wafFieldRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveLogProfile {\n");
    
    sb.append("    headerFieldRules: ").append(toIndentedString(headerFieldRules)).append("\n");
    sb.append("    wafFieldRules: ").append(toIndentedString(wafFieldRules)).append("\n");
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

