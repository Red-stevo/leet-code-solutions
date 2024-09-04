package red.stevo.code.masenomedlabclub.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import red.stevo.code.masenomedlabclub.Entities.IndexPageImages;

@Repository
@Transactional
public interface ImageRepository extends CrudRepository<IndexPageImages, String> {

}
