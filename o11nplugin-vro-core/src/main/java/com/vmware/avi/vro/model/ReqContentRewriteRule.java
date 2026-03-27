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
 * The ReqContentRewriteRule is a POJO class extends AviRestResource that used for creating
 * ReqContentRewriteRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ReqContentRewriteRule")
@VsoFinder(name = Constants.FINDER_VRO_REQCONTENTREWRITERULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ReqContentRewriteRule extends AviRestResource {
    @JsonProperty("enable")
    @JsonInclude(Include.NON_NULL)
    private Boolean enable;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonProperty("pairs")
    @JsonInclude(Include.NON_NULL)
    private List<SearchReplacePair> pairs;

    @JsonProperty("rewritable_content_ref")
    @JsonInclude(Include.NON_NULL)
    private String rewritableContentRef;



  /**
   * This is the getter method this will return the attribute value.
   * Enable rewrite rule on request body.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return enable
   */
  @VsoMethod
  public Boolean getEnable() {
    return enable;
  }

  /**
   * This is the setter method to the attribute.
   * Enable rewrite rule on request body.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param enable set the enable.
   */
  @VsoMethod
  public void setEnable(Boolean  enable) {
    this.enable = enable;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Index of the request rewrite rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Index of the request rewrite rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the request rewrite rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the request rewrite rule.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * List of search-and-replace string pairs for the request body.
   * For eg.
   * Strings 'foo' and 'bar', where all searches of 'foo' in the request body will be replaced with 'bar'.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pairs
   */
  @VsoMethod
  public List<SearchReplacePair> getPairs() {
    return pairs;
  }

  /**
   * This is the setter method. this will set the pairs
   * List of search-and-replace string pairs for the request body.
   * For eg.
   * Strings 'foo' and 'bar', where all searches of 'foo' in the request body will be replaced with 'bar'.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pairs
   */
  @VsoMethod
  public void setPairs(List<SearchReplacePair>  pairs) {
    this.pairs = pairs;
  }

  /**
   * This is the setter method this will set the pairs
   * List of search-and-replace string pairs for the request body.
   * For eg.
   * Strings 'foo' and 'bar', where all searches of 'foo' in the request body will be replaced with 'bar'.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return pairs
   */
  @VsoMethod
  public ReqContentRewriteRule addPairsItem(SearchReplacePair pairsItem) {
    if (this.pairs == null) {
      this.pairs = new ArrayList<SearchReplacePair>();
    }
    this.pairs.add(pairsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Rewrite only content types listed in this string group.
   * Content types not present in this list are not rewritten.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return rewritableContentRef
   */
  @VsoMethod
  public String getRewritableContentRef() {
    return rewritableContentRef;
  }

  /**
   * This is the setter method to the attribute.
   * Rewrite only content types listed in this string group.
   * Content types not present in this list are not rewritten.
   * It is a reference to an object of type stringgroup.
   * Field introduced in 31.2.1.
   * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param rewritableContentRef set the rewritableContentRef.
   */
  @VsoMethod
  public void setRewritableContentRef(String  rewritableContentRef) {
    this.rewritableContentRef = rewritableContentRef;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ReqContentRewriteRule objReqContentRewriteRule = (ReqContentRewriteRule) o;
  return   Objects.equals(this.name, objReqContentRewriteRule.name)&&
  Objects.equals(this.enable, objReqContentRewriteRule.enable)&&
  Objects.equals(this.index, objReqContentRewriteRule.index)&&
  Objects.equals(this.pairs, objReqContentRewriteRule.pairs)&&
  Objects.equals(this.rewritableContentRef, objReqContentRewriteRule.rewritableContentRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ReqContentRewriteRule {\n");
      sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
        sb.append("    rewritableContentRef: ").append(toIndentedString(rewritableContentRef)).append("\n");
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

