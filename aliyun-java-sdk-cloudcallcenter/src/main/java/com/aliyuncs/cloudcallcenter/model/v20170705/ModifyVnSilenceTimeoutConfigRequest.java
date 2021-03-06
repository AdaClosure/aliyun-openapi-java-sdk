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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyVnSilenceTimeoutConfigRequest extends RpcAcsRequest<ModifyVnSilenceTimeoutConfigResponse> {
	
	public ModifyVnSilenceTimeoutConfigRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyVnSilenceTimeoutConfig", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String finalAction;

	private String finalPrompt;

	private Integer threshold;

	private String finalActionParams;

	private String prompt;

	private Long timeout;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getFinalAction() {
		return this.finalAction;
	}

	public void setFinalAction(String finalAction) {
		this.finalAction = finalAction;
		if(finalAction != null){
			putQueryParameter("FinalAction", finalAction);
		}
	}

	public String getFinalPrompt() {
		return this.finalPrompt;
	}

	public void setFinalPrompt(String finalPrompt) {
		this.finalPrompt = finalPrompt;
		if(finalPrompt != null){
			putQueryParameter("FinalPrompt", finalPrompt);
		}
	}

	public Integer getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getFinalActionParams() {
		return this.finalActionParams;
	}

	public void setFinalActionParams(String finalActionParams) {
		this.finalActionParams = finalActionParams;
		if(finalActionParams != null){
			putQueryParameter("FinalActionParams", finalActionParams);
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putQueryParameter("Prompt", prompt);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	@Override
	public Class<ModifyVnSilenceTimeoutConfigResponse> getResponseClass() {
		return ModifyVnSilenceTimeoutConfigResponse.class;
	}

}
