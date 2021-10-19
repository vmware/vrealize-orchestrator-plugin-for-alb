package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BotClassMatcher;
import com.vmware.avi.vro.model.BotClassification;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.avi.vro.model.BotTypeMatcher;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BotMappingRule is a POJO class extends AviRestResource that used for creating
 * BotMappingRule.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotMappingRule")
@VsoFinder(name = Constants.FINDER_VRO_BOTMAPPINGRULE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotMappingRule extends AviRestResource {
    @JsonProperty("class_matcher")
    @JsonInclude(Include.NON_NULL)
    private BotClassMatcher classMatcher = null;

    @JsonProperty("classification")
    @JsonInclude(Include.NON_NULL)
    private BotClassification classification = null;

    @JsonProperty("component_matcher")
    @JsonInclude(Include.NON_NULL)
    private String componentMatcher = null;

    @JsonProperty("identifier_matcher")
    @JsonInclude(Include.NON_NULL)
    private StringMatch identifierMatcher = null;

    @JsonProperty("index")
    @JsonInclude(Include.NON_NULL)
    private Integer index = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("type_matcher")
    @JsonInclude(Include.NON_NULL)
    private BotTypeMatcher typeMatcher = null;



  /**
   * This is the getter method this will return the attribute value.
   * How to match the botclientclass.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return classMatcher
   */
  @VsoMethod
  public BotClassMatcher getClassMatcher() {
    return classMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * How to match the botclientclass.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param classMatcher set the classMatcher.
   */
  @VsoMethod
  public void setClassMatcher(BotClassMatcher classMatcher) {
    this.classMatcher = classMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The assigned classification for this client.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return classification
   */
  @VsoMethod
  public BotClassification getClassification() {
    return classification;
  }

  /**
   * This is the setter method to the attribute.
   * The assigned classification for this client.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param classification set the classification.
   */
  @VsoMethod
  public void setClassification(BotClassification classification) {
    this.classification = classification;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The component for which this mapping is used.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return componentMatcher
   */
  @VsoMethod
  public String getComponentMatcher() {
    return componentMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * The component for which this mapping is used.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param componentMatcher set the componentMatcher.
   */
  @VsoMethod
  public void setComponentMatcher(String  componentMatcher) {
    this.componentMatcher = componentMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The list of bot identifier names and how they're matched.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return identifierMatcher
   */
  @VsoMethod
  public StringMatch getIdentifierMatcher() {
    return identifierMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * The list of bot identifier names and how they're matched.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param identifierMatcher set the identifierMatcher.
   */
  @VsoMethod
  public void setIdentifierMatcher(StringMatch identifierMatcher) {
    this.identifierMatcher = identifierMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Rules are processed in order of this index field.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return index
   */
  @VsoMethod
  public Integer getIndex() {
    return index;
  }

  /**
   * This is the setter method to the attribute.
   * Rules are processed in order of this index field.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param index set the index.
   */
  @VsoMethod
  public void setIndex(Integer  index) {
    this.index = index;
  }

  /**
   * This is the getter method this will return the attribute value.
   * A name describing the rule in a short form.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * A name describing the rule in a short form.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How to match the botclienttype.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return typeMatcher
   */
  @VsoMethod
  public BotTypeMatcher getTypeMatcher() {
    return typeMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * How to match the botclienttype.
   * Field introduced in 21.1.1.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param typeMatcher set the typeMatcher.
   */
  @VsoMethod
  public void setTypeMatcher(BotTypeMatcher typeMatcher) {
    this.typeMatcher = typeMatcher;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotMappingRule objBotMappingRule = (BotMappingRule) o;
  return   Objects.equals(this.index, objBotMappingRule.index)&&
  Objects.equals(this.name, objBotMappingRule.name)&&
  Objects.equals(this.componentMatcher, objBotMappingRule.componentMatcher)&&
  Objects.equals(this.classMatcher, objBotMappingRule.classMatcher)&&
  Objects.equals(this.typeMatcher, objBotMappingRule.typeMatcher)&&
  Objects.equals(this.identifierMatcher, objBotMappingRule.identifierMatcher)&&
  Objects.equals(this.classification, objBotMappingRule.classification);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotMappingRule {\n");
      sb.append("    classMatcher: ").append(toIndentedString(classMatcher)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    componentMatcher: ").append(toIndentedString(componentMatcher)).append("\n");
        sb.append("    identifierMatcher: ").append(toIndentedString(identifierMatcher)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    typeMatcher: ").append(toIndentedString(typeMatcher)).append("\n");
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

