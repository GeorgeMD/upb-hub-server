package srv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.GroupEntity;
import srv.services.GroupService;

/**
 * @author GeorgeMD
 */
@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping(path = "/group", params = "id")
    public @ResponseBody GroupEntity getById(@RequestParam(name = "id") int id) {
        return groupService.getById(id);
    }
}
