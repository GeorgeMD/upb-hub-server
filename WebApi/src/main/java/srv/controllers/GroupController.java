package srv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.GroupEntity;
import srv.models.GroupModel;
import srv.services.GroupService;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GeorgeMD
 */
@RestController
public class GroupController {

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping(path = "/group", params = "id")
    public GroupModel getById(@RequestParam(name = "id") int id) {
        return new GroupModel(groupService.getById(id));
    }

    @GetMapping(path = "/group")
    public List<GroupModel> getAll() {
        Iterable<GroupEntity> rawEntities = groupService.getAll();
        List<GroupModel> models = new LinkedList<>();

        for (GroupEntity entity : rawEntities) {
            models.add(new GroupModel(entity));
        }

        return models;
    }
}
