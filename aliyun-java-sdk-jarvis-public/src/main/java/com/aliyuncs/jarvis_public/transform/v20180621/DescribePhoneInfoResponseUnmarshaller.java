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

package com.aliyuncs.jarvis_public.transform.v20180621;

import com.aliyuncs.jarvis_public.model.v20180621.DescribePhoneInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhoneInfoResponseUnmarshaller {

	public static DescribePhoneInfoResponse unmarshall(DescribePhoneInfoResponse describePhoneInfoResponse, UnmarshallerContext context) {
		
		describePhoneInfoResponse.setRequestId(context.stringValue("DescribePhoneInfoResponse.RequestId"));
		describePhoneInfoResponse.setModule(context.stringValue("DescribePhoneInfoResponse.Module"));
		describePhoneInfoResponse.setPhoneNum(context.longValue("DescribePhoneInfoResponse.phoneNum"));
		describePhoneInfoResponse.setRiskLevel(context.longValue("DescribePhoneInfoResponse.riskLevel"));
		describePhoneInfoResponse.setDetectTime(context.stringValue("DescribePhoneInfoResponse.detectTime"));
	 
	 	return describePhoneInfoResponse;
	}
}