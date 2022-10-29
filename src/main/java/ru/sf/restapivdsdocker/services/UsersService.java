package ru.sf.restapivdsdocker.services;

import ru.sf.restapivdsdocker.dto.UsersDto;

public interface UsersService {
    UsersDto add(UsersDto usersDto);
    UsersDto findById(Long id);
    void deleteByFirstName(Long id);
}
