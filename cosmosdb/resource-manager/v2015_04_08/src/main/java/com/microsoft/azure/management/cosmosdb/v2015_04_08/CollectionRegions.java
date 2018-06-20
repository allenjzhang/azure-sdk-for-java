/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CollectionDatabasisDatabaseAccountMetricModel;

/**
 * Type representing CollectionRegions.
 */
public interface CollectionRegions {
    /**
     * Retrieves the metrics determined by the given filter for the given database account, collection and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CollectionDatabasisDatabaseAccountMetricModel> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String filter);

}
