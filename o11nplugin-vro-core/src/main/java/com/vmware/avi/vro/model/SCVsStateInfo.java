package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.OperationalStatus;
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
 * SCVsStateInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SCVsStateInfo")
@VsoFinder(name = Constants.FINDER_VRO_SCVSSTATEINFO, idAccessor = "getObjectID()")
@Service
public class SCVsStateInfo extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("oper_status")
  private OperationalStatus operStatus = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vip_id")
  private String vipId = null;

  @JsonProperty("vs_id")
  private String vsId = null;

  
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
   *  Field introduced in 17.1.1.
   * @return operStatus
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")

  @Valid

 
  @VsoMethod  
  public OperationalStatus getOperStatus() {
    return operStatus;
  }
    
  @VsoMethod
  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 17.1.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 17.1.1.")


 
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
   *  Field introduced in 17.1.1.
   * @return uuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return vipId
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getVipId() {
    return vipId;
  }
    
  @VsoMethod
  public void setVipId(String vipId) {
    this.vipId = vipId;
  }

  
  /**
   *  Field introduced in 17.1.1.
   * @return vsId
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getVsId() {
    return vsId;
  }
    
  @VsoMethod
  public void setVsId(String vsId) {
    this.vsId = vsId;
  }

  
  public String getObjectID() {
		return "SCVsStateInfo";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCVsStateInfo scVsStateInfo = (SCVsStateInfo) o;
    return Objects.equals(this.lastModified, scVsStateInfo.lastModified) &&
        Objects.equals(this.operStatus, scVsStateInfo.operStatus) &&
        Objects.equals(this.tenantRef, scVsStateInfo.tenantRef) &&
        Objects.equals(this.url, scVsStateInfo.url) &&
        Objects.equals(this.uuid, scVsStateInfo.uuid) &&
        Objects.equals(this.vipId, scVsStateInfo.vipId) &&
        Objects.equals(this.vsId, scVsStateInfo.vsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, operStatus, tenantRef, url, uuid, vipId, vsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCVsStateInfo {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
    sb.append("    vsId: ").append(toIndentedString(vsId)).append("\n");
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

