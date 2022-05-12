package io.provenance.api.models.eos

import io.provenance.objectstore.proto.Objects
import java.util.Base64

data class StoreAssetResponse(
    val hash: String,
    val uri: String,
    val bucket: String,
    val name: String
)

fun Objects.ObjectResponse.toModel() = StoreAssetResponse(Base64.getEncoder().encodeToString(hash.toByteArray()), uri, bucket, name)