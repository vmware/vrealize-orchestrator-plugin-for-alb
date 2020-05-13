package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * HSMAwsCloudHsm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "HSMAwsCloudHsm")
@VsoFinder(name = Constants.FINDER_VRO_HSMAWSCLOUDHSM, idAccessor = "getObjectID()")
@Service
public class HSMAwsCloudHsm extends AviRestResource  {
  @JsonProperty("client_config")
  private String clientConfig = null;

  @JsonProperty("cluster_cert")
  private String clusterCert = null;

  @JsonProperty("crypto_user_name")
  private String cryptoUserName = null;

  @JsonProperty("crypto_user_password")
  private String cryptoUserPassword = null;

  @JsonProperty("hsm_ip")
  @Valid
  private List<String> hsmIp = null;

  @JsonProperty("mgmt_config")
  private String mgmtConfig = null;

  
  /**
   *  Field introduced in 17.2.7.
   * @return clientConfig
  **/
  @ApiModelProperty(readOnly = true, value = " Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getClientConfig() {
    return clientConfig;
  }
    
  @VsoMethod
  public void setClientConfig(String clientConfig) {
    this.clientConfig = clientConfig;
  }

  
  /**
   * AWS CloudHSM Cluster Certificate. Field introduced in 17.2.7.
   * @return clusterCert
  **/
  @ApiModelProperty(value = "AWS CloudHSM Cluster Certificate. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getClusterCert() {
    return clusterCert;
  }
    
  @VsoMethod
  public void setClusterCert(String clusterCert) {
    this.clusterCert = clusterCert;
  }

  
  /**
   * Username of the Crypto User. This will be used to access the keys on the HSM . Field introduced in 17.2.7.
   * @return cryptoUserName
  **/
  @ApiModelProperty(value = "Username of the Crypto User. This will be used to access the keys on the HSM . Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getCryptoUserName() {
    return cryptoUserName;
  }
    
  @VsoMethod
  public void setCryptoUserName(String cryptoUserName) {
    this.cryptoUserName = cryptoUserName;
  }

  
  /**
   * Password of the Crypto User. This will be used to access the keys on the HSM . Field introduced in 17.2.7.
   * @return cryptoUserPassword
  **/
  @ApiModelProperty(value = "Password of the Crypto User. This will be used to access the keys on the HSM . Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getCryptoUserPassword() {
    return cryptoUserPassword;
  }
    
  @VsoMethod
  public void setCryptoUserPassword(String cryptoUserPassword) {
    this.cryptoUserPassword = cryptoUserPassword;
  }

  
  public HSMAwsCloudHsm addHsmIpItem(String hsmIpItem) {
    if (this.hsmIp == null) {
      this.hsmIp = new ArrayList<String>();
    }
    this.hsmIp.add(hsmIpItem);
    return this;
  }
  
  /**
   * IP address of the HSM in the cluster. If there are more than one HSMs, only one is sufficient. Field introduced in 17.2.7.
   * @return hsmIp
  **/
  @ApiModelProperty(value = "IP address of the HSM in the cluster. If there are more than one HSMs, only one is sufficient. Field introduced in 17.2.7.")


 
  @VsoMethod  
  public List<String> getHsmIp() {
    return hsmIp;
  }
    
  @VsoMethod
  public void setHsmIp(List<String> hsmIp) {
    this.hsmIp = hsmIp;
  }

  
  /**
   *  Field introduced in 17.2.7.
   * @return mgmtConfig
  **/
  @ApiModelProperty(readOnly = true, value = " Field introduced in 17.2.7.")


 
  @VsoMethod  
  public String getMgmtConfig() {
    return mgmtConfig;
  }
    
  @VsoMethod
  public void setMgmtConfig(String mgmtConfig) {
    this.mgmtConfig = mgmtConfig;
  }

  
  public String getObjectID() {
		return "HSMAwsCloudHsm";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HSMAwsCloudHsm hsMAwsCloudHsm = (HSMAwsCloudHsm) o;
    return Objects.equals(this.clientConfig, hsMAwsCloudHsm.clientConfig) &&
        Objects.equals(this.clusterCert, hsMAwsCloudHsm.clusterCert) &&
        Objects.equals(this.cryptoUserName, hsMAwsCloudHsm.cryptoUserName) &&
        Objects.equals(this.cryptoUserPassword, hsMAwsCloudHsm.cryptoUserPassword) &&
        Objects.equals(this.hsmIp, hsMAwsCloudHsm.hsmIp) &&
        Objects.equals(this.mgmtConfig, hsMAwsCloudHsm.mgmtConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, clusterCert, cryptoUserName, cryptoUserPassword, hsmIp, mgmtConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HSMAwsCloudHsm {\n");
    
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    clusterCert: ").append(toIndentedString(clusterCert)).append("\n");
    sb.append("    cryptoUserName: ").append(toIndentedString(cryptoUserName)).append("\n");
    sb.append("    cryptoUserPassword: ").append(toIndentedString(cryptoUserPassword)).append("\n");
    sb.append("    hsmIp: ").append(toIndentedString(hsmIp)).append("\n");
    sb.append("    mgmtConfig: ").append(toIndentedString(mgmtConfig)).append("\n");
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

