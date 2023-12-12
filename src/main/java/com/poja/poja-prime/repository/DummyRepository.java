package com.poja.poja-prime.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poja.poja-prime.PojaGenerated;
import com.poja.poja-prime.repository.model.Dummy;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
