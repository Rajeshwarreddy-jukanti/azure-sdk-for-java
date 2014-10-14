/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import java.net.URI;
import java.util.HashMap;

/**
* Request for an http or https action type.
*/
public class JobHttpRequest {
    private HttpAuthentication authentication;
    
    /**
    * Optional. Gets or sets the request authentication.
    * @return The Authentication value.
    */
    public HttpAuthentication getAuthentication() {
        return this.authentication;
    }
    
    /**
    * Optional. Gets or sets the request authentication.
    * @param authenticationValue The Authentication value.
    */
    public void setAuthentication(final HttpAuthentication authenticationValue) {
        this.authentication = authenticationValue;
    }
    
    private String body;
    
    /**
    * Optional. Gets or sets the request body.
    * @return The Body value.
    */
    public String getBody() {
        return this.body;
    }
    
    /**
    * Optional. Gets or sets the request body.
    * @param bodyValue The Body value.
    */
    public void setBody(final String bodyValue) {
        this.body = bodyValue;
    }
    
    private HashMap<String, String> headers;
    
    /**
    * Optional. Gets or sets Header name value pairs to supply with the
    * http/https action.
    * @return The Headers value.
    */
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }
    
    /**
    * Optional. Gets or sets Header name value pairs to supply with the
    * http/https action.
    * @param headersValue The Headers value.
    */
    public void setHeaders(final HashMap<String, String> headersValue) {
        this.headers = headersValue;
    }
    
    private String method;
    
    /**
    * Required. Gets or sets Http method e.g. GET, PUT, POST, DELETE.
    * @return The Method value.
    */
    public String getMethod() {
        return this.method;
    }
    
    /**
    * Required. Gets or sets Http method e.g. GET, PUT, POST, DELETE.
    * @param methodValue The Method value.
    */
    public void setMethod(final String methodValue) {
        this.method = methodValue;
    }
    
    private URI uri;
    
    /**
    * Required. Gets or sets Uri of the endpoint to invoke.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Required. Gets or sets Uri of the endpoint to invoke.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    /**
    * Initializes a new instance of the JobHttpRequest class.
    *
    */
    public JobHttpRequest() {
        this.setHeaders(new HashMap<String, String>());
    }
    
    /**
    * Initializes a new instance of the JobHttpRequest class with required
    * arguments.
    *
    */
    public JobHttpRequest(URI uri, String method) {
        this();
        if (uri == null) {
            throw new NullPointerException("uri");
        }
        if (method == null) {
            throw new NullPointerException("method");
        }
        this.setUri(uri);
        this.setMethod(method);
    }
}
