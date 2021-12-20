package ru.vlapin.experiments.demoaspect.config;

import static ru.vlapin.experiments.demoaspect.common.Loggable.LogLevel.INFO;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.demoaspect.common.Loggable;
import ru.vlapin.experiments.demoaspect.dao.CatRepository;
import ru.vlapin.experiments.demoaspect.model.Cat;

@Component
@Loggable(INFO)
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
//  @Loggable(INFO)
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
