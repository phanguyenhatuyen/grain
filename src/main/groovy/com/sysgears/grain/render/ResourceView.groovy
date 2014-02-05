/*
 * Copyright (c) 2013 SysGears, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sysgears.grain.render

/**
 * Rendered view of resource
 */
class ResourceView {
    
    /** Contents of the child resource */
    String content
    
    /** Full contents of this resource as text string */
    String full
    
    /** Full contents of this resource as byte array */
    byte[] bytes

    /**
     * Converts this view to string
     * 
     * @return this view as a string
     */
    public String toString() {
        full != null ? full : new String(bytes)
    }
}
