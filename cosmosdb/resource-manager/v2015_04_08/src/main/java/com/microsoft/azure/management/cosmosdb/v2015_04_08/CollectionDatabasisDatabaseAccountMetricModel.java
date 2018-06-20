/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.MetricInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.DocumentDBManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing CollectionDatabasisDatabaseAccountMetricModel.
 */
public interface CollectionDatabasisDatabaseAccountMetricModel extends HasInner<MetricInner>, HasManager<DocumentDBManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the metricValues value.
     */
    List<MetricValue> metricValues();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the timeGrain value.
     */
    String timeGrain();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
