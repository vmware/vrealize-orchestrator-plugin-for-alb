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
 * The DebugServiceEngineSeDataStoreMockDlFail is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngineSeDataStoreMockDlFail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DebugServiceEngineSeDataStoreMockDlFail")
@VsoFinder(name = Constants.FINDER_VRO_DEBUGSERVICEENGINESEDATASTOREMOCKDLFAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DebugServiceEngineSeDataStoreMockDlFail extends AviRestResource {
    @JsonProperty("is_sedatastore_update_rpc")
    @JsonInclude(Include.NON_NULL)
    private Boolean isSedatastoreUpdateRpc;

    @JsonProperty("object_type")
    @JsonInclude(Include.NON_NULL)
    private String objectType;



  /**
   * This is the getter method this will return the attribute value.
   * Se datastore notification rpc type to be failed.
   * Set true for update and false for create.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return isSedatastoreUpdateRpc
   */
  @VsoMethod
  public Boolean getIsSedatastoreUpdateRpc() {
    return isSedatastoreUpdateRpc;
  }

  /**
   * This is the setter method to the attribute.
   * Se datastore notification rpc type to be failed.
   * Set true for update and false for create.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param isSedatastoreUpdateRpc set the isSedatastoreUpdateRpc.
   */
  @VsoMethod
  public void setIsSedatastoreUpdateRpc(Boolean  isSedatastoreUpdateRpc) {
    this.isSedatastoreUpdateRpc = isSedatastoreUpdateRpc;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Incoming stream response object type to be failed.
   * Eg  'virtualservicese', 'pool', 'fileobject', etc.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objectType
   */
  @VsoMethod
  public String getObjectType() {
    return objectType;
  }

  /**
   * This is the setter method to the attribute.
   * Incoming stream response object type to be failed.
   * Eg  'virtualservicese', 'pool', 'fileobject', etc.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objectType set the objectType.
   */
  @VsoMethod
  public void setObjectType(String  objectType) {
    this.objectType = objectType;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DebugServiceEngineSeDataStoreMockDlFail objDebugServiceEngineSeDataStoreMockDlFail = (DebugServiceEngineSeDataStoreMockDlFail) o;
  return   Objects.equals(this.objectType, objDebugServiceEngineSeDataStoreMockDlFail.objectType)&&
  Objects.equals(this.isSedatastoreUpdateRpc, objDebugServiceEngineSeDataStoreMockDlFail.isSedatastoreUpdateRpc);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DebugServiceEngineSeDataStoreMockDlFail {\n");
      sb.append("    isSedatastoreUpdateRpc: ").append(toIndentedString(isSedatastoreUpdateRpc)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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

