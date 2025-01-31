// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Port range details. */
@Fluent
public final class EndpointRangeDescription {
    /*
     * Starting port of a range of ports
     */
    @JsonProperty(value = "startPort", required = true)
    private int startPort;

    /*
     * End port of a range of ports
     */
    @JsonProperty(value = "endPort", required = true)
    private int endPort;

    /** Creates an instance of EndpointRangeDescription class. */
    public EndpointRangeDescription() {
    }

    /**
     * Get the startPort property: Starting port of a range of ports.
     *
     * @return the startPort value.
     */
    public int startPort() {
        return this.startPort;
    }

    /**
     * Set the startPort property: Starting port of a range of ports.
     *
     * @param startPort the startPort value to set.
     * @return the EndpointRangeDescription object itself.
     */
    public EndpointRangeDescription withStartPort(int startPort) {
        this.startPort = startPort;
        return this;
    }

    /**
     * Get the endPort property: End port of a range of ports.
     *
     * @return the endPort value.
     */
    public int endPort() {
        return this.endPort;
    }

    /**
     * Set the endPort property: End port of a range of ports.
     *
     * @param endPort the endPort value to set.
     * @return the EndpointRangeDescription object itself.
     */
    public EndpointRangeDescription withEndPort(int endPort) {
        this.endPort = endPort;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
