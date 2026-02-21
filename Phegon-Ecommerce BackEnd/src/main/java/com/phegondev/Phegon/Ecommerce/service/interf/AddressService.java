package com.phegondev.Phegon.Ecommerce.service.interf;

import com.phegondev.Phegon.Ecommerce.dto.AddressDto;
import com.phegondev.Phegon.Ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
