// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for StorageAccounts ListKeys. */
public final class StorageAccountsListKeysSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-08-01/examples/StorageAccountListKeys.json
     */
    /**
     * Sample code: StorageAccountListKeys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountListKeys(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getStorageAccounts()
            .listKeysWithResponse("res418", "sto2220", null, Context.NONE);
    }
}
