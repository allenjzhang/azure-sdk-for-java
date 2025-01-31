// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleProperties;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import org.junit.jupiter.api.Assertions;

public final class SchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Updated\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"jezwlwnw\",\"timeZone\":\"qlcvydy\",\"state\":\"Enabled\"}")
                .toObject(ScheduleProperties.class);
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("jezwlwnw", model.time());
        Assertions.assertEquals("qlcvydy", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleProperties model =
            new ScheduleProperties()
                .withType(ScheduledType.STOP_DEV_BOX)
                .withFrequency(ScheduledFrequency.DAILY)
                .withTime("jezwlwnw")
                .withTimeZone("qlcvydy")
                .withState(ScheduleEnableStatus.ENABLED);
        model = BinaryData.fromObject(model).toObject(ScheduleProperties.class);
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("jezwlwnw", model.time());
        Assertions.assertEquals("qlcvydy", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.ENABLED, model.state());
    }
}
