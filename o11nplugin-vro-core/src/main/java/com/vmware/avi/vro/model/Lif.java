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
 * The Lif is a POJO class extends AviRestResource that used for creating
 * Lif.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "Lif")
@VsoFinder(name = Constants.FINDER_VRO_LIF)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class Lif extends AviRestResource {
    @JsonProperty("cifs")
    @JsonInclude(Include.NON_NULL)
    private List<Cif> cifs = null;

    @JsonProperty("lif")
    @JsonInclude(Include.NON_NULL)
    private String lif = null;

    @JsonProperty("lif_label")
    @JsonInclude(Include.NON_NULL)
    private String lifLabel = null;

    @JsonProperty("subnet")
    @JsonInclude(Include.NON_NULL)
    private String subnet = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property cifs of obj type lif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cifs
   */
  @VsoMethod
  public List<Cif> getCifs() {
    return cifs;
  }

  /**
   * This is the setter method. this will set the cifs
   * Placeholder for description of property cifs of obj type lif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cifs
   */
  @VsoMethod
  public void setCifs(List<Cif>  cifs) {
    this.cifs = cifs;
  }

  /**
   * This is the setter method this will set the cifs
   * Placeholder for description of property cifs of obj type lif field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return cifs
   */
  @VsoMethod
  public Lif addCifsItem(Cif cifsItem) {
    if (this.cifs == null) {
      this.cifs = new ArrayList<Cif>();
    }
    this.cifs.add(cifsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property lif of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lif
   */
  @VsoMethod
  public String getLif() {
    return lif;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property lif of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lif set the lif.
   */
  @VsoMethod
  public void setLif(String  lif) {
    this.lif = lif;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property lif_label of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return lifLabel
   */
  @VsoMethod
  public String getLifLabel() {
    return lifLabel;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property lif_label of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param lifLabel set the lifLabel.
   */
  @VsoMethod
  public void setLifLabel(String  lifLabel) {
    this.lifLabel = lifLabel;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property subnet of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return subnet
   */
  @VsoMethod
  public String getSubnet() {
    return subnet;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property subnet of obj type lif field type str  type string.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param subnet set the subnet.
   */
  @VsoMethod
  public void setSubnet(String  subnet) {
    this.subnet = subnet;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  Lif objLif = (Lif) o;
  return   Objects.equals(this.lif, objLif.lif)&&
  Objects.equals(this.lifLabel, objLif.lifLabel)&&
  Objects.equals(this.subnet, objLif.subnet)&&
  Objects.equals(this.cifs, objLif.cifs);
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

