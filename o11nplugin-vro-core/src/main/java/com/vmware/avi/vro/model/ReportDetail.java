package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.UpgradeReadinessCheckObj;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The ReportDetail is a POJO class extends AviRestResource that used for creating
 * ReportDetail.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReportDetail")
@VsoFinder(name = Constants.FINDER_VRO_REPORTDETAIL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReportDetail extends AviRestResource {
    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("node_ref")
    @JsonInclude(Include.NON_NULL)
    private String nodeRef = null;

    @JsonProperty("node_type")
    @JsonInclude(Include.NON_NULL)
    private String nodeType = null;

    @JsonProperty("obj_cloud_ref")
    @JsonInclude(Include.NON_NULL)
    private String objCloudRef = null;

    @JsonProperty("system_readiness")
    @JsonInclude(Include.NON_NULL)
    private UpgradeReadinessCheckObj systemReadiness = null;



  /**
   * This is the getter method this will return the attribute value.
   * Name of the node such as cluster name, se group name or se name.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the node such as cluster name, se group name or se name.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid identifier for the node such as cluster, se group or se.
   * It is a reference to an object of type upgradestatusinfo.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeRef
   */
  @VsoMethod
  public String getNodeRef() {
    return nodeRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid identifier for the node such as cluster, se group or se.
   * It is a reference to an object of type upgradestatusinfo.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeRef set the nodeRef.
   */
  @VsoMethod
  public void setNodeRef(String  nodeRef) {
    this.nodeRef = nodeRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return nodeType
   */
  @VsoMethod
  public String getNodeType() {
    return nodeType;
  }

  /**
   * This is the setter method to the attribute.
   * Type of the system such as controller_cluster, se_group or se.
   * Enum options - NODE_CONTROLLER_CLUSTER, NODE_SE_GROUP, NODE_SE_TYPE.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param nodeType set the nodeType.
   */
  @VsoMethod
  public void setNodeType(String  nodeType) {
    this.nodeType = nodeType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return objCloudRef
   */
  @VsoMethod
  public String getObjCloudRef() {
    return objCloudRef;
  }

  /**
   * This is the setter method to the attribute.
   * Cloud that this object belongs to.
   * It is a reference to an object of type cloud.
   * Field introduced in 22.1.6.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param objCloudRef set the objCloudRef.
   */
  @VsoMethod
  public void setObjCloudRef(String  objCloudRef) {
    this.objCloudRef = objCloudRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * System readiness check detail.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return systemReadiness
   */
  @VsoMethod
  public UpgradeReadinessCheckObj getSystemReadiness() {
    return systemReadiness;
  }

  /**
   * This is the setter method to the attribute.
   * System readiness check detail.
   * Field introduced in 22.1.6, 30.2.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param systemReadiness set the systemReadiness.
   */
  @VsoMethod
  public void setSystemReadiness(UpgradeReadinessCheckObj systemReadiness) {
    this.systemReadiness = systemReadiness;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReportDetail objReportDetail = (ReportDetail) o;
  return   Objects.equals(this.nodeRef, objReportDetail.nodeRef)&&
  Objects.equals(this.name, objReportDetail.name)&&
  Objects.equals(this.objCloudRef, objReportDetail.objCloudRef)&&
  Objects.equals(this.nodeType, objReportDetail.nodeType)&&
  Objects.equals(this.systemReadiness, objReportDetail.systemReadiness);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReportDetail {\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeRef: ").append(toIndentedString(nodeRef)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    objCloudRef: ").append(toIndentedString(objCloudRef)).append("\n");
        sb.append("    systemReadiness: ").append(toIndentedString(systemReadiness)).append("\n");
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

