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

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.ServiceObjectiveGetResponse;
import com.microsoft.azure.management.sql.models.ServiceObjectiveListResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.Future;

/**
* Represents all the operations for operating on Azure SQL Database Service
* Objectives.   Contains operations to: Retrieve service objectives.
*/
public interface ServiceObjectiveOperations {
    /**
    * Returns information about an Azure SQL Database Server Service Objectives.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Server.
    * @param serviceObjectiveName Required. The name of the service objective
    * to retrieve.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get Azure Sql Database Service
    * Objective request.
    */
    ServiceObjectiveGetResponse get(String resourceGroupName, String serverName, String serviceObjectiveName) throws IOException, ServiceException;
    
    /**
    * Returns information about an Azure SQL Database Server Service Objectives.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Server.
    * @param serviceObjectiveName Required. The name of the service objective
    * to retrieve.
    * @return Represents the response to a Get Azure Sql Database Service
    * Objective request.
    */
    Future<ServiceObjectiveGetResponse> getAsync(String resourceGroupName, String serverName, String serviceObjectiveName);
    
    /**
    * Returns information about an Azure SQL Database Server Service Objectives.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Server.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get Azure Sql Database Service
    * Objectives request.
    */
    ServiceObjectiveListResponse list(String resourceGroupName, String serverName) throws IOException, ServiceException;
    
    /**
    * Returns information about an Azure SQL Database Server Service Objectives.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Server.
    * @return Represents the response to a Get Azure Sql Database Service
    * Objectives request.
    */
    Future<ServiceObjectiveListResponse> listAsync(String resourceGroupName, String serverName);
}
