package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.PathMatch;
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
 * HttpCacheConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HttpCacheConfig")
@VsoFinder(name = Constants.FINDER_VRO_HTTPCACHECONFIG, idAccessor = "getObjectID()")
@Service
public class HttpCacheConfig extends AviRestResource  {
  @JsonProperty("age_header")
  private Boolean ageHeader = true;

  @JsonProperty("aggressive")
  private Boolean aggressive = null;

  @JsonProperty("date_header")
  private Boolean dateHeader = true;

  @JsonProperty("default_expire")
  private Integer defaultExpire = 600;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("heuristic_expire")
  private Boolean heuristicExpire = null;

  @JsonProperty("ignore_request_cache_control")
  private Boolean ignoreRequestCacheControl = null;

  @JsonProperty("max_cache_size")
  private Long maxCacheSize = null;

  @JsonProperty("max_object_size")
  private Integer maxObjectSize = 4194304;

  @JsonProperty("mime_types_black_group_refs")
  @Valid
  private List<String> mimeTypesBlackGroupRefs = null;

  @JsonProperty("mime_types_black_list")
  @Valid
  private List<String> mimeTypesBlackList = null;

  @JsonProperty("mime_types_group_refs")
  @Valid
  private List<String> mimeTypesGroupRefs = null;

  @JsonProperty("mime_types_list")
  @Valid
  private List<String> mimeTypesList = null;

  @JsonProperty("min_object_size")
  private Integer minObjectSize = 100;

  @JsonProperty("query_cacheable")
  private Boolean queryCacheable = null;

  @JsonProperty("uri_non_cacheable")
  private PathMatch uriNonCacheable = null;

  @JsonProperty("xcache_header")
  private Boolean xcacheHeader = true;

  
  /**
   * Add an Age header to content served from cache, which indicates to the client the number of seconds the object has been in the cache.
   * @return ageHeader
  **/
  @ApiModelProperty(value = "Add an Age header to content served from cache, which indicates to the client the number of seconds the object has been in the cache.")


 
  @VsoMethod  
  public Boolean isAgeHeader() {
    return ageHeader;
  }
    
  @VsoMethod
  public void setAgeHeader(Boolean ageHeader) {
    this.ageHeader = ageHeader;
  }

  
  /**
   * Enable/disable caching objects without Cache-Control headers.
   * @return aggressive
  **/
  @ApiModelProperty(value = "Enable/disable caching objects without Cache-Control headers.")


 
  @VsoMethod  
  public Boolean isAggressive() {
    return aggressive;
  }
    
  @VsoMethod
  public void setAggressive(Boolean aggressive) {
    this.aggressive = aggressive;
  }

  
  /**
   * If a Date header was not added by the server, add a Date header to the object served from cache.  This indicates to the client when the object was originally sent by the server to the cache.
   * @return dateHeader
  **/
  @ApiModelProperty(value = "If a Date header was not added by the server, add a Date header to the object served from cache.  This indicates to the client when the object was originally sent by the server to the cache.")


 
  @VsoMethod  
  public Boolean isDateHeader() {
    return dateHeader;
  }
    
  @VsoMethod
  public void setDateHeader(Boolean dateHeader) {
    this.dateHeader = dateHeader;
  }

  
  /**
   * Default expiration time of cache objects received from the server without a Cache-Control expiration header.  This value may be overwritten by the Heuristic Expire setting.
   * @return defaultExpire
  **/
  @ApiModelProperty(value = "Default expiration time of cache objects received from the server without a Cache-Control expiration header.  This value may be overwritten by the Heuristic Expire setting.")


 
  @VsoMethod  
  public Integer getDefaultExpire() {
    return defaultExpire;
  }
    
