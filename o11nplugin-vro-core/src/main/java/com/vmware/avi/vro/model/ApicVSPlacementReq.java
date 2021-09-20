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
 * The ApicVSPlacementReq is a POJO class extends AviRestResource that used for creating
 * ApicVSPlacementReq.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ApicVSPlacementReq")
@VsoFinder(name = Constants.FINDER_VRO_APICVSPLACEMENTREQ)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ApicVSPlacementReq extends AviRestResource {
    @JsonProperty("graph")
    @JsonInclude(Include.NON_NULL)
    private String graph = null;

    @JsonProperty("lifs")
    @JsonInclude(Include.NON_NULL)
    private List<Lif> lifs = null;

    @JsonProperty("network_rel")
    @JsonInclude(Include.NON_NULL)
    private List<APICNetworkRel> networkRel = null;

    @JsonProperty("tenant_name")
    @JsonInclude(Include.NON_NULL)
    private String tenantName = null;

    @JsonProperty("vdev")
    @JsonInclude(Include.NON_NULL)
    private String vdev = null;

    @JsonProperty("vgrp")
    @JsonInclude(Include.NON_NULL)
    private String vgrp = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property graph of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return graph
   */
  @VsoMethod
  public String getGraph() {
    return graph;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property graph of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param graph set the graph.
   */
  @VsoMethod
  public void setGraph(String  graph) {
    this.graph = graph;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property lifs of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lifs
   */
  @VsoMethod
  public List<Lif> getLifs() {
    return lifs;
  }

  /**
   * This is the setter method. this will set the lifs
   * Placeholder for description of property lifs of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lifs
   */
  @VsoMethod
  public void setLifs(List<Lif>  lifs) {
    this.lifs = lifs;
  }

  /**
   * This is the setter method this will set the lifs
   * Placeholder for description of property lifs of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lifs
   */
  @VsoMethod
  public ApicVSPlacementReq addLifsItem(Lif lifsItem) {
    if (this.lifs == null) {
      this.lifs = new ArrayList<Lif>();
    }
    this.lifs.add(lifsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property network_rel of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRel
   */
  @VsoMethod
  public List<APICNetworkRel> getNetworkRel() {
    return networkRel;
  }

  /**
   * This is the setter method. this will set the networkRel
   * Placeholder for description of property network_rel of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRel
   */
  @VsoMethod
  public void setNetworkRel(List<APICNetworkRel>  networkRel) {
    this.networkRel = networkRel;
  }

  /**
   * This is the setter method this will set the networkRel
   * Placeholder for description of property network_rel of obj type apicvsplacementreq field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return networkRel
   */
  @VsoMethod
  public ApicVSPlacementReq addNetworkRelItem(APICNetworkRel networkRelItem) {
    if (this.networkRel == null) {
      this.networkRel = new ArrayList<APICNetworkRel>();
    }
    this.networkRel.add(networkRelItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property tenant_name of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantName
   */
  @VsoMethod
  public String getTenantName() {
    return tenantName;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property tenant_name of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantName set the tenantName.
   */
  @VsoMethod
  public void setTenantName(String  tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vdev of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vdev
   */
  @VsoMethod
  public String getVdev() {
    return vdev;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vdev of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vdev set the vdev.
   */
  @VsoMethod
  public void setVdev(String  vdev) {
    this.vdev = vdev;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property vgrp of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vgrp
   */
  @VsoMethod
  public String getVgrp() {
    return vgrp;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property vgrp of obj type apicvsplacementreq field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vgrp set the vgrp.
   */
  @VsoMethod
  public void setVgrp(String  vgrp) {
    this.vgrp = vgrp;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ApicVSPlacementReq objApicVSPlacementReq = (ApicVSPlacementReq) o;
  return   Objects.equals(this.vdev, objApicVSPlacementReq.vdev)&&
  Objects.equals(this.graph, objApicVSPlacementReq.graph)&&
  Objects.equals(this.tenantName, objApicVSPlacementReq.tenantName)&&
  Objects.equals(this.lifs, objApicVSPlacementReq.lifs)&&
  Objects.equals(this.vgrp, objApicVSPlacementReq.vgrp)&&
  Objects.equals(this.networkRel, objApicVSPlacementReq.networkRel);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ApicVSPlacementReq {\n");
      sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
        sb.append("    lifs: ").append(toIndentedString(lifs)).append("\n");
        sb.append("    networkRel: ").append(toIndentedString(networkRel)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    vdev: ").append(toIndentedString(vdev)).append("\n");
        sb.append("    vgrp: ").append(toIndentedString(vgrp)).append("\n");
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

