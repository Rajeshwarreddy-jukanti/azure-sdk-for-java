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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* Represents the response containing the list of database operations for a
* given server or database.
*/
public class DatabaseOperationListResponse extends OperationResponse implements Iterable<DatabaseOperation> {
    private ArrayList<DatabaseOperation> databaseOperations;
    
    /**
    * Optional. Gets or sets the collection of database operations returned
    * from a call to List Database Operations.
    * @return The DatabaseOperations value.
    */
    public ArrayList<DatabaseOperation> getDatabaseOperations() {
        return this.databaseOperations;
    }
    
    /**
    * Optional. Gets or sets the collection of database operations returned
    * from a call to List Database Operations.
    * @param databaseOperationsValue The DatabaseOperations value.
    */
    public void setDatabaseOperations(final ArrayList<DatabaseOperation> databaseOperationsValue) {
        this.databaseOperations = databaseOperationsValue;
    }
    
    /**
    * Initializes a new instance of the DatabaseOperationListResponse class.
    *
    */
    public DatabaseOperationListResponse() {
        super();
        this.setDatabaseOperations(new LazyArrayList<DatabaseOperation>());
    }
    
    /**
    * Gets the sequence of DatabaseOperations.
    *
    */
    public Iterator<DatabaseOperation> iterator() {
        return this.getDatabaseOperations().iterator();
    }
}
