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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLiveDomainMappingRequest extends RpcAcsRequest<AddLiveDomainMappingResponse> {
	   

	private Long ownerId;

	private String pullDomain;

	private String securityToken;

	private String pushDomain;
	public AddLiveDomainMappingRequest() {
		super("Cdn", "2014-11-11", "AddLiveDomainMapping");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPullDomain() {
		return this.pullDomain;
	}

	public void setPullDomain(String pullDomain) {
		this.pullDomain = pullDomain;
		if(pullDomain != null){
			putQueryParameter("PullDomain", pullDomain);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getPushDomain() {
		return this.pushDomain;
	}

	public void setPushDomain(String pushDomain) {
		this.pushDomain = pushDomain;
		if(pushDomain != null){
			putQueryParameter("PushDomain", pushDomain);
		}
	}

	@Override
	public Class<AddLiveDomainMappingResponse> getResponseClass() {
		return AddLiveDomainMappingResponse.class;
	}

}
