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
 * HttpCacheObjFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:16:36.466+05:30")

@VsoObject(create = false, name = "HttpCacheObjFilter")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCACHEOBJFILTER, idAccessor = "getObjectID()")
@Service
public class HttpCacheObjFilter extends AviRestResource  {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("raw_key")
  private String rawKey = null;

  @JsonProperty("resource_name")
  private String resourceName = null;

  @JsonProperty("resource_type")
  private String resourceType = null;

  @JsonProperty("type")
  private String type = null;

  
  /**
   * HTTP cache object's exact key.
   * @return key
  **/
  @ApiModelProperty(value = "HTTP cache object's exact key.")


 
  @VsoMethod  
  public String getKey() {
    return key;
  }
    
  @VsoMethod
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * HTTP cache object's exact raw key.
   * @return rawKey
  **/
  @ApiModelProperty(value = "HTTP cache object's exact raw key.")


 
  @VsoMethod  
  public String getRawKey() {
    return rawKey;
  }
    
  @VsoMethod
  public void setRawKey(String rawKey) {
    this.rawKey = rawKey;
  }

  
  /**
   * HTTP cache object's resource name.
   * @return resourceName
  **/
  @ApiModelProperty(value = "HTTP cache object's resource name.")


 
  @VsoMethod  
  public String getResourceName() {
    return resourceName;
  }
    
  @VsoMethod
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  
  /**
   * objects with resource type.
   * @return resourceType
  **/
  @ApiModelProperty(value = "objects with resource type.")


 
  @VsoMethod  
  public String getResourceType() {
    return resourceType;
  }
    
  @VsoMethod
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  
  /**
   * HTTP cache object type. Enum options - CO_ALL, CO_IN, CO_OUT.
   * @return type
  **/
  @ApiModelProperty(value = "HTTP cache object type. Enum options - CO_ALL, CO_IN, CO_OUT.")


 
  @VsoMethod  
  public String getType() {
    return type;
  }
    
  @VsoMethod
  public void setType(String type) {
    this.type = type;
  }

  
  public String getObjectID() {
		return "HttpCacheObjFilter";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpCacheObjFilter httpCacheObjFilter = (HttpCacheObjFilter) o;
    return Objects.equals(this.key, httpCacheObjFilter.key) &&
        Objects.equals(this.rawKey, httpCacheObjFilter.rawKey) &&
        Objects.equals(this.resourceName, httpCacheObjFilter.resourceName) &&
        Objects.equals(this.resourceType, httpCacheObjFilter.resourceType) &&
        Objects.equals(this.type, httpCacheObjFilter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, rawKey, resourceName, resourceType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpCacheObjFilter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    rawKey: ").append(toIndentedString(rawKey)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

