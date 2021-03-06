package srv.services;

import org.springframework.stereotype.Service;
import srv.entities.GroupEntity;
import srv.repositories.GroupRepo;

import java.util.List;

/**
 * @author GeorgeMD
 */
@Service
public class GroupService {

    private GroupRepo groupRepo;

    public GroupService(GroupRepo groupRepo) {
        this.groupRepo = groupRepo;
    }

    public GroupEntity getById(int id) {
        return groupRepo.findOne(id);
    }

    public Iterable<GroupEntity> getAll() {
        return groupRepo.findAll();
    }
}
