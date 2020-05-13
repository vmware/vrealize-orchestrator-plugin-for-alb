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
 * TestSeDatastoreLevel1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "TestSeDatastoreLevel1")
@VsoFinder(name = Constants.FINDER_VRO_TESTSEDATASTORELEVEL1, idAccessor = "getObjectID()")
@Service
public class TestSeDatastoreLevel1 extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("test_se_datastore_level_2_ref")
  private String testSeDatastoreLevel2Ref = null;

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
   * Name of the object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the object.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.6.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   *  It is a reference to an object of type TestSeDatastoreLevel2. Field introduced in 18.2.6.
   * @return testSeDatastoreLevel2Ref
  **/
  @ApiModelProperty(value = " It is a reference to an object of type TestSeDatastoreLevel2. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getTestSeDatastoreLevel2Ref() {
    return testSeDatastoreLevel2Ref;
  }
    
  @VsoMethod
  public void setTestSeDatastoreLevel2Ref(String testSeDatastoreLevel2Ref) {
    this.testSeDatastoreLevel2Ref = testSeDatastoreLevel2Ref;
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
   * Unique object identifier of the object.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique object identifier of the object.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "TestSeDatastoreLevel1";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSeDatastoreLevel1 testSeDatastoreLevel1 = (TestSeDatastoreLevel1) o;
    return Objects.equals(this.lastModified, testSeDatastoreLevel1.lastModified) &&
        Objects.equals(this.name, testSeDatastoreLevel1.name) &&
        Objects.equals(this.tenantRef, testSeDatastoreLevel1.tenantRef) &&
        Objects.equals(this.testSeDatastoreLevel2Ref, testSeDatastoreLevel1.testSeDatastoreLevel2Ref) &&
        Objects.equals(this.url, testSeDatastoreLevel1.url) &&
        Objects.equals(this.uuid, testSeDatastoreLevel1.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, tenantRef, testSeDatastoreLevel2Ref, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSeDatastoreLevel1 {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    testSeDatastoreLevel2Ref: ").append(toIndentedString(testSeDatastoreLevel2Ref)).append("\n");
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

