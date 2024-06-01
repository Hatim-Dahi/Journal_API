package google.com.FirstProject.controller;

import google.com.FirstProject.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class EntryController {
    private Map<Long, JournalEntity> entries= new HashMap<>();

    @GetMapping
    public List<JournalEntity> getAll(){
        return new ArrayList(entries.values());
    }

    @PostMapping
    public void createEntry(@RequestBody JournalEntity newEntry){
        entries.put(newEntry.getId(), newEntry);
    }
}
