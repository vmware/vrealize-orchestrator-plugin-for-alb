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
 * The GslbDnsGeoUpdate is a POJO class extends AviRestResource that used for creating
 * GslbDnsGeoUpdate.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "GslbDnsGeoUpdate")
@VsoFinder(name = Constants.FINDER_VRO_GSLBDNSGEOUPDATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class GslbDnsGeoUpdate extends AviRestResource {
    @JsonProperty("obj_info")
    @JsonInclude(Include.NON_NULL)
    private List<GslbObjectInfo> objInfo;

    @JsonProperty("ops")
    @JsonInclude(Include.NON_NULL)
    private String ops;

    @JsonProperty("se_list")
    @JsonInclude(Include.NON_NULL)
    private List<String> seList;



  /**
   * This is the getter method this will return the attribute value.
   * Gslbgeodbprofile object that is pushed on on a per dns basis.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return objInfo
   */
  @VsoMethod
  public List<GslbObjectInfo> getObjInfo() {
    return objInfo;
  }

  /**
   * This is the setter method. this will set the objInfo
   * Gslbgeodbprofile object that is pushed on on a per dns basis.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return objInfo
   */
  @VsoMethod
  public void setObjInfo(List<GslbObjectInfo>  objInfo) {
    this.objInfo = objInfo;
  }

  /**
   * This is the setter method this will set the objInfo
   * Gslbgeodbprofile object that is pushed on on a per dns basis.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return objInfo
   */
  @VsoMethod
  public GslbDnsGeoUpdate addObjInfoItem(GslbObjectInfo objInfoItem) {
    if (this.objInfo == null) {
      this.objInfo = new ArrayList<GslbObjectInfo>();
    }
    this.objInfo.add(objInfoItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return ops
   */
  @VsoMethod
  public String getOps() {
    return ops;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @param ops set the ops.
   */
  @VsoMethod
  public void setOps(String  ops) {
    this.ops = ops;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return seList
   */
  @VsoMethod
  public List<String> getSeList() {
    return seList;
  }

  /**
   * This is the setter method. this will set the seList
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return seList
   */
  @VsoMethod
  public void setSeList(List<String>  seList) {
    this.seList = seList;
  }

  /**
   * This is the setter method this will set the seList
   * Field deprecated in 18.1.5, 18.2.1.
   * Field introduced in 17.1.1.
   * @return seList
   */
  @VsoMethod
  public GslbDnsGeoUpdate addSeListItem(String seListItem) {
    if (this.seList == null) {
      this.seList = new ArrayList<String>();
    }
    this.seList.add(seListItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  GslbDnsGeoUpdate objGslbDnsGeoUpdate = (GslbDnsGeoUpdate) o;
  return   Objects.equals(this.ops, objGslbDnsGeoUpdate.ops)&&
  Objects.equals(this.seList, objGslbDnsGeoUpdate.seList)&&
  Objects.equals(this.objInfo, objGslbDnsGeoUpdate.objInfo);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class GslbDnsGeoUpdate {\n");
      sb.append("    objInfo: ").append(toIndentedString(objInfo)).append("\n");
        sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
        sb.append("    seList: ").append(toIndentedString(seList)).append("\n");
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

