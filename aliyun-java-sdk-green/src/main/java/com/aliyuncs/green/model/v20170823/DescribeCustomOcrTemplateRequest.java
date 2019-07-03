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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomOcrTemplateRequest extends RpcAcsRequest<DescribeCustomOcrTemplateResponse> {
	
	public DescribeCustomOcrTemplateRequest() {
		super("Green", "2017-08-23", "DescribeCustomOcrTemplate", "green");
	}

	private String ids;

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	@Override
	public Class<DescribeCustomOcrTemplateResponse> getResponseClass() {
		return DescribeCustomOcrTemplateResponse.class;
	}

}