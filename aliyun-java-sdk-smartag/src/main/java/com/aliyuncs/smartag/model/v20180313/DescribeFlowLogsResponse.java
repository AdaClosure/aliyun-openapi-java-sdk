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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeFlowLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowLogsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<FlowLogSetType> flowLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<FlowLogSetType> getFlowLogs() {
		return this.flowLogs;
	}

	public void setFlowLogs(List<FlowLogSetType> flowLogs) {
		this.flowLogs = flowLogs;
	}

	public static class FlowLogSetType {

		private String flowLogId;

		private String description;

		private Integer activeAging;

		private Integer inactiveAging;

		private String outputType;

		private String slsRegionId;

		private String projectName;

		private String logstoreName;

		private String netflowServerIp;

		private String netflowServerPort;

		private String netflowVersion;

		private String status;

		private String name;

		private Integer totalSagNum;

		public String getFlowLogId() {
			return this.flowLogId;
		}

		public void setFlowLogId(String flowLogId) {
			this.flowLogId = flowLogId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getActiveAging() {
			return this.activeAging;
		}

		public void setActiveAging(Integer activeAging) {
			this.activeAging = activeAging;
		}

		public Integer getInactiveAging() {
			return this.inactiveAging;
		}

		public void setInactiveAging(Integer inactiveAging) {
			this.inactiveAging = inactiveAging;
		}

		public String getOutputType() {
			return this.outputType;
		}

		public void setOutputType(String outputType) {
			this.outputType = outputType;
		}

		public String getSlsRegionId() {
			return this.slsRegionId;
		}

		public void setSlsRegionId(String slsRegionId) {
			this.slsRegionId = slsRegionId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLogstoreName() {
			return this.logstoreName;
		}

		public void setLogstoreName(String logstoreName) {
			this.logstoreName = logstoreName;
		}

		public String getNetflowServerIp() {
			return this.netflowServerIp;
		}

		public void setNetflowServerIp(String netflowServerIp) {
			this.netflowServerIp = netflowServerIp;
		}

		public String getNetflowServerPort() {
			return this.netflowServerPort;
		}

		public void setNetflowServerPort(String netflowServerPort) {
			this.netflowServerPort = netflowServerPort;
		}

		public String getNetflowVersion() {
			return this.netflowVersion;
		}

		public void setNetflowVersion(String netflowVersion) {
			this.netflowVersion = netflowVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getTotalSagNum() {
			return this.totalSagNum;
		}

		public void setTotalSagNum(Integer totalSagNum) {
			this.totalSagNum = totalSagNum;
		}
	}

	@Override
	public DescribeFlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
