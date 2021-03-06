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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListPageConfigTemplateRequest extends RpcAcsRequest<ListPageConfigTemplateResponse> {
	
	public ListPageConfigTemplateRequest() {
		super("cloudwf", "2017-03-28", "ListPageConfigTemplate", "cloudwf");
	}

	private Integer length;

	private Integer pageIndex;

	private String searchTempName;

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
		if(length != null){
			putQueryParameter("Length", length.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getSearchTempName() {
		return this.searchTempName;
	}

	public void setSearchTempName(String searchTempName) {
		this.searchTempName = searchTempName;
		if(searchTempName != null){
			putQueryParameter("SearchTempName", searchTempName);
		}
	}

	@Override
	public Class<ListPageConfigTemplateResponse> getResponseClass() {
		return ListPageConfigTemplateResponse.class;
	}

}
