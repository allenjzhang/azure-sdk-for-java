// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Filter to apply to the documents in the source path for training. */
@Fluent
public final class TrainSourceFilter {
    /*
     * A case-sensitive prefix string to filter documents in the source path
     * for training. For example, when using a Azure storage blob Uri, use the
     * prefix to restrict sub folders for training.
     */
    @JsonProperty(value = "prefix")
    private String prefix;

    /*
     * A flag to indicate if sub folders within the set of prefix folders will
     * also need to be included when searching for content to be preprocessed.
     */
    @JsonProperty(value = "includeSubFolders")
    private Boolean includeSubFolders;

    /**
     * Get the prefix property: A case-sensitive prefix string to filter documents in the source path for training. For
     * example, when using a Azure storage blob Uri, use the prefix to restrict sub folders for training.
     *
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: A case-sensitive prefix string to filter documents in the source path for training. For
     * example, when using a Azure storage blob Uri, use the prefix to restrict sub folders for training.
     *
     * @param prefix the prefix value to set.
     * @return the TrainSourceFilter object itself.
     */
    public TrainSourceFilter setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the includeSubFolders property: A flag to indicate if sub folders within the set of prefix folders will also
     * need to be included when searching for content to be preprocessed.
     *
     * @return the includeSubFolders value.
     */
    public Boolean isIncludeSubFolders() {
        return this.includeSubFolders;
    }

    /**
     * Set the includeSubFolders property: A flag to indicate if sub folders within the set of prefix folders will also
     * need to be included when searching for content to be preprocessed.
     *
     * @param includeSubFolders the includeSubFolders value to set.
     * @return the TrainSourceFilter object itself.
     */
    public TrainSourceFilter setIncludeSubFolders(Boolean includeSubFolders) {
        this.includeSubFolders = includeSubFolders;
        return this;
    }
}
