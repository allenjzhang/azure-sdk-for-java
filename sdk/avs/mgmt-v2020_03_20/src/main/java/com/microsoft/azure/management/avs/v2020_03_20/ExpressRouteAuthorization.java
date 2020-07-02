/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.ExpressRouteAuthorizationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.AVSManager;

/**
 * Type representing ExpressRouteAuthorization.
 */
public interface ExpressRouteAuthorization extends HasInner<ExpressRouteAuthorizationInner>, Indexable, Refreshable<ExpressRouteAuthorization>, Updatable<ExpressRouteAuthorization.Update>, HasManager<AVSManager> {
    /**
     * @return the expressRouteAuthorizationId value.
     */
    String expressRouteAuthorizationId();

    /**
     * @return the expressRouteAuthorizationKey value.
     */
    String expressRouteAuthorizationKey();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ExpressRouteAuthorizationProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ExpressRouteAuthorization definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateCloud, DefinitionStages.WithAuthorization, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteAuthorization definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteAuthorization definition.
         */
        interface Blank extends WithPrivateCloud {
        }

        /**
         * The stage of the expressrouteauthorization definition allowing to specify PrivateCloud.
         */
        interface WithPrivateCloud {
           /**
            * Specifies resourceGroupName, privateCloudName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param privateCloudName The name of the private cloud
            * @return the next definition stage
            */
            WithAuthorization withExistingPrivateCloud(String resourceGroupName, String privateCloudName);
        }

        /**
         * The stage of the expressrouteauthorization definition allowing to specify Authorization.
         */
        interface WithAuthorization {
           /**
            * Specifies authorization.
            * @param authorization An ExpressRoute Circuit Authorization
            * @return the next definition stage
            */
            WithCreate withAuthorization(Object authorization);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteAuthorization> {
        }
    }
    /**
     * The template for a ExpressRouteAuthorization update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteAuthorization>, UpdateStages.WithAuthorization {
    }

    /**
     * Grouping of ExpressRouteAuthorization update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressrouteauthorization update allowing to specify Authorization.
         */
        interface WithAuthorization {
            /**
             * Specifies authorization.
             * @param authorization An ExpressRoute Circuit Authorization
             * @return the next update stage
             */
            Update withAuthorization(Object authorization);
        }

    }
}
