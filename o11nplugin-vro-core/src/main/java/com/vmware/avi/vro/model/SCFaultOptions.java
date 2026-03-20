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
 * The SCFaultOptions is a POJO class extends AviRestResource that used for creating
 * SCFaultOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SCFaultOptions")
@VsoFinder(name = Constants.FINDER_VRO_SCFAULTOPTIONS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SCFaultOptions extends AviRestResource {
    @JsonProperty("delay_create")
    @JsonInclude(Include.NON_NULL)
    private Integer delayCreate;

    @JsonProperty("delay_delete")
    @JsonInclude(Include.NON_NULL)
    private Integer delayDelete;

    @JsonProperty("delay_update")
    @JsonInclude(Include.NON_NULL)
    private Integer delayUpdate;

    @JsonProperty("fault_type")
    @JsonInclude(Include.NON_NULL)
    private String faultType;

    @JsonProperty("obj")
    @JsonInclude(Include.NON_NULL)
    private String obj;

    @JsonProperty("object_type")
    @JsonInclude(Include.NON_NULL)
    private String objectType;

    @JsonProperty("se")
    @JsonInclude(Include.NON_NULL)
    private String se;



  /**
   * This is the getter method this will return the attribute value.
   * Delay create in config path (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayCreate
   */
  @VsoMethod
  public Integer getDelayCreate() {
    return delayCreate;
  }

  /**
   * This is the setter method to the attribute.
   * Delay create in config path (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param delayCreate set the delayCreate.
   */
  @VsoMethod
  public void setDelayCreate(Integer  delayCreate) {
    this.delayCreate = delayCreate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delay deletes in config, se paths (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayDelete
   */
  @VsoMethod
  public Integer getDelayDelete() {
    return delayDelete;
  }

  /**
   * This is the setter method to the attribute.
   * Delay deletes in config, se paths (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param delayDelete set the delayDelete.
   */
  @VsoMethod
  public void setDelayDelete(Integer  delayDelete) {
    this.delayDelete = delayDelete;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Delay updates in resmgr, config, se paths (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return delayUpdate
   */
  @VsoMethod
  public Integer getDelayUpdate() {
    return delayUpdate;
  }

  /**
   * This is the setter method to the attribute.
   * Delay updates in resmgr, config, se paths (seconds).
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param delayUpdate set the delayUpdate.
   */
  @VsoMethod
  public void setDelayUpdate(Integer  delayUpdate) {
    this.delayUpdate = delayUpdate;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of fault to injection.
   * Enum options - DELAY_NOTIF, DELAY_SE, DELAY_RM.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return faultType
   */
  @VsoMethod
  public String getFaultType() {
    return faultType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of fault to injection.
   * Enum options - DELAY_NOTIF, DELAY_SE, DELAY_RM.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param faultType set the faultType.
   */
  @VsoMethod
  public void setFaultType(String  faultType) {
    this.faultType = faultType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Introduce faults for specific object uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return obj
   */
  @VsoMethod
  public String getObj() {
    return obj;
  }

  /**
   * This is the setter method to the attribute.
   * Introduce faults for specific object uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param obj set the obj.
   */
  @VsoMethod
  public void setObj(String  obj) {
    this.obj = obj;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Introduce faults for objects of specified type.
   * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
   * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
   * PKIPROFILE, AUTHPROFILE, CLOUD...
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objectType
   */
  @VsoMethod
  public String getObjectType() {
    return objectType;
  }

  /**
   * This is the setter method to the attribute.
   * Introduce faults for objects of specified type.
   * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
   * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
   * PKIPROFILE, AUTHPROFILE, CLOUD...
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objectType set the objectType.
   */
  @VsoMethod
  public void setObjectType(String  objectType) {
    this.objectType = objectType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Introduce faults in se path of specific se uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return se
   */
  @VsoMethod
  public String getSe() {
    return se;
  }

  /**
   * This is the setter method to the attribute.
   * Introduce faults in se path of specific se uuid.
   * Field introduced in 31.1.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param se set the se.
   */
  @VsoMethod
  public void setSe(String  se) {
    this.se = se;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SCFaultOptions objSCFaultOptions = (SCFaultOptions) o;
  return   Objects.equals(this.faultType, objSCFaultOptions.faultType)&&
  Objects.equals(this.objectType, objSCFaultOptions.objectType)&&
  Objects.equals(this.obj, objSCFaultOptions.obj)&&
  Objects.equals(this.se, objSCFaultOptions.se)&&
  Objects.equals(this.delayCreate, objSCFaultOptions.delayCreate)&&
  Objects.equals(this.delayUpdate, objSCFaultOptions.delayUpdate)&&
  Objects.equals(this.delayDelete, objSCFaultOptions.delayDelete);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SCFaultOptions {\n");
      sb.append("    delayCreate: ").append(toIndentedString(delayCreate)).append("\n");
        sb.append("    delayDelete: ").append(toIndentedString(delayDelete)).append("\n");
        sb.append("    delayUpdate: ").append(toIndentedString(delayUpdate)).append("\n");
        sb.append("    faultType: ").append(toIndentedString(faultType)).append("\n");
        sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    se: ").append(toIndentedString(se)).append("\n");
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

