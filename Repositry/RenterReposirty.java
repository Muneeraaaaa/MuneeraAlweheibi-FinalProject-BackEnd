package com.example.finalprojectbackend.Repositry;

import com.example.finalprojectbackend.model.Renter;
import org.hibernate.hql.internal.ast.SqlASTFactory;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterReposirty extends JpaRepository<Renter, String> {
}
