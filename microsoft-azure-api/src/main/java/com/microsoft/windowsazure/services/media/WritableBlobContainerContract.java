/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media;

import java.io.InputStream;

import com.microsoft.windowsazure.services.blob.models.BlockList;
import com.microsoft.windowsazure.services.blob.models.CommitBlobBlocksOptions;
import com.microsoft.windowsazure.services.blob.models.CreateBlobBlockOptions;
import com.microsoft.windowsazure.services.blob.models.CreateBlobOptions;
import com.microsoft.windowsazure.services.blob.models.CreateBlobResult;
import com.microsoft.windowsazure.services.core.FilterableService;
import com.microsoft.windowsazure.services.core.ServiceException;

/**
 * Contract for uploading media files to blob storage managed
 * by Media Services.
 * 
 */
public interface WritableBlobContainerContract extends FilterableService<WritableBlobContainerContract> {

    /**
     * Creates a block blob from a content stream.
     * 
     * @param blob
     *            A {@link String} containing the name of the blob to create. A blob name can contain any combination of
     *            characters, but reserved URL characters must be properly escaped. A blob name must be at least one
     *            character long and cannot be more than 1,024 characters long, and must be unique within the container.
     * @param contentStream
     *            An {@link InputStream} reference to the content stream to upload to the new blob.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    CreateBlobResult createBlockBlob(String blob, InputStream contentStream) throws ServiceException;

    /**
     * Creates a block blob from a content stream, using the specified options.
     * <p>
     * Use the {@link CreateBlobOptions options} parameter to optionally specify the server timeout for the operation,
     * the MIME content type and content encoding for the blob, the content language, the MD5 hash, a cache control
     * value, and blob metadata.
     * 
     * @param blob
     *            A {@link String} containing the name of the blob to create. A blob name can contain any combination of
     *            characters, but reserved URL characters must be properly escaped. A blob name must be at least one
     *            character long and cannot be more than 1,024 characters long, and must be unique within the container.
     * @param contentStream
     *            An {@link InputStream} reference to the content to upload to the new blob.
     * @param options
     *            A {@link CreateBlobOptions} instance containing options for the request.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    CreateBlobResult createBlockBlob(String blob, InputStream contentStream, CreateBlobOptions options)
            throws ServiceException;

    /**
     * Creates a new uncommited block from a content stream.
     * <p>
     * This method creates an uncommitted block for a block blob specified by the <em>blob</em> and <em>container</em>
     * parameters. The <em>blockId</em> parameter is a client-specified ID for the block, which must be less than or
     * equal to 64 bytes in size. For a given blob, the length of the value specified for the <em>blockId</em> parameter
     * must be the same size for each block. The <em>contentStream</em> parameter specifies the content to be copied to
     * the block. The content for the block must be less than or equal to 4 MB in size.
     * <p>
     * To create or update a block blob, the blocks that have been successfully written to the server with this method
     * must be committed using a call to {@link WritableBlobContainerContract#commitBlobBlocks(String, BlockList)} or
     * {@link WritableBlobContainerContract#commitBlobBlocks(String, BlockList, CommitBlobBlocksOptions)}.
     * 
     * @param blob
     *            A {@link String} containing the name of the blob to create the block for.
     * @param blockId
     *            A {@link String} containing a client-specified ID for the block.
     * @param contentStream
     *            An {@link InputStream} reference to the content to copy to the block.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    void createBlobBlock(String blob, String blockId, InputStream contentStream) throws ServiceException;

    /**
     * Creates a new uncommitted block from a content stream, using the specified options.
     * <p>
     * This method creates an uncommitted block for a block blob specified by the <em>blob</em> and <em>container</em>
     * parameters. The <em>blockId</em> parameter is a client-specified ID for the block, which must be less than or
     * equal to 64 bytes in size. For a given blob, the length of the value specified for the <em>blockId</em> parameter
     * must be the same size for each block. The <em>contentStream</em> parameter specifies the content to be copied to
     * the block. The content for the block must be less than or equal to 4 MB in size. Use the
     * {@link CreateBlobBlockOptions options} parameter to optionally specify the server timeout for the operation, the
     * lease ID if the blob has an active lease, and the MD5 hash value for the block content.
     * <p>
     * To create or update a block blob, the blocks that have been successfully written to the server with this method
     * must be committed using a call to {@link WritableBlobContainerContract#commitBlobBlocks(String, BlockList)} or
     * {@link WritableBlobContainerContract#commitBlobBlocks(String, BlockList, CommitBlobBlocksOptions)}.
     * 
     * @param blob
     *            A {@link String} containing the name of the blob to create the block for.
     * @param blockId
     *            A {@link String} containing a client-specified ID for the block.
     * @param contentStream
     *            An {@link InputStream} reference to the content to copy to the block.
     * @param options
     *            A {@link CreateBlobBlockOptions} instance containing options for the request.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    void createBlobBlock(String blob, String blockId, InputStream contentStream, CreateBlobBlockOptions options)
            throws ServiceException;

    /**
     * Commits a list of blocks to a block blob.
     * <p>
     * This method creates or updates the block blob specified by the <em>blob</em> and <em>container</em> parameters.
     * You can call this method to update a blob by uploading only those blocks that have changed, then committing the
     * new and existing blocks together. You can do this with the <em>blockList</em> parameter by specifying whether to
     * commit a block from the committed block list or from the uncommitted block list, or to commit the most recently
     * uploaded version of the block, whichever list it may belong to.
     * <p>
     * In order to be written as part of a blob, each block in the list must have been successfully written to the
     * server with a call to {@link WritableBlobContainerContract#createBlobBlock(String, String, InputStream)} or
     * {@link WritableBlobContainerContract#createBlobBlock(String, String, InputStream, CreateBlobBlockOptions)}.
     * 
     * @param blob
     *            A {@link String} containing the name of the block blob to create or update.
     * @param blockList
     *            A {@link BlockList} containing the list of blocks to commit to the block blob.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    void commitBlobBlocks(String blob, BlockList blockList) throws ServiceException;

    /**
     * Commits a block list to a block blob, using the specified options.
     * <p>
     * This method creates or updates the block blob specified by the <em>blob</em> and <em>container</em> parameters.
     * You can call this method to update a blob by uploading only those blocks that have changed, then committing the
     * new and existing blocks together. You can do this with the <em>blockList</em> parameter by specifying whether to
     * commit a block from the committed block list or from the uncommitted block list, or to commit the most recently
     * uploaded version of the block, whichever list it may belong to. Use the {@link CommitBlobBlocksOptions options}
     * parameter to optionally specify the server timeout for the operation, the MIME content type and content encoding
     * for the blob, the content language, the MD5 hash, a cache control value, blob metadata, the lease ID if the blob
     * has an active lease, and any access conditions for the operation.
     * <p>
     * In order to be written as part of a blob, each block in the list must have been successfully written to the
     * server with a call to {@link WritableBlobContainerContract#createBlobBlock(String, String, InputStream)} or
     * {@link WritableBlobContainerContract#createBlobBlock(String, String, InputStream, CreateBlobBlockOptions)}.
     * 
     * @param blob
     *            A {@link String} containing the name of the block blob to create or update.
     * @param blockList
     *            A {@link BlockList} containing the list of blocks to commit to the block blob.
     * @param options
     *            A {@link CommitBlobBlocksOptions} instance containing options for the request.
     * @throws ServiceException
     *             if an error occurs accessing the storage service.
     */
    void commitBlobBlocks(String blob, BlockList blockList, CommitBlobBlocksOptions options) throws ServiceException;
}
