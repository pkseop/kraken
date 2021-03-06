/*
 * Copyright 2009 NCHOVY
 * 
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
package org.krakenapps.http.internal;

import java.util.HashMap;
import java.util.Map;

public class HttpServiceConfig {
	private String name;
	private Map<String, String> props;

	public HttpServiceConfig(String name) {
		this.name = name;
		this.props = new HashMap<String, String>();
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> props) {
		this.props = props;
	}

	public void setProperty(String key, String value) {
		props.put(key, value);
	}
}