  @VsoMethod
  public void setDefaultExpire(Integer defaultExpire) {
    this.defaultExpire = defaultExpire;
  }

  
  /**
   * Enable/disable HTTP object caching.When enabling caching for the first time, SE Group app_cache_percent must beset to allocate shared memory required for caching (A service engine restart is needed after setting/resetting the SE group value).
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable/disable HTTP object caching.When enabling caching for the first time, SE Group app_cache_percent must beset to allocate shared memory required for caching (A service engine restart is needed after setting/resetting the SE group value).")


 
  @VsoMethod  
  public Boolean isEnabled() {
    return enabled;
  }
    
  @VsoMethod
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * If a response object from the server does not include the Cache-Control header, but does include a Last-Modified header, the system will use this time to calculate the Cache-Control expiration.  If unable to solicit an Last-Modified header, then the system will fall back to the Cache Expire Time value.
   * @return heuristicExpire
  **/
  @ApiModelProperty(value = "If a response object from the server does not include the Cache-Control header, but does include a Last-Modified header, the system will use this time to calculate the Cache-Control expiration.  If unable to solicit an Last-Modified header, then the system will fall back to the Cache Expire Time value.")


 
  @VsoMethod  
  public Boolean isHeuristicExpire() {
    return heuristicExpire;
  }
    
  @VsoMethod
  public void setHeuristicExpire(Boolean heuristicExpire) {
    this.heuristicExpire = heuristicExpire;
  }

  
  /**
   * Ignore client's cache control headers when fetching or storing from and to the cache. Field introduced in 18.1.2.
   * @return ignoreRequestCacheControl
  **/
  @ApiModelProperty(value = "Ignore client's cache control headers when fetching or storing from and to the cache. Field introduced in 18.1.2.")


 
  @VsoMethod  
  public Boolean isIgnoreRequestCacheControl() {
    return ignoreRequestCacheControl;
  }
    
  @VsoMethod
  public void setIgnoreRequestCacheControl(Boolean ignoreRequestCacheControl) {
    this.ignoreRequestCacheControl = ignoreRequestCacheControl;
  }

  
  /**
   * Max size, in bytes, of the cache.  The default, zero, indicates auto configuration.
   * @return maxCacheSize
  **/
  @ApiModelProperty(value = "Max size, in bytes, of the cache.  The default, zero, indicates auto configuration.")


 
  @VsoMethod  
  public Long getMaxCacheSize() {
    return maxCacheSize;
  }
    
  @VsoMethod
  public void setMaxCacheSize(Long maxCacheSize) {
    this.maxCacheSize = maxCacheSize;
  }

  
  /**
   * Maximum size of an object to store in the cache.
   * @return maxObjectSize
  **/
  @ApiModelProperty(value = "Maximum size of an object to store in the cache.")


 
  @VsoMethod  
  public Integer getMaxObjectSize() {
    return maxObjectSize;
  }
    
  @VsoMethod
  public void setMaxObjectSize(Integer maxObjectSize) {
    this.maxObjectSize = maxObjectSize;
  }

  
  public HttpCacheConfig addMimeTypesBlackGroupRefsItem(String mimeTypesBlackGroupRefsItem) {
    if (this.mimeTypesBlackGroupRefs == null) {
      this.mimeTypesBlackGroupRefs = new ArrayList<String>();
    }
    this.mimeTypesBlackGroupRefs.add(mimeTypesBlackGroupRefsItem);
    return this;
  }
  
  /**
   * Blacklist string group of non-cacheable mime types. It is a reference to an object of type StringGroup.
   * @return mimeTypesBlackGroupRefs
  **/
  @ApiModelProperty(value = "Blacklist string group of non-cacheable mime types. It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public List<String> getMimeTypesBlackGroupRefs() {
    return mimeTypesBlackGroupRefs;
  }
    
  @VsoMethod
  public void setMimeTypesBlackGroupRefs(List<String> mimeTypesBlackGroupRefs) {
    this.mimeTypesBlackGroupRefs = mimeTypesBlackGroupRefs;
  }

  
  public HttpCacheConfig addMimeTypesBlackListItem(String mimeTypesBlackListItem) {
    if (this.mimeTypesBlackList == null) {
      this.mimeTypesBlackList = new ArrayList<String>();
    }
    this.mimeTypesBlackList.add(mimeTypesBlackListItem);
    return this;
  }
  
