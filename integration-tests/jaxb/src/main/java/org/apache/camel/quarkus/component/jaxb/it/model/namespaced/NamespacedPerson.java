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
package org.apache.camel.quarkus.component.jaxb.it.model.namespaced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.camel.quarkus.component.jaxb.it.model.Person;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "firstName", "lastName", "age" })
@XmlRootElement(name = "person")
public class NamespacedPerson implements Person {

    public static final String NAMESPACE = "https://example.com/a";
    @XmlElement(required = true, namespace = NAMESPACE)
    protected String firstName;
    @XmlElement(required = true, namespace = NAMESPACE)
    protected String lastName;
    @XmlElement(required = true, type = Integer.class, nillable = true, namespace = NAMESPACE)
    protected Integer age;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String value) {
        this.firstName = value;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String value) {
        this.lastName = value;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer value) {
        this.age = value;
    }

    @Override
    public String toString() {
        return "NamespacedPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
