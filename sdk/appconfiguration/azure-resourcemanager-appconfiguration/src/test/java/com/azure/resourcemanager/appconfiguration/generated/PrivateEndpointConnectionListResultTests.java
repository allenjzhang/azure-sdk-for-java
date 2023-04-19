// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\"},\"id\":\"yvxyqjp\",\"name\":\"cattpngjcrcczsq\",\"type\":\"jh\"}],\"nextLink\":\"daj\"}")
                .toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals("daj", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(Arrays.asList(new PrivateEndpointConnectionInner()))
                .withNextLink("daj");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals("daj", model.nextLink());
    }
}
