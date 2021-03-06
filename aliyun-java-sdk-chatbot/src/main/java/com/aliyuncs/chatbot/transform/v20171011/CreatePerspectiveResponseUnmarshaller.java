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

package com.aliyuncs.chatbot.transform.v20171011;

import com.aliyuncs.chatbot.model.v20171011.CreatePerspectiveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePerspectiveResponseUnmarshaller {

	public static CreatePerspectiveResponse unmarshall(CreatePerspectiveResponse createPerspectiveResponse, UnmarshallerContext context) {
		
		createPerspectiveResponse.setRequestId(context.stringValue("CreatePerspectiveResponse.RequestId"));
		createPerspectiveResponse.setPerspectiveId(context.stringValue("CreatePerspectiveResponse.PerspectiveId"));
	 
	 	return createPerspectiveResponse;
	}
}