/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.ClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Clusters.
 */
public interface Clusters extends SupportsCreating<Cluster.DefinitionStages.Blank>, HasInner<ClustersInner> {
    /**
     * Get a cluster by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Cluster> getAsync(String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * List clusters in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Cluster> listAsync(final String resourceGroupName, final String privateCloudName);

    /**
     * Delete a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param clusterName Name of the cluster in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String privateCloudName, String clusterName);

}
