package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.APICNetworkRel;
import com.vmware.avi.vro.model.Lif;
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
 * ApicVSPlacementReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ApicVSPlacementReq")
@VsoFinder(name = Constants.FINDER_VRO_APICVSPLACEMENTREQ, idAccessor = "getObjectID()")
@Service
public class ApicVSPlacementReq extends AviRestResource  {
  @JsonProperty("graph")
  private String graph = null;

  @JsonProperty("lifs")
  @Valid
  private List<Lif> lifs = null;

  @JsonProperty("network_rel")
  @Valid
  private List<APICNetworkRel> networkRel = null;

  @JsonProperty("tenant_name")
  private String tenantName = null;

  @JsonProperty("vdev")
  private String vdev = null;

  @JsonProperty("vgrp")
  private String vgrp = null;

  
  /**
   * graph of ApicVSPlacementReq.
   * @return graph
  **/
  @ApiModelProperty(value = "graph of ApicVSPlacementReq.")


 
  @VsoMethod  
  public String getGraph() {
    return graph;
  }
    
  @VsoMethod
  public void setGraph(String graph) {
    this.graph = graph;
  }

  
  public ApicVSPlacementReq addLifsItem(Lif lifsItem) {
    if (this.lifs == null) {
      this.lifs = new ArrayList<Lif>();
    }
    this.lifs.add(lifsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property lifs of obj type ApicVSPlacementReq field type str  type object
   * @return lifs
  **/
  @ApiModelProperty(value = "Placeholder for description of property lifs of obj type ApicVSPlacementReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<Lif> getLifs() {
    return lifs;
  }
    
  @VsoMethod
  public void setLifs(List<Lif> lifs) {
    this.lifs = lifs;
  }

  
  public ApicVSPlacementReq addNetworkRelItem(APICNetworkRel networkRelItem) {
    if (this.networkRel == null) {
      this.networkRel = new ArrayList<APICNetworkRel>();
    }
    this.networkRel.add(networkRelItem);
    return this;
  }
  
  /**
   * Placeholder for description of property network_rel of obj type ApicVSPlacementReq field type str  type object
   * @return networkRel
  **/
  @ApiModelProperty(value = "Placeholder for description of property network_rel of obj type ApicVSPlacementReq field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<APICNetworkRel> getNetworkRel() {
    return networkRel;
  }
    
  @VsoMethod
  public void setNetworkRel(List<APICNetworkRel> networkRel) {
    this.networkRel = networkRel;
  }

  
  /**
   * tenant_name of ApicVSPlacementReq.
   * @return tenantName
  **/
  @ApiModelProperty(value = "tenant_name of ApicVSPlacementReq.")


 
  @VsoMethod  
  public String getTenantName() {
    return tenantName;
  }
    
  @VsoMethod
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  
  /**
   * vdev of ApicVSPlacementReq.
   * @return vdev
  **/
  @ApiModelProperty(value = "vdev of ApicVSPlacementReq.")


 
  @VsoMethod  
  public String getVdev() {
    return vdev;
  }
    
  @VsoMethod
  public void setVdev(String vdev) {
    this.vdev = vdev;
  }

  
  /**
   * vgrp of ApicVSPlacementReq.
   * @return vgrp
  **/
  @ApiModelProperty(value = "vgrp of ApicVSPlacementReq.")


 
  @VsoMethod  
  public String getVgrp() {
    return vgrp;
  }
    
  @VsoMethod
  public void setVgrp(String vgrp) {
    this.vgrp = vgrp;
  }

  
  public String getObjectID() {
		return "ApicVSPlacementReq";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApicVSPlacementReq apicVSPlacementReq = (ApicVSPlacementReq) o;
    return Objects.equals(this.graph, apicVSPlacementReq.graph) &&
        Objects.equals(this.lifs, apicVSPlacementReq.lifs) &&
        Objects.equals(this.networkRel, apicVSPlacementReq.networkRel) &&
        Objects.equals(this.tenantName, apicVSPlacementReq.tenantName) &&
        Objects.equals(this.vdev, apicVSPlacementReq.vdev) &&
        Objects.equals(this.vgrp, apicVSPlacementReq.vgrp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graph, lifs, networkRel, tenantName, vdev, vgrp);
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

