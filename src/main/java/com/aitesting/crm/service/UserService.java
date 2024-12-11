package com.aitesting.crm.service;

import com.aitesting.crm.domain.User;
import com.aitesting.crm.dto.UserCreateDto;
import com.aitesting.crm.exception.PhoneNumberExistsException;
import com.aitesting.crm.exception.UserInvalidInfoException;
import com.aitesting.crm.repository.UserRepository;
import com.aitesting.crm.utils.StringUtils;


public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public String getUserName(Long id) {
    User user = userRepository.findById(id);
    return user != null ? user.getName() : "User not found";
  }

  public void createNewUser(UserCreateDto user) {
    // Validate data
    validateCreateUser(user);

    // Format data
    String normalisedPhone = StringUtils.normalizePhoneNumber(user.phoneNumber());
    String name = StringUtils.sanitize(user.name());

    User userWithPhoneNumber = userRepository.findByPhoneNumber(normalisedPhone);
    if (userWithPhoneNumber != null) {
      throw new PhoneNumberExistsException("This phone number is already in use");
    }

    User newUser = new User(name, normalisedPhone, user.mail(), user.birthDate());
    userRepository.save(newUser);
  }

  private void validateCreateUser(UserCreateDto user) {
    if (user.name() == null || user.phoneNumber() == null || user.birthDate() == null ) {
      throw new UserInvalidInfoException("User information is missing");
    }

    if (!StringUtils.isValidEmail(user.mail())) {
      throw new UserInvalidInfoException("User mail is missing or invalid");
    }
  }

  public void deleteUser(Long id) {
    // TODO :: Implement this method
    // If the user does not exist, then do nothing
    // If the user exists but has the admin role, then throw a NotAllowedException
  }

}
