package com.phegondev.Phegon.Ecommerce.service.impl;

import com.phegondev.Phegon.Ecommerce.dto.AddressDto;
import com.phegondev.Phegon.Ecommerce.dto.Response;
import com.phegondev.Phegon.Ecommerce.entity.Address;
import com.phegondev.Phegon.Ecommerce.entity.User;
import com.phegondev.Phegon.Ecommerce.repository.AddressRepo;
import com.phegondev.Phegon.Ecommerce.service.interf.AddressService;
import com.phegondev.Phegon.Ecommerce.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final UserService userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            address = new Address();
            address.setUser(user);
            user.setAddress(address);
        }

        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);


        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}
