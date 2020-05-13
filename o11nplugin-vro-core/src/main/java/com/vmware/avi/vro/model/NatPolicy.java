package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.NatRule;
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
 * NatPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "NatPolicy")
@VsoFinder(name = Constants.FINDER_VRO_NATPOLICY, idAccessor = "getObjectID()")
@Service
public class NatPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<NatRule> rules = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Creator name. Field introduced in 18.2.3.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   *  Field introduced in 18.2.3.
   * @return description
  **/
  @ApiModelProperty(value = " Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Name of the Nat policy. Field introduced in 18.2.3.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Nat policy. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public NatPolicy addRulesItem(NatRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<NatRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }
  
  /**
   * Nat policy Rules. Field introduced in 18.2.3.
   * @return rules
  **/
  @ApiModelProperty(value = "Nat policy Rules. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public List<NatRule> getRules() {
    return rules;
  }
    
  @VsoMethod
  public void setRules(List<NatRule> rules) {
    this.rules = rules;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.3.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * UUID of the Nat policy. Field introduced in 18.2.3.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the Nat policy. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "NatPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatPolicy natPolicy = (NatPolicy) o;
    return Objects.equals(this.lastModified, natPolicy.lastModified) &&
        Objects.equals(this.createdBy, natPolicy.createdBy) &&
        Objects.equals(this.description, natPolicy.description) &&
        Objects.equals(this.name, natPolicy.name) &&
        Objects.equals(this.rules, natPolicy.rules) &&
        Objects.equals(this.tenantRef, natPolicy.tenantRef) &&
        Objects.equals(this.url, natPolicy.url) &&
        Objects.equals(this.uuid, natPolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, createdBy, description, name, rules, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

