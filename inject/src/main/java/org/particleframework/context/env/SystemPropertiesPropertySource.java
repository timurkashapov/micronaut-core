/*
 * Copyright 2017 original authors
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
package org.particleframework.context.env;

/**
 * Loads properties from system properties
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class SystemPropertiesPropertySource extends MapPropertySource {

    public static final String NAME = "system";
    /**
     * The position of the loader
     */
    public static final int POSITION = -100;

    public SystemPropertiesPropertySource() {
        super(NAME, System.getProperties());
    }

    @Override
    public int getOrder() {
        return POSITION;
    }
}