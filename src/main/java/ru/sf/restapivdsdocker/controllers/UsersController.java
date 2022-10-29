package ru.sf.restapivdsdocker.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sf.restapivdsdocker.dto.UsersDto;
import ru.sf.restapivdsdocker.services.UsersService;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @PostMapping("/add")
    public ResponseEntity<UsersDto> addNewUsers(@RequestBody UsersDto usersDto) {
        return new ResponseEntity<>(usersService.add(usersDto), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<UsersDto> getUsers(@RequestParam Long id) {
        return new ResponseEntity<>(usersService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/del")
    public void deleteUsers(@RequestParam Long id) {
        usersService.deleteByFirstName(id);
    }
}
