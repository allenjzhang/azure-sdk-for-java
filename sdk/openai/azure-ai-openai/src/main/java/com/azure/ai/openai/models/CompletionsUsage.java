// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of the token counts processed for a completions request. Counts consider all tokens across prompts,
 * choices, choice alternates, best_of generations, and other consumers.
 */
@Immutable
public final class CompletionsUsage {
    /*
     * The number of tokens generated across all completions emissions.
     */
    @Generated
    @JsonProperty(value = "completion_tokens")
    private int completionTokens;

    /*
     * The number of tokens in the provided prompts for the completions request.
     */
    @Generated
    @JsonProperty(value = "prompt_tokens")
    private int promptTokens;

    /*
     * The total number of tokens processed for the completions request and response.
     */
    @Generated
    @JsonProperty(value = "total_tokens")
    private int totalTokens;

    /**
     * Creates an instance of CompletionsUsage class.
     *
     * @param completionTokens the completionTokens value to set.
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    @JsonCreator
    private CompletionsUsage(
            @JsonProperty(value = "completion_tokens") int completionTokens,
            @JsonProperty(value = "prompt_tokens") int promptTokens,
            @JsonProperty(value = "total_tokens") int totalTokens) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the completionTokens property: The number of tokens generated across all completions emissions.
     *
     * @return the completionTokens value.
     */
    @Generated
    public int getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * Get the promptTokens property: The number of tokens in the provided prompts for the completions request.
     *
     * @return the promptTokens value.
     */
    @Generated
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: The total number of tokens processed for the completions request and response.
     *
     * @return the totalTokens value.
     */
    @Generated
    public int getTotalTokens() {
        return this.totalTokens;
    }
}
