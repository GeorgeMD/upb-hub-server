package srv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srv.entities.GroupEntity;
import srv.repositories.GroupRepo;

/**
 * @author GeorgeMD
 */
@Service
public class GroupService {

    @Autowired
    private GroupRepo groupRepo;

    public GroupEntity getById(int id) {
        return groupRepo.findOne(id);
    }
}
