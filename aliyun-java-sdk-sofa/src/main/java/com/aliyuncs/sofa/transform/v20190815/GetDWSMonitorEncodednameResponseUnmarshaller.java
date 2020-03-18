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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSMonitorEncodednameResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSMonitorEncodednameResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSMonitorEncodednameResponseUnmarshaller {

	public static GetDWSMonitorEncodednameResponse unmarshall(GetDWSMonitorEncodednameResponse getDWSMonitorEncodednameResponse, UnmarshallerContext _ctx) {
		
		getDWSMonitorEncodednameResponse.setRequestId(_ctx.stringValue("GetDWSMonitorEncodednameResponse.RequestId"));
		getDWSMonitorEncodednameResponse.setResultCode(_ctx.stringValue("GetDWSMonitorEncodednameResponse.ResultCode"));
		getDWSMonitorEncodednameResponse.setResultMessage(_ctx.stringValue("GetDWSMonitorEncodednameResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSMonitorEncodednameResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("GetDWSMonitorEncodednameResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("GetDWSMonitorEncodednameResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getDWSMonitorEncodednameResponse.setData(data);
	 
	 	return getDWSMonitorEncodednameResponse;
	}
}