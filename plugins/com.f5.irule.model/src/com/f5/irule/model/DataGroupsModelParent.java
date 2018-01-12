/*******************************************************************************
 * Copyright 2015-2017 F5 Networks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.f5.irule.model;

import com.f5.irule.model.BigIPConnection.Module;

public class DataGroupsModelParent extends ModelParent {

    private Module module;

    public DataGroupsModelParent(String name, BigIPConnection conn, String partition, Type type, Module module) {
        super(name, conn, partition, type, null);
        this.module = module;
    }
    
    public Module getModule() {
        return module;
    }

}
