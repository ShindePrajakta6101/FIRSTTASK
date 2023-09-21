package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Role;
import com.repository.role;

@RestController
public class rolecontroller {
@Autowired
	role role1;
@PostMapping("/saverole")

public String saverole(@RequestBody Role rolee)
{
System.out.println(rolee.getRoleid());
role1.save(rolee);
return "role save";

}
@GetMapping("/roles")
public List<Role>roles(){
List<Role>roleList=role1.findAll();
return roleList;
}


@DeleteMapping("/deleterole/{id}")
public String deleteRole(@PathVariable int id)
{
Optional<Role>rolee=role1.findById(id);
if(rolee.isPresent()) {
	role1.delete(rolee.get());
}
return "role deleted";



}
@PutMapping("/updaterole/{id}")
public void updateRoleData(@RequestBody Role rolee)
{
role1.save(rolee);

}
	
}
