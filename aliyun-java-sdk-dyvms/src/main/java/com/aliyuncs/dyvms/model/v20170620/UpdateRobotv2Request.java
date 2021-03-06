/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRobotv2Request extends RpcAcsRequest<UpdateRobotv2Response> {
	   

	private Long resourceOwnerId;

	private String remark;

	private String robotName;

	private String asrType;

	private String asrId;

	private String voiceSpeed;

	private String atSence;

	private Long id;

	private String atProfession;

	private String voiceVolume;

	private String resourceOwnerAccount;

	private String robotType;

	private String prodCode;

	private Long ownerId;

	private String voiceStyle;
	public UpdateRobotv2Request() {
		super("Dyvms", "2017-06-20", "UpdateRobotv2", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getRobotName() {
		return this.robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
		if(robotName != null){
			putQueryParameter("RobotName", robotName);
		}
	}

	public String getAsrType() {
		return this.asrType;
	}

	public void setAsrType(String asrType) {
		this.asrType = asrType;
		if(asrType != null){
			putQueryParameter("AsrType", asrType);
		}
	}

	public String getAsrId() {
		return this.asrId;
	}

	public void setAsrId(String asrId) {
		this.asrId = asrId;
		if(asrId != null){
			putQueryParameter("AsrId", asrId);
		}
	}

	public String getVoiceSpeed() {
		return this.voiceSpeed;
	}

	public void setVoiceSpeed(String voiceSpeed) {
		this.voiceSpeed = voiceSpeed;
		if(voiceSpeed != null){
			putQueryParameter("VoiceSpeed", voiceSpeed);
		}
	}

	public String getAtSence() {
		return this.atSence;
	}

	public void setAtSence(String atSence) {
		this.atSence = atSence;
		if(atSence != null){
			putQueryParameter("AtSence", atSence);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getAtProfession() {
		return this.atProfession;
	}

	public void setAtProfession(String atProfession) {
		this.atProfession = atProfession;
		if(atProfession != null){
			putQueryParameter("AtProfession", atProfession);
		}
	}

	public String getVoiceVolume() {
		return this.voiceVolume;
	}

	public void setVoiceVolume(String voiceVolume) {
		this.voiceVolume = voiceVolume;
		if(voiceVolume != null){
			putQueryParameter("VoiceVolume", voiceVolume);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getRobotType() {
		return this.robotType;
	}

	public void setRobotType(String robotType) {
		this.robotType = robotType;
		if(robotType != null){
			putQueryParameter("RobotType", robotType);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVoiceStyle() {
		return this.voiceStyle;
	}

	public void setVoiceStyle(String voiceStyle) {
		this.voiceStyle = voiceStyle;
		if(voiceStyle != null){
			putQueryParameter("VoiceStyle", voiceStyle);
		}
	}

	@Override
	public Class<UpdateRobotv2Response> getResponseClass() {
		return UpdateRobotv2Response.class;
	}

}
