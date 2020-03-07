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

package com.aliyuncs.geoip.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.geoip.transform.v20200101.DescribeGeoipInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGeoipInstancesResponse extends AcsResponse {

	private String requestId;

	private List<GeoipInstance> geoipInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GeoipInstance> getGeoipInstances() {
		return this.geoipInstances;
	}

	public void setGeoipInstances(List<GeoipInstance> geoipInstances) {
		this.geoipInstances = geoipInstances;
	}

	public static class GeoipInstance {

		private String productCode;

		private String instanceId;

		private String versionCode;

		private String status;

		private String createTime;

		private Long createTimestamp;

		private String expireTime;

		private Long expireTimestamp;

		private Long maxQps;

		private Long maxQpd;

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public Long getMaxQps() {
			return this.maxQps;
		}

		public void setMaxQps(Long maxQps) {
			this.maxQps = maxQps;
		}

		public Long getMaxQpd() {
			return this.maxQpd;
		}

		public void setMaxQpd(Long maxQpd) {
			this.maxQpd = maxQpd;
		}
	}

	@Override
	public DescribeGeoipInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGeoipInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
