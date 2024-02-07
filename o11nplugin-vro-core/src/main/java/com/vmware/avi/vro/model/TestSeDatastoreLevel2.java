package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The TestSeDatastoreLevel2 is a POJO class extends AviRestResource that used for creating
 * TestSeDatastoreLevel2.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TestSeDatastoreLevel2")
@VsoFinder(name = Constants.FINDER_VRO_TESTSEDATASTORELEVEL2, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TestSeDatastoreLevel2 extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef;

    @JsonProperty("test_se_datastore_level_3_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> testSeDatastoreLevel3Refs;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type testsedatastorelevel3.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testSeDatastoreLevel3Refs
   */
  @VsoMethod
  public List<String> getTestSeDatastoreLevel3Refs() {
    return testSeDatastoreLevel3Refs;
  }

  /**
   * This is the setter method. this will set the testSeDatastoreLevel3Refs
   * It is a reference to an object of type testsedatastorelevel3.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testSeDatastoreLevel3Refs
   */
  @VsoMethod
  public void setTestSeDatastoreLevel3Refs(List<String>  testSeDatastoreLevel3Refs) {
    this.testSeDatastoreLevel3Refs = testSeDatastoreLevel3Refs;
  }

  /**
   * This is the setter method this will set the testSeDatastoreLevel3Refs
   * It is a reference to an object of type testsedatastorelevel3.
   * Field introduced in 18.2.6.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testSeDatastoreLevel3Refs
   */
  @VsoMethod
  public TestSeDatastoreLevel2 addTestSeDatastoreLevel3RefsItem(String testSeDatastoreLevel3RefsItem) {
    if (this.testSeDatastoreLevel3Refs == null) {
      this.testSeDatastoreLevel3Refs = new ArrayList<String>();
    }
    this.testSeDatastoreLevel3Refs.add(testSeDatastoreLevel3RefsItem);
    return this;
  }

/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  TestSeDatastoreLevel2 objTestSeDatastoreLevel2 = (TestSeDatastoreLevel2) o;
  return   Objects.equals(this.uuid, objTestSeDatastoreLevel2.uuid)&&
  Objects.equals(this.name, objTestSeDatastoreLevel2.name)&&
  Objects.equals(this.testSeDatastoreLevel3Refs, objTestSeDatastoreLevel2.testSeDatastoreLevel3Refs)&&
  Objects.equals(this.tenantRef, objTestSeDatastoreLevel2.tenantRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TestSeDatastoreLevel2 {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    testSeDatastoreLevel3Refs: ").append(toIndentedString(testSeDatastoreLevel3Refs)).append("\n");
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

