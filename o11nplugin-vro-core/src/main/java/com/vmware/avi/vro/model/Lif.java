package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.Cif;
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
 * Lif
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-06T12:17:08.927+05:30")

@VsoObject(create = false, name = "Lif")
@VsoFinder(name = Constants.FINDER_VRO_LIF, idAccessor = "getObjectID()")
@Service
public class Lif extends AviRestResource  {
  @JsonProperty("cifs")
  @Valid
  private List<Cif> cifs = null;

  @JsonProperty("lif")
  private String lif = null;

  @JsonProperty("lif_label")
  private String lifLabel = null;

  @JsonProperty("subnet")
  private String subnet = null;

  
  public Lif addCifsItem(Cif cifsItem) {
    if (this.cifs == null) {
      this.cifs = new ArrayList<Cif>();
    }
    this.cifs.add(cifsItem);
    return this;
  }
  
  /**
   * Placeholder for description of property cifs of obj type Lif field type str  type object
   * @return cifs
  **/
  @ApiModelProperty(value = "Placeholder for description of property cifs of obj type Lif field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<Cif> getCifs() {
    return cifs;
  }
    
  @VsoMethod
  public void setCifs(List<Cif> cifs) {
    this.cifs = cifs;
  }

  
  /**
   * lif of Lif.
   * @return lif
  **/
  @ApiModelProperty(value = "lif of Lif.")


 
  @VsoMethod  
  public String getLif() {
    return lif;
  }
    
  @VsoMethod
  public void setLif(String lif) {
    this.lif = lif;
  }

  
  /**
   * lif_label of Lif.
   * @return lifLabel
  **/
  @ApiModelProperty(value = "lif_label of Lif.")


 
  @VsoMethod  
  public String getLifLabel() {
    return lifLabel;
  }
    
  @VsoMethod
  public void setLifLabel(String lifLabel) {
    this.lifLabel = lifLabel;
  }

  
  /**
   * subnet of Lif.
   * @return subnet
  **/
  @ApiModelProperty(value = "subnet of Lif.")


 
  @VsoMethod  
  public String getSubnet() {
    return subnet;
  }
    
  @VsoMethod
  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  
  public String getObjectID() {
		return "Lif";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lif lif = (Lif) o;
    return Objects.equals(this.cifs, lif.cifs) &&
        Objects.equals(this.lif, lif.lif) &&
        Objects.equals(this.lifLabel, lif.lifLabel) &&
        Objects.equals(this.subnet, lif.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cifs, lif, lifLabel, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lif {\n");
    
    sb.append("    cifs: ").append(toIndentedString(cifs)).append("\n");
    sb.append("    lif: ").append(toIndentedString(lif)).append("\n");
    sb.append("    lifLabel: ").append(toIndentedString(lifLabel)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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

