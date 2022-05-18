package io.github.homchom.recode.mod.features.modules.triggers.impl;

import io.github.homchom.recode.mod.features.modules.triggers.Trigger;

public class MessageReceivedTrigger extends Trigger {

    @Override
    public String[] getEventVars() {
        return new String[]{
                "message",
                "messageWithoutColor"
        };
    }

    @Override
    public String getId() {
        return "messageReceived";
    }

}
