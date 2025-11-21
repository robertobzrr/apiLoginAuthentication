package com.robertoapi.login_and_authentication_api.mappers;
import com.robertoapi.login_and_authentication_api.dtos.UserResponseDTO;
import com.robertoapi.login_and_authentication_api.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponseDTO toResponseDTO(User user){
        if (user == null){
            return null;
        }
        else{
            UserResponseDTO respDTO = new UserResponseDTO();

            respDTO.setName(user.getName());
            respDTO.setEmail(user.getEmail());

            return respDTO;
        }

    }


}