  /**
   * Blacklist of non-cacheable mime types.
   * @return mimeTypesBlackList
  **/
  @ApiModelProperty(value = "Blacklist of non-cacheable mime types.")


 
  @VsoMethod  
  public List<String> getMimeTypesBlackList() {
    return mimeTypesBlackList;
  }
    
  @VsoMethod
  public void setMimeTypesBlackList(List<String> mimeTypesBlackList) {
    this.mimeTypesBlackList = mimeTypesBlackList;
  }

  
  public HttpCacheConfig addMimeTypesGroupRefsItem(String mimeTypesGroupRefsItem) {
    if (this.mimeTypesGroupRefs == null) {
      this.mimeTypesGroupRefs = new ArrayList<String>();
    }
    this.mimeTypesGroupRefs.add(mimeTypesGroupRefsItem);
    return this;
  }
  
  /**
   * Whitelist string group of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*. It is a reference to an object of type StringGroup.
   * @return mimeTypesGroupRefs
  **/
  @ApiModelProperty(value = "Whitelist string group of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*. It is a reference to an object of type StringGroup.")


 
  @VsoMethod  
  public List<String> getMimeTypesGroupRefs() {
    return mimeTypesGroupRefs;
  }
    
  @VsoMethod
  public void setMimeTypesGroupRefs(List<String> mimeTypesGroupRefs) {
    this.mimeTypesGroupRefs = mimeTypesGroupRefs;
  }

  
  public HttpCacheConfig addMimeTypesListItem(String mimeTypesListItem) {
    if (this.mimeTypesList == null) {
      this.mimeTypesList = new ArrayList<String>();
    }
    this.mimeTypesList.add(mimeTypesListItem);
    return this;
  }
  
  /**
   * Whitelist of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*.
   * @return mimeTypesList
  **/
  @ApiModelProperty(value = "Whitelist of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*.")


 
  @VsoMethod  
  public List<String> getMimeTypesList() {
    return mimeTypesList;
  }
    
  @VsoMethod
  public void setMimeTypesList(List<String> mimeTypesList) {
    this.mimeTypesList = mimeTypesList;
  }

  
  /**
   * Minimum size of an object to store in the cache.
   * @return minObjectSize
  **/
  @ApiModelProperty(value = "Minimum size of an object to store in the cache.")


 
  @VsoMethod  
  public Integer getMinObjectSize() {
    return minObjectSize;
  }
    
  @VsoMethod
  public void setMinObjectSize(Integer minObjectSize) {
    this.minObjectSize = minObjectSize;
  }

  
  /**
   * Allow caching of objects whose URI included a query argument.  When disabled, these objects are not cached.  When enabled, the request must match the URI query to be considered a hit.
   * @return queryCacheable
  **/
  @ApiModelProperty(value = "Allow caching of objects whose URI included a query argument.  When disabled, these objects are not cached.  When enabled, the request must match the URI query to be considered a hit.")


 
  @VsoMethod  
  public Boolean isQueryCacheable() {
    return queryCacheable;
  }
    
  @VsoMethod
  public void setQueryCacheable(Boolean queryCacheable) {
    this.queryCacheable = queryCacheable;
  }

  
  /**
   * Non-cacheable URI configuration with match criteria. Field introduced in 18.1.2.
   * @return uriNonCacheable
  **/
  @ApiModelProperty(value = "Non-cacheable URI configuration with match criteria. Field introduced in 18.1.2.")

  @Valid

 
  @VsoMethod  
  public PathMatch getUriNonCacheable() {
    return uriNonCacheable;
  }
    
  @VsoMethod
  public void setUriNonCacheable(PathMatch uriNonCacheable) {
    this.uriNonCacheable = uriNonCacheable;
  }

  
  /**
   * Add an X-Cache header to content served from cache, which indicates to the client that the object was served from an intermediate cache.
   * @return xcacheHeader
  **/
  @ApiModelProperty(value = "Add an X-Cache header to content served from cache, which indicates to the client that the object was served from an intermediate cache.")


 
  @VsoMethod  
  public Boolean isXcacheHeader() {
    return xcacheHeader;
  }
    
