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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PublishDialogFlowRequest extends RpcAcsRequest<PublishDialogFlowResponse> {
	
	public PublishDialogFlowRequest() {
		super("Chatbot", "2017-10-11", "PublishDialogFlow", "beebot");
	}

	private Long dialogId;

	public Long getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(Long dialogId) {
		this.dialogId = dialogId;
		if(dialogId != null){
			putQueryParameter("DialogId", dialogId.toString());
		}
	}

	@Override
	public Class<PublishDialogFlowResponse> getResponseClass() {
		return PublishDialogFlowResponse.class;
	}

}
