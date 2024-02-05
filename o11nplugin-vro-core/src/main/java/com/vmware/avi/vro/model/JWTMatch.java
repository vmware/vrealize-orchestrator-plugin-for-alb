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
 * The JWTMatch is a POJO class extends AviRestResource that used for creating
 * JWTMatch.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "JWTMatch")
@VsoFinder(name = Constants.FINDER_VRO_JWTMATCH)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class JWTMatch extends AviRestResource {
    @JsonProperty("matches")
    @JsonInclude(Include.NON_NULL)
    private List<JWTClaimMatch> matches;

    @JsonProperty("token_name")
    @JsonInclude(Include.NON_NULL)
    private String tokenName;



  /**
   * This is the getter method this will return the attribute value.
   * Claims whose values need to be matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public List<JWTClaimMatch> getMatches() {
    return matches;
  }

  /**
   * This is the setter method. this will set the matches
   * Claims whose values need to be matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public void setMatches(List<JWTClaimMatch>  matches) {
    this.matches = matches;
  }

  /**
   * This is the setter method this will set the matches
   * Claims whose values need to be matched.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return matches
   */
  @VsoMethod
  public JWTMatch addMatchesItem(JWTClaimMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<JWTClaimMatch>();
    }
    this.matches.add(matchesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Token for which the claims need to be validated.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tokenName
   */
  @VsoMethod
  public String getTokenName() {
    return tokenName;
  }

  /**
   * This is the setter method to the attribute.
   * Token for which the claims need to be validated.
   * Field introduced in 20.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tokenName set the tokenName.
   */
  @VsoMethod
  public void setTokenName(String  tokenName) {
    this.tokenName = tokenName;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  JWTMatch objJWTMatch = (JWTMatch) o;
  return   Objects.equals(this.tokenName, objJWTMatch.tokenName)&&
  Objects.equals(this.matches, objJWTMatch.matches);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class JWTMatch {\n");
      sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
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

