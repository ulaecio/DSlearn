package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Enrollment;
import com.ulasoftware.learn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
