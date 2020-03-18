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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySaleFlowCountTypeRequest extends RpcAcsRequest<ModifySaleFlowCountTypeResponse> {
	   

	private Integer saleFlowCountType;

	private String lang;
	public ModifySaleFlowCountTypeRequest() {
		super("Sddp", "2019-01-03", "ModifySaleFlowCountType", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSaleFlowCountType() {
		return this.saleFlowCountType;
	}

	public void setSaleFlowCountType(Integer saleFlowCountType) {
		this.saleFlowCountType = saleFlowCountType;
		if(saleFlowCountType != null){
			putQueryParameter("SaleFlowCountType", saleFlowCountType.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<ModifySaleFlowCountTypeResponse> getResponseClass() {
		return ModifySaleFlowCountTypeResponse.class;
	}

}
