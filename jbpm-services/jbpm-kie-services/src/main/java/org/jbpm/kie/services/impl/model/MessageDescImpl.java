/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
 */
package org.jbpm.kie.services.impl.model;

import org.jbpm.bpmn2.core.Message;
import org.jbpm.services.api.model.MessageDesc;

public class MessageDescImpl extends SignalDescBaseImpl implements MessageDesc {

    private static final long serialVersionUID = 1L;

    public static MessageDescImpl from(Message message) {
        return new MessageDescImpl(message.getId(), message.getName(), message.getType());
    }

    private MessageDescImpl(String id, String name, String structureRef) {
        super(id, name, structureRef);
    }
}
