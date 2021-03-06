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

package com.microsoft.azure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* Represents the Azure SQL Server edition capabilities.
*/
public class EditionCapability {
    private String name;
    
    /**
    * Optional. Gets the edition name.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets the edition name.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String status;
    
    /**
    * Optional. Gets the status of the Azure SQL Server edition.
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets the status of the Azure SQL Server edition.
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    private ArrayList<ServiceObjectiveCapability> supportedServiceObjectives;
    
    /**
    * Optional. Gets the list of supported Service Objectives for the edition.
    * @return The SupportedServiceObjectives value.
    */
    public ArrayList<ServiceObjectiveCapability> getSupportedServiceObjectives() {
        return this.supportedServiceObjectives;
    }
    
    /**
    * Optional. Gets the list of supported Service Objectives for the edition.
    * @param supportedServiceObjectivesValue The SupportedServiceObjectives
    * value.
    */
    public void setSupportedServiceObjectives(final ArrayList<ServiceObjectiveCapability> supportedServiceObjectivesValue) {
        this.supportedServiceObjectives = supportedServiceObjectivesValue;
    }
    
    /**
    * Initializes a new instance of the EditionCapability class.
    *
    */
    public EditionCapability() {
        this.setSupportedServiceObjectives(new LazyArrayList<ServiceObjectiveCapability>());
    }
}
