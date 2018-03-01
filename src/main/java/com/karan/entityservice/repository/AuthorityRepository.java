package com.karan.entityservice.repository;

import com.karan.entityservice.domain.Authority;

/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
