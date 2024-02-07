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
 * The TlsFingerprintMatch is a POJO class extends AviRestResource that used for creating
 * TlsFingerprintMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "TlsFingerprintMatch")
@VsoFinder(name = Constants.FINDER_VRO_TLSFINGERPRINTMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class TlsFingerprintMatch extends AviRestResource {
    @JsonProperty("fingerprints")
    @JsonInclude(Include.NON_NULL)
    private List<String> fingerprints;

    @JsonProperty("match_operation")
    @JsonInclude(Include.NON_NULL)
    private String matchOperation;

    @JsonProperty("string_group_refs")
    @JsonInclude(Include.NON_NULL)
    private List<String> stringGroupRefs;



  /**
   * This is the getter method this will return the attribute value.
   * The list of fingerprints.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fingerprints
   */
  @VsoMethod
  public List<String> getFingerprints() {
    return fingerprints;
  }

  /**
   * This is the setter method. this will set the fingerprints
   * The list of fingerprints.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fingerprints
   */
  @VsoMethod
  public void setFingerprints(List<String>  fingerprints) {
    this.fingerprints = fingerprints;
  }

  /**
   * This is the setter method this will set the fingerprints
   * The list of fingerprints.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return fingerprints
   */
  @VsoMethod
  public TlsFingerprintMatch addFingerprintsItem(String fingerprintsItem) {
    if (this.fingerprints == null) {
      this.fingerprints = new ArrayList<String>();
    }
    this.fingerprints.add(fingerprintsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matchOperation
   */
  @VsoMethod
  public String getMatchOperation() {
    return matchOperation;
  }

  /**
   * This is the setter method to the attribute.
   * Match criteria.
   * Enum options - IS_IN, IS_NOT_IN.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param matchOperation set the matchOperation.
   */
  @VsoMethod
  public void setMatchOperation(String  matchOperation) {
    this.matchOperation = matchOperation;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuids of the string groups.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public List<String> getStringGroupRefs() {
    return stringGroupRefs;
  }

  /**
   * This is the setter method. this will set the stringGroupRefs
   * Uuids of the string groups.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public void setStringGroupRefs(List<String>  stringGroupRefs) {
    this.stringGroupRefs = stringGroupRefs;
  }

  /**
   * This is the setter method this will set the stringGroupRefs
   * Uuids of the string groups.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringGroupRefs
   */
  @VsoMethod
  public TlsFingerprintMatch addStringGroupRefsItem(String stringGroupRefsItem) {
    if (this.stringGroupRefs == null) {
      this.stringGroupRefs = new ArrayList<String>();
    }
    this.stringGroupRefs.add(stringGroupRefsItem);
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
  TlsFingerprintMatch objTlsFingerprintMatch = (TlsFingerprintMatch) o;
  return   Objects.equals(this.matchOperation, objTlsFingerprintMatch.matchOperation)&&
  Objects.equals(this.fingerprints, objTlsFingerprintMatch.fingerprints)&&
  Objects.equals(this.stringGroupRefs, objTlsFingerprintMatch.stringGroupRefs);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class TlsFingerprintMatch {\n");
      sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
        sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
        sb.append("    stringGroupRefs: ").append(toIndentedString(stringGroupRefs)).append("\n");
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

