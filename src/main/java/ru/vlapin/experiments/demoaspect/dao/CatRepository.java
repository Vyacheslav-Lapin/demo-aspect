package ru.vlapin.experiments.demoaspect.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.demoaspect.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
