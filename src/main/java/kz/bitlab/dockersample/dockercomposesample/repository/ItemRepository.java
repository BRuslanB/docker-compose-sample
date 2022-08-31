package kz.bitlab.dockersample.dockercomposesample.repository;

import kz.bitlab.dockersample.dockercomposesample.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemRepository extends JpaRepository<Item, Long> {
}
