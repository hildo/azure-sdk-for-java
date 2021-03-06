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

/**
* Specifies the service bus authentication.
*/
public class JobServiceBusAuthentication {
    private String sasKey;
    
    /**
    * Required. Gets or sets the service bus SAS key.
    * @return The SasKey value.
    */
    public String getSasKey() {
        return this.sasKey;
    }
    
    /**
    * Required. Gets or sets the service bus SAS key.
    * @param sasKeyValue The SasKey value.
    */
    public void setSasKey(final String sasKeyValue) {
        this.sasKey = sasKeyValue;
    }
    
    private String sasKeyName;
    
    /**
    * Required. Gets or sets the service bus SAS key name.
    * @return The SasKeyName value.
    */
    public String getSasKeyName() {
        return this.sasKeyName;
    }
    
    /**
    * Required. Gets or sets the service bus SAS key name.
    * @param sasKeyNameValue The SasKeyName value.
    */
    public void setSasKeyName(final String sasKeyNameValue) {
        this.sasKeyName = sasKeyNameValue;
    }
    
    private JobServiceBusAuthenticationType type;
    
    /**
    * Required. Gets or sets the service bus authentication type.
    * @return The Type value.
    */
    public JobServiceBusAuthenticationType getType() {
        return this.type;
    }
    
    /**
    * Required. Gets or sets the service bus authentication type.
    * @param typeValue The Type value.
    */
    public void setType(final JobServiceBusAuthenticationType typeValue) {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the JobServiceBusAuthentication class.
    *
    */
    public JobServiceBusAuthentication() {
    }
    
    /**
    * Initializes a new instance of the JobServiceBusAuthentication class with
    * required arguments.
    *
    * @param sasKeyName Gets or sets the service bus SAS key name.
    * @param sasKey Gets or sets the service bus SAS key.
    * @param type Gets or sets the service bus authentication type.
    */
    public JobServiceBusAuthentication(String sasKeyName, String sasKey, JobServiceBusAuthenticationType type) {
        if (sasKeyName == null) {
            throw new NullPointerException("sasKeyName");
        }
        if (sasKey == null) {
            throw new NullPointerException("sasKey");
        }
        if (type == null) {
            throw new NullPointerException("type");
        }
        this.setSasKeyName(sasKeyName);
        this.setSasKey(sasKey);
        this.setType(type);
    }
}
