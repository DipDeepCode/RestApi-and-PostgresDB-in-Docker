package ru.sf.restapivdsdocker.services;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.sf.restapivdsdocker.dto.UsersDto;
import ru.sf.restapivdsdocker.entities.Users;
import ru.sf.restapivdsdocker.repositories.UsersRepository;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService{
    private final UsersRepository usersRepository;
    private final ModelMapper modelMapper;

    @Override
    public UsersDto add(UsersDto usersDto) {
        Users users = dtoToEntity(usersDto);
        users = usersRepository.save(users);
        return entityToDto(users);
    }

    @Override
    public UsersDto findById(Long id) {
        Users users = usersRepository.findById(id).orElseThrow();
        return entityToDto(users);
    }

    @Override
    public void deleteByFirstName(Long id) {
        usersRepository.deleteById(id);
    }

    private UsersDto entityToDto(Users users) {
        return modelMapper.map(users, UsersDto.class);
    }

    private Users dtoToEntity(UsersDto usersDto) {
        return modelMapper.map(usersDto, Users.class);
    }
}
