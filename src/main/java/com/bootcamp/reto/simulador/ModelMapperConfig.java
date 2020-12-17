package com.bootcamp.reto.simulador;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Model mapper config.
 *
 * @author Jean Pier Barbieri
 */
public class ModelMapperConfig {

  /**
   * Model mapper model mapper.
   *
   * @return the model mapper
   */
  @Bean
  public ModelMapper modelMapper() {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.getConfiguration()
            .setMatchingStrategy(MatchingStrategies.STRICT);
    return modelMapper;
  }


}
