/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.ng.request.handler.impl;

import org.apache.wicket.ng.request.RequestHandler;
import org.apache.wicket.ng.request.cycle.RequestCycle;
import org.apache.wicket.ng.request.response.BufferedWebResponse;
import org.apache.wicket.ng.request.response.WebResponse;

public class BufferedResponseRequestHandler implements RequestHandler
{
	private final BufferedWebResponse bufferedWebResponse;

	public BufferedResponseRequestHandler(BufferedWebResponse bufferedWebResponse)
	{
		this.bufferedWebResponse = bufferedWebResponse;
	}

	public void detach(RequestCycle requestCycle)
	{

	}

	public void respond(RequestCycle requestCycle)
	{
		bufferedWebResponse.writeTo((WebResponse)requestCycle.getResponse());
	}

}
