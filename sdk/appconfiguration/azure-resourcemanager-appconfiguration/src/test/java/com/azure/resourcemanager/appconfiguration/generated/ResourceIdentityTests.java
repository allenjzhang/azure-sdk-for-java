// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.models.IdentityType;
import com.azure.resourcemanager.appconfiguration.models.ResourceIdentity;
import com.azure.resourcemanager.appconfiguration.models.UserIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SystemAssigned,"
                        + " UserAssigned\",\"userAssignedIdentities\":{\"aeqjhqjbasvms\":{\"principalId\":\"tzfkufubl\",\"clientId\":\"fxqeof\"},\"douskcqvkocrcjdk\":{\"principalId\":\"qulngsntnbybkzgc\",\"clientId\":\"wclxxwrl\"},\"p\":{\"principalId\":\"nh\",\"clientId\":\"njbiksqrglssain\"}},\"principalId\":\"nzl\",\"tenantId\":\"fmppe\"}")
                .toObject(ResourceIdentity.class);
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceIdentity model =
            new ResourceIdentity()
                .withType(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "aeqjhqjbasvms",
                        new UserIdentity(),
                        "douskcqvkocrcjdk",
                        new UserIdentity(),
                        "p",
                        new UserIdentity()));
        model = BinaryData.fromObject(model).toObject(ResourceIdentity.class);
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
