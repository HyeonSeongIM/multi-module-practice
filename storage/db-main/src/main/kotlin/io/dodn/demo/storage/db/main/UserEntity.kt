package io.dodn.demo.storage.db.main

import jakarta.persistence.Entity

@Entity
class UserEntity(
    val name: String
) : BaseEntity()