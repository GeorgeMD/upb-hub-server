package srv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srv.models.GroupModel;
import srv.services.GroupService;

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
}
