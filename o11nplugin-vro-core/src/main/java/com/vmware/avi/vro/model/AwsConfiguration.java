package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AwsEncryption;
import com.vmware.avi.vro.model.AwsZoneConfig;
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
 * AwsConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AwsConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_AWSCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class AwsConfiguration extends AviRestResource  {
  @JsonProperty("access_key_id")
  private String accessKeyId = null;

  @JsonProperty("asg_poll_interval")
  private Integer asgPollInterval = 600;

  @JsonProperty("ebs_encryption")
  private AwsEncryption ebsEncryption = null;

  @JsonProperty("free_elasticips")
  private Boolean freeElasticips = true;

  @JsonProperty("iam_assume_role")
  private String iamAssumeRole = null;

  @JsonProperty("publish_vip_to_public_zone")
  private Boolean publishVipToPublicZone = null;

  @JsonProperty("region")
  private String region = "us-west-1";

  @JsonProperty("route53_integration")
  private Boolean route53Integration = null;

  @JsonProperty("s3_encryption")
  private AwsEncryption s3Encryption = null;

  @JsonProperty("secret_access_key")
  private String secretAccessKey = null;

  @JsonProperty("sqs_encryption")
  private AwsEncryption sqsEncryption = null;

  @JsonProperty("ttl")
  private Integer ttl = 60;

  @JsonProperty("use_iam_roles")
  private Boolean useIamRoles = null;

  @JsonProperty("use_sns_sqs")
  private Boolean useSnsSqs = null;

  @JsonProperty("vpc")
  private String vpc = null;

  @JsonProperty("vpc_id")
  private String vpcId = null;

  @JsonProperty("wildcard_access")
  private Boolean wildcardAccess = null;

  @JsonProperty("zones")
  @Valid
  private List<AwsZoneConfig> zones = null;

  
  /**
   * AWS access key ID.
   * @return accessKeyId
  **/
  @ApiModelProperty(value = "AWS access key ID.")


 
  @VsoMethod  
  public String getAccessKeyId() {
    return accessKeyId;
  }
    
  @VsoMethod
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  
  /**
   * Time interval between periodic polling of all Auto Scaling Groups. Allowed values are 60-1800. Field introduced in 17.1.3.
   * @return asgPollInterval
  **/
  @ApiModelProperty(value = "Time interval between periodic polling of all Auto Scaling Groups. Allowed values are 60-1800. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getAsgPollInterval() {
    return asgPollInterval;
  }
    
  @VsoMethod
  public void setAsgPollInterval(Integer asgPollInterval) {
    this.asgPollInterval = asgPollInterval;
  }

  
  /**
   * EBS encryption mode and the master key to be used for encrypting SE AMI, Volumes, and Snapshots. Field introduced in 17.2.3.
   * @return ebsEncryption
  **/
  @ApiModelProperty(value = "EBS encryption mode and the master key to be used for encrypting SE AMI, Volumes, and Snapshots. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public AwsEncryption getEbsEncryption() {
    return ebsEncryption;
  }
    
  @VsoMethod
  public void setEbsEncryption(AwsEncryption ebsEncryption) {
    this.ebsEncryption = ebsEncryption;
  }

  
  /**
   * Free unused elastic IP addresses.
   * @return freeElasticips
  **/
  @ApiModelProperty(value = "Free unused elastic IP addresses.")


 
  @VsoMethod  
  public Boolean isFreeElasticips() {
    return freeElasticips;
  }
    
  @VsoMethod
  public void setFreeElasticips(Boolean freeElasticips) {
    this.freeElasticips = freeElasticips;
  }

  
  /**
   * IAM assume role for cross-account access.
   * @return iamAssumeRole
  **/
  @ApiModelProperty(value = "IAM assume role for cross-account access.")


 
  @VsoMethod  
  public String getIamAssumeRole() {
    return iamAssumeRole;
  }
    
  @VsoMethod
  public void setIamAssumeRole(String iamAssumeRole) {
    this.iamAssumeRole = iamAssumeRole;
  }

  
  /**
   * If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones. Field introduced in 17.2.10.
   * @return publishVipToPublicZone
  **/
  @ApiModelProperty(value = "If enabled and the virtual service is not floating ip capable, vip will be published to both private and public zones. Field introduced in 17.2.10.")


 
  @VsoMethod  
  public Boolean isPublishVipToPublicZone() {
    return publishVipToPublicZone;
  }
    
  @VsoMethod
  public void setPublishVipToPublicZone(Boolean publishVipToPublicZone) {
    this.publishVipToPublicZone = publishVipToPublicZone;
  }

  
  /**
   * AWS region.
   * @return region
  **/
  @ApiModelProperty(value = "AWS region.")


 
  @VsoMethod  
  public String getRegion() {
    return region;
  }
    
  @VsoMethod
  public void setRegion(String region) {
    this.region = region;
  }

  
  /**
   * If enabled, create/update DNS entries in Amazon Route 53 zones.
   * @return route53Integration
  **/
  @ApiModelProperty(value = "If enabled, create/update DNS entries in Amazon Route 53 zones.")


 
  @VsoMethod  
  public Boolean isRoute53Integration() {
    return route53Integration;
  }
    
  @VsoMethod
  public void setRoute53Integration(Boolean route53Integration) {
    this.route53Integration = route53Integration;
  }

  
  /**
   * S3 encryption mode and the master key to be used for encrypting S3 buckets during SE AMI upload. Only SSE-KMS mode is supported. Field introduced in 17.2.3.
   * @return s3Encryption
  **/
  @ApiModelProperty(value = "S3 encryption mode and the master key to be used for encrypting S3 buckets during SE AMI upload. Only SSE-KMS mode is supported. Field introduced in 17.2.3.")

  @Valid

 
  @VsoMethod  
  public AwsEncryption getS3Encryption() {
    return s3Encryption;
  }
    
  @VsoMethod
  public void setS3Encryption(AwsEncryption s3Encryption) {
    this.s3Encryption = s3Encryption;
  }

  
  /**
   * AWS secret access key.
   * @return secretAccessKey
  **/
  @ApiModelProperty(value = "AWS secret access key.")


 
  @VsoMethod  
  public String getSecretAccessKey() {
    return secretAccessKey;
  }
    
  @VsoMethod
  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  
  /**
   * Server Side Encryption to be used for encrypting SQS Queues. Field introduced in 17.2.8.
   * @return sqsEncryption
  **/
  @ApiModelProperty(value = "Server Side Encryption to be used for encrypting SQS Queues. Field introduced in 17.2.8.")

  @Valid

 
  @VsoMethod  
  public AwsEncryption getSqsEncryption() {
    return sqsEncryption;
  }
    
  @VsoMethod
  public void setSqsEncryption(AwsEncryption sqsEncryption) {
    this.sqsEncryption = sqsEncryption;
  }

  
  /**
   * Default TTL for all records. Allowed values are 1-172800. Field introduced in 17.1.3.
   * @return ttl
  **/
  @ApiModelProperty(value = "Default TTL for all records. Allowed values are 1-172800. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Integer getTtl() {
    return ttl;
  }
    
  @VsoMethod
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  /**
   * Use IAM roles instead of access and secret key.
   * @return useIamRoles
  **/
  @ApiModelProperty(value = "Use IAM roles instead of access and secret key.")


 
  @VsoMethod  
  public Boolean isUseIamRoles() {
    return useIamRoles;
  }
    
  @VsoMethod
  public void setUseIamRoles(Boolean useIamRoles) {
    this.useIamRoles = useIamRoles;
  }

  
  /**
   * Use SNS/SQS based notifications for monitoring Auto Scaling Groups. Field introduced in 17.1.3.
   * @return useSnsSqs
  **/
  @ApiModelProperty(value = "Use SNS/SQS based notifications for monitoring Auto Scaling Groups. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isUseSnsSqs() {
    return useSnsSqs;
  }
    
  @VsoMethod
  public void setUseSnsSqs(Boolean useSnsSqs) {
    this.useSnsSqs = useSnsSqs;
  }

  
  /**
   * VPC name.
   * @return vpc
  **/
  @ApiModelProperty(value = "VPC name.")


 
  @VsoMethod  
  public String getVpc() {
    return vpc;
  }
    
  @VsoMethod
  public void setVpc(String vpc) {
    this.vpc = vpc;
  }

  
  /**
   * VPC ID.
   * @return vpcId
  **/
  @ApiModelProperty(required = true, value = "VPC ID.")
  @NotNull


 
  @VsoMethod  
  public String getVpcId() {
    return vpcId;
  }
    
  @VsoMethod
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  
  /**
   * If enabled, program SE security group with ingress rule to allow SSH (port 22) access from 0.0.0.0/0. Field deprecated in 17.1.5. Field introduced in 17.1.3.
   * @return wildcardAccess
  **/
  @ApiModelProperty(value = "If enabled, program SE security group with ingress rule to allow SSH (port 22) access from 0.0.0.0/0. Field deprecated in 17.1.5. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public Boolean isWildcardAccess() {
    return wildcardAccess;
  }
    
  @VsoMethod
  public void setWildcardAccess(Boolean wildcardAccess) {
    this.wildcardAccess = wildcardAccess;
  }

  
  public AwsConfiguration addZonesItem(AwsZoneConfig zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<AwsZoneConfig>();
    }
    this.zones.add(zonesItem);
    return this;
  }
  
  /**
   * Placeholder for description of property zones of obj type AwsConfiguration field type str  type object
   * @return zones
  **/
  @ApiModelProperty(value = "Placeholder for description of property zones of obj type AwsConfiguration field type str  type object")

  @Valid

 
  @VsoMethod  
  public List<AwsZoneConfig> getZones() {
    return zones;
  }
    
  @VsoMethod
  public void setZones(List<AwsZoneConfig> zones) {
    this.zones = zones;
  }

  
  public String getObjectID() {
		return "AwsConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsConfiguration awsConfiguration = (AwsConfiguration) o;
    return Objects.equals(this.accessKeyId, awsConfiguration.accessKeyId) &&
        Objects.equals(this.asgPollInterval, awsConfiguration.asgPollInterval) &&
        Objects.equals(this.ebsEncryption, awsConfiguration.ebsEncryption) &&
        Objects.equals(this.freeElasticips, awsConfiguration.freeElasticips) &&
        Objects.equals(this.iamAssumeRole, awsConfiguration.iamAssumeRole) &&
        Objects.equals(this.publishVipToPublicZone, awsConfiguration.publishVipToPublicZone) &&
        Objects.equals(this.region, awsConfiguration.region) &&
        Objects.equals(this.route53Integration, awsConfiguration.route53Integration) &&
        Objects.equals(this.s3Encryption, awsConfiguration.s3Encryption) &&
        Objects.equals(this.secretAccessKey, awsConfiguration.secretAccessKey) &&
        Objects.equals(this.sqsEncryption, awsConfiguration.sqsEncryption) &&
        Objects.equals(this.ttl, awsConfiguration.ttl) &&
        Objects.equals(this.useIamRoles, awsConfiguration.useIamRoles) &&
        Objects.equals(this.useSnsSqs, awsConfiguration.useSnsSqs) &&
        Objects.equals(this.vpc, awsConfiguration.vpc) &&
        Objects.equals(this.vpcId, awsConfiguration.vpcId) &&
        Objects.equals(this.wildcardAccess, awsConfiguration.wildcardAccess) &&
        Objects.equals(this.zones, awsConfiguration.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, asgPollInterval, ebsEncryption, freeElasticips, iamAssumeRole, publishVipToPublicZone, region, route53Integration, s3Encryption, secretAccessKey, sqsEncryption, ttl, useIamRoles, useSnsSqs, vpc, vpcId, wildcardAccess, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsConfiguration {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    asgPollInterval: ").append(toIndentedString(asgPollInterval)).append("\n");
    sb.append("    ebsEncryption: ").append(toIndentedString(ebsEncryption)).append("\n");
    sb.append("    freeElasticips: ").append(toIndentedString(freeElasticips)).append("\n");
    sb.append("    iamAssumeRole: ").append(toIndentedString(iamAssumeRole)).append("\n");
    sb.append("    publishVipToPublicZone: ").append(toIndentedString(publishVipToPublicZone)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    route53Integration: ").append(toIndentedString(route53Integration)).append("\n");
    sb.append("    s3Encryption: ").append(toIndentedString(s3Encryption)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    sqsEncryption: ").append(toIndentedString(sqsEncryption)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    useIamRoles: ").append(toIndentedString(useIamRoles)).append("\n");
    sb.append("    useSnsSqs: ").append(toIndentedString(useSnsSqs)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    wildcardAccess: ").append(toIndentedString(wildcardAccess)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

