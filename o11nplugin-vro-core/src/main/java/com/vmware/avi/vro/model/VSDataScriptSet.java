package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.RateLimiter;
import com.vmware.avi.vro.model.VSDataScript;
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
 * VSDataScriptSet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VSDataScriptSet")
@VsoFinder(name = Constants.FINDER_VRO_VSDATASCRIPTSET, idAccessor = "getObjectID()")
@Service
public class VSDataScriptSet extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("datascript")
  @Valid
  private List<VSDataScript> datascript = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ipgroup_refs")
  @Valid
  private List<String> ipgroupRefs = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pool_group_refs")
  @Valid
  private List<String> poolGroupRefs = null;

  @JsonProperty("pool_refs")
  @Valid
  private List<String> poolRefs = null;

  @JsonProperty("protocol_parser_refs")
  @Valid
  private List<String> protocolParserRefs = null;

  @JsonProperty("rate_limiters")
  @Valid
  private List<RateLimiter> rateLimiters = null;

  @JsonProperty("string_group_refs")
  @Valid
  private List<String> stringGroupRefs = null;

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
   * Creator name. Field introduced in 17.1.11,17.2.4.
   * @return createdBy
  **/
  @ApiModelProperty(value = "Creator name. Field introduced in 17.1.11,17.2.4.")


 
  @VsoMethod  
  public String getCreatedBy() {
    return createdBy;
  }
    
  @VsoMethod
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  public VSDataScriptSet addDatascriptItem(VSDataScript datascriptItem) {
    if (this.datascript == null) {
      this.datascript = new ArrayList<VSDataScript>();
    }
    this.datascript.add(datascriptItem);
    return this;
  }
  
  /**
   * DataScripts to execute.
   * @return datascript
  **/
  @ApiModelProperty(value = "DataScripts to execute.")

  @Valid

 
  @VsoMethod  
  public List<VSDataScript> getDatascript() {
    return datascript;
  }
    
  @VsoMethod
  public void setDatascript(List<VSDataScript> datascript) {
    this.datascript = datascript;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public VSDataScriptSet addIpgroupRefsItem(String ipgroupRefsItem) {
    if (this.ipgroupRefs == null) {
      this.ipgroupRefs = new ArrayList<String>();
    }
    this.ipgroupRefs.add(ipgroupRefsItem);
    return this;
  }
  
  /**
   * UUID of IP Groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type IpAddrGroup.
   * @return ipgroupRefs
  **/
  @ApiModelProperty(value = "UUID of IP Groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type IpAddrGroup.")


 
  @VsoMethod  
  public List<String> getIpgroupRefs() {
    return ipgroupRefs;
  }
    
  @VsoMethod
  public void setIpgroupRefs(List<String> ipgroupRefs) {
    this.ipgroupRefs = ipgroupRefs;
  }

  
  /**
   * Name for the virtual service datascript collection.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name for the virtual service datascript collection.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public VSDataScriptSet addPoolGroupRefsItem(String poolGroupRefsItem) {
    if (this.poolGroupRefs == null) {
      this.poolGroupRefs = new ArrayList<String>();
    }
    this.poolGroupRefs.add(poolGroupRefsItem);
    return this;
  }
  
  /**
   * UUID of pool groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type PoolGroup.
   * @return poolGroupRefs
  **/
  @ApiModelProperty(value = "UUID of pool groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type PoolGroup.")


 
  @VsoMethod  
  public List<String> getPoolGroupRefs() {
    return poolGroupRefs;
  }
    
  @VsoMethod
  public void setPoolGroupRefs(List<String> poolGroupRefs) {
    this.poolGroupRefs = poolGroupRefs;
  }

  
  public VSDataScriptSet addPoolRefsItem(String poolRefsItem) {
    if (this.poolRefs == null) {
      this.poolRefs = new ArrayList<String>();
    }
    this.poolRefs.add(poolRefsItem);
    return this;
  }
  
  /**
   * UUID of pools that could be referred by VSDataScriptSet objects. It is a reference to an object of type Pool.
   * @return poolRefs
  **/
  @ApiModelProperty(value = "UUID of pools that could be referred by VSDataScriptSet objects. It is a reference to an object of type Pool.")


 
  @VsoMethod  
  public List<String> getPoolRefs() {
    return poolRefs;
  }
    
  @VsoMethod
  public void setPoolRefs(List<String> poolRefs) {
    this.poolRefs = poolRefs;
  }

  
  public VSDataScriptSet addProtocolParserRefsItem(String protocolParserRefsItem) {
    if (this.protocolParserRefs == null) {
      this.protocolParserRefs = new ArrayList<String>();
    }
    this.protocolParserRefs.add(protocolParserRefsItem);
    return this;
  }
  
  /**
   * List of protocol parsers that could be referred by VSDataScriptSet objects. It is a reference to an object of type ProtocolParser. Field introduced in 18.2.3.
   * @return protocolParserRefs
  **/
  @ApiModelProperty(value = "List of protocol parsers that could be referred by VSDataScriptSet objects. It is a reference to an object of type ProtocolParser. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public List<String> getProtocolParserRefs() {
    return protocolParserRefs;
  }
    
  @VsoMethod
  public void setProtocolParserRefs(List<String> protocolParserRefs) {
    this.protocolParserRefs = protocolParserRefs;
  }

  
  public VSDataScriptSet addRateLimitersItem(RateLimiter rateLimitersItem) {
    if (this.rateLimiters == null) {
      this.rateLimiters = new ArrayList<RateLimiter>();
    }
    this.rateLimiters.add(rateLimitersItem);
    return this;
  }
  
  /**
   * The Rate Limit definitions needed for this DataScript. The name is composed of the Virtual Service name and the DataScript name.
   * @return rateLimiters
  **/
  @ApiModelProperty(value = "The Rate Limit definitions needed for this DataScript. The name is composed of the Virtual Service name and the DataScript name.")

  @Valid

 
  @VsoMethod  
  public List<RateLimiter> getRateLimiters() {
    return rateLimiters;
  }
    
  @VsoMethod
  public void setRateLimiters(List<RateLimiter> rateLimiters) {
    this.rateLimiters = rateLimiters;
  }

  
  public VSDataScriptSet addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
    return this;
  }
  
  /**
   * UUID of String Groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type StringGroup.
   * @return stringGroupRefs
  **/
  @ApiModelProperty(value = "UUID of String Groups that could be referred by VSDataScriptSet objects. It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }
    
  @VsoMethod
  public void setStringGroupRefs(List<String> stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
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
   * UUID of the virtual service datascript collection.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the virtual service datascript collection.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "VSDataScriptSet";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VSDataScriptSet vsDataScriptSet = (VSDataScriptSet) o;
    return Objects.equals(this.lastModified, vsDataScriptSet.lastModified) &&
        Objects.equals(this.createdBy, vsDataScriptSet.createdBy) &&
        Objects.equals(this.datascript, vsDataScriptSet.datascript) &&
        Objects.equals(this.description, vsDataScriptSet.description) &&
        Objects.equals(this.ipgroupRefs, vsDataScriptSet.ipgroupRefs) &&
        Objects.equals(this.name, vsDataScriptSet.name) &&
        Objects.equals(this.poolGroupRefs, vsDataScriptSet.poolGroupRefs) &&
        Objects.equals(this.poolRefs, vsDataScriptSet.poolRefs) &&
        Objects.equals(this.protocolParserRefs, vsDataScriptSet.protocolParserRefs) &&
        Objects.equals(this.rateLimiters, vsDataScriptSet.rateLimiters) &&
        Objects.equals(this.stringGroupRefs, vsDataScriptSet.stringGroupRefs) &&
        Objects.equals(this.tenantRef, vsDataScriptSet.tenantRef) &&
        Objects.equals(this.url, vsDataScriptSet.url) &&
        Objects.equals(this.uuid, vsDataScriptSet.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, createdBy, datascript, description, ipgroupRefs, name, poolGroupRefs, poolRefs, protocolParserRefs, rateLimiters, stringGroupRefs, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VSDataScriptSet {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    datascript: ").append(toIndentedString(datascript)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipgroupRefs: ").append(toIndentedString(ipgroupRefs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poolGroupRefs: ").append(toIndentedString(poolGroupRefs)).append("\n");
    sb.append("    poolRefs: ").append(toIndentedString(poolRefs)).append("\n");
    sb.append("    protocolParserRefs: ").append(toIndentedString(protocolParserRefs)).append("\n");
    sb.append("    rateLimiters: ").append(toIndentedString(rateLimiters)).append("\n");
    sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

