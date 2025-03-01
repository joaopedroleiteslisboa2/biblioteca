package com.bibliotec.livroservice.infrastructure.config.db

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open abstract class AbstractAuditingEntity(

)