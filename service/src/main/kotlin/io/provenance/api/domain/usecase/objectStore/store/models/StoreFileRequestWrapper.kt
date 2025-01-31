package io.provenance.api.domain.usecase.objectStore.store.models

import java.util.UUID
import org.springframework.http.codec.multipart.FilePart
import org.springframework.http.codec.multipart.Part

data class StoreFileRequestWrapper(
    val uuid: UUID,
    val request: Map<String, Part>,
    val storeRawBytes: Boolean = false,
)

data class SwaggerStoreFileRequestWrapper(
    val objectStoreAddress: String,
    val id: UUID,
    val file: FilePart,
    val storeRawBytes: Boolean,
)

data class SwaggerGetFileResponse(
    val value: ByteArray
)
