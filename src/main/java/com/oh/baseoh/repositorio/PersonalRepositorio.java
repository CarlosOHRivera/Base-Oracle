package com.oh.baseoh.repositorio;

import com.oh.baseoh.modelo.Personal;
import com.oh.baseoh.modelo.PersonalPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepositorio extends JpaRepository<Personal, PersonalPK> {
}
