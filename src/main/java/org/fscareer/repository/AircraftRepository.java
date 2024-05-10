package org.fscareer.repository;

import org.fscareer.models.Aircraft;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AircraftRepository implements PanacheRepository<Aircraft> {

}
