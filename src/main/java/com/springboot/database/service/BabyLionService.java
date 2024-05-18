package com.springboot.database.service;

import com.springboot.database.data.dto.reponse.ResponseBabyLionDto;
import com.springboot.database.data.dto.request.ChangeNameRequestDto;
import com.springboot.database.data.dto.request.RequestBabyLionDto;

public interface BabyLionService {
    ResponseBabyLionDto getBabyLion(String email) throws Exception;

    ResponseBabyLionDto saveBabyLion(RequestBabyLionDto requestBabyLionDto);
    ResponseBabyLionDto changeBabyLionName(ChangeNameRequestDto changeNameRequestDto) throws Exception;
    void deleteBabyLion(String email) throws Exception;

}
