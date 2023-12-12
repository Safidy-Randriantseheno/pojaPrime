package com.poja.pojaPrime.service.event;

import java.util.function.Consumer;

import com.poja.pojaPrime.PojaGenerated;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.poja.pojaPrime.PojaGenerated;
import com.poja.pojaPrime.endpoint.event.gen.UuidCreated;
import com.poja.pojaPrime.repository.DummyUuidRepository;
import com.poja.pojaPrime.repository.model.DummyUuid;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
