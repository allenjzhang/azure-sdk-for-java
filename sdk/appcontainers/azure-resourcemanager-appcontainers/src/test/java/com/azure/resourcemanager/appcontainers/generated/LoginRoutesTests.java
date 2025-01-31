// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.LoginRoutes;
import org.junit.jupiter.api.Assertions;

public final class LoginRoutesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoginRoutes model = BinaryData.fromString("{\"logoutEndpoint\":\"j\"}").toObject(LoginRoutes.class);
        Assertions.assertEquals("j", model.logoutEndpoint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoginRoutes model = new LoginRoutes().withLogoutEndpoint("j");
        model = BinaryData.fromObject(model).toObject(LoginRoutes.class);
        Assertions.assertEquals("j", model.logoutEndpoint());
    }
}
