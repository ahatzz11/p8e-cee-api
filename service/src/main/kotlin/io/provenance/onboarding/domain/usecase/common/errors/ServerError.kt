package io.provenance.onboarding.domain.usecase.common.errors

class ServerError(message: String, cause: Throwable? = null) : Exception(message, cause)