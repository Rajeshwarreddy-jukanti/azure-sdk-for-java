/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.appservice.SkuDescription;
import com.microsoft.azure.management.appservice.SkuCapacity;

/**
 * SKU discovery information.
 */
public class SkuInfoInner {
    /**
     * Resource type that this SKU applies to.
     */
    private String resourceType;

    /**
     * Name and tier of the SKU.
     */
    private SkuDescription sku;

    /**
     * Min, max, and default scale values of the SKU.
     */
    private SkuCapacity capacity;

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

}
