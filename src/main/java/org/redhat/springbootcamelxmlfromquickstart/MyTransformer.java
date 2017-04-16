/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package org.redhat.springbootcamelxmlfromquickstart;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyTransformer implements Processor {


    private Logger log = LoggerFactory.getLogger(MyTransformer.class);

    public void process(Exchange exchange) throws Exception {
    	
    	
		             //getting the request object
					 String req = (String) exchange.getIn().getBody();
		             System.out.println("Message Body from prigya's service :" + req);
		             //req = req.substring(1,req.length()-1);
		             System.out.println("req =" + req);
		             exchange.getOut().setHeader(Exchange.CONTENT_TYPE, "application/json");
			            // exchange.getOut().setBody("{\"id\":\"01\",\"name\":\"Joe\",\"age\":32}");
			         exchange.getOut().setBody(req);
				
    	
    }

}
