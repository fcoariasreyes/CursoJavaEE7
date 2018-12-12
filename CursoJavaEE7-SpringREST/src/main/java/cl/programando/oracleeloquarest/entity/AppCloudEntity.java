package cl.programando.oracleeloquarest.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCloudEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8895774367191190586L;
	
	private String instanceId;
	private String installId;
	private String assetId;
	private String assetName;
	private String assetType; 
	private String originalInstanceId; 
	private String originalInstallId; 
	private String originalAssetId; 
	private String originalAssetName; 
	private String userName; 
	private String userId; 
	private String userCulture; 
	private String siteName; 
	private String siteId; 
	private String appId;
	private String executionId;
	private String entityType;
	private String customObjectId; 
	private String oauth_consumer_key;
	private String oauth_nonce;
	private String oauth_signature_method;
	private String oauth_timestamp;
	private String oauth_version;
	private String oauth_signature;
	
	private String userSecurity;
	private String passSecurity;
	
	private String typeData;
	
	private String body;
	
	public String getTypeData() {
		return typeData;
	}

	public void setTypeData(String typeData) {
		this.typeData = typeData;
	}

	public String getUserSecurity() {
		return userSecurity;
	}

	public void setUserSecurity(String userSecurity) {
		this.userSecurity = userSecurity;
	}

	public String getPassSecurity() {
		return passSecurity;
	}

	public void setPassSecurity(String passSecurity) {
		this.passSecurity = passSecurity;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstallId() {
		return installId;
	}

	public void setInstallId(String installId) {
		this.installId = installId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getOriginalInstanceId() {
		return originalInstanceId;
	}

	public void setOriginalInstanceId(String originalInstanceId) {
		this.originalInstanceId = originalInstanceId;
	}

	public String getOriginalInstallId() {
		return originalInstallId;
	}

	public void setOriginalInstallId(String originalInstallId) {
		this.originalInstallId = originalInstallId;
	}

	public String getOriginalAssetId() {
		return originalAssetId;
	}

	public void setOriginalAssetId(String originalAssetId) {
		this.originalAssetId = originalAssetId;
	}

	public String getOriginalAssetName() {
		return originalAssetName;
	}

	public void setOriginalAssetName(String originalAssetName) {
		this.originalAssetName = originalAssetName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCulture() {
		return userCulture;
	}

	public void setUserCulture(String userCulture) {
		this.userCulture = userCulture;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getCustomObjectId() {
		return customObjectId;
	}

	public void setCustomObjectId(String customObjectId) {
		this.customObjectId = customObjectId;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOauth_consumer_key() {
		return oauth_consumer_key;
	}

	public void setOauth_consumer_key(String oauth_consumer_key) {
		this.oauth_consumer_key = oauth_consumer_key;
	}

	public String getOauth_nonce() {
		return oauth_nonce;
	}

	public void setOauth_nonce(String oauth_nonce) {
		this.oauth_nonce = oauth_nonce;
	}

	public String getOauth_signature_method() {
		return oauth_signature_method;
	}

	public void setOauth_signature_method(String oauth_signature_method) {
		this.oauth_signature_method = oauth_signature_method;
	}

	public String getOauth_timestamp() {
		return oauth_timestamp;
	}

	public void setOauth_timestamp(String oauth_timestamp) {
		this.oauth_timestamp = oauth_timestamp;
	}

	public String getOauth_version() {
		return oauth_version;
	}

	public void setOauth_version(String oauth_version) {
		this.oauth_version = oauth_version;
	}

	public String getOauth_signature() {
		return oauth_signature;
	}

	public void setOauth_signature(String oauth_signature) {
		this.oauth_signature = oauth_signature;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "AppCloudEntity [instanceId=" + instanceId + ", installId=" + installId + ", assetId=" + assetId
				+ ", assetName=" + assetName + ", assetType=" + assetType + ", originalInstanceId=" + originalInstanceId
				+ ", originalInstallId=" + originalInstallId + ", originalAssetId=" + originalAssetId
				+ ", originalAssetName=" + originalAssetName + ", userName=" + userName + ", userId=" + userId
				+ ", userCulture=" + userCulture + ", siteName=" + siteName + ", siteId=" + siteId + ", appId=" + appId
				+ ", executionId=" + executionId + ", entityType=" + entityType + ", customObjectId=" + customObjectId
				+ ", oauth_consumer_key=" + oauth_consumer_key + ", oauth_nonce=" + oauth_nonce
				+ ", oauth_signature_method=" + oauth_signature_method + ", oauth_timestamp=" + oauth_timestamp
				+ ", oauth_version=" + oauth_version + ", oauth_signature=" + oauth_signature + ", userSecurity="
				+ userSecurity + ", passSecurity=" + passSecurity + ", typeData=" + typeData + ", body=" + body + "]";
	}

	
}