  @VsoMethod
  public void setXcacheHeader(Boolean xcacheHeader) {
    this.xcacheHeader = xcacheHeader;
  }

  
  public String getObjectID() {
		return "HttpCacheConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpCacheConfig httpCacheConfig = (HttpCacheConfig) o;
    return Objects.equals(this.ageHeader, httpCacheConfig.ageHeader) &&
        Objects.equals(this.aggressive, httpCacheConfig.aggressive) &&
        Objects.equals(this.dateHeader, httpCacheConfig.dateHeader) &&
        Objects.equals(this.defaultExpire, httpCacheConfig.defaultExpire) &&
        Objects.equals(this.enabled, httpCacheConfig.enabled) &&
        Objects.equals(this.heuristicExpire, httpCacheConfig.heuristicExpire) &&
        Objects.equals(this.ignoreRequestCacheControl, httpCacheConfig.ignoreRequestCacheControl) &&
        Objects.equals(this.maxCacheSize, httpCacheConfig.maxCacheSize) &&
        Objects.equals(this.maxObjectSize, httpCacheConfig.maxObjectSize) &&
        Objects.equals(this.mimeTypesBlackGroupRefs, httpCacheConfig.mimeTypesBlackGroupRefs) &&
        Objects.equals(this.mimeTypesBlackList, httpCacheConfig.mimeTypesBlackList) &&
        Objects.equals(this.mimeTypesGroupRefs, httpCacheConfig.mimeTypesGroupRefs) &&
        Objects.equals(this.mimeTypesList, httpCacheConfig.mimeTypesList) &&
        Objects.equals(this.minObjectSize, httpCacheConfig.minObjectSize) &&
        Objects.equals(this.queryCacheable, httpCacheConfig.queryCacheable) &&
        Objects.equals(this.uriNonCacheable, httpCacheConfig.uriNonCacheable) &&
        Objects.equals(this.xcacheHeader, httpCacheConfig.xcacheHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageHeader, aggressive, dateHeader, defaultExpire, enabled, heuristicExpire, ignoreRequestCacheControl, maxCacheSize, maxObjectSize, mimeTypesBlackGroupRefs, mimeTypesBlackList, mimeTypesGroupRefs, mimeTypesList, minObjectSize, queryCacheable, uriNonCacheable, xcacheHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpCacheConfig {\n");
    
    sb.append("    ageHeader: ").append(toIndentedString(ageHeader)).append("\n");
    sb.append("    aggressive: ").append(toIndentedString(aggressive)).append("\n");
    sb.append("    dateHeader: ").append(toIndentedString(dateHeader)).append("\n");
    sb.append("    defaultExpire: ").append(toIndentedString(defaultExpire)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    heuristicExpire: ").append(toIndentedString(heuristicExpire)).append("\n");
    sb.append("    ignoreRequestCacheControl: ").append(toIndentedString(ignoreRequestCacheControl)).append("\n");
    sb.append("    maxCacheSize: ").append(toIndentedString(maxCacheSize)).append("\n");
    sb.append("    maxObjectSize: ").append(toIndentedString(maxObjectSize)).append("\n");
    sb.append("    mimeTypesBlackGroupRefs: ").append(toIndentedString(mimeTypesBlackGroupRefs)).append("\n");
    sb.append("    mimeTypesBlackList: ").append(toIndentedString(mimeTypesBlackList)).append("\n");
    sb.append("    mimeTypesGroupRefs: ").append(toIndentedString(mimeTypesGroupRefs)).append("\n");
    sb.append("    mimeTypesList: ").append(toIndentedString(mimeTypesList)).append("\n");
    sb.append("    minObjectSize: ").append(toIndentedString(minObjectSize)).append("\n");
    sb.append("    queryCacheable: ").append(toIndentedString(queryCacheable)).append("\n");
    sb.append("    uriNonCacheable: ").append(toIndentedString(uriNonCacheable)).append("\n");
    sb.append("    xcacheHeader: ").append(toIndentedString(xcacheHeader)).append("\n");
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

