// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state of the replica. */
public final class ReplicaProvisioningState extends ExpandableStringEnum<ReplicaProvisioningState> {
    /** Static value Creating for ReplicaProvisioningState. */
    public static final ReplicaProvisioningState CREATING = fromString("Creating");

    /** Static value Succeeded for ReplicaProvisioningState. */
    public static final ReplicaProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for ReplicaProvisioningState. */
    public static final ReplicaProvisioningState DELETING = fromString("Deleting");

    /** Static value Failed for ReplicaProvisioningState. */
    public static final ReplicaProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ReplicaProvisioningState. */
    public static final ReplicaProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of ReplicaProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicaProvisioningState() {
    }

    /**
     * Creates or finds a ReplicaProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicaProvisioningState.
     */
    @JsonCreator
    public static ReplicaProvisioningState fromString(String name) {
        return fromString(name, ReplicaProvisioningState.class);
    }

    /**
     * Gets known ReplicaProvisioningState values.
     *
     * @return known ReplicaProvisioningState values.
     */
    public static Collection<ReplicaProvisioningState> values() {
        return values(ReplicaProvisioningState.class);
    }
}
